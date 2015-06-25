package de.hub.visualemf.gwt.examples.client;

import com.github.gwtd3.api.D3;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtExamples implements EntryPoint {

	public void onModuleLoad() {
		final Label versionLabel = new Label("d3.js current version: " + D3.version());
		RootPanel.get().add(versionLabel);
		
		ChordDiagram chordDiagram = new ChordDiagram();
		RootPanel.get("ChordDiagram").add(chordDiagram);
		chordDiagram.render();
		
		ParallelCoordinates parallelCoordinates = new ParallelCoordinates();
		RootPanel.get("ParallelCoordinates").add(parallelCoordinates);
		parallelCoordinates.render();
		
	}
}
