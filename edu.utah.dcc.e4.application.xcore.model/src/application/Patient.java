/**
 */
package application;

import java.util.Calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Patient object represents a patient in the intensive care unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.Patient#getWeight <em>Weight</em>}</li>
 *   <li>{@link application.Patient#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link application.Patient#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link application.Patient#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link application.Patient#getHeight <em>Height</em>}</li>
 *   <li>{@link application.Patient#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link application.Patient#getLabTests <em>Lab Tests</em>}</li>
 *   <li>{@link application.Patient#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.Patient#getBirthDateString <em>Birth Date String</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends Person
{
  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Weight is measured in kilograms.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(Double)
   * @see application.ApplicationPackage#getPatient_Weight()
   * @model unique="false"
   * @generated
   */
  Double getWeight();

  /**
   * Sets the value of the '{@link application.Patient#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(Double value);

  /**
   * Returns the value of the '<em><b>Med Rec Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Medical record number should be the hospital medical record number, not the visit account record.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Med Rec Num</em>' attribute.
   * @see #setMedRecNum(String)
   * @see application.ApplicationPackage#getPatient_MedRecNum()
   * @model unique="false"
   * @generated
   */
  String getMedRecNum();

  /**
   * Sets the value of the '{@link application.Patient#getMedRecNum <em>Med Rec Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Med Rec Num</em>' attribute.
   * @see #getMedRecNum()
   * @generated
   */
  void setMedRecNum(String value);

  /**
   * Returns the value of the '<em><b>Study ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This is the ID used in the specific study in which the patient is enrolled.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Study ID</em>' attribute.
   * @see #setStudyID(String)
   * @see application.ApplicationPackage#getPatient_StudyID()
   * @model unique="false"
   * @generated
   */
  String getStudyID();

  /**
   * Sets the value of the '{@link application.Patient#getStudyID <em>Study ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Study ID</em>' attribute.
   * @see #getStudyID()
   * @generated
   */
  void setStudyID(String value);

  /**
   * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Date of birth of patient.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Birthdate</em>' attribute.
   * @see #setBirthdate(Calendar)
   * @see application.ApplicationPackage#getPatient_Birthdate()
   * @model unique="false" dataType="application.calendar"
   * @generated
   */
  Calendar getBirthdate();

  /**
   * Sets the value of the '{@link application.Patient#getBirthdate <em>Birthdate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birthdate</em>' attribute.
   * @see #getBirthdate()
   * @generated
   */
  void setBirthdate(Calendar value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Height of the patient, measured in centimeters.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(Double)
   * @see application.ApplicationPackage#getPatient_Height()
   * @model unique="false"
   * @generated
   */
  Double getHeight();

  /**
   * Sets the value of the '{@link application.Patient#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(Double value);

  /**
   * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
   * The list contents are of type {@link application.ClinicalDecision}.
   * It is bidirectional and its opposite is '{@link application.ClinicalDecision#getPatient <em>Patient</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decisions</em>' containment reference list.
   * @see application.ApplicationPackage#getPatient_Decisions()
   * @see application.ClinicalDecision#getPatient
   * @model opposite="patient" containment="true" keys="observationDate userAction"
   * @generated
   */
  EList<ClinicalDecision> getDecisions();

  /**
   * Returns the value of the '<em><b>Lab Tests</b></em>' containment reference list.
   * The list contents are of type {@link application.LaboratoryTest}.
   * It is bidirectional and its opposite is '{@link application.LaboratoryTest#getPatient <em>Patient</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lab Tests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lab Tests</em>' containment reference list.
   * @see application.ApplicationPackage#getPatient_LabTests()
   * @see application.LaboratoryTest#getPatient
   * @model opposite="patient" containment="true"
   * @generated
   */
  EList<LaboratoryTest> getLabTests();

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
   * @see application.ApplicationPackage#getPatient_CreatedBy()
   * @model
   * @generated
   */
  User getCreatedBy();

  /**
   * Sets the value of the '{@link application.Patient#getCreatedBy <em>Created By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' reference.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(User value);

  /**
   * Returns the value of the '<em><b>Birth Date String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Birth Date String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Birth Date String</em>' attribute.
   * @see application.ApplicationPackage#getPatient_BirthDateString()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _xifexpression = null;\n<%application.Patient%> _this = this;\n<%java.util.Calendar%> _birthdate = _this.getBirthdate();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_birthdate, null));\nif (_notEquals)\n{\n\t<%java.text.DateFormat%> _dateInstance = <%java.text.DateFormat%>.getDateInstance(<%java.text.DateFormat%>.LONG);\n\t<%application.Patient%> _this_1 = this;\n\t<%java.util.Calendar%> _birthdate_1 = _this_1.getBirthdate();\n\t<%java.util.Date%> _time = _birthdate_1.getTime();\n\t<%java.lang.String%> _format = _dateInstance.format(_time);\n\t_xifexpression = _format;\n}\nreturn _xifexpression;'"
   * @generated
   */
  String getBirthDateString();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" dateDataType="application.calendar" dateUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.Long%> _xifexpression = null;\n<%application.Patient%> _this = this;\n<%java.util.Calendar%> _birthdate = _this.getBirthdate();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_birthdate, null));\nif (_notEquals)\n{\n\t<%application.Patient%> _this_1 = this;\n\t<%java.util.Calendar%> _birthdate_1 = _this_1.getBirthdate();\n\tlong _timeInMillis = _birthdate_1.getTimeInMillis();\n\tlong _timeInMillis_1 = date.getTimeInMillis();\n\tlong _minus = (_timeInMillis - _timeInMillis_1);\n\tlong _abs = <%java.lang.Math%>.abs(_minus);\n\tint _multiply = (1000 * 60);\n\tint _multiply_1 = (_multiply * 60);\n\tint _multiply_2 = (_multiply_1 * 24);\n\tlong _divide = (_abs / _multiply_2);\n\t_xifexpression = <%java.lang.Long%>.valueOf(_divide);\n}\nreturn (_xifexpression).longValue();'"
   * @generated
   */
  long getDeltaAgeDays(Calendar date);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" dateDataType="application.calendar" dateUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%application.Patient%> _this = this;\nlong _deltaAgeDays = _this.getDeltaAgeDays(date);\nlong _divide = (_deltaAgeDays / 365);\nreturn _divide;'"
   * @generated
   */
  long getDeltaAgeYears(Calendar date);

} // Patient
