package com.github.gwtd3.api.layout;
import com.github.gwtd3.api.arrays.Array;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * Copyright (c) 2013, Anthony Schiochet and Eric Citaire
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * The names Anthony Schiochet and Eric Citaire may not be used to endorse or promote products
 *   derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL MICHAEL BOSTOCK BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */



/**
 * A node in d3j's treemap layout, see <a
 * href="https://github.com/mbostock/d3/wiki/Treemap-Layout#treemap">d3 docs on
 * node</a>. TODO The node class is used in {@link Tree}, cluster, and
 * partitions. The class provides accessors for the nodes key attributes, its
 * position, children, parent, and depth.
 * 
 * @author <a href="mailto:evanshi09@gmail.com">Evan Shi</a>
 * 
 */
public class TreeMapNode extends JavaScriptObject {
    protected TreeMapNode() {
        super();
    }

    /**
     * @return the minimum x-coordinate of the node position
     */
    public final native double x()/*-{
		return this.x;
    }-*/;

    /**
     * @return the minimum y-coordinate of the node position
     */
    public final native double y()/*-{
		return this.y;
    }-*/;

    /**
     * @return array of {@link Node} objects or null
     */
    public final native Array<Node> children() /*-{
    	var hasNoChildren = this.children == null
		return hasNoChildren ? null : this.children;
    }-*/;

    /**
     * @return parent node
     */
    public final native TreeMapNode parent() /*-{
		return this.parent;
    }-*/;

    /**
     * @return the node's depth, root depth = 0
     */
    public final native double depth() /*-{
		return this.depth;
    }-*/;
    
    /**
     * @return  the x-extent of the node position
     */
    public final native double dx()/*-{
		return this.dx;
    }-*/;

    /**
     * @return  the y-extent of the node position
     */
    public final native double dy()/*-{
		return this.dy;
    }-*/;
    
    /**
     * @return the node value, as returned by the value accessor
     */
    public final native JavaScriptObject value() /*-{
		return this.value;
    }-*/;
}
