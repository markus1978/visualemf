var parrallelCoords = (function(self) {
    // bounding box
	var margin = {
            top: 30,
            right: 10,
            bottom: 10,
            left: 10
        },
        width = 960 - margin.left - margin.right,
        height = 300 - margin.top - margin.bottom;

    // d3 scales
    var x = d3.scale.ordinal().rangePoints([0, width], 1),	// one x-scale, domain is set later based on actual data
    	dimensionIndexes = {}, 								// map between column index and column name
        y = {}, 											// map of y-scales, one scale per dimension of x-scale
        dragging = {};

    // svg generators
    var line = d3.svg.line(),  				 // line generator to draw parrallel coordinate lines
        axis = d3.svg.axis().orient("left"), // one axis generator to generate different y-axis for each y-scale (i.e. for each dimension)
        coordLines;

    // members
    var svg
    var dimensions
    
    self.handleUserSelect = function(ids) {
    	console.log("non override user select event handle for " + ids + " called.");
    };
    
    self.select = function(ids) {
    	coordLines.attr("class", function(entry) {
    		if (ids.some(function(id){ return id == entry.id; })) {
    			return "selected";
    		} else {
    			return "not-selected";
    		}            
        });
    }
    
    self.create = function(dataFileName, elementSelector) {    	    	
	    svg = d3.select(elementSelector)
	    	.append("svg")
	        .attr("width", width + margin.left + margin.right)
	        .attr("height", height + margin.top + margin.bottom + 100)
	        .append("g")
	        .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

	    d3.json(dataFileName, function(data) {
	    	// extract domains and dimensions
	    	dimensions = data.head.map(function(columnName, columnIndex) {
	    		dimensionIndexes[columnIndex] = columnName;
	    		
	    		var columnDomain = d3.extent(data.entries, function(entry) {
	    			return entry.values[columnIndex]
	    		});
	    		
	    		var columnScale = d3.scale.linear().domain(columnDomain).range([height, 0]);
	    		y[columnIndex] = columnScale;
	    		
	    		return columnName;
	    	});
	    	x.domain(dimensions);
	    	// add subgroup for each dimension
	    	var dimensionGroups = svg.selectAll(".dimension")
	        	.data(dimensions)
	            .enter().append("g")
	            .attr("class", "dimension")
	            .attr("transform", function(columnName) {
	                return "translate(" + x(columnName) + ")";
	            })
	            .call(d3.behavior.drag()
	                .origin(function(columnName) { return { x: x(columnName) }; })
	                .on("dragstart", function(columnName) {
	                    dragging[columnName] = x(columnName);
	                    
	                })
	                .on("drag", function(columnName) {
	                    dragging[columnName] = Math.min(width, Math.max(0, d3.event.x));
	                    coordLines.attr("d", path);
	                    dimensions.sort(function(a, b) {
	                        return position(a) - position(b);
	                    });
	                    x.domain(dimensions);
	                    dimensionGroups.attr("transform", function(columnName) {
	                        return "translate(" + position(columnName) + ")";
	                    })
	                })
	                .on("dragend", function(columnName) {
	                    delete dragging[columnName];
	                    transition(d3.select(this)).attr("transform", "translate(" + x(columnName) + ")");
	                    transition(coordLines).attr("d", path);	                    
	                })
	            );
	    	// render an axis into each dimension subgroup
	    	dimensionGroups.append("g")
	            .attr("class", "axis")
	            .each(function(columnName, columnIndex) {
	                d3.select(this).call(axis.scale(y[columnIndex]));
	            })
	            .append("text")
	            .style("text-anchor", "middle")
	            .attr("y", -9)
	            .text(function(columnName) {
	                return columnName;
	            });
	    	// add a brush to to each dimension
	    	dimensionGroups.append("g")
	            .attr("class", "brush")
	            .each(function(columnName, columnIndex) {
	                d3.select(this).call(y[columnIndex].brush = d3.svg.brush().y(y[columnIndex]).on("brushstart", brushstart).on("brush", brush));
	            })
	            .selectAll("rect")
	            .attr("x", -8)
	            .attr("width", 16);
	    	
	    	// configure line generator
	    	line.x(function(value, index) { return position(dimensionIndexes[index]); })
	    		.y(function(value, index) { return y[index](value); })
	        // draw coord lines
	        coordLines = svg.append("g")
	            .attr("class", "coordLines")
	            .selectAll("path")
	            .data(data.entries)
	            .enter().append("path")
	            .attr("class", "not-selected")
	            .attr("d", path);
	    });
    };

    function position(columnName) {
        var v = dragging[columnName];
        return v == null ? x(columnName) : v;
    }

    function transition(g) {
        return g.transition().duration(500);
    }

    function path(entry) {
        return line(entry.values);
    }

    function brushstart() {
        d3.event.sourceEvent.stopPropagation();
    }

    // Handles a brush event, toggling the display of foreground lines.
    function brush() {
        var actives = dimensions.map(function(columnName, columnIndex) {
                if (y[columnIndex].brush.empty()) {
                	return null;
                } else {
                	return columnIndex;
                }
            });
        
        var extents = actives.map(function(columnIndex) {
            	if (columnIndex == null) return null; else 
            		return y[columnIndex].brush.extent();
            });
        
        coordLines.attr("class", function(entry) {
            return (actives.every(function(columnIndex) {
            	if (columnIndex == null) return true; else 
            		return extents[columnIndex][0] <= entry.values[columnIndex] && entry.values[columnIndex] <= extents[columnIndex][1];
            }) && actives.some(function(d) { return d != null; })) ? "selected" : "not-selected";
        });
        
        
        self.handleUserSelect(coordLines.data()
    		.filter(function(entry) {
    			return actives.every(function(columnIndex) {
                	if (columnIndex == null) return true; else 
                		return extents[columnIndex][0] <= entry.values[columnIndex] && entry.values[columnIndex] <= extents[columnIndex][1];
                }) && actives.some(function(d) { return d != null; });
    		})
    		.map(function(entry) {
    			return entry.id;
    		}));
    }
    
    return self;
}(parrallelCoords = parrallelCoords || {}));