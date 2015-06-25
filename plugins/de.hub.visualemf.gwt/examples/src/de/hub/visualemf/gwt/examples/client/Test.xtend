package de.hub.visualemf.gwt.examples.client

import de.itemis.xtend.auto.gwt.JsNative
import de.itemis.xtend.auto.gwt.OverlayTypeByExample

@OverlayTypeByExample('
  {
	"head":["metric"],
    "entries":[
      {
        "values":[13,26,4],
        "name":"EmfFragActivator",
        "id":"de.hub.emffrag.EmfFragActivator"
      }
	]
  }
')
class TestData {}

class Test {
	@JsNative static def String hello() '''
		return "HEllo"
	'''
}