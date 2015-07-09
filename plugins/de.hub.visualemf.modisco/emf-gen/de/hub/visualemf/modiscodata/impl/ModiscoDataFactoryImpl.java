/**
 */
package de.hub.visualemf.modiscodata.impl;

import de.hub.visualemf.modiscodata.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoDataFactoryImpl extends EFactoryImpl implements ModiscoDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModiscoDataFactory init() {
		try {
			ModiscoDataFactory theModiscoDataFactory = (ModiscoDataFactory)EPackage.Registry.INSTANCE.getEFactory(ModiscoDataPackage.eNS_URI);
			if (theModiscoDataFactory != null) {
				return theModiscoDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModiscoDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM: return createClassMetricsItem();
			case ModiscoDataPackage.CONTAINMENT_ITEM: return createContainmentItem();
			case ModiscoDataPackage.PACKAGE_DEPENDENCY_ITEM: return createPackageDependencyItem();
			case ModiscoDataPackage.CLASS_DEPENDENCY_ITEM: return createClassDependencyItem();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM: return createMoDiscoDataItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMetricsItem createClassMetricsItem() {
		ClassMetricsItemImpl classMetricsItem = new ClassMetricsItemImpl();
		return classMetricsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentItem createContainmentItem() {
		ContainmentItemImpl containmentItem = new ContainmentItemImpl();
		return containmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependencyItem createPackageDependencyItem() {
		PackageDependencyItemImpl packageDependencyItem = new PackageDependencyItemImpl();
		return packageDependencyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDependencyItem createClassDependencyItem() {
		ClassDependencyItemImpl classDependencyItem = new ClassDependencyItemImpl();
		return classDependencyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoDiscoDataItem createMoDiscoDataItem() {
		MoDiscoDataItemImpl moDiscoDataItem = new MoDiscoDataItemImpl();
		return moDiscoDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoDataPackage getModiscoDataPackage() {
		return (ModiscoDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModiscoDataPackage getPackage() {
		return ModiscoDataPackage.eINSTANCE;
	}

} //ModiscoDataFactoryImpl
