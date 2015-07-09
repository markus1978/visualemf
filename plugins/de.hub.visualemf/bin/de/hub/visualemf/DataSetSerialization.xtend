package de.hub.visualemf

import de.hub.visualemf.data.DataHierarchy
import de.hub.visualemf.data.DataRelation
import de.hub.visualemf.data.DataTable
import org.eclipse.emf.common.util.EList
import de.hub.visualemf.data.DataItem
import de.hub.visualemf.data.SizeTreeMapData
import java.io.File
import de.hub.visualemf.data.DataSet
import java.io.PrintWriter

class DataSetSerialization {
	
	static dispatch def serialize(DataTable dataSet) '''
		{
			"head" : [ «FOR column:dataSet.columnFeatures SEPARATOR ", "»«column.name»«ENDFOR» ],
			"entries" : [
				«FOR dataItem:dataSet.items SEPARATOR ","»
					{
						"name" : "«dataItem.eGet(dataSet.nameAttribute)»",
						"id" : "«dataItem.eGet(dataSet.idAttribute)»",
						"values"" : [«FOR column:dataSet.columnFeatures SEPARATOR ", "»«dataItem.eGet(column)»«ENDFOR»]
					}
				«ENDFOR»
			]
		}
	'''
	
	static dispatch def serialize(DataRelation dataSet) '''
		[
			«FOR dataItem:dataSet.items SEPARATOR ", "»
				{
					"name" : "«dataItem.eGet(dataSet.nameAttribute)»",
					"id" : "«dataItem.eGet(dataSet.idAttribute)»",
					"links" : [«FOR relatedItem:(dataItem.eGet(dataSet.relationReference) as EList<? extends DataItem>) SEPARATOR ", "»"«relatedItem.eGet(dataSet.idAttribute)»"«ENDFOR»]
				}
			«ENDFOR»
		]
	'''	
	
	static dispatch def CharSequence serialize(DataHierarchy dataSet) {
		return serialize(dataSet, dataSet.items);
	}
	
	static def CharSequence serialize(DataHierarchy dataSet, EList<? extends DataItem> items) '''
		[
			«FOR dataItem:items SEPARATOR ", "»
				{
					«val name = dataItem.eGet(dataSet.nameAttribute)»
					«val children=dataItem.eGet(dataSet.childrenReference) as EList<? extends DataItem>»
					"id" : "«dataItem.eGet(dataSet.idAttribute)»"«IF !name.equals("#noname") || !children.empty || dataSet instanceof SizeTreeMapData»,«ENDIF»
					«IF !name.equals("#noname")»
						"name" : "«dataItem.eGet(dataSet.nameAttribute)»"«IF !children.empty || dataSet instanceof SizeTreeMapData»,«ENDIF»
					«ENDIF»					
					«IF !children.empty»
						"children" : «serialize(dataSet, children)»
					«ELSE»
						«IF dataSet instanceof SizeTreeMapData»
							«val sizeAttribute=(dataSet as SizeTreeMapData).sizeAttribute»
							«IF dataItem.eClass.EAllAttributes.contains(sizeAttribute) && dataItem.eIsSet(sizeAttribute)»
								"size" : «dataItem.eGet(sizeAttribute)»
							«ELSE»
							    "size" : 1
							«ENDIF» 
						«ENDIF»						
					«ENDIF»
				}
			«ENDFOR»
		]
	'''
	
	static def write(File file, DataSet dataSet) {
		if (file.parentFile != null) file.parentFile.mkdirs
		val out = new PrintWriter(file)
		out.print(serialize(dataSet).toString)
		out.close	
	}
}