package de.hub.visualemf.gwt.examples.client

import org.apache.commons.collections4.trie.AbstractPatriciaTrie
import org.apache.commons.collections4.trie.KeyAnalyzer
import org.eclipse.xtend.lib.annotations.Data
import java.nio.channels.SelectionKey

@Data
class SelectionItem {
	private val Pair<String,String>[] bits
	
	public new(String id) {
		val elements = id.split("\\.")
		bits = newArrayOfSize(elements.length)		
		for(var i = 0; i < bits.length; i++) {
			val nameAndType = elements.get(i).split("&")
			if (nameAndType.length == 1) {
				bits.set(i, nameAndType.get(0) -> null)
			} else {
				bits.set(i, nameAndType.get(0) -> nameAndType.get(1))	
			}
		}
	}
}

class SelectionTree extends AbstractPatriciaTrie<SelectionItem, Void> {
	
	protected static final class SelectionTrieAnalyzer extends KeyAnalyzer<SelectionItem> {
		override bitIndex(SelectionItem key, int offsetInBits, int lengthInBits, SelectionItem other, int otherOffsetInBits, int otherLengthInBits) {
			val length = if (lengthInBits < otherLengthInBits) lengthInBits else otherLengthInBits
			for (var i = 0; i < length; i++) {
				val bit = key.bits.get(i + offsetInBits)
				val otherBit = other.bits.get(i + otherOffsetInBits)
				
				if (!bit.equals(otherBit)) {
					return i + offsetInBits
				}
			}
			return length + offsetInBits
		}
		
		override bitsPerElement() {
			return 1
		}
		
		override isBitSet(SelectionItem key, int bitIndex, int lengthInBits) {
			return false
		}
		
		override isPrefix(SelectionItem prefix, int offsetInBits, int lengthInBits, SelectionItem key) {
			for (var i = 0; i < lengthInBits; i++) {
				if (!prefix.bits.get(0).equals(key.bits.get(0))) {
					return false
				}
			}
			return true
		}
		
		override lengthInBits(SelectionItem key) {
			return key.bits.length
		}
	}
	
	protected static val keyAnalyzerInstance = new SelectionTrieAnalyzer
	
	protected new() {
		super(keyAnalyzerInstance)
	}
}

class Selection {
	val trie = new SelectionTree
	
	def hasSelectedPrefix(SelectionItem item) {
		val previous = trie.previousKey(item)
		return 
		if (previous == null) {
			false
		} else if (previous.bits.length < item.bits.length) {
			SelectionTree::keyAnalyzerInstance.isPrefix(previous, 0, previous.bits.length, item)
		} else {
			false
		}
	}
	
	def isSelected(SelectionItem item) {
		return trie.containsKey(item)		
	}
	
	def isAPrefixOfSelection(SelectionItem item) {
		return !trie.prefixMap(item).empty
	}
	
	def clear() { trie.clear }
	
	def add(SelectionItem item) { trie.put(item, null) }
	
	def remove(SelectionItem item) { trie.remove(item) }
}