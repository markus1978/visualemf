package de.hub.visualemf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import de.hub.visualemf.data.DataFactory;
import de.hub.visualemf.data.DataHierarchy;
import de.hub.visualemf.data.DataItem;
import de.hub.visualemf.data.DataRelation;
import de.hub.visualemf.data.DataSet;
import de.hub.visualemf.data.DataTable;
import de.hub.visualemf.data.SizeTreeMapData;

public class DataSetMetaDataGenerator {

	public static DataHierarchy autoGenHierarchyDataSet(EClass dataItemClass) {
		return autoGenHierarchyDataSet(null, dataItemClass);
	}
	
	private static <T extends DataSet> T autoGenDataSet(T dataSet, EClass dataItemClass) {
		EStructuralFeature idAttr = dataItemClass.getEStructuralFeature("id");
		if (idAttr == null || !(idAttr instanceof EAttribute)) {
			throw new IllegalArgumentException("Invalid data item class with no suitable id attribute.");
		}
		EStructuralFeature nameAttr = dataItemClass.getEStructuralFeature("name");
		if (nameAttr == null || !(nameAttr instanceof EAttribute)) {
			throw new IllegalArgumentException("Invalid data item class with no suitable name attribute.");
		}
		dataSet.setIdAttribute((EAttribute)idAttr);
		dataSet.setNameAttribute((EAttribute)nameAttr);
		return dataSet;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends DataHierarchy> T autoGenHierarchyDataSet(T dataHierarchy, EClass dataItemClass) {
		if (dataHierarchy == null) {
			dataHierarchy = (T)DataFactory.eINSTANCE.createDataHierarchy();
		}
		
		dataHierarchy = autoGenDataSet(dataHierarchy, dataItemClass);
		
		EReference childReference = null;
		for (EReference reference: dataItemClass.getEAllReferences()) {
			if (reference.getEType().getInstanceClass().isAssignableFrom(dataItemClass.getInstanceClass()) &&
					reference.isContainment() && reference.isMany()) {
				if (childReference == null) {
					childReference = reference;
				} else {
					throw new IllegalArgumentException("Invalid data item class with more than one child reference.");
				}
			}
		}
		if (childReference == null) {
			throw new IllegalArgumentException("Invalid data item class with no suitable child reference.");
		}
		dataHierarchy.setChildrenReference(childReference);
		
		return dataHierarchy;
	}
	
	public static SizeTreeMapData autoGenSizeTreeDataSet(EClass dataItemClass) {
		SizeTreeMapData sizeTreeMapData = autoGenHierarchyDataSet(DataFactory.eINSTANCE.createSizeTreeMapData(), dataItemClass);
		EAttribute sizeAttribute = null;
		for(EAttribute attribute: dataItemClass.getEAllAttributes()) {
			if (attribute.getEType() == EcorePackage.eINSTANCE.getEInt() && !attribute.isMany()) {
				if (sizeAttribute != null) {
					throw new IllegalArgumentException("Invalid size tree data item class with more than one size attribute.");
				} else {
					sizeAttribute = attribute;
				}
			}
		}
		if (sizeAttribute == null) {
			throw new IllegalArgumentException("Invalid size tree data item class with no size attribute.");
		}
		sizeTreeMapData.setSizeAttribute(sizeAttribute);
		
		return sizeTreeMapData;
	}
	
	public static DataTable autoGenTableDataSet(EClass dataItemClass) {
		DataTable dataTable = autoGenDataSet(DataFactory.eINSTANCE.createDataTable(), dataItemClass);
		for(EAttribute attribute: dataItemClass.getEAllAttributes()) {
			if (attribute.getEType() == EcorePackage.eINSTANCE.getEFloat() || 
				attribute.getEType() == EcorePackage.eINSTANCE.getEDouble() ||
				attribute.getEType() == EcorePackage.eINSTANCE.getEInt() ||
				attribute.getEType() == EcorePackage.eINSTANCE.getELong()) {
				if (!attribute.isMany()) {
					dataTable.getColumnFeatures().add(attribute);
				}
			}
		}
		return dataTable;
	}
	
	public static DataRelation autoGenRelationDataSet(EClass dataItemClass) {
		DataRelation dataRelation = autoGenDataSet(DataFactory.eINSTANCE.createDataRelation(), dataItemClass);
		EReference relationReference = null;
		for(EReference reference: dataItemClass.getEAllReferences()) {
			if (DataItem.class.isAssignableFrom(reference.getEType().getInstanceClass()) && reference.isMany()) {
				if (relationReference != null) {
					throw new IllegalArgumentException("Invalid relation data item class with more than one relation reference.");
				} else {
					relationReference = reference;
				}
			}
		}
		if (relationReference == null) {
			throw new IllegalArgumentException("Invalid relation data item class with no suitable relation reference.");
		}
		dataRelation.setRelationReference(relationReference);
		
		return dataRelation;
	}
}
