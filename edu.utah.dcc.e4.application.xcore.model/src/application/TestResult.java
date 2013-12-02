/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single test result, contained within a LaboratoryTest object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.TestResult#getResultID <em>Result ID</em>}</li>
 *   <li>{@link application.TestResult#getLoincCode <em>Loinc Code</em>}</li>
 *   <li>{@link application.TestResult#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link application.TestResult#getConventionalTextResult <em>Conventional Text Result</em>}</li>
 *   <li>{@link application.TestResult#getConventionalUnits <em>Conventional Units</em>}</li>
 *   <li>{@link application.TestResult#getLaboratoryTest <em>Laboratory Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getTestResult()
 * @model
 * @generated
 */
public interface TestResult extends EObject
{
  /**
   * Returns the value of the '<em><b>Result ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result ID</em>' attribute.
   * @see #setResultID(String)
   * @see application.ApplicationPackage#getTestResult_ResultID()
   * @model unique="false" id="true"
   *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")'"
   * @generated
   */
  String getResultID();

  /**
   * Sets the value of the '{@link application.TestResult#getResultID <em>Result ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result ID</em>' attribute.
   * @see #getResultID()
   * @generated
   */
  void setResultID(String value);

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
   * @see application.ApplicationPackage#getTestResult_LoincCode()
   * @model unique="false"
   * @generated
   */
  String getLoincCode();

  /**
   * Sets the value of the '{@link application.TestResult#getLoincCode <em>Loinc Code</em>}' attribute.
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
   * @see application.ApplicationPackage#getTestResult_LabelName()
   * @model unique="false"
   * @generated
   */
  String getLabelName();

  /**
   * Sets the value of the '{@link application.TestResult#getLabelName <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' attribute.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(String value);

  /**
   * Returns the value of the '<em><b>Conventional Text Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conventional Text Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conventional Text Result</em>' attribute.
   * @see #setConventionalTextResult(String)
   * @see application.ApplicationPackage#getTestResult_ConventionalTextResult()
   * @model unique="false"
   * @generated
   */
  String getConventionalTextResult();

  /**
   * Sets the value of the '{@link application.TestResult#getConventionalTextResult <em>Conventional Text Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conventional Text Result</em>' attribute.
   * @see #getConventionalTextResult()
   * @generated
   */
  void setConventionalTextResult(String value);

  /**
   * Returns the value of the '<em><b>Conventional Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conventional Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conventional Units</em>' attribute.
   * @see #setConventionalUnits(String)
   * @see application.ApplicationPackage#getTestResult_ConventionalUnits()
   * @model unique="false"
   * @generated
   */
  String getConventionalUnits();

  /**
   * Sets the value of the '{@link application.TestResult#getConventionalUnits <em>Conventional Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conventional Units</em>' attribute.
   * @see #getConventionalUnits()
   * @generated
   */
  void setConventionalUnits(String value);

  /**
   * Returns the value of the '<em><b>Laboratory Test</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link application.LaboratoryTest#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Laboratory Test</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Laboratory Test</em>' container reference.
   * @see #setLaboratoryTest(LaboratoryTest)
   * @see application.ApplicationPackage#getTestResult_LaboratoryTest()
   * @see application.LaboratoryTest#getResults
   * @model opposite="results" transient="false"
   * @generated
   */
  LaboratoryTest getLaboratoryTest();

  /**
   * Sets the value of the '{@link application.TestResult#getLaboratoryTest <em>Laboratory Test</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Laboratory Test</em>' container reference.
   * @see #getLaboratoryTest()
   * @generated
   */
  void setLaboratoryTest(LaboratoryTest value);

} // TestResult
