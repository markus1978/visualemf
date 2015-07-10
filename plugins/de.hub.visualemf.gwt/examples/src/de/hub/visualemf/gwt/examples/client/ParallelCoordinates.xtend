package de.hub.visualemf.gwt.examples.client

import com.github.gwtd3.api.Arrays
import com.github.gwtd3.api.Coords
import com.github.gwtd3.api.D3
import com.github.gwtd3.api.D3Event
import com.github.gwtd3.api.arrays.Array
import com.github.gwtd3.api.arrays.NumericForEachCallback
import com.github.gwtd3.api.behaviour.Drag.DragEventType
import com.github.gwtd3.api.core.Selection
import com.github.gwtd3.api.scales.LinearScale
import com.github.gwtd3.api.scales.OrdinalScale
import com.github.gwtd3.api.svg.Axis.Orientation
import com.github.gwtd3.api.svg.Brush
import com.github.gwtd3.api.svg.Brush.BrushEvent
import com.google.gwt.core.client.JsArrayNumber
import com.google.gwt.dom.client.Element
import de.hub.visualemf.gwt.examples.client.GlobalSelection.SelectionItem
import de.hub.visualemf.gwt.examples.client.TableData.Entrie
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative
import de.itemis.xtend.auto.gwt.OverlayTypeByExample
import java.util.HashMap
import java.util.Map

import static extension de.hub.visualemf.gwt.examples.client.GlobalSelection.*

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

class ParallelCoordinates extends AbstractPackageVis<TableData> {
	
	val selection = GlobalSelection::instance
	
	val margin = 10
	val width = 750
	val height = 300	
	
	val css = ParallelCoordinatesBundle.Util.get.ParallelCoordinatesStyles;
	val line = D3.svg.line
	
	var OrdinalScale dimensionScale	
	var Array<String> dimensions
	var Array<String> originalDimensions
	var Array<LinearScale> scales  
	var Array<Brush> brushes
	var Map<String,Double> dragging
	
	var Selection coordLinesContainer
	var Selection coordLines
	var Selection dimensionGroups
	
	var Selection svg = null
	
	override protected getFileName() {
		"metrics.json"
	}
	
	override def onLoad() {		
		// TODO the top margin extension for the header names is ugly implemented
		svg = D3.select(this.element)
	    	.append("svg")
	        .attr("width", width)
	        .attr("height", height)
	        .append("g")
	        .attr("transform", '''translate(«margin + 10», «margin + 20»)''')
	        
	    coordLinesContainer = svg.append("g")
	    	.attr("class", css.foreground)
	    
	    super.onLoad()    	    
	}
	
	override protected updateSelection() {
		 coordLines.classed(css.selected, [e,d,i |
		 	val entry = d.<TableData.Entrie>^as
		 	return selection.current.contains(entry.id.newSelectionItemFromClass)		 	
        ])
	}
	
	override def updateData(TableData data) {
		val axis = D3.svg.axis().orient(Orientation.LEFT)  
		dimensions = data.head.cast
		originalDimensions = dimensions.map[e,d,i,a|d.asString]
		
		dimensionScale =  D3.scale.ordinal().domain(dimensions).rangePoints(0, width-2*margin-10, 0.2d)
    
		dragging = new HashMap<String,Double>()
		
		scales = dimensions.map[e,d,dimensionIndex,a|
			// We MUST use NumericForEachCallback because it uses primitive doubles. 
			// All other callbacks use Double due to generics and max/min/extent use 
			// natural order, which makes a Double 20 less than a Double 9.
			val NumericForEachCallback entrieValueF = [o, entry, i, aa | entry.<Entrie>^as.values.get(dimensionIndex)*1.05d]
			val domain = Array.fromDoubles(Arrays.min(data.entries, entrieValueF).asDouble, Arrays.max(data.entries, entrieValueF).asDouble)
			return D3.scale.linear.domain(domain).range(height-2*margin-20, 0)
		]
		brushes = scales.map[e,scale,i,a|
			return D3.svg.brush.y(scale.<LinearScale>^as).extent(0, 0)
				.on(BrushEvent.BRUSH)[ee,dd,ii| brush return null]
				.on(BrushEvent.BRUSH_START)[ee,dd,ii| brushstart return null]
		]	

		svg.selectAll(".dimension").remove()
		dimensionGroups = svg.selectAll(".dimension").data(dimensions)
			.enter()
			.append("g")
			.attr("class", "dimension")
			.attr("transform")[c, columnName, i|'''translate(«dimensionScale.apply(columnName.asString).asDouble»)''']
			.call(D3.behavior.drag()
      			.origin[e,d,i| Coords.create(dimensionScale.apply(d.asString).asDouble,0)]
      			.on(DragEventType.DRAG)[e,d,i |drag(d.asString)  return null]
      			.on(DragEventType.DRAGSTART)[e,d,i | dragstart(d.asString) return null]
      			.on(DragEventType.DRAGEND)[e,d,i | dragend(e,d.asString) return null]
      		);
			
		dimensionGroups.append("g")
	        .attr("class", css.axis)
	        .each[element, d, index| D3.select(element).call(axis.scale(scales.get(index))); return null]
            .append("text")
            .style("text-anchor", "middle")
            .attr("y", -9)
            .text[element,columnName,index|columnName.asString]
            
        dimensionGroups.append("g")
	        .attr("class", css.brush)
	        .each[element,d,index| D3.select(element).call(brushes.get(index)) return null]
	        .selectAll("rect")
	        .attr("x", -8)
	        .attr("width", 16);
	    	
	    coordLinesContainer.selectAll("path").remove()
	    coordLines = coordLinesContainer.selectAll("path").data(data.entries)
	    	.enter().append("path")
	        .attr("class", css.notselected)
	        .attr("d")[c, entry, i | path(entry.<Entrie>^as)];
	}
	
	private def path(Entrie entry) {
		return line.generate(dimensions.map[e,d,i,a|
			val dimension = d.asString
			val originalIndex = originalDimensions.indexOf(dimension)			
			Array.fromDoubles(position(dimension),scales.get(originalIndex).apply(entry.values.get(originalIndex)).asDouble)
		])
	}
	
	private def position(String columnName) {
        val v = dragging.get(columnName);
        return if (v == null) dimensionScale.apply(columnName).asDouble else v
    }
	
	private def brushstart() {
		(D3.event as D3Event).sourceEvent.stopPropagation
		selection.clear(this)
	}
	
	private def brush() {
		val actives = dimensions.map[c,dd,index,a|index].filter[c,dimensionIndex,ii,a|!brushes.get(dimensionIndex.asInt).empty]
		val Array<JsArrayNumber> extents = actives.map[c,dimensionIndex,ii,a|brushes.get(dimensionIndex.asInt).extent.cast]
		          
        coordLines.classed(css.selected, [c, entry, ii |
        	val isSelected = actives.length > 0 && actives.every[cc,dimensionIndex,activeIndex,a|
        		val y = entry.<Entrie>^as.values.get(dimensionIndex.asInt)
        		val extent = extents.get(activeIndex)
        		return extent.get(0) <= y && extent.get(1) > y
        	]
        	val clazz = entry.<Entrie>^as.id
        	val pkg = clazz.substring(0, clazz.lastIndexOf("."))
        	if (isSelected) {        	
        		selection.add(ParallelCoordinates.this, new SelectionItem(pkg, clazz, null))
        	} else {
        		selection.remove(ParallelCoordinates.this, new SelectionItem(pkg, clazz, null))
        	}
        	return isSelected
        ])
	}
	
	private def dragstart(String columnName) {
		dragging.put(columnName, dimensionScale.apply(columnName).asDouble)
	}
	
	@JsNative private def Void sortDimensions(Array<String> dimensions, OrdinalScale scale) '''
		var pc = this;
		dimensions.sort(function(a, b) { 
			return pc.@de.hub.visualemf.gwt.examples.client.ParallelCoordinates::position(Ljava/lang/String;)(a) 
				- pc.@de.hub.visualemf.gwt.examples.client.ParallelCoordinates::position(Ljava/lang/String;)(b);
		});
	'''
	
	private def drag(String columnName) {
		// calculate new drag position
		dragging.put(columnName, Math.min(width, Math.max(0, D3.eventAsCoords.x)) as double)
		// recalculate the path of the coord lines
		coordLines.attr("d")[e,entry,i|path(entry.<Entrie>^as)]
		// sort dimensions according to new (drag) positions
		dimensions.sortDimensions(dimensionScale)
		dimensionScale.domain(dimensions)
		dimensionGroups.attr("transform")[e,d,i|'''translate(«position(d.asString)»)''']
	}
	
	private def dragend(Element element, String columnName) {
		dragging.remove(columnName)
		D3.select(element).transition.duration(500).attr("transform")[e,d,i|'''translate(«dimensionScale.apply(columnName).asDouble»)''']
		coordLines.transition.duration(500).attr("d")[e,d,i|path(d.<Entrie>^as())]	                    
	}
}