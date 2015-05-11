/**
 */
package de.hub.visualemf.data.impl;

import de.hub.visualemf.data.DataPackage;
import de.hub.visualemf.data.SizeTreeMapData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Tree Map Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.visualemf.data.impl.SizeTreeMapDataImpl#getSizeAttribute <em>Size Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeTreeMapDataImpl extends DataHierarchyImpl implements SizeTreeMapData {
	/**
	 * The cached value of the '{@link #getSizeAttribute() <em>Size Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute sizeAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeTreeMapDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.SIZE_TREE_MAP_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeAttribute() {
		if (sizeAttribute != null && sizeAttribute.eIsProxy()) {
			InternalEObject oldSizeAttribute = (InternalEObject)sizeAttribute;
			sizeAttribute = (EAttribute)eResolveProxy(oldSizeAttribute);
			if (sizeAttribute != oldSizeAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE, oldSizeAttribute, sizeAttribute));
			}
		}
		return sizeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetSizeAttribute() {
		return sizeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeAttribute(EAttribute newSizeAttribute) {
		EAttribute oldSizeAttribute = sizeAttribute;
		sizeAttribute = newSizeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE, oldSizeAttribute, sizeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE:
				if (resolve) return getSizeAttribute();
				return basicGetSizeAttribute();
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
			case DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE:
				setSizeAttribute((EAttribute)newValue);
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
			case DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE:
				setSizeAttribute((EAttribute)null);
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
			case DataPackage.SIZE_TREE_MAP_DATA__SIZE_ATTRIBUTE:
				return sizeAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //SizeTreeMapDataImpl
