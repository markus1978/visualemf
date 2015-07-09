/**
 */
package de.hub.visualemf.modiscodata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Containment Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem#getChildren <em>Children</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getDeclarationContainmentItem()
 * @model
 * @generated
 */
public interface DeclarationContainmentItem extends MoDiscoDataItem {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.visualemf.modiscodata.DeclarationContainmentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getDeclarationContainmentItem_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclarationContainmentItem> getChildren();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getDeclarationContainmentItem_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.modiscodata.DeclarationContainmentItem#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // DeclarationContainmentItem
