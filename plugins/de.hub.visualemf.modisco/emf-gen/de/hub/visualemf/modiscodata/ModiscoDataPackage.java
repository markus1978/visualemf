/**
 */
package de.hub.visualemf.modiscodata;

import de.hub.visualemf.data.DataPackage;

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
 * @see de.hub.visualemf.modiscodata.ModiscoDataFactory
 * @model kind="package"
 * @generated
 */
public interface ModiscoDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modiscodata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hub.de/2015/VisualEMF/ModiscoData";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "md";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoDataPackage eINSTANCE = de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl <em>Mo Disco Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getMoDiscoDataItem()
	 * @generated
	 */
	int MO_DISCO_DATA_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT = DataPackage.DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_DATA_ITEM__NAME = DataPackage.DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_DATA_ITEM__ID = DataPackage.DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mo Disco Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_DATA_ITEM_FEATURE_COUNT = DataPackage.DATA_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mo Disco Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DISCO_DATA_ITEM_OPERATION_COUNT = DataPackage.DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl <em>Class Metrics Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getClassMetricsItem()
	 * @generated
	 */
	int CLASS_METRICS_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__REPRESENTED_ELEMENT = MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__NAME = MO_DISCO_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__ID = MO_DISCO_DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Wmc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__WMC = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__DIT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Noc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__NOC = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cbo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__CBO = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__NOM = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Noam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__NOAM = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM__SIZE = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class Metrics Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM_FEATURE_COUNT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Class Metrics Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METRICS_ITEM_OPERATION_COUNT = MO_DISCO_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.ContainmentItemImpl <em>Containment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.ContainmentItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getContainmentItem()
	 * @generated
	 */
	int CONTAINMENT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM__REPRESENTED_ELEMENT = MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM__NAME = MO_DISCO_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM__ID = MO_DISCO_DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM__CHILDREN = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM_FEATURE_COUNT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ITEM_OPERATION_COUNT = MO_DISCO_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.DeclarationContainmentItemImpl <em>Declaration Containment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.DeclarationContainmentItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getDeclarationContainmentItem()
	 * @generated
	 */
	int DECLARATION_CONTAINMENT_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM__REPRESENTED_ELEMENT = MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM__NAME = MO_DISCO_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM__ID = MO_DISCO_DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM__CHILDREN = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM__SIZE = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declaration Containment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM_FEATURE_COUNT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Declaration Containment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONTAINMENT_ITEM_OPERATION_COUNT = MO_DISCO_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.PackageDependencyItemImpl <em>Package Dependency Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.PackageDependencyItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getPackageDependencyItem()
	 * @generated
	 */
	int PACKAGE_DEPENDENCY_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM__REPRESENTED_ELEMENT = MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM__NAME = MO_DISCO_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM__ID = MO_DISCO_DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM__DEPENDENCIES = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Dependency Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM_FEATURE_COUNT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package Dependency Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_ITEM_OPERATION_COUNT = MO_DISCO_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.visualemf.modiscodata.impl.ClassDependencyItemImpl <em>Class Dependency Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.visualemf.modiscodata.impl.ClassDependencyItemImpl
	 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getClassDependencyItem()
	 * @generated
	 */
	int CLASS_DEPENDENCY_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM__REPRESENTED_ELEMENT = MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM__NAME = MO_DISCO_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM__ID = MO_DISCO_DATA_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM__DEPENDENCIES = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Dependency Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM_FEATURE_COUNT = MO_DISCO_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Dependency Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCY_ITEM_OPERATION_COUNT = MO_DISCO_DATA_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.ClassMetricsItem <em>Class Metrics Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Metrics Item</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem
	 * @generated
	 */
	EClass getClassMetricsItem();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getWmc <em>Wmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wmc</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getWmc()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Wmc();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getDit <em>Dit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dit</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getDit()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Dit();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getNoc <em>Noc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noc</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getNoc()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Noc();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getCbo <em>Cbo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cbo</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getCbo()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Cbo();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getNom()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Nom();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getNoam <em>Noam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noam</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getNoam()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Noam();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.ClassMetricsItem#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem#getSize()
	 * @see #getClassMetricsItem()
	 * @generated
	 */
	EAttribute getClassMetricsItem_Size();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.ContainmentItem <em>Containment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Item</em>'.
	 * @see de.hub.visualemf.modiscodata.ContainmentItem
	 * @generated
	 */
	EClass getContainmentItem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.visualemf.modiscodata.ContainmentItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.hub.visualemf.modiscodata.ContainmentItem#getChildren()
	 * @see #getContainmentItem()
	 * @generated
	 */
	EReference getContainmentItem_Children();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem <em>Declaration Containment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Containment Item</em>'.
	 * @see de.hub.visualemf.modiscodata.DeclarationContainmentItem
	 * @generated
	 */
	EClass getDeclarationContainmentItem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.hub.visualemf.modiscodata.DeclarationContainmentItem#getChildren()
	 * @see #getDeclarationContainmentItem()
	 * @generated
	 */
	EReference getDeclarationContainmentItem_Children();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.hub.visualemf.modiscodata.DeclarationContainmentItem#getSize()
	 * @see #getDeclarationContainmentItem()
	 * @generated
	 */
	EAttribute getDeclarationContainmentItem_Size();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.PackageDependencyItem <em>Package Dependency Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Dependency Item</em>'.
	 * @see de.hub.visualemf.modiscodata.PackageDependencyItem
	 * @generated
	 */
	EClass getPackageDependencyItem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.visualemf.modiscodata.PackageDependencyItem#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.hub.visualemf.modiscodata.PackageDependencyItem#getDependencies()
	 * @see #getPackageDependencyItem()
	 * @generated
	 */
	EReference getPackageDependencyItem_Dependencies();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.ClassDependencyItem <em>Class Dependency Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Dependency Item</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassDependencyItem
	 * @generated
	 */
	EClass getClassDependencyItem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.visualemf.modiscodata.ClassDependencyItem#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.hub.visualemf.modiscodata.ClassDependencyItem#getDependencies()
	 * @see #getClassDependencyItem()
	 * @generated
	 */
	EReference getClassDependencyItem_Dependencies();

	/**
	 * Returns the meta object for class '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem <em>Mo Disco Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo Disco Data Item</em>'.
	 * @see de.hub.visualemf.modiscodata.MoDiscoDataItem
	 * @generated
	 */
	EClass getMoDiscoDataItem();

	/**
	 * Returns the meta object for the reference '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getRepresentedElement <em>Represented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented Element</em>'.
	 * @see de.hub.visualemf.modiscodata.MoDiscoDataItem#getRepresentedElement()
	 * @see #getMoDiscoDataItem()
	 * @generated
	 */
	EReference getMoDiscoDataItem_RepresentedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.visualemf.modiscodata.MoDiscoDataItem#getName()
	 * @see #getMoDiscoDataItem()
	 * @generated
	 */
	EAttribute getMoDiscoDataItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.visualemf.modiscodata.MoDiscoDataItem#getId()
	 * @see #getMoDiscoDataItem()
	 * @generated
	 */
	EAttribute getMoDiscoDataItem_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModiscoDataFactory getModiscoDataFactory();

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
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl <em>Class Metrics Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getClassMetricsItem()
		 * @generated
		 */
		EClass CLASS_METRICS_ITEM = eINSTANCE.getClassMetricsItem();

		/**
		 * The meta object literal for the '<em><b>Wmc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__WMC = eINSTANCE.getClassMetricsItem_Wmc();

		/**
		 * The meta object literal for the '<em><b>Dit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__DIT = eINSTANCE.getClassMetricsItem_Dit();

		/**
		 * The meta object literal for the '<em><b>Noc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__NOC = eINSTANCE.getClassMetricsItem_Noc();

		/**
		 * The meta object literal for the '<em><b>Cbo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__CBO = eINSTANCE.getClassMetricsItem_Cbo();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__NOM = eINSTANCE.getClassMetricsItem_Nom();

		/**
		 * The meta object literal for the '<em><b>Noam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__NOAM = eINSTANCE.getClassMetricsItem_Noam();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METRICS_ITEM__SIZE = eINSTANCE.getClassMetricsItem_Size();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.ContainmentItemImpl <em>Containment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.ContainmentItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getContainmentItem()
		 * @generated
		 */
		EClass CONTAINMENT_ITEM = eINSTANCE.getContainmentItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_ITEM__CHILDREN = eINSTANCE.getContainmentItem_Children();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.DeclarationContainmentItemImpl <em>Declaration Containment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.DeclarationContainmentItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getDeclarationContainmentItem()
		 * @generated
		 */
		EClass DECLARATION_CONTAINMENT_ITEM = eINSTANCE.getDeclarationContainmentItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION_CONTAINMENT_ITEM__CHILDREN = eINSTANCE.getDeclarationContainmentItem_Children();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION_CONTAINMENT_ITEM__SIZE = eINSTANCE.getDeclarationContainmentItem_Size();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.PackageDependencyItemImpl <em>Package Dependency Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.PackageDependencyItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getPackageDependencyItem()
		 * @generated
		 */
		EClass PACKAGE_DEPENDENCY_ITEM = eINSTANCE.getPackageDependencyItem();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DEPENDENCY_ITEM__DEPENDENCIES = eINSTANCE.getPackageDependencyItem_Dependencies();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.ClassDependencyItemImpl <em>Class Dependency Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.ClassDependencyItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getClassDependencyItem()
		 * @generated
		 */
		EClass CLASS_DEPENDENCY_ITEM = eINSTANCE.getClassDependencyItem();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEPENDENCY_ITEM__DEPENDENCIES = eINSTANCE.getClassDependencyItem_Dependencies();

		/**
		 * The meta object literal for the '{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl <em>Mo Disco Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl
		 * @see de.hub.visualemf.modiscodata.impl.ModiscoDataPackageImpl#getMoDiscoDataItem()
		 * @generated
		 */
		EClass MO_DISCO_DATA_ITEM = eINSTANCE.getMoDiscoDataItem();

		/**
		 * The meta object literal for the '<em><b>Represented Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT = eINSTANCE.getMoDiscoDataItem_RepresentedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_DISCO_DATA_ITEM__NAME = eINSTANCE.getMoDiscoDataItem_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_DISCO_DATA_ITEM__ID = eINSTANCE.getMoDiscoDataItem_Id();

	}

} //ModiscoDataPackage
