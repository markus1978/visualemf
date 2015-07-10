package de.hub.visualemf.gwt.examples.client

import java.util.ArrayList
import java.util.HashSet
import org.eclipse.xtend.lib.annotations.Data

class GlobalSelection {
	
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
	
	public static val GlobalSelection instance = new GlobalSelection
	
	private val listeners = new ArrayList<Pair<Object, (Iterable<SelectionItem>)=>Void>>
	private val ids = new HashSet<SelectionItem>
	 
	private def notifyChange(Object source) {
		listeners.filter[it.key != source].forEach[listener,index|listener.value.apply(ids)]
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
	
	def remove(Object source, SelectionItem id) {
		if (ids.remove(id)) {
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
	
	def addListener(Object target, (Iterable<SelectionItem>)=>Void listener) {
		listeners += target -> listener
	}
	
	def getCurrent() {
		return ids
	}
	
	static def newSelectionItemFromMethod(String id) {
		val clazz = id.substring(0, id.lastIndexOf("."))
		val pkg = id.substring(0, clazz.lastIndexOf("."))
		return new SelectionItem(pkg, clazz, id)
	}
	
	static def newSelectionItemFromMethodClass(String id) {
		val clazz = id.substring(0, id.lastIndexOf("."))
		val pkg = id.substring(0, clazz.lastIndexOf("."))
		return new SelectionItem(pkg, clazz, null)
	}
	
	static def newSelectionItemFromClass(String id) {
		val pkg = id.substring(0, id.lastIndexOf("."))
		return new SelectionItem(pkg, id, null)
	}
}