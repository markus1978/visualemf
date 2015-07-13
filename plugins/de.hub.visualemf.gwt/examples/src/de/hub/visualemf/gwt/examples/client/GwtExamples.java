package de.hub.visualemf.gwt.examples.client;

import com.github.gwtd3.api.D3;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GwtExamples implements EntryPoint {

	public void onModuleLoad() {
		
		final Label versionLabel = new Label("d3.js current version: " + D3.version());
		Directory directory = new Directory();
		ParallelCoordinates parallelCoordinates = new ParallelCoordinates();
		Sunburst sunburst = new Sunburst();
		HierachicalEdgeBundling heb = new HierachicalEdgeBundling();
		SelectionVis selection = new SelectionVis();
		ChordDiagram chord = new ChordDiagram();
		
		DockLayoutPanel p = new DockLayoutPanel(Unit.PX);
		p.addNorth(selection, 110);
		p.addSouth(versionLabel, 20);
		p.addWest(directory, 250);

		
		VerticalPanel content = new VerticalPanel();
		content.add(parallelCoordinates);
		
		HorizontalPanel details = new HorizontalPanel();	
		details.add(heb);
		details.add(chord);
		details.add(sunburst);
		
		
		content.add(details);
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		decoratorPanel.setWidget(content);
		
		p.add(decoratorPanel);
		RootLayoutPanel.get().add(p);
		RootLayoutPanel.get().setStylePrimaryName("root-panel");
		
		//GlobalSelection.instance.add(this, new GlobalSelection.SelectionItem("de/hub/emffrag/fragmentation", null, null));
		GlobalSelection.instance.add(this, new GlobalSelection.SelectionItem("org/eclipse/jdt/ui/wizards", null, null));
	
		
//		ChordDiagram chordDiagram = new ChordDiagram();
//		RootPanel.get("ChordDiagram").add(chordDiagram);
//		chordDiagram.render();
		
		
//		TreeMap treeMap = new TreeMap();
//		RootPanel.get("TreeMap").add(treeMap);
//		treeMap.render();
//		
//		Sunburst sunburst = new Sunburst();
//		RootPanel.get("Sunburst").add(sunburst);
//		sunburst.render();
	}
}
