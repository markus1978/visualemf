/**
 */
package de.hub.visualemf.modiscodata;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Dependency Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.ClassDependencyItem#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getClassDependencyItem()
 * @model
 * @generated
 */
public interface ClassDependencyItem extends MoDiscoDataItem {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.visualemf.modiscodata.MoDiscoDataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage#getClassDependencyItem_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<MoDiscoDataItem> getDependencies();

} // ClassDependencyItem
