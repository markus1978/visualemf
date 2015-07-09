package de.hub.visualemf.example

import de.hub.srcrepo.metrics.ModiscoMetrics
import java.io.File
import java.io.PrintWriter
import java.util.HashSet
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration
import org.eclipse.gmt.modisco.java.ClassDeclaration
import org.eclipse.gmt.modisco.java.NamedElement
import org.eclipse.gmt.modisco.java.TypeDeclaration
import org.eclipse.gmt.modisco.java.emf.JavaPackage
import org.json.JSONArray
import org.json.JSONObject

import static extension de.hub.srcrepo.metrics.ModiscoMetrics.*

class ExampleJsonFromModisco {
	
	val methodDepData = new JSONArray
	val classDepData = new JSONArray
	var currentMethodDeps = new HashSet<EObject>();
	var currentClassDeps = new HashSet<EObject>();
	
	val parrallelCoordsData = new JSONObject

	var TreeIterator<EObject> iterator = null
	
	def static main(String[] args) {
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.nsURI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl);
		
		val instance = new ExampleJsonFromModisco
		instance.run("model/de.hub.emffrag_java.xmi", "model/method-dependencies.json", "model/class-dependencies.json", "model/classes.json")		
	}
	
	def run(String in, String methodDepData, String classDepData, String parrallelCoordsData) {
		val head = new JSONArray
		ModiscoMetrics::metrics.map[it.metricName].forEach[head.put(it)]
		this.parrallelCoordsData.put("head", head)
		
		val rs = new ResourceSetImpl
		val r = rs.getResource(URI.createFileURI(in), true)
		for(content:r.contents) {
			traverse(content)
		}
		
		this.classDepData.checkChordData;
		
		this.methodDepData.write(methodDepData)
		this.classDepData.write(classDepData)
		this.parrallelCoordsData.write(parrallelCoordsData)
	}
	
	def checkChordData(JSONArray chordData) {
		for (var i = 0; i < chordData.length; i++) {
			val entry = chordData.getJSONObject(i)
			for (var ii = 0; ii < entry.getJSONArray("links").length; ii++) {
				var hasTarget = false;
				val link = entry.getJSONArray("links").getString(ii)
				for (var iii = 0; iii < chordData.length; iii++) {
					if (chordData.getJSONObject(iii).getString("id").equals(link)) {
						hasTarget = true;
					}
				}
				if (!hasTarget) {
					System.out.println(link + " is not in the model.")
				}
			}			
		}
	}
	
	def write(JSONArray json, String fileName) {
		val writer = new PrintWriter(new File(fileName))
		json.write(writer)
		writer.close
	}
	
	def write(JSONObject json, String fileName) {
		val writer = new PrintWriter(new File(fileName))
		json.write(writer)
		writer.close
	}
	
	def void traverse(EObject obj) {		
		iterator = obj.eAllContents;
		while (iterator.hasNext) {
			val next = iterator.next
			val prune = visit(next as EObject)
			if (prune) {
				val oldIterator = iterator
				oldIterator.prune
				traverse(next as EObject)
				after(next as EObject)
				iterator = oldIterator
			}
		}
	}
	
	def dispatch after(EObject obj) {}
	
	def dispatch boolean visit(AbstractTypeDeclaration type) {
		currentClassDeps.clear();
		return true;
	}
	
	def dispatch after(AbstractTypeDeclaration type) {
		if (type instanceof ClassDeclaration) {
			val value = new JSONObject
			value.put("name", type.name)
			val values = new JSONArray
			ModiscoMetrics::metrics.forEach[
				try {
					values.put(it.invoke(null, type) as Integer)
				} catch (Exception e) {
					e.printStackTrace
					values.put(0)		
				}
			]			
			value.put("values", values)
			value.put("id", type.id)
			parrallelCoordsData.accumulate("entries", value)
		}	
		
		val currentClassDepDataItem = new JSONObject
		classDepData.put(currentClassDepDataItem)
		currentClassDepDataItem.put("name", type.name)
		currentClassDepDataItem.put("id", type.id)
		currentClassDepDataItem.put("links", new JSONArray)
		for (obj : currentClassDeps) {
			if (obj != null) {
				if (type != obj) {
					currentClassDepDataItem.append("links", obj.id)
				}
			}
		}
	}
	
	def dispatch boolean visit(AbstractMethodDeclaration method) {
		currentMethodDeps.clear();
		return true;
	} 
	
	def dispatch after(AbstractMethodDeclaration method) {
		val currentMethodDepDataItem = new JSONObject
		methodDepData.put(currentMethodDepDataItem)
		currentMethodDepDataItem.put("name", method.name)
		currentMethodDepDataItem.put("id", method.id)
		currentMethodDepDataItem.put("links", new JSONArray)
		for (obj:currentMethodDeps) {
			currentMethodDepDataItem.append("links", obj.id)
		}
	}
	
	def dispatch boolean visit(AbstractMethodInvocation declr) {
		currentMethodDeps.add(declr.method)
		var current = declr.method as EObject
		while (!(current instanceof TypeDeclaration)) {
			current = current.eContainer
		}
		currentClassDeps.add(current);		
		return false;
	} 
	
	def dispatch boolean visit(EObject obj) {
		return true;
	}
	
	def id(EObject element) {
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