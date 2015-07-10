/**
 */
package de.hub.visualemf.data.impl;

import de.hub.visualemf.data.DataPackage;
import de.hub.visualemf.data.DataRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.data.impl.DataRelationImpl#getRelationReference <em>Relation Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRelationImpl extends DataSetImpl implements DataRelation {
	/**
	 * The cached value of the '{@link #getRelationReference() <em>Relation Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationReference()
	 * @generated
	 * @ordered
	 */
	protected EReference relationReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationReference() {
		if (relationReference != null && relationReference.eIsProxy()) {
			InternalEObject oldRelationReference = (InternalEObject)relationReference;
			relationReference = (EReference)eResolveProxy(oldRelationReference);
			if (relationReference != oldRelationReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_RELATION__RELATION_REFERENCE, oldRelationReference, relationReference));
			}
		}
		return relationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetRelationReference() {
		return relationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationReference(EReference newRelationReference) {
		EReference oldRelationReference = relationReference;
		relationReference = newRelationReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RELATION__RELATION_REFERENCE, oldRelationReference, relationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_RELATION__RELATION_REFERENCE:
				if (resolve) return getRelationReference();
				return basicGetRelationReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.DATA_RELATION__RELATION_REFERENCE:
				setRelationReference((EReference)newValue);
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
			case DataPackage.DATA_RELATION__RELATION_REFERENCE:
				setRelationReference((EReference)null);
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
			case DataPackage.DATA_RELATION__RELATION_REFERENCE:
				return relationReference != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRelationImpl
