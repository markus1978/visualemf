package de.hub.visualemf.gwt.examples.client

import com.google.gwt.user.client.ui.DecoratorPanel
import com.google.gwt.user.client.ui.FlowPanel
import com.google.gwt.user.client.ui.ScrollPanel
import com.google.gwt.user.client.ui.HTML

class SelectionVis extends FlowPanel {
	
	override protected onLoad() {
		val panel = new FlowPanel
		val scollWrapper = new ScrollPanel(panel);
		scollWrapper.setSize("1350px", "90px");
		
		val staticDecorator = new DecoratorPanel();
		staticDecorator.setWidget(scollWrapper);
		
		super.add(staticDecorator)
		
		GlobalSelection::instance.addListener(this)[selection|
			panel.clear
			for(item: selection) {
				panel.add(new HTML(item.toString))				
			}
			return null
		]
	}
}