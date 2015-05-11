var chord = (function(self) {
    var w = 1280,
        h = 800,
        rx = w / 2,
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

    self.handleUserSelect = function(ids) {
        console.log("non override user select event handle for " + ids + " called.");
    };

    self.select = function(ids) {
    	nodes.filter(function(n) { return !n.children;}).every(function(node) {
    		var selected = ids.indexOf(node.id) >= 0;
    	 	svg.selectAll("path.link.target-" + node.key)
		        .classed("target", selected)
		        .each(updateNodes("source", selected));
	
    	 	svg.selectAll("path.link.source-" + node.key)
		        .classed("source", selected)
		        .each(updateNodes("target", selected));
    	});
    	
//        svg.selectAll("g.node")
//	        .data(nodes.filter(function(n) {
//	            return !n.children;
//	        }))
//	        .selectAll("text")
//	        .attr("class", function(n) {
//	        	return ids.indexOf(n.id) >= 0 ? "selected" : "not-selected";
//	        });
    }

    self.create = function(dataFileName, elementSelector) {
        div = d3.select(elementSelector).insert("div", "h2");

        svg = div.append("svg:svg")
            .attr("width", w)
            .attr("height", w)
            .append("svg:g")
            .attr("transform", "translate(" + rx + "," + ry + ")");

        d3.json(dataFileName, function(entries) {
            nodes = cluster.nodes(packages.root(entries));
            var links = packages.links(nodes),
            	splines = bundle(links);

            var path = svg.selectAll("path.link")
                .data(links)
                .enter().append("svg:path")
                .attr("class", function(d) {
                    return "link source-" + d.source.key + " target-" + d.target.key;
                })
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
                    return "node-" + d.key;
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
        });

        d3.select(window)
            .on("mousemove", mousemove)
            .on("mouseup", mouseup);
    };

    function mouse(e) {
        return [e.pageX - rx, e.pageY - ry];
    }

    function mousedown() {
        m0 = mouse(d3.event);
        d3.event.preventDefault();
    }

    function mousemove() {
        if (m0) {
            var m1 = mouse(d3.event),
                dm = Math.atan2(cross(m0, m1), dot(m0, m1)) * 180 / Math.PI;
            div.style("-webkit-transform", "translateY(" + (ry - rx) + "px)rotateZ(" + dm + "deg)translateY(" + (rx - ry) + "px)");
        }
    }

    function mouseup() {
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
    }

    function mouseover(d) {
        svg.selectAll("path.link.target-" + d.key)
            .classed("target", true)
            .each(updateNodes("source", true));

        svg.selectAll("path.link.source-" + d.key)
            .classed("source", true)
            .each(updateNodes("target", true));
        
        self.handleUserSelect([d.id]);
    }

    function mouseout(d) {
        svg.selectAll("path.link.source-" + d.key)
            .classed("source", false)
            .each(updateNodes("target", false));

        svg.selectAll("path.link.target-" + d.key)
            .classed("target", false)
            .each(updateNodes("source", false));
        
        self.handleUserSelect([]);
    }

    function updateNodes(name, value) {
        return function(d) {
            if (value) this.parentNode.appendChild(this);
            svg.select("#node-" + d[name].key).classed(name, value);
        };
    }

    function cross(a, b) {
        return a[0] * b[1] - a[1] * b[0];
    }

    function dot(a, b) {
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

    return self;
}(chord = chord ||  {}));