package de.hub.visualemf.gwt.examples.client

import java.util.ArrayList
import java.util.HashSet
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtend.lib.annotations.Data

class Selection {
	
	@Data
	public static class SelectionItem {
		String pkg
		String clazz
		String method
		
		override toString() {
			return if (method != null) {
				method	
			} else if (clazz != null) {
				clazz
			} else {
				pkg
			}
		}
	}
	
	public static val Selection instance = new Selection
	
	private val listeners = new ArrayList<Pair<Object, Function1<Iterable<SelectionItem>, Void>>>
	private val ids = new HashSet<SelectionItem>
	 
	private def notifyChange(Object source) {
		listeners.filter[it.key != source].forEach[it.value.apply(ids)]
	}
	
	def set(Object source, SelectionItem id) {
		ids.clear
		ids.add(id)
		source.notifyChange
	}
	
	def clear(Object source) {
		if (!ids.empty) {
			ids.clear
			source.notifyChange		
		}
	}
	
	def add(Object source, SelectionItem id) {
		if (ids.add(id)) {
			source.notifyChange			
		}
	}
	
	def addAll(Object source, Iterable<SelectionItem> ids) {
		var changed = false
		for (id:ids) {
			changed = changed || this.ids.add(id)
		}
		if (changed) {
			source.notifyChange	
		}
	}
	
	def addListener(Object target, Function1<Iterable<SelectionItem>, Void> listener) {
		listeners += target -> listener
	}
	
	def getCurrent() {
		return ids
	}
}