package de.hub.visualemf.modisco

import java.util.List
import java.util.Collection
import java.util.HashSet

class DispatchTest {
	
	def dispatch void foo(Collection a) {
		System.out.println("A");
	}
	
	def dispatch void foo(HashSet a) {
		System.out.println("B");
		foo(a as Collection)
	}
	
	static def void main(String[] args) {
		new DispatchTest().foo(new HashSet());
	}
}