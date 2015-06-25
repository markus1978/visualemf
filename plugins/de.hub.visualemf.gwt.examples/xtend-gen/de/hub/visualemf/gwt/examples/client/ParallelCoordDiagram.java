package de.hub.visualemf.gwt.examples.client;

import com.github.gwtd3.api.D3;
import com.github.gwtd3.api.core.Selection;
import com.github.gwtd3.api.scales.OrdinalScale;
import com.github.gwtd3.api.svg.Axis;
import com.github.gwtd3.api.svg.Line;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.ui.FlowPanel;
import de.itemis.xtend.auto.gwt.OverlayTypeByExample;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class ParallelCoordDiagram extends FlowPanel {
  public class OpenSourceProject extends JavaScriptObject {
    protected OpenSourceProject() {
      
    }
    
    public final native String getName();
  }
  
  /* @OverlayTypeByExample("\n\t\t{\n        \t\"head\" : [\"metric\"],\n\t\t\t\"entries\" : [\n\t\t\t\t{\n\t\t\t\t\t\"values\" : [13],\n\t\t\t\t\t\"name\" : \"EmfFragActivator\",\n\t\t\t\t\t\"id\" : \"de.hub.emffrag.EmfFragActivator\"\n\t\t\t\t}\n\t\t\t]\n\t\t}\n\t")
   */public static class Data extends JavaScriptObject {
    protected Data() {
      
    }
    
    public final native JsArray<String> getHead();
    
    public final native void getEntries();
  }
  
  private final int margin_top = 30;
  
  private final int margin_right = 10;
  
  private final int margin_left = 10;
  
  private final int margin_bottom = 10;
  
  private final int width = ((960 - this.margin_left) - this.margin_right);
  
  private final int height = ((300 - this.margin_top) - this.margin_bottom);
  
  private final OrdinalScale x = D3.scale.ordinal().rangePoints(0, this.width, 1);
  
  private final Object dimensionIndexes = new Function0<Object>() {
    public Object apply() {
      return null;
    }
  }.apply();
  
  private final Object y = new Function0<Object>() {
    public Object apply() {
      return null;
    }
  }.apply();
  
  private final Object dragging = new Function0<Object>() {
    public Object apply() {
      return null;
    }
  }.apply();
  
  private final Line line = D3.svg().line();
  
  private final Axis axis = D3.svg().axis().orient(Axis.Orientation.LEFT);
  
  public void render() {
    Selection _select = D3.select(this);
    Selection _append = _select.append("svg");
    Selection _attr = _append.attr("width", ((this.width + this.margin_left) + this.margin_right));
    Selection _attr_1 = _attr.attr("height", (((this.height + this.margin_top) + this.margin_bottom) + 100));
    Selection _append_1 = _attr_1.append("g");
    final Selection svg = _append_1.<Object>attr("transform", (((("translate(" + Integer.valueOf(this.margin_left)) + ",") + Integer.valueOf(this.margin_top)) + ")"));
  }
}
