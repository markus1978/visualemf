/**
 */
package de.hub.visualemf.modiscodata;

import de.hub.visualemf.data.DataItem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mo Disco Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getRepresentedElement <em>Represented Element</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getMoDiscoDataItem()
 * @model
 * @generated
 */
public interface MoDiscoDataItem extends DataItem {
	/**
	 * Returns the value of the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Element</em>' reference.
	 * @see #setRepresentedElement(EObject)
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getMoDiscoDataItem_RepresentedElement()
	 * @model
	 * @generated
	 */
	EObject getRepresentedElement();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getRepresentedElement <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Element</em>' reference.
	 * @see #getRepresentedElement()
	 * @generated
	 */
	void setRepresentedElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getMoDiscoDataItem_Name()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getMoDiscoDataItem_Id()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns whether the value of the '{@link de.hub.visualemf.modiscodata.MoDiscoDataItem#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #getId()
	 * @generated
	 */
	boolean isSetId();

} // MoDiscoDataItem
