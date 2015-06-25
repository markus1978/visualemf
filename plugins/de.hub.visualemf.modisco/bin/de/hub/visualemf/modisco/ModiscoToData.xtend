package de.hub.visualemf.modisco

import de.hub.visualemf.DataSetMetaDataGenerator
import de.hub.visualemf.DataSetSerialization
import de.hub.visualemf.data.DataPackage
import de.hub.visualemf.data.DataTable
import de.hub.visualemf.modiscodata.ClassDependencyItem
import de.hub.visualemf.modiscodata.ContainmentItem
import de.hub.visualemf.modiscodata.ModiscoDataFactory
import de.hub.visualemf.modiscodata.ModiscoDataPackage
import java.io.File
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.ArrayType
import org.eclipse.gmt.modisco.java.ClassDeclaration
import org.eclipse.gmt.modisco.java.MethodDeclaration
import org.eclipse.gmt.modisco.java.MethodInvocation
import org.eclipse.gmt.modisco.java.NamedElement
import org.eclipse.gmt.modisco.java.Package
import org.eclipse.gmt.modisco.java.ParameterizedType
import org.eclipse.gmt.modisco.java.Type
import org.eclipse.gmt.modisco.java.TypeDeclaration
import org.eclipse.gmt.modisco.java.TypeParameter
import org.eclipse.gmt.modisco.java.emf.JavaPackage

class ModiscoToData {
	
	static abstract class Command {
		def abstract void apply()
	}
	
	var TreeIterator<EObject> iterator = null
	
	var wmc = 0;
	var size = 0;
	var dit = 0;
	
	var classDependencies = new HashSet<TypeDeclaration>();
	var packageDependencies = new HashSet<Package>();
	var classDependencyRelationData = DataSetMetaDataGenerator.autoGenRelationDataSet(ModiscoDataPackage.eINSTANCE.classDependencyItem);
	var packageDependencyRelationData = DataSetMetaDataGenerator.autoGenRelationDataSet(ModiscoDataPackage.eINSTANCE.packageDependencyItem);
	 
	var currentInDeclarationContainment = ModiscoDataFactory.eINSTANCE.createDeclarationContainmentItem();
	var currentInContainment = null as ContainmentItem;
	
	var classesDataTable = null as DataTable
	
	def static main(String[] args) {
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.nsURI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(DataPackage.eINSTANCE.nsURI, DataPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ModiscoDataPackage.eINSTANCE.nsURI, ModiscoDataPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl);
		
		val instance = new ModiscoToData
		instance.run(new File("model/de.hub.emffrag_java.xmi"))		
	}
	
	def run(File modelFile) {		
		val rs = new ResourceSetImpl
		val r = rs.getResource(URI.createFileURI(modelFile.path), true)
		for(content:r.contents) {
			traverse(content)
		}
		
		// write declaration containment
		val declarationContainmentData = DataSetMetaDataGenerator.autoGenSizeTreeDataSet(ModiscoDataPackage.eINSTANCE.declarationContainmentItem)
		declarationContainmentData.items.addAll(currentInDeclarationContainment.children);
		DataSetSerialization.write(new File("model/json/DeclarationSizeTreeData.json"), declarationContainmentData)
		
		// write package dependencies
		DataSetSerialization.write(new File("model/json/packageDependencyRelationData.json"), packageDependencyRelationData)
	}
	
	def void traverse(EObject obj) {		
		iterator = obj.eAllContents;
		while (iterator.hasNext) {
			val next = iterator.next
			val command = visit(next as EObject)
			if (command != null) {
				val oldIterator = iterator
				oldIterator.prune
				traverse(next as EObject)
				command.apply()
				iterator = oldIterator
			}
		}
	}
	
	def Command visit(EObject obj) {
		size = size + 1
		val beforeSize = size;
		val oldCurrentInContainment = currentInContainment
		if (currentInContainment != null) {		
			currentInContainment = ModiscoDataFactory.eINSTANCE.createContainmentItem
			currentInContainment.representedElement = obj
			oldCurrentInContainment.children.add(currentInContainment)		
		}
		
		val oldCurrentInDeclarationContainment = currentInDeclarationContainment
		currentInDeclarationContainment = if ((obj instanceof Package || obj instanceof TypeDeclaration || obj instanceof MethodDeclaration) && oldCurrentInDeclarationContainment != null)
			ModiscoDataFactory.eINSTANCE.createDeclarationContainmentItem
		else 
			null;
		
		val command = visitConcreteElementType(obj)
		
		return [ 
			if (command != null) command.apply; 
			if (currentInDeclarationContainment != null) {
				oldCurrentInDeclarationContainment.children.add(currentInDeclarationContainment)
				currentInDeclarationContainment.representedElement = obj
				if (obj instanceof MethodDeclaration) {
					currentInDeclarationContainment.size = size - beforeSize					
				}
			}
			currentInContainment = oldCurrentInContainment; 
			currentInDeclarationContainment = oldCurrentInDeclarationContainment
		]
	}
	
	def dispatch Command visitConcreteElementType(EObject obj) { 
		return null
	}
	
	def dispatch Command visitConcreteElementType(Package pkg) {
		val oldClassesDataTable = classesDataTable
		val oldPackageDependencies = packageDependencies
		val oldClassDependencyRelationData = classDependencyRelationData
		val oldCurrentInContainment = currentInContainment
		
		classesDataTable = DataSetMetaDataGenerator.autoGenTableDataSet(ModiscoDataPackage.eINSTANCE.classMetricsItem)
		currentInContainment = ModiscoDataFactory.eINSTANCE.createContainmentItem
		currentInContainment.representedElement = pkg;
		classDependencyRelationData = DataSetMetaDataGenerator.autoGenRelationDataSet(ModiscoDataPackage.eINSTANCE.classDependencyItem)
		packageDependencies = new HashSet<Package>();
		return [
			// write classesDataTable
			DataSetSerialization.write(new File("model/json/" + pkg.qualifiedId.replace(".", "/") + "/classesTableData.json"), classesDataTable)
			classesDataTable = oldClassesDataTable
			
			// calculate package dependencies
			val packageDependencyItem = ModiscoDataFactory.eINSTANCE.createPackageDependencyItem
			packageDependencyItem.representedElement = pkg
			packageDependencyRelationData.items.add(packageDependencyItem)
			// TODO dependencies outside model
			packageDependencies.fold(packageDependencyItem.dependencies)[r,e|
				val dependency = ModiscoDataFactory.eINSTANCE.createMoDiscoDataItem
				dependency.representedElement = e
				r.add(dependency); 
				return r;
			]
			
			// class dependencies
			DataSetSerialization.write(new File("model/json/" + pkg.qualifiedId.replace(".", "/") + "/classDependencyRelationData.json"), classDependencyRelationData)
			
			// save package containment
			val packageContainmentData = DataSetMetaDataGenerator.autoGenHierarchyDataSet(ModiscoDataPackage.eINSTANCE.containmentItem)
			packageContainmentData.items.add(currentInContainment);
			DataSetSerialization.write(new File("model/json/" + pkg.qualifiedId.replace(".", "/") + "/packageContainmentData.json"), packageContainmentData)
			
			classDependencyRelationData = oldClassDependencyRelationData	
			packageDependencies = oldPackageDependencies
			currentInContainment = oldCurrentInContainment;
		]
	}
	
	def dispatch Command visitConcreteElementType(TypeDeclaration typeDecl) {
		size = 0;
		val oldClassDependencies = classDependencies
		classDependencies = new HashSet<TypeDeclaration>()
		
		dit = 0;
		val allSuperTypes = new ArrayList<TypeDeclaration>()
		typeDecl.collectInheritenceTree(allSuperTypes, 0)
		
		if (typeDecl.abstractTypeDeclaration != null) typeDecl.abstractTypeDeclaration.addTypeDecl(classDependencies)
		typeDecl.superInterfaces.forEach[it.type.addTypeDecl(classDependencies)] 
		switch(typeDecl) {
			ClassDeclaration: if (typeDecl.superClass != null) typeDecl.superClass.type.addTypeDecl(classDependencies)
		}
		
		return [
			val classMetrics = ModiscoDataFactory.eINSTANCE.createClassMetricsItem
			classesDataTable.items.add(classMetrics)
			classMetrics.representedElement = typeDecl
			classMetrics.size = size
			classMetrics.wmc = wmc
			classMetrics.dit = dit
			classMetrics.cbo = classDependencies.size
			classMetrics.nom = typeDecl.bodyDeclarations.filter[it instanceof MethodDeclaration].size
			classMetrics.noam = allSuperTypes.fold(0)[sum,eDecl|sum + eDecl.bodyDeclarations.filter[it instanceof MethodDeclaration].size]
			
			val classDependencyItem = ModiscoDataFactory.eINSTANCE.createClassDependencyItem
			classDependencyItem.representedElement = typeDecl
			classDependencyRelationData.items.add(classDependencyItem)
			// TODO dependencies outside model
			classDependencies.fold(classDependencyItem.dependencies)[r,e|
				val dependency = ModiscoDataFactory.eINSTANCE.createMoDiscoDataItem
				dependency.representedElement = e
				r.add(dependency);
				
				if (e.package != null) packageDependencies.add(e.package)
				 
				return r;
			]
						
			classDependencies = oldClassDependencies
		]			
	}		
	
	private def superTypes(TypeDeclaration typeDecl) {
		val result = new ArrayList<TypeDeclaration>();
		val superInterfaces = typeDecl.superInterfaces.fold(new ArrayList())[r,e|val eDecl = e.type.typeDecl; r.add(eDecl); return r; ]
		result.addAll(superInterfaces.filter[it != null])
		if (typeDecl != null) {
			switch(typeDecl) {
				ClassDeclaration: if (typeDecl.superClass != null) result.add(typeDecl.superClass.type.typeDecl)
			}
		}
		return result;
	}
		
	private def void collectInheritenceTree(TypeDeclaration typeDecl, Collection<TypeDeclaration> typeDecls, int depth) {
	 	if (depth > dit) dit = depth
		typeDecl.superTypes.forEach[typeDecls.add(it); it.collectInheritenceTree(typeDecls, depth + 1)]
	}
	
	def dispatch Command visitConcreteElementType(MethodDeclaration methodDecl) {
		val beforeSize = size
		
		methodDecl.parameters.forEach[it.type.type.addTypeDecl(classDependencies)]
		methodDecl.typeParameters.forEach[it.addTypeDecl(classDependencies)]
		if (methodDecl.returnType != null && methodDecl.returnType.type != null) methodDecl.returnType.type.addTypeDecl(classDependencies)
		
		return [ wmc += size - beforeSize ]
	}
	
	def dispatch Command visitConcreteElementType(MethodInvocation call) {
		call.method.abstractTypeDeclaration.addTypeDecl(classDependencies)		
		return null
	}
	
	private def dispatch void addTypeDecl(Type type, Collection<TypeDeclaration> typeDecls) {
		
	}
	
	private def dispatch void addTypeDecl(TypeDeclaration type, Collection<TypeDeclaration> typeDecls) {
		typeDecls.add(type)
	}
	
	private def dispatch void addTypeDecl(ParameterizedType type, Collection<TypeDeclaration> typeDecls) {
		type.typeArguments.forEach[it.type.addTypeDecl(typeDecls)]
		type.type.type.addTypeDecl(typeDecls)
	}
	
	private def dispatch void addTypeDecl(ArrayType type, Collection<TypeDeclaration> typeDecls) {
		type.elementType.type.addTypeDecl(typeDecls)
	}
	
	private def dispatch void addTypeDecl(TypeParameter type, Collection<TypeDeclaration> typeDecls) {
		type.bounds.forEach[it.type.addTypeDecl(typeDecls)]
	}
	
	private def dispatch TypeDeclaration typeDecl(Type type) {
		return null;
	}
	
	private def dispatch TypeDeclaration typeDecl(TypeDeclaration type) {
		return type;
	}
	
	private def dispatch TypeDeclaration typeDecl(ParameterizedType type) {
		return type.type.type.typeDecl;
	}
	
	static def name(EObject element) {
		val nameAttr = element.eClass.getEStructuralFeature("name")
		if (nameAttr != null && element.eIsSet(nameAttr)) {
			return element.eGet(nameAttr).toString
		} else {
			return "#noname";
		}
	}
	
	static def qualifiedId(EObject element) {
		var current = element
		var String result = null
		while (current != null) {
			if (current instanceof NamedElement && (current as NamedElement).name != null) {
				result = (current as NamedElement).name + (if (result == null ) "" else "." + result)
			}
			current = current.eContainer
		}
		return result;
	}
}