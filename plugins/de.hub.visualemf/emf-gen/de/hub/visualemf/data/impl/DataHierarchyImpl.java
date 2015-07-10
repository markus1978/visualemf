/**
 */
package de.hub.visualemf.data.impl;

import de.hub.visualemf.data.DataHierarchy;
import de.hub.visualemf.data.DataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.data.impl.DataHierarchyImpl#getChildrenReference <em>Children Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataHierarchyImpl extends DataSetImpl implements DataHierarchy {
	/**
	 * The cached value of the '{@link #getChildrenReference() <em>Children Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenReference()
	 * @generated
	 * @ordered
	 */
	protected EReference childrenReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildrenReference() {
		if (childrenReference != null && childrenReference.eIsProxy()) {
			InternalEObject oldChildrenReference = (InternalEObject)childrenReference;
			childrenReference = (EReference)eResolveProxy(oldChildrenReference);
			if (childrenReference != oldChildrenReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE, oldChildrenReference, childrenReference));
			}
		}
		return childrenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetChildrenReference() {
		return childrenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenReference(EReference newChildrenReference) {
		EReference oldChildrenReference = childrenReference;
		childrenReference = newChildrenReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE, oldChildrenReference, childrenReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE:
				if (resolve) return getChildrenReference();
				return basicGetChildrenReference();
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
			case DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE:
				setChildrenReference((EReference)newValue);
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
			case DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE:
				setChildrenReference((EReference)null);
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
			case DataPackage.DATA_HIERARCHY__CHILDREN_REFERENCE:
				return childrenReference != null;
		}
		return super.eIsSet(featureID);
	}

} //DataHierarchyImpl
