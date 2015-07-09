/**
 */
package de.hub.visualemf.modiscodata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage
 * @generated
 */
public interface ModiscoDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoDataFactory eINSTANCE = de.hub.visualemf.modiscodata.impl.ModiscoDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Metrics Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Metrics Item</em>'.
	 * @generated
	 */
	ClassMetricsItem createClassMetricsItem();

	/**
	 * Returns a new object of class '<em>Containment Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Item</em>'.
	 * @generated
	 */
	ContainmentItem createContainmentItem();

	/**
	 * Returns a new object of class '<em>Package Dependency Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Dependency Item</em>'.
	 * @generated
	 */
	PackageDependencyItem createPackageDependencyItem();

	/**
	 * Returns a new object of class '<em>Class Dependency Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Dependency Item</em>'.
	 * @generated
	 */
	ClassDependencyItem createClassDependencyItem();

	/**
	 * Returns a new object of class '<em>Mo Disco Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo Disco Data Item</em>'.
	 * @generated
	 */
	MoDiscoDataItem createMoDiscoDataItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoDataPackage getModiscoDataPackage();

} //ModiscoDataFactory
