package de.hub.visualemf.modisco;

import de.hub.visualemf.modiscodata.ModiscoDataPackage;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.omg.kdm.data.DataPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class XmiToBin {
  public static void main(final String[] args) {
    try {
      String _nsURI = EcorePackage.eINSTANCE.getNsURI();
      EPackage.Registry.INSTANCE.put(_nsURI, EcorePackage.eINSTANCE);
      EPackage.Registry.INSTANCE.put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", JavaPackage.eINSTANCE);
      String _nsURI_1 = DataPackage.eINSTANCE.getNsURI();
      EPackage.Registry.INSTANCE.put(_nsURI_1, DataPackage.eINSTANCE);
      String _nsURI_2 = ModiscoDataPackage.eINSTANCE.getNsURI();
      EPackage.Registry.INSTANCE.put(_nsURI_2, ModiscoDataPackage.eINSTANCE);
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Map<String, Object> _extensionToFactoryMap_1 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_1.put("xml", _xMIResourceFactoryImpl_1);
      Map<String, Object> _extensionToFactoryMap_2 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_2 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_2.put("ecore", _xMIResourceFactoryImpl_2);
      Map<String, Object> _extensionToFactoryMap_3 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      _extensionToFactoryMap_3.put("java", new Resource.Factory() {
        @Override
        public Resource createResource(final URI uri) {
          return new BinaryResourceImpl(uri);
        }
      });
      final ResourceSetImpl rs = new ResourceSetImpl();
      URI _createURI = URI.createURI("model/jdt.xml");
      final Resource source = rs.getResource(_createURI, true);
      URI _createURI_1 = URI.createURI("model/jdt.java");
      final Resource target = rs.createResource(_createURI_1);
      EList<EObject> _contents = target.getContents();
      EList<EObject> _contents_1 = source.getContents();
      _contents.addAll(_contents_1);
      target.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
