/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.visualemf.data.DataRelation#getRelationReference <em>Relation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.visualemf.data.DataPackage#getDataRelation()
 * @model
 * @generated
 */
public interface DataRelation extends DataSet {
	/**
	 * Returns the value of the '<em><b>Relation Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Reference</em>' reference.
	 * @see #setRelationReference(EReference)
	 * @see de.hub.visualemf.data.DataPackage#getDataRelation_RelationReference()
	 * @model
	 * @generated
	 */
	EReference getRelationReference();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataRelation#getRelationReference <em>Relation Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Reference</em>' reference.
	 * @see #getRelationReference()
	 * @generated
	 */
	void setRelationReference(EReference value);

} // DataRelation
