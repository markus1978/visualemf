/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.data.DataSet#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.DataSet#getIdAttribute <em>Id Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.DataSet#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link de.hub.visualemf.data.DataSet#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.visualemf.data.DataSet#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.hub.visualemf.data.DataPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends DataItem {
	/**
	 * Returns the value of the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attribute</em>' reference.
	 * @see #setNameAttribute(EAttribute)
	 * @see de.hub.visualemf.data.DataPackage#getDataSet_NameAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getNameAttribute();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataSet#getNameAttribute <em>Name Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Attribute</em>' reference.
	 * @see #getNameAttribute()
	 * @generated
	 */
	void setNameAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Attribute</em>' reference.
	 * @see #setIdAttribute(EAttribute)
	 * @see de.hub.visualemf.data.DataPackage#getDataSet_IdAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getIdAttribute();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataSet#getIdAttribute <em>Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Attribute</em>' reference.
	 * @see #getIdAttribute()
	 * @generated
	 */
	void setIdAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Type Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attribute</em>' reference.
	 * @see #setTypeAttribute(EAttribute)
	 * @see de.hub.visualemf.data.DataPackage#getDataSet_TypeAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getTypeAttribute();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataSet#getTypeAttribute <em>Type Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attribute</em>' reference.
	 * @see #getTypeAttribute()
	 * @generated
	 */
	void setTypeAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.visualemf.data.DataPackage#getDataSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.DataSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.visualemf.data.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.hub.visualemf.data.DataPackage#getDataSet_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataItem> getItems();

} // DataSet
