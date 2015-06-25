package de.hub.visualemf.gwt.examples.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public class ChordDiagramHelper {
	public interface Bundle extends ClientBundle {
		public static final Bundle INSTANCE = GWT.create(Bundle.class);

		@Source("ChordDiagramStyles.css")
		MyResources css();
	}

	interface MyResources extends CssResource {
		String chord();
	}
	
	protected static native JsArray<JsArrayNumber> matrix() /*-{
		return [ [ 11975, 5871, 8916, 2868 ], [ 1951, 10048, 2060, 6171 ],
				[ 8010, 16145, 8090, 8045 ], [ 1013, 990, 940, 6907 ] ];
	}-*/;

	protected static native String call(JavaScriptObject f) /*-{
		f();
	}-*/;

	protected static class GroupTick extends JavaScriptObject {

		public static native GroupTick create(double angle, String label) /*-{
			return {
				angle : angle,
				label : label
			};
		}-*/;

		final native double angle() /*-{
			return this.angle;
		}-*/;

		final native String label() /*-{
			return this.label;
		}-*/;
	}
}
