package de.hub.visualemf.gwt.examples.client

import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.user.client.ui.FlowPanel
import de.itemis.xtend.auto.gwt.ClientBundle
import de.itemis.xtend.auto.gwt.CssResource
import de.itemis.xtend.auto.gwt.JsNative
import com.github.gwtd3.api.core.Selection
import com.github.gwtd3.api.D3
import de.hub.visualemf.gwt.examples.client.GlobalSelection.SelectionItem
import static extension de.hub.visualemf.gwt.examples.client.GlobalSelection.*

@CssResource(value="ChordDiagramStyles", csses="de/hub/visualemf/gwt/examples/client/ChordDiagramStyles.css")
@ClientBundle
public interface ChordDiagramBundle {
	
}

class ChordDiagram extends AbstractPackageVis<JavaScriptObject> {
	
	val css = ChordDiagramBundle.Util.get.ChordDiagramStyles;
	val width = 350
	val height = 350
	
	var Selection svg = null
	var Selection div = null
	
	@JsNative private def JavaScriptObject update(Selection div, Selection svg, JavaScriptObject data, String chart, String source, String target) '''
		var d3 = $wnd.d3;
		var w = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::width;
		var h = this.@de.hub.visualemf.gwt.examples.client.ChordDiagram::height;
		
		var rx = w / 2,
		    ry = h / 2,
		    m0,
		    rotate = 0;
		
		var splines = [];
		
		var cluster = d3.layout.cluster()
		    .size([360, ry - 40])
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
		
		var nodes;
		
		
		
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
		                    if (!node.parent) {
		                    	console.log("###");
		                    }
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
		            	var target = map[i];
		            	if (target) {
			                links.push({
			                    source: map[d.id],
			                    target: map[i]
			                });
			           	}
		            });
		        });
		
		        return links;
		    }
		
		};
		
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
		
		create();
		
		return null;
	'''

	override def onLoad() {
		super.onLoad()
		
		div = D3.select(this.element).append("div")
		
		svg = div.append("svg")
			.attr("class", css.chart)
			.attr("width", width)
			.attr("height", height)
			.append("g")
			.attr("transform", '''translate(«width/2», «height/2»)''');		
	}
	
	override protected updateData(JavaScriptObject data) {
		svg.selectAll("path").remove()
		svg.selectAll("g.node").remove()
		update(div, svg, data, css.chart, css.source, css.target)
	}
	
	private static class Link extends JavaScriptObject {
		protected new() {}
		@JsNative def Node target() '''return this.target;'''
		@JsNative def Node source() '''return this.source;'''
	}

	private static class Node extends JavaScriptObject {
		protected new() {}
		@JsNative def String id() '''return this.id;'''
	}
	
	override protected updateSelection() {
		svg.selectAll("path").each[e,d,i|
			val link = d.<Link>^as
			D3.select(e).classed(css.source, selection.current.contains(link.source.id.newSelectionItemFromMethodClass))
			D3.select(e).classed(css.target, selection.current.contains(link.target.id.newSelectionItemFromMethodClass))
			return null
		]
	}
	
	override protected getFileName() {
		return "dependencies.json"
	}
	
}