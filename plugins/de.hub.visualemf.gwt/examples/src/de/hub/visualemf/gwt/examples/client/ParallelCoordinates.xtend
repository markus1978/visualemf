package de.hub.visualemf.gwt.examples.client

import com.github.gwtd3.api.Arrays
import com.github.gwtd3.api.D3
import com.github.gwtd3.api.arrays.Array
import com.github.gwtd3.api.scales.LinearScale
import com.github.gwtd3.api.svg.Axis.Orientation
import com.google.gwt.user.client.ui.FlowPanel
import de.hub.visualemf.gwt.examples.client.TableData.Entrie
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative
import de.itemis.xtend.auto.gwt.OverlayTypeByExample
import com.github.gwtd3.api.core.ObjectAccessor
import com.google.gwt.core.client.JavaScriptObject
import com.github.gwtd3.api.arrays.NumericForEachCallback

@OverlayTypeByExample('
  {
	"head":["metric"],
    "entries":[
      {
        "values":[13,26,4],
        "name":"EmfFragActivator",
        "id":"de.hub.emffrag.EmfFragActivator"
      }
	]
  }
')
class TableData {}

@CssResource(value="ParallelCoordinatesStyles", csses="de/hub/visualemf/gwt/examples/client/ParallelCoordinatesStyles.css")
@ClientBundle
public interface ParallelCoordinatesBundle {
	
}

class ParallelCoordinates extends FlowPanel {
	
	val margin = 10
	val width = 500
	val height = 300	
	
	val css = ParallelCoordinatesBundle.Util.get.ParallelCoordinatesStyles;
	
	@JsNative private static def TableData data() '''
		return {"head":["methods","calls","fields"],"entries":[{"values":[13,26,4],"name":"EmfFragActivator","id":"de.hub.emffrag.EmfFragActivator"},{"values":[5,26,1],"name":"DataStoreURIHandler","id":"de.hub.emffrag.datastore.DataStoreURIHandler"},{"values":[3,22,2],"name":"ScanningDataStore","id":"de.hub.emffrag.datastore.ScanningDataStore"},{"values":[19,60,5],"name":"DataMap","id":"de.hub.emffrag.datastore.DataMap"},{"values":[35,60,6],"name":"InMemoryDataStore","id":"de.hub.emffrag.datastore.InMemoryDataStore"},{"values":[13,24,4],"name":"MapCache","id":"de.hub.emffrag.datastore.MapCache"},{"values":[8,8,1],"name":"LongKeyType","id":"de.hub.emffrag.datastore.LongKeyType"},{"values":[17,17,1],"name":"DelegatedDataMap","id":"de.hub.emffrag.datastore.DelegatedDataMap"},{"values":[11,43,1],"name":"AbstractDelegatingDataStore","id":"de.hub.emffrag.datastore.AbstractDelegatingDataStore"},{"values":[6,5,1],"name":"StringKeyType","id":"de.hub.emffrag.datastore.StringKeyType"},{"values":[11,45,3],"name":"FileSystemDataStore","id":"de.hub.emffrag.datastore.FileSystemDataStore"},{"values":[2,5,1],"name":"URIUtils","id":"de.hub.emffrag.datastore.URIUtils"},{"values":[4,5,1],"name":"DataStoreImpl","id":"de.hub.emffrag.datastore.DataStoreImpl"},{"values":[14,29,3],"name":"WriteCachingDataStore","id":"de.hub.emffrag.datastore.WriteCachingDataStore"},{"values":[56,137,1],"name":"AccessNotifyingEListWrapper","id":"de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl.AccessNotifyingEListWrapper"},{"values":[56,137,1],"name":"AccessNotifyingEObjectImpl","id":"de.hub.emffrag.fragmentation.AccessNotifyingEObjectImpl"},{"values":[3,21,1],"name":"UUIDEObjectInputStream","id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl.UUIDEObjectInputStream"},{"values":[3,38,0],"name":"UUIDEObjectOutputStream","id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl.UUIDEObjectOutputStream"},{"values":[4,38,0],"name":"UUIDBinaryResourceImpl","id":"de.hub.emffrag.fragmentation.UUIDBinaryResourceImpl"},{"values":[3,3,2],"name":"UserObjectID","id":"de.hub.emffrag.fragmentation.UserCaches.UserObjectID"},{"values":[3,3,3],"name":"UserReferenceID","id":"de.hub.emffrag.fragmentation.UserCaches.UserReferenceID"},{"values":[3,3,3],"name":"UserCaches","id":"de.hub.emffrag.fragmentation.UserCaches"},{"values":[50,206,7],"name":"Fragmentation","id":"de.hub.emffrag.fragmentation.Fragmentation"},{"values":[7,18,2],"name":"PooledStackMultiMap","id":"de.hub.emffrag.fragmentation.PooledStackMultiMap"},{"values":[8,12,0],"name":"FragmentsCache","id":"de.hub.emffrag.fragmentation.FragmentsCache"},{"values":[22,68,3],"name":"FObjectImpl","id":"de.hub.emffrag.fragmentation.FObjectImpl"},{"values":[15,54,3],"name":"Fragment","id":"de.hub.emffrag.fragmentation.Fragment"},{"values":[4,17,4],"name":"Ansi","id":"de.hub.util.Ansi"},{"values":[3,0,0],"name":"Plugin","id":"org.eclipse.core.runtime.Plugin"},{"values":[1,0,0],"name":"Status","id":"org.eclipse.core.runtime.Status"},{"values":[0,0,0],"name":"ResourceFactoryImpl","id":"org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl"},{"values":[1,0,0],"name":"URIHandlerImpl","id":"org.eclipse.emf.ecore.resource.impl.URIHandlerImpl"},{"values":[0,0,1],"name":"EClassData","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.EClassData"},{"values":[0,0,3],"name":"EStructuralFeatureData","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.EStructuralFeatureData"},{"values":[1,0,3],"name":"EObjectOutputStream","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream"},{"values":[0,0,0],"name":"BinaryIO","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.BinaryIO"},{"values":[0,0,2],"name":"EClassData","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream.EClassData"},{"values":[0,0,0],"name":"EStructuralFeatureData","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream.EStructuralFeatureData"},{"values":[2,0,0],"name":"EObjectInputStream","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream"},{"values":[2,0,0],"name":"BinaryResourceImpl","id":"org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl"},{"values":[14,0,4],"name":"ResourceImpl","id":"org.eclipse.emf.ecore.resource.impl.ResourceImpl"},{"values":[0,0,0],"name":"ExtensibleURIConverterImpl","id":"org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl"},{"values":[5,0,2],"name":"ResourceSetImpl","id":"org.eclipse.emf.ecore.resource.impl.ResourceSetImpl"},{"values":[1,0,0],"name":"XMIResourceFactoryImpl","id":"org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl"},{"values":[12,0,0],"name":"MinimalEObjectImpl","id":"org.eclipse.emf.ecore.impl.MinimalEObjectImpl"},{"values":[13,0,0],"name":"BasicEObjectImpl","id":"org.eclipse.emf.ecore.impl.BasicEObjectImpl"},{"values":[1,0,0],"name":"FeatureMapUtil","id":"org.eclipse.emf.ecore.util.FeatureMapUtil"},{"values":[2,0,0],"name":"EcoreUtil","id":"org.eclipse.emf.ecore.util.EcoreUtil"},{"values":[1,0,0],"name":"BasicNotifierImpl","id":"org.eclipse.emf.common.notify.impl.BasicNotifierImpl"},{"values":[0,0,0],"name":"NotifierImpl","id":"org.eclipse.emf.common.notify.impl.NotifierImpl"},{"values":[6,0,0],"name":"URI","id":"org.eclipse.emf.common.util.URI"},{"values":[1,0,0],"name":"Assert","id":"org.junit.Assert"},{"values":[1,0,0],"name":"Base32","id":"org.apache.commons.codec.binary.Base32"},{"values":[3,0,0],"name":"BaseNCodec","id":"org.apache.commons.codec.binary.BaseNCodec"},{"values":[1,0,0],"name":"Base64","id":"org.apache.commons.codec.binary.Base64"},{"values":[1,0,0],"name":"FieldUtils","id":"org.apache.commons.lang3.reflect.FieldUtils"},{"values":[0,0,0],"name":"Exception","id":"java.lang.Exception"},{"values":[2,0,0],"name":"Throwable","id":"java.lang.Throwable"},{"values":[3,0,0],"name":"Object","id":"java.lang.Object"},{"values":[9,0,0],"name":"String","id":"java.lang.String"},{"values":[0,0,1],"name":"System","id":"java.lang.System"},{"values":[0,0,0],"name":"Number","id":"java.lang.Number"},{"values":[3,0,0],"name":"RuntimeException","id":"java.lang.RuntimeException"},{"values":[7,0,0],"name":"StringBuilder","id":"java.lang.StringBuilder"},{"values":[1,0,0],"name":"AbstractStringBuilder","id":"java.lang.AbstractStringBuilder"},{"values":[4,0,1],"name":"Integer","id":"java.lang.Integer"},{"values":[1,0,0],"name":"IndexOutOfBoundsException","id":"java.lang.IndexOutOfBoundsException"},{"values":[2,0,0],"name":"IllegalArgumentException","id":"java.lang.IllegalArgumentException"},{"values":[3,0,0],"name":"StringBuffer","id":"java.lang.StringBuffer"},{"values":[0,0,1],"name":"Long","id":"java.lang.Long"},{"values":[1,0,0],"name":"Math","id":"java.lang.Math"},{"values":[2,0,0],"name":"UnsupportedOperationException","id":"java.lang.UnsupportedOperationException"},{"values":[2,0,0],"name":"IllegalStateException","id":"java.lang.IllegalStateException"},{"values":[0,0,0],"name":"Class","id":"java.lang.Class"},{"values":[0,0,0],"name":"IllegalAccessException","id":"java.lang.IllegalAccessException"},{"values":[0,0,0],"name":"ReflectiveOperationException","id":"java.lang.ReflectiveOperationException"},{"values":[1,0,0],"name":"Enum","id":"java.lang.Enum"},{"values":[1,0,0],"name":"PrintStream","id":"java.io.PrintStream"},{"values":[0,0,0],"name":"FilterOutputStream","id":"java.io.FilterOutputStream"},{"values":[1,0,0],"name":"OutputStream","id":"java.io.OutputStream"},{"values":[1,0,0],"name":"IOException","id":"java.io.IOException"},{"values":[0,0,0],"name":"InputStream","id":"java.io.InputStream"},{"values":[1,0,0],"name":"InputStreamReader","id":"java.io.InputStreamReader"},{"values":[2,0,0],"name":"Reader","id":"java.io.Reader"},{"values":[3,0,0],"name":"PrintWriter","id":"java.io.PrintWriter"},{"values":[0,0,0],"name":"Writer","id":"java.io.Writer"},{"values":[0,0,0],"name":"UnsupportedEncodingException","id":"java.io.UnsupportedEncodingException"},{"values":[1,0,0],"name":"ByteArrayInputStream","id":"java.io.ByteArrayInputStream"},{"values":[2,0,0],"name":"ByteArrayOutputStream","id":"java.io.ByteArrayOutputStream"},{"values":[6,0,0],"name":"File","id":"java.io.File"},{"values":[1,0,0],"name":"FileInputStream","id":"java.io.FileInputStream"},{"values":[0,0,0],"name":"FileNotFoundException","id":"java.io.FileNotFoundException"},{"values":[1,0,0],"name":"FileOutputStream","id":"java.io.FileOutputStream"},{"values":[1,0,0],"name":"BufferedInputStream","id":"java.io.BufferedInputStream"},{"values":[0,0,0],"name":"FilterInputStream","id":"java.io.FilterInputStream"},{"values":[1,0,0],"name":"BufferedOutputStream","id":"java.io.BufferedOutputStream"},{"values":[1,0,0],"name":"HashMap","id":"java.util.HashMap"},{"values":[0,0,0],"name":"AbstractMap","id":"java.util.AbstractMap"},{"values":[14,0,0],"name":"TreeMap","id":"java.util.TreeMap"},{"values":[2,0,0],"name":"ArrayList","id":"java.util.ArrayList"},{"values":[0,0,0],"name":"AbstractList","id":"java.util.AbstractList"},{"values":[0,0,0],"name":"AbstractCollection","id":"java.util.AbstractCollection"},{"values":[4,0,0],"name":"Stack","id":"java.util.Stack"},{"values":[1,0,0],"name":"Vector","id":"java.util.Vector"},{"values":[1,0,0],"name":"LinkedList","id":"java.util.LinkedList"},{"values":[0,0,0],"name":"AbstractSequentialList","id":"java.util.AbstractSequentialList"},{"values":[2,0,0],"name":"BigInteger","id":"java.math.BigInteger"},{"values":[6,0,0],"name":"ByteBuffer","id":"java.nio.ByteBuffer"},{"values":[0,0,0],"name":"Buffer","id":"java.nio.Buffer"},{"values":[5,0,0],"name":"CacheBuilder","id":"com.google.common.cache.CacheBuilder"},{"values":[2,0,0],"name":"RemovalNotification","id":"com.google.common.cache.RemovalNotification"},{"values":[1,0,0],"name":"Throwables","id":"com.google.common.base.Throwables"}]}
	'''
	
	@JsNative private static def void consoleLog(String msg) '''
        console.log( "me:" + msg );
  	'''
	
	def render() {
		val data = data
		
		val axis = D3.svg.axis().orient(Orientation.LEFT) 
		val dimensions = data.head.cast as Array
		// TODO this leaves to much room left and right of the actual chart
		val x =  D3.scale.ordinal().rangePoints(0, width, 1).domain(dimensions)
    
		val LinearScale[] scales = newArrayOfSize(data.head.length)		
		dimensions.forEach[object, element, index, array |
			// We MUST use NumericForEachCallback because it uses primitive doubles. 
			// All other callbacks use Double due to generics and max/min/extent use 
			// natural order, which makes a Double 20 less than a Double 9.
			val NumericForEachCallback entrieValueF = [o, d, i, a | d.<Entrie>^as.values.get(index)]
			val domain = Array.fromDoubles(Arrays.min(data.entries, entrieValueF).asDouble, Arrays.max(data.entries, entrieValueF).asDouble)		
			scales.set(index, D3.scale.linear.domain(domain).range(height, 0))
		]		
		
		// TODO the top margin extension for the header names is ugly implemented
		val svg = D3.select(this)
	    	.append("svg")
	        .attr("width", width + margin + margin)
	        .attr("height", height + margin + margin + 20)
	        .append("g")
	        .attr("transform", '''translate(«margin», «margin + 20»)''')

		val dimensionGroups = svg.selectAll(".dimension")
			.data(dimensions)
			.enter()
			.append("g")
			.attr("class", "dimension")
			.attr("transform")[context, columnName, index|'''translate(«x.apply(columnName.asString).asDouble»)'''] 
			
		dimensionGroups.append("g")
	        .attr("class", css.axis)
	        .each[element, columnName, index| D3.select(element).call(axis.scale(scales.get(index))); return null]
            .append("text")
            .style("text-anchor", "middle")
            .attr("y", -9)
            .text[element,columnName,index|columnName.asString]
            
        val line = D3.svg.line
         	.x[ctx, value, index | return x.apply(dimensions.get(index) as String).asDouble]
	    	.y[ctx, value, index | return scales.get(index).apply(value.asDouble).asDouble]
	    	
	    svg.append("g")
	       	.attr("class", css.foreground)
	        .selectAll("path")
	        .data(data.entries)
	        .enter().append("path")
	        .attr("class", "not-selected")
	        .attr("d")[ctx, value, index | line.generate(value.<Entrie>^as.values)];
	}
}