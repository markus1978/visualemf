/**
 */
package de.hub.visualemf.data.impl;

import de.hub.visualemf.data.DataPackage;
import de.hub.visualemf.data.DataTable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.visualemf.data.impl.DataTableImpl#getColumnFeatures <em>Column Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTableImpl extends DataSetImpl implements DataTable {
	/**
	 * The cached value of the '{@link #getColumnFeatures() <em>Column Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> columnFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getColumnFeatures() {
		if (columnFeatures == null) {
			columnFeatures = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, DataPackage.DATA_TABLE__COLUMN_FEATURES);
		}
		return columnFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_TABLE__COLUMN_FEATURES:
				return getColumnFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA_TABLE__COLUMN_FEATURES:
				getColumnFeatures().clear();
				getColumnFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_TABLE__COLUMN_FEATURES:
				getColumnFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.DATA_TABLE__COLUMN_FEATURES:
				return columnFeatures != null && !columnFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTableImpl
