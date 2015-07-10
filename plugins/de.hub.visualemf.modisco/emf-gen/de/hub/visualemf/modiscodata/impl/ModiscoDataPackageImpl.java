/**
 */
package de.hub.visualemf.modiscodata.impl;

import de.hub.visualemf.data.DataPackage;
import de.hub.visualemf.modiscodata.ClassDependencyItem;
import de.hub.visualemf.modiscodata.ClassMetricsItem;
import de.hub.visualemf.modiscodata.ContainmentItem;
import de.hub.visualemf.modiscodata.MoDiscoDataItem;
import de.hub.visualemf.modiscodata.ModiscoDataFactory;
import de.hub.visualemf.modiscodata.ModiscoDataPackage;
import de.hub.visualemf.modiscodata.PackageDependencyItem;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoDataPackageImpl extends EPackageImpl implements ModiscoDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMetricsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDependencyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDependencyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moDiscoDataItemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModiscoDataPackageImpl() {
		super(eNS_URI, ModiscoDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModiscoDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModiscoDataPackage init() {
		if (isInited) return (ModiscoDataPackage)EPackage.Registry.INSTANCE.getEPackage(ModiscoDataPackage.eNS_URI);

		// Obtain or create and register package
		ModiscoDataPackageImpl theModiscoDataPackage = (ModiscoDataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModiscoDataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModiscoDataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModiscoDataPackage.createPackageContents();

		// Initialize created meta-data
		theModiscoDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModiscoDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModiscoDataPackage.eNS_URI, theModiscoDataPackage);
		return theModiscoDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMetricsItem() {
		return classMetricsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Wmc() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Wmc_cc() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Dit() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Noc() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Cbo() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Rfc() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Lcom() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMetricsItem_Size() {
		return (EAttribute)classMetricsItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentItem() {
		return containmentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentItem_Children() {
		return (EReference)containmentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentItem_Size() {
		return (EAttribute)containmentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDependencyItem() {
		return packageDependencyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDependencyItem_Dependencies() {
		return (EReference)packageDependencyItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDependencyItem() {
		return classDependencyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDependencyItem_Dependencies() {
		return (EReference)classDependencyItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoDiscoDataItem() {
		return moDiscoDataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoDiscoDataItem_RepresentedElement() {
		return (EReference)moDiscoDataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoDiscoDataItem_Name() {
		return (EAttribute)moDiscoDataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoDiscoDataItem_Id() {
		return (EAttribute)moDiscoDataItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoDiscoDataItem_Type() {
		return (EAttribute)moDiscoDataItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoDiscoDataItem_Declaration() {
		return (EAttribute)moDiscoDataItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoDataFactory getModiscoDataFactory() {
		return (ModiscoDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classMetricsItemEClass = createEClass(CLASS_METRICS_ITEM);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__WMC);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__WMC_CC);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__DIT);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__NOC);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__CBO);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__RFC);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__LCOM);
		createEAttribute(classMetricsItemEClass, CLASS_METRICS_ITEM__SIZE);

		containmentItemEClass = createEClass(CONTAINMENT_ITEM);
		createEReference(containmentItemEClass, CONTAINMENT_ITEM__CHILDREN);
		createEAttribute(containmentItemEClass, CONTAINMENT_ITEM__SIZE);

		packageDependencyItemEClass = createEClass(PACKAGE_DEPENDENCY_ITEM);
		createEReference(packageDependencyItemEClass, PACKAGE_DEPENDENCY_ITEM__DEPENDENCIES);

		classDependencyItemEClass = createEClass(CLASS_DEPENDENCY_ITEM);
		createEReference(classDependencyItemEClass, CLASS_DEPENDENCY_ITEM__DEPENDENCIES);

		moDiscoDataItemEClass = createEClass(MO_DISCO_DATA_ITEM);
		createEReference(moDiscoDataItemEClass, MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT);
		createEAttribute(moDiscoDataItemEClass, MO_DISCO_DATA_ITEM__NAME);
		createEAttribute(moDiscoDataItemEClass, MO_DISCO_DATA_ITEM__ID);
		createEAttribute(moDiscoDataItemEClass, MO_DISCO_DATA_ITEM__TYPE);
		createEAttribute(moDiscoDataItemEClass, MO_DISCO_DATA_ITEM__DECLARATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classMetricsItemEClass.getESuperTypes().add(this.getMoDiscoDataItem());
		containmentItemEClass.getESuperTypes().add(this.getMoDiscoDataItem());
		packageDependencyItemEClass.getESuperTypes().add(this.getMoDiscoDataItem());
		classDependencyItemEClass.getESuperTypes().add(this.getMoDiscoDataItem());
		moDiscoDataItemEClass.getESuperTypes().add(theDataPackage.getDataItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(classMetricsItemEClass, ClassMetricsItem.class, "ClassMetricsItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassMetricsItem_Wmc(), theEcorePackage.getEInt(), "wmc", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Wmc_cc(), theEcorePackage.getEInt(), "wmc_cc", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Dit(), theEcorePackage.getEInt(), "dit", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Noc(), theEcorePackage.getEInt(), "noc", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Cbo(), theEcorePackage.getEInt(), "cbo", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Rfc(), theEcorePackage.getEInt(), "rfc", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Lcom(), theEcorePackage.getEInt(), "lcom", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMetricsItem_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, ClassMetricsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentItemEClass, ContainmentItem.class, "ContainmentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentItem_Children(), this.getContainmentItem(), null, "children", null, 0, -1, ContainmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentItem_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, ContainmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageDependencyItemEClass, PackageDependencyItem.class, "PackageDependencyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageDependencyItem_Dependencies(), this.getMoDiscoDataItem(), null, "dependencies", null, 0, -1, PackageDependencyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDependencyItemEClass, ClassDependencyItem.class, "ClassDependencyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDependencyItem_Dependencies(), this.getMoDiscoDataItem(), null, "dependencies", null, 0, -1, ClassDependencyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moDiscoDataItemEClass, MoDiscoDataItem.class, "MoDiscoDataItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoDiscoDataItem_RepresentedElement(), theEcorePackage.getEObject(), null, "representedElement", null, 0, 1, MoDiscoDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoDiscoDataItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, MoDiscoDataItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoDiscoDataItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, MoDiscoDataItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoDiscoDataItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, MoDiscoDataItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoDiscoDataItem_Declaration(), theEcorePackage.getEBoolean(), "declaration", null, 0, 1, MoDiscoDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModiscoDataPackageImpl
