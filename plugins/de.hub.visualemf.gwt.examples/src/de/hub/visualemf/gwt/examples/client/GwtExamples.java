package de.hub.visualemf.gwt.examples.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtExamples implements EntryPoint {

	public void onModuleLoad() {
		ChordDiagram2 chordDiagram = new ChordDiagram2();
		RootPanel.get().add(chordDiagram);
		chordDiagram.render();
	}
}
