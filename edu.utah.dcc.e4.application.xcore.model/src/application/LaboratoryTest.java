/**
 */
package application;

import java.util.Calendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laboratory Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Laboratory test entity, contains 1 or more TestResult objects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.LaboratoryTest#getTestID <em>Test ID</em>}</li>
 *   <li>{@link application.LaboratoryTest#isValid <em>Valid</em>}</li>
 *   <li>{@link application.LaboratoryTest#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.LaboratoryTest#getTimeOfSpecimenCollection <em>Time Of Specimen Collection</em>}</li>
 *   <li>{@link application.LaboratoryTest#getLoincCode <em>Loinc Code</em>}</li>
 *   <li>{@link application.LaboratoryTest#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link application.LaboratoryTest#getResults <em>Results</em>}</li>
 *   <li>{@link application.LaboratoryTest#getPatient <em>Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getLaboratoryTest()
 * @model
 * @generated
 */
public interface LaboratoryTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Test ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test ID</em>' attribute.
   * @see #setTestID(String)
   * @see application.ApplicationPackage#getLaboratoryTest_TestID()
   * @model unique="false" id="true"
   *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")'"
   * @generated
   */
  String getTestID();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getTestID <em>Test ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test ID</em>' attribute.
   * @see #getTestID()
   * @generated
   */
  void setTestID(String value);

  /**
   * Returns the value of the '<em><b>Valid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Validity of test.  Applies to entire panel, not individual tests.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Valid</em>' attribute.
   * @see #setValid(boolean)
   * @see application.ApplicationPackage#getLaboratoryTest_Valid()
   * @model unique="false"
   * @generated
   */
  boolean isValid();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#isValid <em>Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid</em>' attribute.
   * @see #isValid()
   * @generated
   */
  void setValid(boolean value);

  /**
   * Returns the value of the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created By</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created By</em>' reference.
   * @see #setCreatedBy(User)
   * @see application.ApplicationPackage#getLaboratoryTest_CreatedBy()
   * @model
   * @generated
   */
  User getCreatedBy();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getCreatedBy <em>Created By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' reference.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(User value);

  /**
   * Returns the value of the '<em><b>Time Of Specimen Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Of Specimen Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Of Specimen Collection</em>' attribute.
   * @see #setTimeOfSpecimenCollection(Calendar)
   * @see application.ApplicationPackage#getLaboratoryTest_TimeOfSpecimenCollection()
   * @model unique="false" dataType="application.calendar"
   * @generated
   */
  Calendar getTimeOfSpecimenCollection();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getTimeOfSpecimenCollection <em>Time Of Specimen Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Of Specimen Collection</em>' attribute.
   * @see #getTimeOfSpecimenCollection()
   * @generated
   */
  void setTimeOfSpecimenCollection(Calendar value);

  /**
   * Returns the value of the '<em><b>Loinc Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loinc Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loinc Code</em>' attribute.
   * @see #setLoincCode(String)
   * @see application.ApplicationPackage#getLaboratoryTest_LoincCode()
   * @model unique="false"
   * @generated
   */
  String getLoincCode();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getLoincCode <em>Loinc Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loinc Code</em>' attribute.
   * @see #getLoincCode()
   * @generated
   */
  void setLoincCode(String value);

  /**
   * Returns the value of the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Name</em>' attribute.
   * @see #setLabelName(String)
   * @see application.ApplicationPackage#getLaboratoryTest_LabelName()
   * @model unique="false"
   * @generated
   */
  String getLabelName();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getLabelName <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' attribute.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(String value);

  /**
   * Returns the value of the '<em><b>Results</b></em>' containment reference list.
   * The list contents are of type {@link application.TestResult}.
   * It is bidirectional and its opposite is '{@link application.TestResult#getLaboratoryTest <em>Laboratory Test</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' containment reference list.
   * @see application.ApplicationPackage#getLaboratoryTest_Results()
   * @see application.TestResult#getLaboratoryTest
   * @model opposite="laboratoryTest" containment="true" required="true"
   * @generated
   */
  EList<TestResult> getResults();

  /**
   * Returns the value of the '<em><b>Patient</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link application.Patient#getLabTests <em>Lab Tests</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patient</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient</em>' container reference.
   * @see #setPatient(Patient)
   * @see application.ApplicationPackage#getLaboratoryTest_Patient()
   * @see application.Patient#getLabTests
   * @model opposite="labTests" transient="false"
   * @generated
   */
  Patient getPatient();

  /**
   * Sets the value of the '{@link application.LaboratoryTest#getPatient <em>Patient</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patient</em>' container reference.
   * @see #getPatient()
   * @generated
   */
  void setPatient(Patient value);

} // LaboratoryTest
