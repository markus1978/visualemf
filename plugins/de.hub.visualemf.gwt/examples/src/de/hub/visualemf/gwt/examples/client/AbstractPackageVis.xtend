package de.hub.visualemf.gwt.examples.client

import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.core.client.JsonUtils
import de.hub.visualemf.gwt.examples.client.GlobalSelection.SelectionItem

abstract class AbstractPackageVis<DataType extends JavaScriptObject> extends AbstractVis {
	
	var String currentPackage = null
	
	override def onLoad() {		
		selection.addListener(this)[items|
	    	if (!items.empty) {
	    		val item = items.findFirst[true]
	    		if (item.pkg != currentPackage) {
		    		DataHelper::load(item.pkg.replaceAll("\\.","/") + "/" + fileName)[result|
		    			if (result != null) {
			    			val data = JsonUtils.<DataType>safeEval(result)
			    			updateData(data)
			    			currentPackage = item.pkg		    			
			    		}
			    		return null
		    		]		    		
		    	} else {
		    		updateSelection()		
		    	}	    		
	    	} else {
	    		updateSelection()	    	
	    	}	
	    	return null
	    ]
	} 
	
	protected abstract def String getFileName();
	
	protected def boolean isSelected(String id) {
		var result = selection.current.contains(new SelectionItem(id.substring(0, id.lastIndexOf(".")), id, null))		
		
		var firstSelected = selection.current.findFirst[true]		
		return result || if (firstSelected != null && firstSelected.clazz != null && id.startsWith(firstSelected.clazz)) true else false			
	}
	
	protected abstract def void updateData(DataType data);
	protected abstract def void updateSelection();
}