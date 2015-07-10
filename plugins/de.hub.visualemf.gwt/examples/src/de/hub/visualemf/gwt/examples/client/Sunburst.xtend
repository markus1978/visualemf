package de.hub.visualemf.gwt.examples.client

import com.github.gwtd3.api.D3
import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.user.client.ui.FlowPanel
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative
import com.google.gwt.core.client.JsonUtils
import com.google.gwt.core.client.JsArray

@CssResource(value="SunburstStyles", csses="de/hub/visualemf/gwt/examples/client/SunburstStyles.css")
@ClientBundle
public interface SunburstBundle {
	
}

class Sunburst extends FlowPanel {
	
	val selection = Selection::instance
	
	val width = 730
	val height = 500
	
	val css = SunburstBundle.Util.get.SunburstStyles;
	
	var com.github.gwtd3.api.core.Selection svg = null
	
	
	@JsNative private def JavaScriptObject update(com.github.gwtd3.api.core.Selection svg, JavaScriptObject data, String css) '''
		var d3 = $wnd.d3;
		var width = this.@de.hub.visualemf.gwt.examples.client.Sunburst::width;
		height = this.@de.hub.visualemf.gwt.examples.client.Sunburst::height;
		
		var radius = Math.min(width, height) / 2,
		color = d3.scale.category20c();
		
		var stash = function(d) {
		    d.x0 = d.x;
		    d.dx0 = d.dx;
		};

		var arcTween = function(a) {
		    var i = d3.interpolate({
		        x: a.x0,
		        dx: a.dx0
		    }, a);
		    return function(t) {
		        var b = i(t);
		        a.x0 = b.x;
		        a.dx0 = b.dx;
		        return arc(b);
		    };
		};

		var partition = d3.layout.partition()
		    .sort(null)
		    .size([2 * Math.PI, radius * radius])
		    .value(function(d) {
		        return 1;
		});
		
		var arc = d3.svg.arc()
		    .startAngle(function(d) {
		        return d.x;
		    })
		    .endAngle(function(d) {
		        return d.x + d.dx;
		    })
		    .innerRadius(function(d) {
		        return Math.sqrt(d.y);
		    })
		    .outerRadius(function(d) {
		        return Math.sqrt(d.y + d.dy);
		    });

		var path = svg.datum(data).selectAll("path")
		    .data(partition.nodes)
		    .enter().append("path")
		    .attr("display", function(d) {
		        return d.depth ? null : "none";
		    }) // hide inner ring
		    .attr("d", arc)
		    .style("stroke", "#fff")
		    .style("fill", function(d) {
		        return color((d.children ? d : d.parent).name);
		    })
		    .style("fill-rule", "evenodd")
		    .each(stash);
		    
		d3.selectAll("input").on("change", function change() {
		    var value = this.value === "count" ? function() {
		        return 1;
		    } : function(d) {
		        return d.size;
		    };
		    
		    path
		        .data(partition.value(value).nodes)
		        .transition()
		        .duration(1500)
		        .attrTween("d", arcTween);
		});
	'''
	
	override def onLoad() {
		svg = D3.select(this.element).append("svg")
			.attr("class", css.chart)
			.attr("width", width)
			.attr("height", height)
			.append("g")
			.attr("transform", '''translate(«width / 2», «height*0.52»)''');
		
		selection.addListener(this)[items|
	    	if (!items.empty) {
	    		val item = items.findFirst[true]
	    		DataHelper::load(item.pkg + "/containment.json")[result|
	    			if (result != null) {
		    			val data = JsonUtils.<TableData>safeEval(result)
		    			update(data)		    			
		    		}
		    		return null
	    		]	    		
	    	}
	    	return null
	    ]
	} 
	
	def update(JavaScriptObject data) {		
		svg.selectAll("path").remove()
		update(svg, (data.cast as JsArray).get(0), css.chart)
	}
}