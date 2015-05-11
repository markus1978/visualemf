/**
 */
package de.hub.visualemf.modiscodata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.ContainmentItem#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getContainmentItem()
 * @model
 * @generated
 */
public interface ContainmentItem extends MoDiscoDataItem {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.visualemf.modiscodata.ContainmentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getContainmentItem_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainmentItem> getChildren();

} // ContainmentItem
