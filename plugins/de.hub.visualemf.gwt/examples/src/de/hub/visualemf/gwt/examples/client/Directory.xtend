package de.hub.visualemf.gwt.examples.client

import com.google.gwt.core.client.JavaScriptObject
import com.google.gwt.core.client.JsArray
import com.google.gwt.core.client.JsonUtils
import com.google.gwt.user.client.ui.DecoratorPanel
import com.google.gwt.user.client.ui.FlowPanel
import com.google.gwt.user.client.ui.ScrollPanel
import com.google.gwt.user.client.ui.Tree
import de.hub.visualemf.gwt.examples.client.GlobalSelection.SelectionItem
import de.itemis.xtend.auto.gwt.JsNative
import org.eclipse.xtext.xbase.lib.Functions.Function2

class Directory extends FlowPanel {
	
	private var Tree tree = null

	private static class DirectoryItem extends JavaScriptObject {		
		protected new() {}
		@JsNative def String getName() '''return this.name;'''
		@JsNative def String getId() '''return this.id;'''
		@JsNative def Integer getSize() '''return this.size;'''
		@JsNative def JsArray<DirectoryItem> getChildren() '''return this.children;'''
	}
	
	private static def <T extends JavaScriptObject,E> void traverse(JsArray<T> source, E targetParent, Function2<T,E,Pair<E,JsArray<T>>> function) {
		if (source != null) {
			for (var i = 0; i < source.length; i++) {
				val result = function.apply(source.get(i), targetParent)
				traverse(result.value, result.key, function)	
			}
		}
	}
	
	private def Tree createTree() {
		val tree = new Tree();
		val root = tree.addTextItem("jdt")
		DataHelper::load("directory.json")[stringResult|
			if (stringResult != null) {
				val jsonResult = JsonUtils.<JsArray<DirectoryItem>>safeEval(stringResult)
				jsonResult.traverse(root)[node, parent|
					val item = parent.addTextItem(node.name)
					item.userObject = node.id
					return item -> node.children 
				]
			} else {
				tree.addTextItem("Error")
			}
			select(GlobalSelection::instance.current)
			return null
		]
		
		tree.addSelectionHandler[event|
			val selectedItem = event.selectedItem
			val selectionItem = if (selectedItem.childCount > 0) {
				new SelectionItem(selectedItem.userObject as String, null, null)
			} else {
				new SelectionItem(selectedItem.parentItem.userObject as String, selectedItem.userObject as String, null)
			}
			GlobalSelection::instance.set(Directory.this, selectionItem)
		]
		return tree;
	}

	override protected onLoad() {
		super.onLoad()

		tree = createTree();
		tree.setAnimationEnabled(true);
		tree.ensureDebugId("cwTree-staticTree");
		val staticTreeWrapper = new ScrollPanel(tree);
		staticTreeWrapper.setSize("230px", "800px");

		val staticDecorator = new DecoratorPanel();
		staticDecorator.setWidget(staticTreeWrapper);
		
		add(staticDecorator)
		
		GlobalSelection::instance.addListener(this)[it.select; return null]
	}
	
	private def void select(Iterable<SelectionItem> ids) {
		if (!ids.empty) {
			val id = ids.findFirst[true]
			val selectedItem = tree.treeItemIterator.findFirst [
				if (it.userObject != null) {
					if (id.clazz != null) {
						return it.userObject.equals(id.clazz)
					} else {
						return it.userObject.equals(id.pkg)
					}
				} else {
					return false
				}
			]
			if (selectedItem != null) {
				var parent = selectedItem.parentItem
				while (parent != null) {
					parent.state = true
					parent = parent.parentItem
				}
			}
		}
	}
}