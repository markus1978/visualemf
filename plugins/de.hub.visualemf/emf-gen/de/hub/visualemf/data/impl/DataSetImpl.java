/**
 */
package de.hub.visualemf.data.impl;

import de.hub.visualemf.data.DataItem;
import de.hub.visualemf.data.DataPackage;
import de.hub.visualemf.data.DataSet;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.data.impl.DataSetImpl#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.impl.DataSetImpl#getIdAttribute <em>Id Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.impl.DataSetImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.impl.DataSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.visualemf.data.impl.DataSetImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetImpl extends DataItemImpl implements DataSet {
	/**
	 * The cached value of the '{@link #getNameAttribute() <em>Name Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute nameAttribute;

	/**
	 * The cached value of the '{@link #getIdAttribute() <em>Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute idAttribute;

	/**
	 * The cached value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute typeAttribute;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameAttribute() {
		if (nameAttribute != null && nameAttribute.eIsProxy()) {
			InternalEObject oldNameAttribute = (InternalEObject)nameAttribute;
			nameAttribute = (EAttribute)eResolveProxy(oldNameAttribute);
			if (nameAttribute != oldNameAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_SET__NAME_ATTRIBUTE, oldNameAttribute, nameAttribute));
			}
		}
		return nameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetNameAttribute() {
		return nameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAttribute(EAttribute newNameAttribute) {
		EAttribute oldNameAttribute = nameAttribute;
		nameAttribute = newNameAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SET__NAME_ATTRIBUTE, oldNameAttribute, nameAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdAttribute() {
		if (idAttribute != null && idAttribute.eIsProxy()) {
			InternalEObject oldIdAttribute = (InternalEObject)idAttribute;
			idAttribute = (EAttribute)eResolveProxy(oldIdAttribute);
			if (idAttribute != oldIdAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_SET__ID_ATTRIBUTE, oldIdAttribute, idAttribute));
			}
		}
		return idAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetIdAttribute() {
		return idAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAttribute(EAttribute newIdAttribute) {
		EAttribute oldIdAttribute = idAttribute;
		idAttribute = newIdAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SET__ID_ATTRIBUTE, oldIdAttribute, idAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAttribute() {
		if (typeAttribute != null && typeAttribute.eIsProxy()) {
			InternalEObject oldTypeAttribute = (InternalEObject)typeAttribute;
			typeAttribute = (EAttribute)eResolveProxy(oldTypeAttribute);
			if (typeAttribute != oldTypeAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_SET__TYPE_ATTRIBUTE, oldTypeAttribute, typeAttribute));
			}
		}
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetTypeAttribute() {
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttribute(EAttribute newTypeAttribute) {
		EAttribute oldTypeAttribute = typeAttribute;
		typeAttribute = newTypeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SET__TYPE_ATTRIBUTE, oldTypeAttribute, typeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<DataItem>(DataItem.class, this, DataPackage.DATA_SET__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_SET__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_SET__NAME_ATTRIBUTE:
				if (resolve) return getNameAttribute();
				return basicGetNameAttribute();
			case DataPackage.DATA_SET__ID_ATTRIBUTE:
				if (resolve) return getIdAttribute();
				return basicGetIdAttribute();
			case DataPackage.DATA_SET__TYPE_ATTRIBUTE:
				if (resolve) return getTypeAttribute();
				return basicGetTypeAttribute();
			case DataPackage.DATA_SET__NAME:
				return getName();
			case DataPackage.DATA_SET__ITEMS:
				return getItems();
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
			case DataPackage.DATA_SET__NAME_ATTRIBUTE:
				setNameAttribute((EAttribute)newValue);
				return;
			case DataPackage.DATA_SET__ID_ATTRIBUTE:
				setIdAttribute((EAttribute)newValue);
				return;
			case DataPackage.DATA_SET__TYPE_ATTRIBUTE:
				setTypeAttribute((EAttribute)newValue);
				return;
			case DataPackage.DATA_SET__NAME:
				setName((String)newValue);
				return;
			case DataPackage.DATA_SET__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends DataItem>)newValue);
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
			case DataPackage.DATA_SET__NAME_ATTRIBUTE:
				setNameAttribute((EAttribute)null);
				return;
			case DataPackage.DATA_SET__ID_ATTRIBUTE:
				setIdAttribute((EAttribute)null);
				return;
			case DataPackage.DATA_SET__TYPE_ATTRIBUTE:
				setTypeAttribute((EAttribute)null);
				return;
			case DataPackage.DATA_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.DATA_SET__ITEMS:
				getItems().clear();
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
			case DataPackage.DATA_SET__NAME_ATTRIBUTE:
				return nameAttribute != null;
			case DataPackage.DATA_SET__ID_ATTRIBUTE:
				return idAttribute != null;
			case DataPackage.DATA_SET__TYPE_ATTRIBUTE:
				return typeAttribute != null;
			case DataPackage.DATA_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.DATA_SET__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataSetImpl
