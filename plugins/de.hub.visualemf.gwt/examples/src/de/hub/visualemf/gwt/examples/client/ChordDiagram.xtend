package de.hub.visualemf.gwt.examples.client

import com.github.gwtd3.api.D3
import com.github.gwtd3.api.core.Selection
import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.core.client.JsArray
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative
import de.itemis.xtend.auto.gwt.OverlayTypeByExample
import java.util.HashMap
import com.google.gwt.core.client.JsArrayNumber
import com.google.gwt.core.client.JsArrayString

@CssResource(value="ChordDiagramStyles", csses="de/hub/visualemf/gwt/examples/client/ChordDiagramStyles.css")
@ClientBundle
public interface ChordDiagramBundle {
	
}

@OverlayTypeByExample('
	{
		"name" : "displayHelp",
		"id" : "org.eclipse.jdt.core.formatter.CodeFormatterApplication.displayHelp",
		"type" : "MethodDeclaration",
		"links" : ["org.eclipse.jdt.core.formatter.CodeFormatterApplication.Messages.bind"]
	}
')
class DependencyDataItem {}

class ChordDiagram extends AbstractPackageVis<JavaScriptObject> {
	
	val css = ChordDiagramBundle.Util.get.ChordDiagramStyles;
	val width = 350
	val height = 350
	
	var Selection svg = null
	
	@JsNative private def JavaScriptObject update(Selection svg, JavaScriptObject matrix, JavaScriptObject names, String chart) '''
		var self = this;
		var d3 = $wnd.d3;
		var width = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::width;
		var height = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::height;
		
		var isSelected = function(d) {
			return self.@de.hub.visualemf.gwt.examples.client.ChordDiagram::isSelected(Ljava/lang/String;)(d);
		}
		
		// Returns an array of tick angles and labels, given a group.
		var groupTicks = function(d) {
		  var k = (d.endAngle - d.startAngle) / d.value;
		  return d3.range(0, d.value, 10).map(function(v, i) {
		    return {
		      angle: v * k + d.startAngle,
		      label: i % 5 ? null : v
		    };
		  });
		};
		
		// Returns an event handler for fading a given chord group.
		var fade = function(opacity) {
		  return function(g, i) {
		    svg.selectAll(".chord path")
		        .filter(function(d) { return d.source.index != i && d.target.index != i; })
		      .transition()
		        .style("opacity", opacity);
		  };
		};
		
		var chord = d3.layout.chord()
		    .padding(.05)
		    .sortSubgroups(d3.descending)
		    .matrix(matrix);
		
		var innerRadius = Math.min(width, height) * .41,
		    outerRadius = innerRadius * 1.1;
		
		var fill = d3.scale.category20c()
		//var fill = d3.scale.ordinal()
		//    .domain(d3.range(4))
		//    .range(["#000000", "#FFDD89", "#957244", "#F26223"]);
		
		svg.append("g").selectAll("path")
		    .data(chord.groups)
		    .enter().append("path")
		    .style("fill", function(d) { return fill(d.index); })
		    .style("stroke", function(d) { return fill(d.index); })
		    .attr("d", d3.svg.arc().innerRadius(innerRadius).outerRadius(outerRadius))
		    .on("mouseover", fade(.1))
		    .on("mouseout", fade(1));
		
		var ticks = svg.append("g").selectAll("g")
		    .data(chord.groups)
		    .enter().append("g").selectAll("g")
		    .data(groupTicks)
		    .enter().append("g")
		    .attr("transform", function(d) {
		      return "rotate(" + (d.angle * 180 / Math.PI - 90) + ")"
		          + "translate(" + outerRadius + ",0)";
		    });
		
		ticks.append("line")
		    .attr("x1", 1)
		    .attr("y1", 0)
		    .attr("x2", 5)
		    .attr("y2", 0)
		    .style("stroke", "#000");
		
		ticks.append("text")
		    .attr("x", 8)
		    .attr("dy", ".35em")
		    .attr("transform", function(d) { return d.angle > Math.PI ? "rotate(180)translate(-16)" : null; })
		    .style("text-anchor", function(d) { return d.angle > Math.PI ? "end" : null; })
		    .text(function(d) { return d.label; });
		
		svg.append("g")
		    .attr("class", chart)
		    .selectAll("path")
		    .data(chord.chords)
		    .enter().append("path")
		    .attr("d", d3.svg.chord().radius(innerRadius))
		    .style("fill", function(d) { return fill(d.target.index); })
		    .style("opacity", function(d) { 
		    	console.log(names[d.source.index]);
		    	return (isSelected(names[d.target.index])) ? 1 : .1;
		    });
		return null;
	'''

	override def onLoad() {
		super.onLoad()
		
		svg = D3.select(this.element).append("svg")
			.attr("class", css.chart)
			.attr("width", width)
			.attr("height", height)
			.append("g")
			.attr("transform", '''translate(«width/2», «height/2»)''');		
	}
	
	private def classId(String methodId) {
		methodId.substring(0, methodId.lastIndexOf("."))
	}
	
	var JsArray<JsArrayNumber> data = null
	var JsArrayString ids = null
	
	override protected updateData(JavaScriptObject source) {
		val dependencyData = source.cast as JsArray<DependencyDataItem>
		val map = new HashMap<String, Integer>
		
		var length = 0
		for (var i = 0; i < dependencyData.length; i++) {
			val item = dependencyData.get(i)
			val clazz = item.id.classId
			if (map.get(clazz) == null) {
				map.put(clazz, length)
				length++
			}
		}
		
		ids = JsArray.createArray(length) as JsArrayString
		data = JsArray.createArray(length) as JsArray<JsArrayNumber>
		for (var i = 0; i < dependencyData.length; i++) {
			val item = dependencyData.get(i)
			val clazz = item.id.classId
			val index = map.get(clazz)
			if (data.get(index) == null) {
				val dependencies = JsArray.createArray(length) as JsArrayNumber
				for (var ii = 0; ii < length; ii++) {
					dependencies.set(ii, 0)
				}
				data.set(index, dependencies)		
				ids.set(index, item.id.classId)
			}
			val dependencies = data.get(index)
			for (var ii = 0; ii < item.links.length; ii++) {
				val link = item.links.get(ii)
				val linkClazz = link.classId
				val linkIndex = map.get(linkClazz)
				if (linkIndex != null) {
					var newValue = (dependencies.get(linkIndex) as int) + 1
					dependencies.set(linkIndex, newValue)					
				}
			}
		}
		
		svg.selectAll("g").remove()
		update(svg, data, ids, css.chart)
	}
	
	override protected updateSelection() {
		svg.selectAll("g").remove()
		update(svg, data, ids, css.chart)
	}
	
	override protected getFileName() {
		return "dependencies.json"
	}
	
}