/**
 */
package application;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}</li>
 *   <li>{@link application.ClinicalDecision#getObservationDate <em>Observation Date</em>}</li>
 *   <li>{@link application.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}</li>
 *   <li>{@link application.ClinicalDecision#getPatientHeight <em>Patient Height</em>}</li>
 *   <li>{@link application.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}</li>
 *   <li>{@link application.ClinicalDecision#getAdviceText <em>Advice Text</em>}</li>
 *   <li>{@link application.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}</li>
 *   <li>{@link application.ClinicalDecision#getRationaleText <em>Rationale Text</em>}</li>
 *   <li>{@link application.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}</li>
 *   <li>{@link application.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}</li>
 *   <li>{@link application.ClinicalDecision#getOtherComment <em>Other Comment</em>}</li>
 *   <li>{@link application.ClinicalDecision#getUserAction <em>User Action</em>}</li>
 *   <li>{@link application.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}</li>
 *   <li>{@link application.ClinicalDecision#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.ClinicalDecision#getDecisionID <em>Decision ID</em>}</li>
 *   <li>{@link application.ClinicalDecision#getStatus <em>Status</em>}</li>
 *   <li>{@link application.ClinicalDecision#getPatient <em>Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getClinicalDecision()
 * @model
 * @generated
 */
public interface ClinicalDecision extends EObject
{
  /**
   * Returns the value of the '<em><b>Decision Time Stamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision Time Stamp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision Time Stamp</em>' attribute.
   * @see #setDecisionTimeStamp(Calendar)
   * @see application.ApplicationPackage#getClinicalDecision_DecisionTimeStamp()
   * @model unique="false" dataType="application.calendar"
   * @generated
   */
  Calendar getDecisionTimeStamp();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decision Time Stamp</em>' attribute.
   * @see #getDecisionTimeStamp()
   * @generated
   */
  void setDecisionTimeStamp(Calendar value);

  /**
   * Returns the value of the '<em><b>Observation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observation Date</em>' attribute.
   * @see #setObservationDate(Calendar)
   * @see application.ApplicationPackage#getClinicalDecision_ObservationDate()
   * @model unique="false" dataType="application.calendar"
   * @generated
   */
  Calendar getObservationDate();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getObservationDate <em>Observation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observation Date</em>' attribute.
   * @see #getObservationDate()
   * @generated
   */
  void setObservationDate(Calendar value);

  /**
   * Returns the value of the '<em><b>Patient Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patient Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient Weight</em>' attribute.
   * @see #setPatientWeight(double)
   * @see application.ApplicationPackage#getClinicalDecision_PatientWeight()
   * @model unique="false"
   * @generated
   */
  double getPatientWeight();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patient Weight</em>' attribute.
   * @see #getPatientWeight()
   * @generated
   */
  void setPatientWeight(double value);

  /**
   * Returns the value of the '<em><b>Patient Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patient Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient Height</em>' attribute.
   * @see #setPatientHeight(double)
   * @see application.ApplicationPackage#getClinicalDecision_PatientHeight()
   * @model unique="false"
   * @generated
   */
  double getPatientHeight();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getPatientHeight <em>Patient Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patient Height</em>' attribute.
   * @see #getPatientHeight()
   * @generated
   */
  void setPatientHeight(double value);

  /**
   * Returns the value of the '<em><b>Patient Age Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patient Age Days</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient Age Days</em>' attribute.
   * @see #setPatientAgeDays(int)
   * @see application.ApplicationPackage#getClinicalDecision_PatientAgeDays()
   * @model unique="false"
   * @generated
   */
  int getPatientAgeDays();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patient Age Days</em>' attribute.
   * @see #getPatientAgeDays()
   * @generated
   */
  void setPatientAgeDays(int value);

  /**
   * Returns the value of the '<em><b>Advice Text</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advice Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advice Text</em>' attribute.
   * @see #setAdviceText(String)
   * @see application.ApplicationPackage#getClinicalDecision_AdviceText()
   * @model default="" unique="false"
   * @generated
   */
  String getAdviceText();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getAdviceText <em>Advice Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Advice Text</em>' attribute.
   * @see #getAdviceText()
   * @generated
   */
  void setAdviceText(String value);

  /**
   * Returns the value of the '<em><b>Rules Fired Text</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules Fired Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules Fired Text</em>' attribute.
   * @see #setRulesFiredText(String)
   * @see application.ApplicationPackage#getClinicalDecision_RulesFiredText()
   * @model default="" unique="false"
   * @generated
   */
  String getRulesFiredText();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules Fired Text</em>' attribute.
   * @see #getRulesFiredText()
   * @generated
   */
  void setRulesFiredText(String value);

  /**
   * Returns the value of the '<em><b>Rationale Text</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale Text</em>' attribute.
   * @see #setRationaleText(String)
   * @see application.ApplicationPackage#getClinicalDecision_RationaleText()
   * @model default="" unique="false"
   * @generated
   */
  String getRationaleText();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getRationaleText <em>Rationale Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale Text</em>' attribute.
   * @see #getRationaleText()
   * @generated
   */
  void setRationaleText(String value);

  /**
   * Returns the value of the '<em><b>Decline Comment</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decline Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decline Comment</em>' attribute.
   * @see #setDeclineComment(String)
   * @see application.ApplicationPackage#getClinicalDecision_DeclineComment()
   * @model default="" unique="false"
   * @generated
   */
  String getDeclineComment();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decline Comment</em>' attribute.
   * @see #getDeclineComment()
   * @generated
   */
  void setDeclineComment(String value);

  /**
   * Returns the value of the '<em><b>Accept Comment</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accept Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accept Comment</em>' attribute.
   * @see #setAcceptComment(String)
   * @see application.ApplicationPackage#getClinicalDecision_AcceptComment()
   * @model default="" unique="false"
   * @generated
   */
  String getAcceptComment();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accept Comment</em>' attribute.
   * @see #getAcceptComment()
   * @generated
   */
  void setAcceptComment(String value);

  /**
   * Returns the value of the '<em><b>Other Comment</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Comment</em>' attribute.
   * @see #setOtherComment(String)
   * @see application.ApplicationPackage#getClinicalDecision_OtherComment()
   * @model default="" unique="false"
   * @generated
   */
  String getOtherComment();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getOtherComment <em>Other Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Comment</em>' attribute.
   * @see #getOtherComment()
   * @generated
   */
  void setOtherComment(String value);

  /**
   * Returns the value of the '<em><b>User Action</b></em>' attribute.
   * The default value is <code>"Pending"</code>.
   * The literals are from the enumeration {@link application.UserActionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Action</em>' attribute.
   * @see application.UserActionType
   * @see #setUserAction(UserActionType)
   * @see application.ApplicationPackage#getClinicalDecision_UserAction()
   * @model default="Pending" unique="false"
   * @generated
   */
  UserActionType getUserAction();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getUserAction <em>User Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Action</em>' attribute.
   * @see application.UserActionType
   * @see #getUserAction()
   * @generated
   */
  void setUserAction(UserActionType value);

  /**
   * Returns the value of the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
   * The default value is <code>"999999"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutes To Next Evaluation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutes To Next Evaluation</em>' attribute.
   * @see #setMinutesToNextEvaluation(int)
   * @see application.ApplicationPackage#getClinicalDecision_MinutesToNextEvaluation()
   * @model default="999999" unique="false"
   * @generated
   */
  int getMinutesToNextEvaluation();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutes To Next Evaluation</em>' attribute.
   * @see #getMinutesToNextEvaluation()
   * @generated
   */
  void setMinutesToNextEvaluation(int value);

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
   * @see application.ApplicationPackage#getClinicalDecision_CreatedBy()
   * @model
   * @generated
   */
  User getCreatedBy();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getCreatedBy <em>Created By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' reference.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(User value);

  /**
   * Returns the value of the '<em><b>Decision ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision ID</em>' attribute.
   * @see #setDecisionID(String)
   * @see application.ApplicationPackage#getClinicalDecision_DecisionID()
   * @model unique="false" id="true"
   *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")'"
   * @generated
   */
  String getDecisionID();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getDecisionID <em>Decision ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decision ID</em>' attribute.
   * @see #getDecisionID()
   * @generated
   */
  void setDecisionID(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The default value is <code>"Current"</code>.
   * The literals are from the enumeration {@link application.StatusType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see application.StatusType
   * @see #setStatus(StatusType)
   * @see application.ApplicationPackage#getClinicalDecision_Status()
   * @model default="Current" unique="false"
   * @generated
   */
  StatusType getStatus();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see application.StatusType
   * @see #getStatus()
   * @generated
   */
  void setStatus(StatusType value);

  /**
   * Returns the value of the '<em><b>Patient</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link application.Patient#getDecisions <em>Decisions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patient</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient</em>' container reference.
   * @see #setPatient(Patient)
   * @see application.ApplicationPackage#getClinicalDecision_Patient()
   * @see application.Patient#getDecisions
   * @model opposite="decisions" required="true" transient="false"
   * @generated
   */
  Patient getPatient();

  /**
   * Sets the value of the '{@link application.ClinicalDecision#getPatient <em>Patient</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Patient</em>' container reference.
   * @see #getPatient()
   * @generated
   */
  void setPatient(Patient value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model messageUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%application.ClinicalDecision%> _this = this;\n<%java.lang.String%> _adviceText = _this.getAdviceText();\nint _length = _adviceText.length();\nboolean _equals = (_length == 0);\nif (_equals)\n{\n\t<%application.ClinicalDecision%> _this_1 = this;\n\t_this_1.setAdviceText(message);\n}\nelse\n{\n\t<%application.ClinicalDecision%> _this_2 = this;\n\t<%application.ClinicalDecision%> _this_3 = this;\n\t<%java.lang.String%> _adviceText_1 = _this_3.getAdviceText();\n\t<%java.lang.String%> _plus = (_adviceText_1 + message);\n\t_this_2.setAdviceText(_plus);\n}'"
   * @generated
   */
  void advise(String message);

} // ClinicalDecision
