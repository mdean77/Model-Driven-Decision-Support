/**
 */
package application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationFactory eINSTANCE = application.impl.ApplicationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Patient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patient</em>'.
   * @generated
   */
  Patient createPatient();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Clinical Decision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clinical Decision</em>'.
   * @generated
   */
  ClinicalDecision createClinicalDecision();

  /**
   * Returns a new object of class '<em>Intensive Care Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intensive Care Unit</em>'.
   * @generated
   */
  IntensiveCareUnit createIntensiveCareUnit();

  /**
   * Returns a new object of class '<em>Laboratory Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Laboratory Test</em>'.
   * @generated
   */
  LaboratoryTest createLaboratoryTest();

  /**
   * Returns a new object of class '<em>Test Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Result</em>'.
   * @generated
   */
  TestResult createTestResult();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ApplicationPackage getApplicationPackage();

} //ApplicationFactory
