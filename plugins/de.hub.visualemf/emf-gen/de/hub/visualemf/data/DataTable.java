/**
 */
package de.hub.visualemf.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.visualemf.data.DataTable#getColumnFeatures <em>Column Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.visualemf.data.DataPackage#getDataTable()
 * @model
 * @generated
 */
public interface DataTable extends DataSet {
	/**
	 * Returns the value of the '<em><b>Column Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Features</em>' reference list.
	 * @see de.hub.visualemf.data.DataPackage#getDataTable_ColumnFeatures()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getColumnFeatures();

} // DataTable
