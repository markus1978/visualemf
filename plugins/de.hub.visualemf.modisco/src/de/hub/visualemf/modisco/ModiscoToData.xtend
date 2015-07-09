package de.hub.visualemf.modisco

import de.hub.visualemf.DataSetMetaDataGenerator
import de.hub.visualemf.DataSetSerialization
import de.hub.visualemf.data.DataPackage
import de.hub.visualemf.modiscodata.ContainmentItem
import de.hub.visualemf.modiscodata.DeclarationContainmentItem
import de.hub.visualemf.modiscodata.ModiscoDataFactory
import de.hub.visualemf.modiscodata.ModiscoDataPackage
import java.io.File
import java.util.HashMap
import java.util.concurrent.Executors
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration
import org.eclipse.gmt.modisco.java.Block
import org.eclipse.gmt.modisco.java.Model
import org.eclipse.gmt.modisco.java.Package
import org.eclipse.gmt.modisco.java.emf.JavaPackage

import static extension de.hub.srcrepo.metrics.ModiscoMetrics.*
import static extension de.hub.srcrepo.ocl.OclExtensions.*

class ModiscoToData {
	
	def static main(String[] args) {
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.nsURI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(DataPackage.eINSTANCE.nsURI, DataPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ModiscoDataPackage.eINSTANCE.nsURI, ModiscoDataPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl);
		
		val instance = new ModiscoToData
		instance.run(new File("output/jdt"), new File("model/jdt.xml"))		
	}
	
	def run(File outputDirectory, File modelFile) {								
		val rs = new ResourceSetImpl
		val r = rs.getResource(URI.createFileURI(modelFile.path), true)
		val model = r.contents.get(0) as Model
		
		println("Model loaded")
		
		val executorService = Executors.newFixedThreadPool(10)
		
		// directory data
		executorService.submit[
			println("+ processing directroy")
			val directoryData = DataSetMetaDataGenerator.autoGenSizeTreeDataSet(ModiscoDataPackage.eINSTANCE.declarationContainmentItem)
			val directoryMap = new HashMap<EObject, DeclarationContainmentItem>
			model.eAllContentsAsIterable[it instanceof Package].forEach[element|
				val node = ModiscoDataFactory::eINSTANCE.createDeclarationContainmentItem
				directoryMap.put(element, node)
				node.representedElement = element
				val parent = directoryMap.get(element.eContainer)
				if (parent != null) {
					parent.children.add(node)
				} else {
					directoryData.items.add(node)
				}
			]
			DataSetSerialization.write(new File(outputDirectory.path + "/directory.json"), directoryData)
			println("- processing directroy")
		]
		
		val packages = model.ownedElements.closure[it.ownedPackages].filter[ownedElements.exists[it.originalCompilationUnit != null && it instanceof AbstractTypeDeclaration]]
		packages.forEach[pkg|
			executorService.submit[
				println("+ processing " + pkg.qualifiedName)
				val classes = pkg.ownedElements.typeSelect(typeof(AbstractTypeDeclaration)) 
				// metrics data
				val metricsData = DataSetMetaDataGenerator.autoGenTableDataSet(ModiscoDataPackage.eINSTANCE.classMetricsItem)
				classes.forEach[
					val metricsDataItem = ModiscoDataFactory::eINSTANCE.createClassMetricsItem
					metricsDataItem.representedElement = it
					metricsDataItem.wmc = it.weightedMethodsPerClass
					metricsDataItem.dit = it.depthOfInheritenceTree
					metricsDataItem.noc = it.numberOfChildren
					metricsDataItem.cbo = it.couplingBetweenObjects
					metricsDataItem.rfc = it.responseForClass
					metricsDataItem.lcom = it.lackOfCohesionInMethods
					metricsDataItem.size = it.eAllContentsAsIterable.sum[1]
					metricsData.items.add(metricsDataItem)
				]
				DataSetSerialization.write(new File(outputDirectory.path + "/" + pkg.qualifiedName.replace("\\.","/") + "/metrics.json"), metricsData)
				EcoreUtil.delete(metricsData)
				
				// dependency data
				val dependencyData = DataSetMetaDataGenerator.autoGenRelationDataSet(ModiscoDataPackage::eINSTANCE.classDependencyItem)
				classes.collectAll[bodyDeclarations.typeSelect(typeof(AbstractMethodDeclaration)).select[body != null]].forEach[
					val classDependencyItem = ModiscoDataFactory::eINSTANCE.createClassDependencyItem
					classDependencyItem.representedElement = it
					classDependencyItem.dependencies.addAll(
						body.eAllContentsAsIterable.typeSelect(AbstractMethodInvocation)
						.collect[method]
						.select[it.eTypeSelectContainer(typeof(Package)) == pkg]
						.toSet.collect[
							val dependency = ModiscoDataFactory::eINSTANCE.createMoDiscoDataItem
							dependency.representedElement = it
							return dependency
						]									
					)
					dependencyData.items.add(classDependencyItem)
				]
				DataSetSerialization.write(new File(outputDirectory.path + "/" + pkg.qualifiedName.replace("\\.","/") + "/dependencies.json"), dependencyData)
				EcoreUtil.delete(dependencyData)
				
				// containment data
				val containmentData = DataSetMetaDataGenerator.autoGenHierarchyDataSet(ModiscoDataPackage.eINSTANCE.containmentItem)
				val containmentMap = new HashMap<EObject, ContainmentItem>
				model.eAllContentsAsIterable[!(it instanceof Block)].forEach[element|			
					val node = ModiscoDataFactory::eINSTANCE.createContainmentItem
					containmentMap.put(element, node)
					node.representedElement = element
					val parent = containmentMap.get(element.eContainer)
					if (parent != null) {
						parent.children.add(node)
					} else {
						containmentData.items.add(node)
					}
				]						
				DataSetSerialization.write(new File(outputDirectory.path + "/" + pkg.qualifiedName.replace("\\.","/") + "/containment.json"), containmentData)
				EcoreUtil.delete(containmentData)
				
				println("- processed " + pkg.qualifiedName)
			]
		]
		executorService.shutdown()
	}
}