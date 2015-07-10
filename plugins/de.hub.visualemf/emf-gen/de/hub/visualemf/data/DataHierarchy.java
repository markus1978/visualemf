/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.data.DataHierarchy#getChildrenReference <em>Children Reference</em>}</li>
 * </ul>
 *
 * @see de.hub.visualemf.data.DataPackage#getDataHierarchy()
 * @model
 * @generated
 */
public interface DataHierarchy extends DataSet {
	/**
	 * Returns the value of the '<em><b>Children Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Reference</em>' reference.
	 * @see #setChildrenReference(EReference)
	 * @see de.hub.visualemf.data.DataPackage#getDataHierarchy_ChildrenReference()
	 * @model
	 * @generated
	 */
	EReference getChildrenReference();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataHierarchy#getChildrenReference <em>Children Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Reference</em>' reference.
	 * @see #getChildrenReference()
	 * @generated
	 */
	void setChildrenReference(EReference value);

} // DataHierarchy
