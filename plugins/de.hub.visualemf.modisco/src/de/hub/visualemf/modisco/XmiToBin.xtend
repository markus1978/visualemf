package de.hub.visualemf.modisco

import de.hub.visualemf.modiscodata.ModiscoDataPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.gmt.modisco.java.emf.JavaPackage
import org.eclipse.gmt.modisco.omg.kdm.data.DataPackage

class XmiToBin {
	def static main(String[] args) {
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.nsURI, EcorePackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(DataPackage.eINSTANCE.nsURI, DataPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(ModiscoDataPackage.eINSTANCE.nsURI, ModiscoDataPackage.eINSTANCE)
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", new Resource.Factory() {
			override createResource(URI uri) {
				return new BinaryResourceImpl(uri)
			}
		})
		
		val rs = new ResourceSetImpl
		val source = rs.getResource(URI.createURI("model/jdt.xml"), true)
		val target = rs.createResource(URI.createURI("model/jdt.java"))
		target.contents.addAll(source.contents)
		target.save(null)
	}
}