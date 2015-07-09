/**
 */
package de.hub.visualemf.modiscodata.util;

import de.hub.visualemf.data.DataItem;

import de.hub.visualemf.modiscodata.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage
 * @generated
 */
public class ModiscoDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModiscoDataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModiscoDataSwitch<Adapter> modelSwitch =
		new ModiscoDataSwitch<Adapter>() {
			@Override
			public Adapter caseClassMetricsItem(ClassMetricsItem object) {
				return createClassMetricsItemAdapter();
			}
			@Override
			public Adapter caseContainmentItem(ContainmentItem object) {
				return createContainmentItemAdapter();
			}
			@Override
			public Adapter casePackageDependencyItem(PackageDependencyItem object) {
				return createPackageDependencyItemAdapter();
			}
			@Override
			public Adapter caseClassDependencyItem(ClassDependencyItem object) {
				return createClassDependencyItemAdapter();
			}
			@Override
			public Adapter caseMoDiscoDataItem(MoDiscoDataItem object) {
				return createMoDiscoDataItemAdapter();
			}
			@Override
			public Adapter caseDataItem(DataItem object) {
				return createDataItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.modiscodata.ClassMetricsItem <em>Class Metrics Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.modiscodata.ClassMetricsItem
	 * @generated
	 */
	public Adapter createClassMetricsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.modiscodata.ContainmentItem <em>Containment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.modiscodata.ContainmentItem
	 * @generated
	 */
	public Adapter createContainmentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.modiscodata.PackageDependencyItem <em>Package Dependency Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.modiscodata.PackageDependencyItem
	 * @generated
	 */
	public Adapter createPackageDependencyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.modiscodata.ClassDependencyItem <em>Class Dependency Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.modiscodata.ClassDependencyItem
	 * @generated
	 */
	public Adapter createClassDependencyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem <em>Mo Disco Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.modiscodata.MoDiscoDataItem
	 * @generated
	 */
	public Adapter createMoDiscoDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.visualemf.data.DataItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.visualemf.data.DataItem
	 * @generated
	 */
	public Adapter createDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModiscoDataAdapterFactory
