package de.hub.visualemf.gwt.examples.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

@SuppressWarnings("all")
public class ParallelCoordData extends JavaScriptObject {
  public static class Entrie extends JavaScriptObject {
    protected Entrie() {
      
    }
    
    public final native JsArray<Integer> getValues() /*-{ return this.Values; }-*/;
    
    public final native String getName() /*-{ return this.Name; }-*/;
    
    public final native String getId() /*-{ return this.Id; }-*/;
  }
  
  protected ParallelCoordData() {
    
  }
  
  public final native JsArray<String> getHead() /*-{ return this.Head; }-*/;
  
  public final native JsArray<ParallelCoordData.Entrie> getEntries() /*-{ return this.Entries; }-*/;
}
