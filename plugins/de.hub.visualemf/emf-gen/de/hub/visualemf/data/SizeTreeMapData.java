/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Tree Map Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.visualemf.data.SizeTreeMapData#getSizeAttribute <em>Size Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.visualemf.data.DataPackage#getSizeTreeMapData()
 * @model
 * @generated
 */
public interface SizeTreeMapData extends DataHierarchy {
	/**
	 * Returns the value of the '<em><b>Size Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Attribute</em>' reference.
	 * @see #setSizeAttribute(EAttribute)
	 * @see de.hub.visualemf.data.DataPackage#getSizeTreeMapData_SizeAttribute()
	 * @model
	 * @generated
	 */
	EAttribute getSizeAttribute();

	/**
	 * Sets the value of the '{@link de.hub.visualemf.data.SizeTreeMapData#getSizeAttribute <em>Size Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Attribute</em>' reference.
	 * @see #getSizeAttribute()
	 * @generated
	 */
	void setSizeAttribute(EAttribute value);

} // SizeTreeMapData
