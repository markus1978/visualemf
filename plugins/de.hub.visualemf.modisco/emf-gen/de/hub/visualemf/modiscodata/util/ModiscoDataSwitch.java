/**
 */
package de.hub.visualemf.modiscodata.util;

import de.hub.visualemf.data.DataItem;

import de.hub.visualemf.modiscodata.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.visualemf.modiscodata.ModiscoDataPackage
 * @generated
 */
public class ModiscoDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModiscoDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoDataSwitch() {
		if (modelPackage == null) {
			modelPackage = ModiscoDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM: {
				ClassMetricsItem classMetricsItem = (ClassMetricsItem)theEObject;
				T result = caseClassMetricsItem(classMetricsItem);
				if (result == null) result = caseMoDiscoDataItem(classMetricsItem);
				if (result == null) result = caseDataItem(classMetricsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoDataPackage.CONTAINMENT_ITEM: {
				ContainmentItem containmentItem = (ContainmentItem)theEObject;
				T result = caseContainmentItem(containmentItem);
				if (result == null) result = caseMoDiscoDataItem(containmentItem);
				if (result == null) result = caseDataItem(containmentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoDataPackage.DECLARATION_CONTAINMENT_ITEM: {
				DeclarationContainmentItem declarationContainmentItem = (DeclarationContainmentItem)theEObject;
				T result = caseDeclarationContainmentItem(declarationContainmentItem);
				if (result == null) result = caseMoDiscoDataItem(declarationContainmentItem);
				if (result == null) result = caseDataItem(declarationContainmentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoDataPackage.PACKAGE_DEPENDENCY_ITEM: {
				PackageDependencyItem packageDependencyItem = (PackageDependencyItem)theEObject;
				T result = casePackageDependencyItem(packageDependencyItem);
				if (result == null) result = caseMoDiscoDataItem(packageDependencyItem);
				if (result == null) result = caseDataItem(packageDependencyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoDataPackage.CLASS_DEPENDENCY_ITEM: {
				ClassDependencyItem classDependencyItem = (ClassDependencyItem)theEObject;
				T result = caseClassDependencyItem(classDependencyItem);
				if (result == null) result = caseMoDiscoDataItem(classDependencyItem);
				if (result == null) result = caseDataItem(classDependencyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModiscoDataPackage.MO_DISCO_DATA_ITEM: {
				MoDiscoDataItem moDiscoDataItem = (MoDiscoDataItem)theEObject;
				T result = caseMoDiscoDataItem(moDiscoDataItem);
				if (result == null) result = caseDataItem(moDiscoDataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Metrics Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Metrics Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMetricsItem(ClassMetricsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentItem(ContainmentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Containment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Containment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationContainmentItem(DeclarationContainmentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Dependency Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Dependency Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDependencyItem(PackageDependencyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Dependency Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Dependency Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDependencyItem(ClassDependencyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo Disco Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo Disco Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoDiscoDataItem(MoDiscoDataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItem(DataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModiscoDataSwitch
