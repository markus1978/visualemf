/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.visualemf.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hub.de/2015/VisualEMF/Data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = de.hub.visualemf.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.DataItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.DataItemImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.DataSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.DataSetImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME_ATTRIBUTE = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ID_ATTRIBUTE = DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME = DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ITEMS = DATA_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.DataTableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.DataTableImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataTable()
	 * @generated
	 */
	int DATA_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__NAME_ATTRIBUTE = DATA_SET__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ID_ATTRIBUTE = DATA_SET__ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__NAME = DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__ITEMS = DATA_SET__ITEMS;

	/**
	 * The feature id for the '<em><b>Column Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE__COLUMN_FEATURES = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TABLE_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.DataHierarchyImpl <em>Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.DataHierarchyImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataHierarchy()
	 * @generated
	 */
	int DATA_HIERARCHY = 3;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY__NAME_ATTRIBUTE = DATA_SET__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY__ID_ATTRIBUTE = DATA_SET__ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY__NAME = DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY__ITEMS = DATA_SET__ITEMS;

	/**
	 * The feature id for the '<em><b>Children Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY__CHILDREN_REFERENCE = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HIERARCHY_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.DataRelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.DataRelationImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataRelation()
	 * @generated
	 */
	int DATA_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION__NAME_ATTRIBUTE = DATA_SET__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION__ID_ATTRIBUTE = DATA_SET__ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION__NAME = DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION__ITEMS = DATA_SET__ITEMS;

	/**
	 * The feature id for the '<em><b>Relation Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION__RELATION_REFERENCE = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATION_OPERATION_COUNT = DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.data.impl.SizeTreeMapDataImpl <em>Size Tree Map Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.data.impl.SizeTreeMapDataImpl
	 * @see de.hub.visualemf.data.impl.DataPackageImpl#getSizeTreeMapData()
	 * @generated
	 */
	int SIZE_TREE_MAP_DATA = 5;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__NAME_ATTRIBUTE = DATA_HIERARCHY__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__ID_ATTRIBUTE = DATA_HIERARCHY__ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__NAME = DATA_HIERARCHY__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__ITEMS = DATA_HIERARCHY__ITEMS;

	/**
	 * The feature id for the '<em><b>Children Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__CHILDREN_REFERENCE = DATA_HIERARCHY__CHILDREN_REFERENCE;

	/**
	 * The feature id for the '<em><b>Size Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE = DATA_HIERARCHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Size Tree Map Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA_FEATURE_COUNT = DATA_HIERARCHY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Size Tree Map Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_TREE_MAP_DATA_OPERATION_COUNT = DATA_HIERARCHY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.DataItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see de.hub.visualemf.data.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.DataSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see de.hub.visualemf.data.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.data.DataSet#getNameAttribute <em>Name Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Attribute</em>'.
	 * @see de.hub.visualemf.data.DataSet#getNameAttribute()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_NameAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.data.DataSet#getIdAttribute <em>Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Attribute</em>'.
	 * @see de.hub.visualemf.data.DataSet#getIdAttribute()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_IdAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.data.DataSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.visualemf.data.DataSet#getName()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.visualemf.data.DataSet#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.hub.visualemf.data.DataSet#getItems()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Items();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.DataTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see de.hub.visualemf.data.DataTable
	 * @generated
	 */
	EClass getDataTable();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.visualemf.data.DataTable#getColumnFeatures <em>Column Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Features</em>'.
	 * @see de.hub.visualemf.data.DataTable#getColumnFeatures()
	 * @see #getDataTable()
	 * @generated
	 */
	EReference getDataTable_ColumnFeatures();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.DataHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy</em>'.
	 * @see de.hub.visualemf.data.DataHierarchy
	 * @generated
	 */
	EClass getDataHierarchy();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.data.DataHierarchy#getChildrenReference <em>Children Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Children Reference</em>'.
	 * @see de.hub.visualemf.data.DataHierarchy#getChildrenReference()
	 * @see #getDataHierarchy()
	 * @generated
	 */
	EReference getDataHierarchy_ChildrenReference();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.DataRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.hub.visualemf.data.DataRelation
	 * @generated
	 */
	EClass getDataRelation();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.data.DataRelation#getRelationReference <em>Relation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation Reference</em>'.
	 * @see de.hub.visualemf.data.DataRelation#getRelationReference()
	 * @see #getDataRelation()
	 * @generated
	 */
	EReference getDataRelation_RelationReference();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.data.SizeTreeMapData <em>Size Tree Map Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Tree Map Data</em>'.
	 * @see de.hub.visualemf.data.SizeTreeMapData
	 * @generated
	 */
	EClass getSizeTreeMapData();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.data.SizeTreeMapData#getSizeAttribute <em>Size Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size Attribute</em>'.
	 * @see de.hub.visualemf.data.SizeTreeMapData#getSizeAttribute()
	 * @see #getSizeTreeMapData()
	 * @generated
	 */
	EReference getSizeTreeMapData_SizeAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.DataItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.DataItemImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.DataSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.DataSetImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Name Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__NAME_ATTRIBUTE = eINSTANCE.getDataSet_NameAttribute();

		/**
		 * The meta object literal for the '<em><b>Id Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__ID_ATTRIBUTE = eINSTANCE.getDataSet_IdAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__NAME = eINSTANCE.getDataSet_Name();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__ITEMS = eINSTANCE.getDataSet_Items();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.DataTableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.DataTableImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataTable()
		 * @generated
		 */
		EClass DATA_TABLE = eINSTANCE.getDataTable();

		/**
		 * The meta object literal for the '<em><b>Column Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TABLE__COLUMN_FEATURES = eINSTANCE.getDataTable_ColumnFeatures();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.DataHierarchyImpl <em>Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.DataHierarchyImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataHierarchy()
		 * @generated
		 */
		EClass DATA_HIERARCHY = eINSTANCE.getDataHierarchy();

		/**
		 * The meta object literal for the '<em><b>Children Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HIERARCHY__CHILDREN_REFERENCE = eINSTANCE.getDataHierarchy_ChildrenReference();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.DataRelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.DataRelationImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getDataRelation()
		 * @generated
		 */
		EClass DATA_RELATION = eINSTANCE.getDataRelation();

		/**
		 * The meta object literal for the '<em><b>Relation Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RELATION__RELATION_REFERENCE = eINSTANCE.getDataRelation_RelationReference();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.data.impl.SizeTreeMapDataImpl <em>Size Tree Map Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.data.impl.SizeTreeMapDataImpl
		 * @see de.hub.visualemf.data.impl.DataPackageImpl#getSizeTreeMapData()
		 * @generated
		 */
		EClass SIZE_TREE_MAP_DATA = eINSTANCE.getSizeTreeMapData();

		/**
		 * The meta object literal for the '<em><b>Size Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE = eINSTANCE.getSizeTreeMapData_SizeAttribute();

	}

} //DataPackage
