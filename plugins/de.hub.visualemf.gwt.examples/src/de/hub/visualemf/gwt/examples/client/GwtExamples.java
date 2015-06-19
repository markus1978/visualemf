package de.hub.visualemf.gwt.examples.client;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.github.gwtd3.api.D3;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtExamples implements EntryPoint {

	public void onModuleLoad() {
		final Label versionLabel = new Label("d3.js current version: " + D3.version());
		RootPanel.get().add(versionLabel);
		
//		ArcTween arcTween = new ArcTween();
//		RootPanel.get().add(arcTween);
//		arcTween.start();
		
		ChordDiagram chordDiagram = new ChordDiagram();
		RootPanel.get("TEST").add(chordDiagram);
		chordDiagram.render();
		
		ChordDiagram2 chordDiagram2 = new ChordDiagram2();
		RootPanel.get("xTend").add(chordDiagram2);
		chordDiagram2.render();
		
//		BarChart barChart = new BarChart();
//		RootPanel.get().add(barChart);
//		barChart.render();
	}
}
