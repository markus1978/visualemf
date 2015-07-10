/**
 */
package de.hub.visualemf.modiscodata.impl;

import de.hub.srcrepo.metrics.ModiscoMetrics;
import de.hub.visualemf.data.impl.DataItemImpl;
import de.hub.visualemf.modiscodata.MoDiscoDataItem;
import de.hub.visualemf.modiscodata.ModiscoDataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.modisco.java.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo Disco Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl#getRepresentedElement <em>Represented Element</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.MoDiscoDataItemImpl#isDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoDiscoDataItemImpl extends DataItemImpl implements MoDiscoDataItem {
	/**
	 * The cached value of the '{@link #getRepresentedElement() <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject representedElement;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECLARATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeclaration()
	 * @generated
	 * @ordered
	 */
	protected boolean declaration = DECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoDiscoDataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoDataPackage.Literals.MO_DISCO_DATA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRepresentedElement() {
		if (representedElement != null && representedElement.eIsProxy()) {
			InternalEObject oldRepresentedElement = (InternalEObject)representedElement;
			representedElement = eResolveProxy(oldRepresentedElement);
			if (representedElement != oldRepresentedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
			}
		}
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRepresentedElement() {
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedElement(EObject newRepresentedElement) {
		EObject oldRepresentedElement = representedElement;
		representedElement = newRepresentedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (getRepresentedElement() == null) {
			return "#noname";
		}
		if (getRepresentedElement() instanceof NamedElement) {
			String name = ((NamedElement)getRepresentedElement()).getName();
			if (name == null) {
				return "#noname";
			} else {
				return name;
			}
		} else {
			return "#noname";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		// TODO: implement this method to return whether the 'Name' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getId() {
		return ModiscoMetrics.qualifiedName(getRepresentedElement()).replace('/', '.');
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		// TODO: implement this method to return whether the 'Id' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		return getRepresentedElement().eClass().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		// TODO: implement this method to return whether the 'Type' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(boolean newDeclaration) {
		boolean oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.MO_DISCO_DATA_ITEM__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT:
				if (resolve) return getRepresentedElement();
				return basicGetRepresentedElement();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__NAME:
				return getName();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__ID:
				return getId();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__TYPE:
				return getType();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__DECLARATION:
				return isDeclaration();
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
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT:
				setRepresentedElement((EObject)newValue);
				return;
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__DECLARATION:
				setDeclaration((Boolean)newValue);
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
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT:
				setRepresentedElement((EObject)null);
				return;
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
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
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__REPRESENTED_ELEMENT:
				return representedElement != null;
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__NAME:
				return isSetName();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__ID:
				return isSetId();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__TYPE:
				return isSetType();
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM__DECLARATION:
				return declaration != DECLARATION_EDEFAULT;
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
		result.append(" (declaration: ");
		result.append(declaration);
		result.append(')');
		return result.toString();
	}

} //MoDiscoDataItemImpl
