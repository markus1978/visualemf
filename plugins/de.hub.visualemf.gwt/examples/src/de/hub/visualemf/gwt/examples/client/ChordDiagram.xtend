package de.hub.visualemf.gwt.examples.client

import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.dom.client.Element
import com.google.gwt.user.client.ui.FlowPanel
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative

@CssResource(value="ChordDiagramStyles", csses="de/hub/visualemf/gwt/examples/client/ChordDiagramStyles.css")
@ClientBundle
public interface ChordDiagramBundle {
	
}

class ChordDiagram extends FlowPanel {
	
	val css = ChordDiagramBundle.Util.get.ChordDiagramStyles;
	val width = 350
	val height = 350
	
	@JsNative private static def JavaScriptObject data() '''
		return [{"name":"EmfFragActivator","links":["org.eclipse.core.runtime.Status","org.eclipse.core.runtime.ILog","org.osgi.framework.Bundle","org.eclipse.core.runtime.Plugin","org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl","org.eclipse.emf.ecore.EPackage","java.lang.Throwable","org.eclipse.emf.ecore.resource.Resource.Factory.Registry","java.util.Map","java.io.PrintStream","org.junit.Assert"],"id":"de.hub.emffrag.EmfFragActivator"},{"name":"DataStoreURIHandler","links":["org.eclipse.emf.ecore.resource.impl.URIHandlerImpl","java.lang.String","de.hub.emffrag.datastore.URIUtils","de.hub.emffrag.datastore.IBaseDataStore","de.hub.emffrag.EmfFragActivator","de.hub.util.Ansi","org.eclipse.emf.common.util.URI","java.io.IOException","java.lang.Object","de.hub.emffrag.datastore.IDataStore"],"id":"de.hub.emffrag.datastore.DataStoreURIHandler"},{"name":"ScanningDataStore","links":["de.hub.emffrag.datastore.IScanExtension.ICursor","de.hub.emffrag.datastore.IScanExtension","java.math.BigInteger","com.google.common.cache.CacheBuilder","de.hub.emffrag.datastore.AbstractDelegatingDataStore","com.google.common.cache.RemovalNotification","com.google.common.cache.Cache"],"id":"de.hub.emffrag.datastore.ScanningDataStore"},{"name":"IDataStoreFactory","links":[],"id":"de.hub.emffrag.datastore.IDataStore.IDataStoreFactory"},{"name":"IDataStore","links":["java.util.HashMap"],"id":"de.hub.emffrag.datastore.IDataStore"},{"name":"DataMap","links":["java.lang.String","java.nio.ByteBuffer","de.hub.emffrag.datastore.URIUtils","de.hub.emffrag.datastore.IBaseDataStore","de.hub.emffrag.datastore.KeyType","java.io.PrintWriter","java.io.InputStreamReader","java.io.Reader","java.lang.StringBuilder","org.eclipse.emf.common.util.URI","java.lang.Object","java.lang.RuntimeException"],"id":"de.hub.emffrag.datastore.DataMap"},{"name":"InMemoryDataStore","links":["java.lang.String","java.lang.IndexOutOfBoundsException","de.hub.emffrag.datastore.URIUtils","java.util.Map.Entry","java.lang.Integer","java.io.ByteArrayOutputStream","java.util.Set","java.io.ByteArrayInputStream","java.util.TreeMap","java.lang.StringBuffer","java.util.SortedMap","java.lang.IllegalArgumentException","java.util.Iterator"],"id":"de.hub.emffrag.datastore.InMemoryDataStore"},{"name":"MapCache","links":["java.lang.String","java.util.Map.Entry","java.util.HashMap","java.util.Map","de.hub.emffrag.datastore.KeyType","de.hub.emffrag.datastore.IDataMap","java.util.TreeMap","java.lang.Object"],"id":"de.hub.emffrag.datastore.MapCache"},{"name":"LongKeyType","links":["java.nio.ByteBuffer"],"id":"de.hub.emffrag.datastore.LongKeyType"},{"name":"IDataMap","links":[],"id":"de.hub.emffrag.datastore.IDataMap"},{"name":"DelegatedDataMap","links":["de.hub.emffrag.datastore.IDataMap","java.lang.Object"],"id":"de.hub.emffrag.datastore.DelegatedDataMap"},{"name":"IBulkInsertExtension","links":[],"id":"de.hub.emffrag.datastore.IBulkInsertExtension"},{"name":"AbstractDelegatingDataStore","links":["de.hub.emffrag.datastore.URIUtils","de.hub.emffrag.EmfFragActivator","de.hub.emffrag.datastore.IBaseDataStore","de.hub.util.Ansi","java.lang.Math","java.lang.Object"],"id":"de.hub.emffrag.datastore.AbstractDelegatingDataStore"},{"name":"ICursor","links":[],"id":"de.hub.emffrag.datastore.IScanExtension.ICursor"},{"name":"IScanExtension","links":[],"id":"de.hub.emffrag.datastore.IScanExtension"},{"name":"StringKeyType","links":["java.lang.String"],"id":"de.hub.emffrag.datastore.StringKeyType"},{"name":"FileSystemDataStore","links":["java.io.FileOutputStream","java.io.File","java.lang.String","java.lang.UnsupportedOperationException","org.apache.commons.codec.binary.Base32","java.io.FileInputStream","org.apache.commons.codec.binary.BaseNCodec","java.util.TreeMap","com.google.common.base.Throwables"],"id":"de.hub.emffrag.datastore.FileSystemDataStore"},{"name":"IBaseDataStore","links":[],"id":"de.hub.emffrag.datastore.IBaseDataStore"},{"name":"KeyType","links":[],"id":"de.hub.emffrag.datastore.KeyType"},{"name":"URIUtils","links":["java.lang.String","org.apache.commons.codec.binary.Base64","org.apache.commons.codec.binary.BaseNCodec"],"id":"de.hub.emffrag.datastore.URIUtils"},{"name":"DataStoreImpl","links":["de.hub.emffrag.datastore.IDataStore.IDataStoreFactory","de.hub.emffrag.datastore.AbstractDelegatingDataStore","java.util.Map","de.hub.emffrag.datastore.DataMap","org.eclipse.emf.common.util.URI"],"id":"de.hub.emffrag.datastore.DataStoreImpl"},{"name":"WriteCachingDataStore","links":["de.hub.emffrag.datastore.AbstractDelegatingDataStore","java.io.ByteArrayOutputStream","java.io.ByteArrayInputStream","java.util.Comparator","java.util.TreeMap","de.hub.emffrag.datastore.IBulkInsertExtension"],"id":"de.hub.emffrag.datastore.WriteCachingDataStore"},{"name":"AccessNotifyingEListWrapper","links":["org.eclipse.emf.ecore.util.InternalEList","org.eclipse.emf.ecore.EStructuralFeature.Setting","java.util.List","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl","org.eclipse.emf.common.util.EList"],"id":"de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl.AccessNotifyingEListWrapper"},{"name":"AccessNotifyingEObjectImpl","links":["org.eclipse.emf.ecore.util.InternalEList","org.eclipse.emf.ecore.EStructuralFeature.Setting","java.util.List","org.eclipse.emf.common.util.EList","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl.AccessNotifyingEListWrapper"],"id":"de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl"},{"name":"UUIDEObjectInputStream","links":["java.util.List","org.eclipse.emf.ecore.EFactory","org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream","de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl","java.util.ArrayList"],"id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl.UUIDEObjectInputStream"},{"name":"UUIDEObjectOutputStream","links":["org.eclipse.emf.ecore.resource.Resource","de.hub.emffrag.fragmentation.FObject","org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream","java.util.Map","org.eclipse.emf.ecore.InternalEObject","de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl","org.eclipse.emf.ecore.EObject"],"id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl.UUIDEObjectOutputStream"},{"name":"UUIDBinaryResourceImpl","links":["org.eclipse.emf.ecore.resource.Resource","de.hub.emffrag.fragmentation.FObject","org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream","de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl.UUIDEObjectOutputStream","java.util.Map","org.eclipse.emf.ecore.InternalEObject","org.eclipse.emf.ecore.EObject"],"id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl"},{"name":"FObject","links":[],"id":"de.hub.emffrag.fragmentation.FObject"},{"name":"UserObjectID","links":["java.lang.Object"],"id":"de.hub.emffrag.fragmentation.UserCaches.UserObjectID"},{"name":"UserReferenceID","links":["java.lang.Object"],"id":"de.hub.emffrag.fragmentation.UserCaches.UserReferenceID"},{"name":"UserCaches","links":["java.lang.Object"],"id":"de.hub.emffrag.fragmentation.UserCaches"},{"name":"Fragmentation","links":["java.lang.String","de.hub.emffrag.datastore.IBaseDataStore","org.eclipse.emf.ecore.impl.BasicEObjectImpl","org.apache.commons.lang3.reflect.FieldUtils","java.util.ArrayList","java.lang.IllegalStateException","org.eclipse.emf.ecore.resource.impl.ResourceImpl","org.eclipse.emf.ecore.resource.URIConverter","de.hub.emffrag.fragmentation.FragmentsCache","org.eclipse.emf.ecore.resource.impl.ResourceSetImpl","java.lang.IllegalArgumentException","java.lang.RuntimeException","java.lang.Object","de.hub.emffrag.datastore.IDataStore","java.util.Iterator","org.eclipse.emf.ecore.resource.Resource","java.lang.UnsupportedOperationException","de.hub.emffrag.EmfFragActivator","org.eclipse.emf.common.notify.Notification","de.hub.emffrag.fragmentation.FObjectImpl","java.lang.Throwable","org.eclipse.emf.ecore.EModelElement","de.hub.util.Ansi","java.util.List","java.lang.Integer","de.hub.emffrag.fragmentation.UserCaches","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl","de.hub.emffrag.datastore.DataStoreURIHandler","de.hub.emffrag.datastore.IDataMap","de.hub.emffrag.fragmentation.Fragment","org.eclipse.emf.common.util.URI","org.eclipse.emf.ecore.EObject"],"id":"de.hub.emffrag.fragmentation.Fragmentation"},{"name":"Nullable","links":[],"id":"de.hub.emffrag.fragmentation.PooledStackMultiMap.Nullable"},{"name":"PooledStackMultiMap","links":["java.util.Vector","de.hub.emffrag.fragmentation.PooledStackMultiMap.Nullable","java.util.Map","java.util.Stack","java.util.HashMap"],"id":"de.hub.emffrag.fragmentation.PooledStackMultiMap"},{"name":"FragmentsCacheListener","links":[],"id":"de.hub.emffrag.fragmentation.FragmentsCache.FragmentsCacheListener"},{"name":"FragmentsCache","links":["java.util.Queue","java.util.Collection","java.lang.IllegalStateException","java.lang.IllegalArgumentException","de.hub.emffrag.fragmentation.FragmentsCache.FragmentsCacheListener"],"id":"de.hub.emffrag.fragmentation.FragmentsCache"},{"name":"FObjectImpl","links":["org.eclipse.emf.ecore.EClass","org.eclipse.emf.ecore.impl.BasicEObjectImpl","de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl","java.lang.IllegalStateException","org.eclipse.emf.ecore.resource.impl.ResourceImpl","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl.AccessNotifyingEListWrapper","org.eclipse.emf.ecore.util.EcoreUtil","org.eclipse.emf.ecore.impl.MinimalEObjectImpl","de.hub.emffrag.fragmentation.PooledStackMultiMap","de.hub.emffrag.fragmentation.UserCaches","org.eclipse.emf.common.notify.impl.BasicNotifierImpl","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl","de.hub.emffrag.fragmentation.Fragmentation","org.eclipse.emf.ecore.EStructuralFeature","de.hub.emffrag.fragmentation.Fragment"],"id":"de.hub.emffrag.fragmentation.FObjectImpl"},{"name":"Fragment","links":["de.hub.emffrag.fragmentation.FObject","de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl","java.util.ArrayList","java.lang.IllegalStateException","org.eclipse.emf.ecore.resource.impl.ResourceImpl","java.util.Iterator","org.eclipse.emf.common.notify.Notification","org.eclipse.emf.ecore.impl.MinimalEObjectImpl","de.hub.emffrag.fragmentation.FObjectImpl","java.util.List","de.hub.emffrag.fragmentation.UserCaches","de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl","de.hub.emffrag.fragmentation.Fragmentation","org.eclipse.emf.common.util.URI"],"id":"de.hub.emffrag.fragmentation.Fragment"},{"name":"Attribute","links":["java.lang.String"],"id":"de.hub.util.Ansi.Attribute"},{"name":"Color","links":[],"id":"de.hub.util.Ansi.Color"},{"name":"Ansi","links":["java.lang.Enum","java.lang.AbstractStringBuilder","java.lang.StringBuilder"],"id":"de.hub.util.Ansi"},{"name":"Plugin","links":[],"id":"org.eclipse.core.runtime.Plugin"},{"name":"Status","links":[],"id":"org.eclipse.core.runtime.Status"},{"name":"IStatus","links":[],"id":"org.eclipse.core.runtime.IStatus"},{"name":"ILog","links":[],"id":"org.eclipse.core.runtime.ILog"},{"name":"Registry","links":[],"id":"org.eclipse.emf.ecore.EPackage.Registry"},{"name":"EPackage","links":[],"id":"org.eclipse.emf.ecore.EPackage"},{"name":"ENamedElement","links":[],"id":"org.eclipse.emf.ecore.ENamedElement"},{"name":"EModelElement","links":[],"id":"org.eclipse.emf.ecore.EModelElement"},{"name":"EObject","links":[],"id":"org.eclipse.emf.ecore.EObject"},{"name":"EcorePackage","links":[],"id":"org.eclipse.emf.ecore.EcorePackage"},{"name":"DynamicValueHolder","links":[],"id":"org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder"},{"name":"Internal","links":[],"id":"org.eclipse.emf.ecore.EStructuralFeature.Internal"},{"name":"Setting","links":[],"id":"org.eclipse.emf.ecore.EStructuralFeature.Setting"},{"name":"EStructuralFeature","links":[],"id":"org.eclipse.emf.ecore.EStructuralFeature"},{"name":"ETypedElement","links":[],"id":"org.eclipse.emf.ecore.ETypedElement"},{"name":"InternalEObject","links":[],"id":"org.eclipse.emf.ecore.InternalEObject"},{"name":"EClass","links":[],"id":"org.eclipse.emf.ecore.EClass"},{"name":"EClassifier","links":[],"id":"org.eclipse.emf.ecore.EClassifier"},{"name":"EFactory","links":[],"id":"org.eclipse.emf.ecore.EFactory"},{"name":"EOperation","links":[],"id":"org.eclipse.emf.ecore.EOperation"},{"name":"EReference","links":[],"id":"org.eclipse.emf.ecore.EReference"},{"name":"Registry","links":[],"id":"org.eclipse.emf.ecore.resource.Resource.Factory.Registry"},{"name":"Factory","links":[],"id":"org.eclipse.emf.ecore.resource.Resource.Factory"},{"name":"Internal","links":[],"id":"org.eclipse.emf.ecore.resource.Resource.Internal"},{"name":"Resource","links":[],"id":"org.eclipse.emf.ecore.resource.Resource"},{"name":"URIHandler","links":[],"id":"org.eclipse.emf.ecore.resource.URIHandler"},{"name":"Saveable","links":[],"id":"org.eclipse.emf.ecore.resource.URIConverter.Saveable"},{"name":"Loadable","links":[],"id":"org.eclipse.emf.ecore.resource.URIConverter.Loadable"},{"name":"URIConverter","links":[],"id":"org.eclipse.emf.ecore.resource.URIConverter"},{"name":"ResourceSet","links":[],"id":"org.eclipse.emf.ecore.resource.ResourceSet"},{"name":"ResourceFactoryImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl"},{"name":"URIHandlerImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.URIHandlerImpl"},{"name":"Check","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.Check"},{"name":"EClassData","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.EClassData"},{"name":"EStructuralFeatureData","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.EStructuralFeatureData"},{"name":"EObjectOutputStream","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream"},{"name":"FeatureKind","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.BinaryIO.FeatureKind"},{"name":"BinaryIO","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.BinaryIO"},{"name":"EClassData","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream.EClassData"},{"name":"EStructuralFeatureData","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream.EStructuralFeatureData"},{"name":"EObjectInputStream","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream"},{"name":"BinaryResourceImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl"},{"name":"ResourceImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.ResourceImpl"},{"name":"ExtensibleURIConverterImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl"},{"name":"ResourceSetImpl","links":[],"id":"org.eclipse.emf.ecore.resource.impl.ResourceSetImpl"},{"name":"XMIResourceFactoryImpl","links":[],"id":"org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl"},{"name":"MinimalEObjectImpl","links":[],"id":"org.eclipse.emf.ecore.impl.MinimalEObjectImpl"},{"name":"BasicEObjectImpl","links":[],"id":"org.eclipse.emf.ecore.impl.BasicEObjectImpl"},{"name":"FeatureMapUtil","links":[],"id":"org.eclipse.emf.ecore.util.FeatureMapUtil"},{"name":"Unsettable","links":[],"id":"org.eclipse.emf.ecore.util.InternalEList.Unsettable"},{"name":"InternalEList","links":[],"id":"org.eclipse.emf.ecore.util.InternalEList"},{"name":"EcoreUtil","links":[],"id":"org.eclipse.emf.ecore.util.EcoreUtil"},{"name":"Notifier","links":[],"id":"org.eclipse.emf.common.notify.Notifier"},{"name":"NotificationChain","links":[],"id":"org.eclipse.emf.common.notify.NotificationChain"},{"name":"Notification","links":[],"id":"org.eclipse.emf.common.notify.Notification"},{"name":"BasicNotifierImpl","links":[],"id":"org.eclipse.emf.common.notify.impl.BasicNotifierImpl"},{"name":"NotifierImpl","links":[],"id":"org.eclipse.emf.common.notify.impl.NotifierImpl"},{"name":"URI","links":[],"id":"org.eclipse.emf.common.util.URI"},{"name":"EList","links":[],"id":"org.eclipse.emf.common.util.EList"},{"name":"TreeIterator","links":[],"id":"org.eclipse.emf.common.util.TreeIterator"},{"name":"BundleActivator","links":[],"id":"org.osgi.framework.BundleActivator"},{"name":"BundleContext","links":[],"id":"org.osgi.framework.BundleContext"},{"name":"BundleReference","links":[],"id":"org.osgi.framework.BundleReference"},{"name":"Bundle","links":[],"id":"org.osgi.framework.Bundle"},{"name":"Assert","links":[],"id":"org.junit.Assert"},{"name":"BinaryEncoder","links":[],"id":"org.apache.commons.codec.BinaryEncoder"},{"name":"Encoder","links":[],"id":"org.apache.commons.codec.Encoder"},{"name":"BinaryDecoder","links":[],"id":"org.apache.commons.codec.BinaryDecoder"},{"name":"Decoder","links":[],"id":"org.apache.commons.codec.Decoder"},{"name":"Base32","links":[],"id":"org.apache.commons.codec.binary.Base32"},{"name":"BaseNCodec","links":[],"id":"org.apache.commons.codec.binary.BaseNCodec"},{"name":"Base64","links":[],"id":"org.apache.commons.codec.binary.Base64"},{"name":"FieldUtils","links":[],"id":"org.apache.commons.lang3.reflect.FieldUtils"},{"name":"Override","links":[],"id":"java.lang.Override"},{"name":"Exception","links":[],"id":"java.lang.Exception"},{"name":"Throwable","links":[],"id":"java.lang.Throwable"},{"name":"Object","links":[],"id":"java.lang.Object"},{"name":"String","links":[],"id":"java.lang.String"},{"name":"Comparable","links":[],"id":"java.lang.Comparable"},{"name":"CharSequence","links":[],"id":"java.lang.CharSequence"},{"name":"System","links":[],"id":"java.lang.System"},{"name":"AutoCloseable","links":[],"id":"java.lang.AutoCloseable"},{"name":"Appendable","links":[],"id":"java.lang.Appendable"},{"name":"Number","links":[],"id":"java.lang.Number"},{"name":"Cloneable","links":[],"id":"java.lang.Cloneable"},{"name":"Readable","links":[],"id":"java.lang.Readable"},{"name":"RuntimeException","links":[],"id":"java.lang.RuntimeException"},{"name":"StringBuilder","links":[],"id":"java.lang.StringBuilder"},{"name":"AbstractStringBuilder","links":[],"id":"java.lang.AbstractStringBuilder"},{"name":"Integer","links":[],"id":"java.lang.Integer"},{"name":"Iterable","links":[],"id":"java.lang.Iterable"},{"name":"IndexOutOfBoundsException","links":[],"id":"java.lang.IndexOutOfBoundsException"},{"name":"IllegalArgumentException","links":[],"id":"java.lang.IllegalArgumentException"},{"name":"StringBuffer","links":[],"id":"java.lang.StringBuffer"},{"name":"Long","links":[],"id":"java.lang.Long"},{"name":"Math","links":[],"id":"java.lang.Math"},{"name":"UnsupportedOperationException","links":[],"id":"java.lang.UnsupportedOperationException"},{"name":"SuppressWarnings","links":[],"id":"java.lang.SuppressWarnings"},{"name":"IllegalStateException","links":[],"id":"java.lang.IllegalStateException"},{"name":"Class","links":[],"id":"java.lang.Class"},{"name":"IllegalAccessException","links":[],"id":"java.lang.IllegalAccessException"},{"name":"ReflectiveOperationException","links":[],"id":"java.lang.ReflectiveOperationException"},{"name":"Enum","links":[],"id":"java.lang.Enum"},{"name":"GenericDeclaration","links":[],"id":"java.lang.reflect.GenericDeclaration"},{"name":"AnnotatedElement","links":[],"id":"java.lang.reflect.AnnotatedElement"},{"name":"Type","links":[],"id":"java.lang.reflect.Type"},{"name":"Serializable","links":[],"id":"java.io.Serializable"},{"name":"PrintStream","links":[],"id":"java.io.PrintStream"},{"name":"FilterOutputStream","links":[],"id":"java.io.FilterOutputStream"},{"name":"OutputStream","links":[],"id":"java.io.OutputStream"},{"name":"Closeable","links":[],"id":"java.io.Closeable"},{"name":"Flushable","links":[],"id":"java.io.Flushable"},{"name":"IOException","links":[],"id":"java.io.IOException"},{"name":"InputStream","links":[],"id":"java.io.InputStream"},{"name":"InputStreamReader","links":[],"id":"java.io.InputStreamReader"},{"name":"Reader","links":[],"id":"java.io.Reader"},{"name":"PrintWriter","links":[],"id":"java.io.PrintWriter"},{"name":"Writer","links":[],"id":"java.io.Writer"},{"name":"UnsupportedEncodingException","links":[],"id":"java.io.UnsupportedEncodingException"},{"name":"ByteArrayInputStream","links":[],"id":"java.io.ByteArrayInputStream"},{"name":"ByteArrayOutputStream","links":[],"id":"java.io.ByteArrayOutputStream"},{"name":"File","links":[],"id":"java.io.File"},{"name":"FileInputStream","links":[],"id":"java.io.FileInputStream"},{"name":"FileNotFoundException","links":[],"id":"java.io.FileNotFoundException"},{"name":"FileOutputStream","links":[],"id":"java.io.FileOutputStream"},{"name":"BufferedInputStream","links":[],"id":"java.io.BufferedInputStream"},{"name":"FilterInputStream","links":[],"id":"java.io.FilterInputStream"},{"name":"BufferedOutputStream","links":[],"id":"java.io.BufferedOutputStream"},{"name":"Entry","links":[],"id":"java.util.Map.Entry"},{"name":"Map","links":[],"id":"java.util.Map"},{"name":"HashMap","links":[],"id":"java.util.HashMap"},{"name":"AbstractMap","links":[],"id":"java.util.AbstractMap"},{"name":"Comparator","links":[],"id":"java.util.Comparator"},{"name":"TreeMap","links":[],"id":"java.util.TreeMap"},{"name":"NavigableMap","links":[],"id":"java.util.NavigableMap"},{"name":"SortedMap","links":[],"id":"java.util.SortedMap"},{"name":"Set","links":[],"id":"java.util.Set"},{"name":"Collection","links":[],"id":"java.util.Collection"},{"name":"Iterator","links":[],"id":"java.util.Iterator"},{"name":"List","links":[],"id":"java.util.List"},{"name":"ListIterator","links":[],"id":"java.util.ListIterator"},{"name":"ArrayList","links":[],"id":"java.util.ArrayList"},{"name":"AbstractList","links":[],"id":"java.util.AbstractList"},{"name":"AbstractCollection","links":[],"id":"java.util.AbstractCollection"},{"name":"RandomAccess","links":[],"id":"java.util.RandomAccess"},{"name":"Stack","links":[],"id":"java.util.Stack"},{"name":"Vector","links":[],"id":"java.util.Vector"},{"name":"LinkedList","links":[],"id":"java.util.LinkedList"},{"name":"AbstractSequentialList","links":[],"id":"java.util.AbstractSequentialList"},{"name":"Deque","links":[],"id":"java.util.Deque"},{"name":"Queue","links":[],"id":"java.util.Queue"},{"name":"BigInteger","links":[],"id":"java.math.BigInteger"},{"name":"ByteBuffer","links":[],"id":"java.nio.ByteBuffer"},{"name":"Buffer","links":[],"id":"java.nio.Buffer"},{"name":"Cache","links":[],"id":"com.google.common.cache.Cache"},{"name":"CacheBuilder","links":[],"id":"com.google.common.cache.CacheBuilder"},{"name":"RemovalCause","links":[],"id":"com.google.common.cache.RemovalCause"},{"name":"RemovalListener","links":[],"id":"com.google.common.cache.RemovalListener"},{"name":"RemovalNotification","links":[],"id":"com.google.common.cache.RemovalNotification"},{"name":"Throwables","links":[],"id":"com.google.common.base.Throwables"},{"name":"Resource","links":[],"id":"javax.annotation.Resource"}];
	'''
	
	@JsNative private def JavaScriptObject create(Element element, JavaScriptObject data, String chart, String source, String target) '''
		var d3 = $wnd.d3;
		var w = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::width;
		var h = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::height;
		
		var rx = w / 2,
		    ry = h / 2,
		    m0,
		    rotate = 0;
		
		var splines = [];
		
		var cluster = d3.layout.cluster()
		    .size([360, ry - 120])
		    .sort(function(a, b) {
		        return d3.ascending(a.key, b.key);
		    });
		
		var bundle = d3.layout.bundle();
		
		var line = d3.svg.line.radial()
		    .interpolate("bundle")
		    .tension(.85)
		    .radius(function(d) {
		        return d.y;
		    })
		    .angle(function(d) {
		        return d.x / 180 * Math.PI;
		    });
		
		var svg, div, nodes;
		
		var create = function() {
			var path;
			var mouseover = function(data) {
			    path.filter(function(d){
			    		return d.target==data;
			    	})
			        .classed(target, true);
				path.filter(function(d){return d.source==data;})
			        .classed(source, true);
			};
			
			var mouseout = function(data) {
			    path.filter(function(d){return d.target==data;})
			        .classed(target, false);
				path.filter(function(d){return d.source==data;})
			        .classed(source, false);
			};
			
		    div = d3.select(element).insert("div", "h2");
		
		    svg = div.append("svg:svg")
		    	.attr("class", chart)
		        .attr("width", w)
		        .attr("height", w)
		        .append("svg:g")
		        .attr("transform", "translate(" + rx + "," + ry + ")");
		
		    nodes = cluster.nodes(packages.root(data));
		    var links = packages.links(nodes),
		    	splines = bundle(links);
		
		    path = svg.selectAll("path")
		        .data(links)
		        .enter().append("svg:path")
		        .attr("d", function(d, i) {
		            return line(splines[i]);
		        });
		
		    svg.selectAll("g.node")
		        .data(nodes.filter(function(n) {
		            return !n.children;
		        }))
		        .enter().append("svg:g")
		        .attr("class", "node")
		        .attr("id", function(d) {
		            return "node";
		        })
		        .attr("transform", function(d) {
		            return "rotate(" + (d.x - 90) + ")translate(" + d.y + ")";
		        })
		        .append("svg:text")
		        .attr("dx", function(d) {
		            return d.x < 180 ? 8 : -8;
		        })
		        .attr("dy", ".31em")
		        .attr("text-anchor", function(d) {
		            return d.x < 180 ? "start" : "end";
		        })
		        .attr("transform", function(d) {
		            return d.x < 180 ? null : "rotate(180)";
		        })
		        .text(function(d) {
		            return d.name;
		        })
		        .on("mouseover", mouseover)
		        .on("mouseout", mouseout);
		
		    d3.select("input[type=range]").on("change", function() {
		        line.tension(this.value / 100);
		        path.attr("d", function(d, i) {
		            return line(splines[i]);
		        });
		    });
		
		    d3.select(window)
		        .on("mousemove", mousemove)
		        .on("mouseup", mouseup);
		};
		
		var mouse = function(e) {
		    return [e.pageX - rx, e.pageY - ry];
		}
		
		var mousedown = function() {
		    m0 = mouse(d3.event);
		    d3.event.preventDefault();
		};
		
		var mousemove = function() {
		    if (m0) {
		        var m1 = mouse(d3.event),
		            dm = Math.atan2(cross(m0, m1), dot(m0, m1)) * 180 / Math.PI;
		        div.style("-webkit-transform", "translateY(" + (ry - rx) + "px)rotateZ(" + dm + "deg)translateY(" + (rx - ry) + "px)");
		    }
		};
		
		var mouseup = function() {
		    if (m0) {
		        var m1 = mouse(d3.event),
		            dm = Math.atan2(cross(m0, m1), dot(m0, m1)) * 180 / Math.PI;
		
		        rotate += dm;
		        if (rotate > 360) rotate -= 360;
		        else if (rotate < 0) rotate += 360;
		        m0 = null;
		
		        div.style("-webkit-transform", null);
		
		        svg
		            .attr("transform", "translate(" + rx + "," + ry + ")rotate(" + rotate + ")")
		            .selectAll("g.node text")
		            .attr("dx", function(d) {
		                return (d.x + rotate) % 360 < 180 ? 8 : -8;
		            })
		            .attr("text-anchor", function(d) {
		                return (d.x + rotate) % 360 < 180 ? "start" : "end";
		            })
		            .attr("transform", function(d) {
		                return (d.x + rotate) % 360 < 180 ? null : "rotate(180)";
		            });
		        
		    }
		};
		
		var cross = function(a, b) {
		    return a[0] * b[1] - a[1] * b[0];
		}
		
		var dot = function(a, b) {
		    return a[0] * b[0] + a[1] * b[1];
		}
		
		var packages = {
		    // Lazily construct the package hierarchy from entity names.
		    root: function(entities) {
		        var map = {};
		
		        function find(id, data) {
		            var node = map[id],
		                i;
		            if (!node) {
		                node = map[id] = data || {
		                    id: id,
		                    children: []
		                };
		                if (id.length) {
		                    node.parent = find(id.substring(0, i = id.lastIndexOf(".")));
		                    node.parent.children.push(node);
		                    node.key = id.substring(i + 1);
		                }
		            }
		            return node;
		        }
		
		        entities.forEach(function(d) {
		            find(d.id, d);
		        });
		
		        return map[""];
		    },
		
		    // Return a list of links for the given array of nodes.
		    links: function(nodes) {
		        var map = {},
		            links = [];
		
		        // Compute a map from id to node.
		        nodes.forEach(function(d) {
		            map[d.id] = d;
		        });
		
		        // For each link, construct a link from the source to target node.
		        nodes.forEach(function(d) {
		            if (d.links) d.links.forEach(function(i) {
		                links.push({
		                    source: map[d.id],
		                    target: map[i]
		                });
		            });
		        });
		
		        return links;
		    }
		
		};
		
		create();
		
		return null;
	'''

	override def onLoad() {
		render()
	}

	def render() {
		create(this.element, data, css.chart, css.source, css.target)
	}
}