/**
 */
package application.impl;

import application.ApplicationPackage;
import application.ClinicalDecision;
import application.Patient;
import application.StatusType;
import application.User;
import application.UserActionType;

import java.lang.reflect.InvocationTargetException;

import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getDecisionTimeStamp <em>Decision Time Stamp</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getObservationDate <em>Observation Date</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getPatientWeight <em>Patient Weight</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getPatientHeight <em>Patient Height</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getPatientAgeDays <em>Patient Age Days</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getAdviceText <em>Advice Text</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getRulesFiredText <em>Rules Fired Text</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getRationaleText <em>Rationale Text</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getDeclineComment <em>Decline Comment</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getAcceptComment <em>Accept Comment</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getOtherComment <em>Other Comment</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getUserAction <em>User Action</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getDecisionID <em>Decision ID</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link application.impl.ClinicalDecisionImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalDecisionImpl extends MinimalEObjectImpl.Container implements ClinicalDecision
{
  /**
   * The default value of the '{@link #getDecisionTimeStamp() <em>Decision Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTimeStamp()
   * @generated
   * @ordered
   */
  protected static final Calendar DECISION_TIME_STAMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecisionTimeStamp() <em>Decision Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTimeStamp()
   * @generated
   * @ordered
   */
  protected Calendar decisionTimeStamp = DECISION_TIME_STAMP_EDEFAULT;

  /**
   * The default value of the '{@link #getObservationDate() <em>Observation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservationDate()
   * @generated
   * @ordered
   */
  protected static final Calendar OBSERVATION_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObservationDate() <em>Observation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObservationDate()
   * @generated
   * @ordered
   */
  protected Calendar observationDate = OBSERVATION_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPatientWeight() <em>Patient Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientWeight()
   * @generated
   * @ordered
   */
  protected static final double PATIENT_WEIGHT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPatientWeight() <em>Patient Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientWeight()
   * @generated
   * @ordered
   */
  protected double patientWeight = PATIENT_WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getPatientHeight() <em>Patient Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientHeight()
   * @generated
   * @ordered
   */
  protected static final double PATIENT_HEIGHT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPatientHeight() <em>Patient Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientHeight()
   * @generated
   * @ordered
   */
  protected double patientHeight = PATIENT_HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getPatientAgeDays() <em>Patient Age Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientAgeDays()
   * @generated
   * @ordered
   */
  protected static final int PATIENT_AGE_DAYS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPatientAgeDays() <em>Patient Age Days</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientAgeDays()
   * @generated
   * @ordered
   */
  protected int patientAgeDays = PATIENT_AGE_DAYS_EDEFAULT;

  /**
   * The default value of the '{@link #getAdviceText() <em>Advice Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdviceText()
   * @generated
   * @ordered
   */
  protected static final String ADVICE_TEXT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getAdviceText() <em>Advice Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdviceText()
   * @generated
   * @ordered
   */
  protected String adviceText = ADVICE_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getRulesFiredText() <em>Rules Fired Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulesFiredText()
   * @generated
   * @ordered
   */
  protected static final String RULES_FIRED_TEXT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getRulesFiredText() <em>Rules Fired Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulesFiredText()
   * @generated
   * @ordered
   */
  protected String rulesFiredText = RULES_FIRED_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getRationaleText() <em>Rationale Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationaleText()
   * @generated
   * @ordered
   */
  protected static final String RATIONALE_TEXT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getRationaleText() <em>Rationale Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationaleText()
   * @generated
   * @ordered
   */
  protected String rationaleText = RATIONALE_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getDeclineComment() <em>Decline Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclineComment()
   * @generated
   * @ordered
   */
  protected static final String DECLINE_COMMENT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getDeclineComment() <em>Decline Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclineComment()
   * @generated
   * @ordered
   */
  protected String declineComment = DECLINE_COMMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getAcceptComment() <em>Accept Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptComment()
   * @generated
   * @ordered
   */
  protected static final String ACCEPT_COMMENT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getAcceptComment() <em>Accept Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptComment()
   * @generated
   * @ordered
   */
  protected String acceptComment = ACCEPT_COMMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getOtherComment() <em>Other Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherComment()
   * @generated
   * @ordered
   */
  protected static final String OTHER_COMMENT_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getOtherComment() <em>Other Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherComment()
   * @generated
   * @ordered
   */
  protected String otherComment = OTHER_COMMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getUserAction() <em>User Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserAction()
   * @generated
   * @ordered
   */
  protected static final UserActionType USER_ACTION_EDEFAULT = UserActionType.PENDING;

  /**
   * The cached value of the '{@link #getUserAction() <em>User Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserAction()
   * @generated
   * @ordered
   */
  protected UserActionType userAction = USER_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMinutesToNextEvaluation() <em>Minutes To Next Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutesToNextEvaluation()
   * @generated
   * @ordered
   */
  protected static final int MINUTES_TO_NEXT_EVALUATION_EDEFAULT = 999999;

  /**
   * The cached value of the '{@link #getMinutesToNextEvaluation() <em>Minutes To Next Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutesToNextEvaluation()
   * @generated
   * @ordered
   */
  protected int minutesToNextEvaluation = MINUTES_TO_NEXT_EVALUATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedBy()
   * @generated
   * @ordered
   */
  protected User createdBy;

  /**
   * The default value of the '{@link #getDecisionID() <em>Decision ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionID()
   * @generated
   * @ordered
   */
  protected static final String DECISION_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecisionID() <em>Decision ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionID()
   * @generated
   * @ordered
   */
  protected String decisionID = DECISION_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final StatusType STATUS_EDEFAULT = StatusType.CURRENT;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected StatusType status = STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalDecisionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationPackage.Literals.CLINICAL_DECISION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calendar getDecisionTimeStamp()
  {
    return decisionTimeStamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecisionTimeStamp(Calendar newDecisionTimeStamp)
  {
    Calendar oldDecisionTimeStamp = decisionTimeStamp;
    decisionTimeStamp = newDecisionTimeStamp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP, oldDecisionTimeStamp, decisionTimeStamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calendar getObservationDate()
  {
    return observationDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObservationDate(Calendar newObservationDate)
  {
    Calendar oldObservationDate = observationDate;
    observationDate = newObservationDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE, oldObservationDate, observationDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPatientWeight()
  {
    return patientWeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatientWeight(double newPatientWeight)
  {
    double oldPatientWeight = patientWeight;
    patientWeight = newPatientWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT, oldPatientWeight, patientWeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPatientHeight()
  {
    return patientHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatientHeight(double newPatientHeight)
  {
    double oldPatientHeight = patientHeight;
    patientHeight = newPatientHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT, oldPatientHeight, patientHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPatientAgeDays()
  {
    return patientAgeDays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatientAgeDays(int newPatientAgeDays)
  {
    int oldPatientAgeDays = patientAgeDays;
    patientAgeDays = newPatientAgeDays;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS, oldPatientAgeDays, patientAgeDays));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdviceText()
  {
    return adviceText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdviceText(String newAdviceText)
  {
    String oldAdviceText = adviceText;
    adviceText = newAdviceText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT, oldAdviceText, adviceText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRulesFiredText()
  {
    return rulesFiredText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRulesFiredText(String newRulesFiredText)
  {
    String oldRulesFiredText = rulesFiredText;
    rulesFiredText = newRulesFiredText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT, oldRulesFiredText, rulesFiredText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRationaleText()
  {
    return rationaleText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationaleText(String newRationaleText)
  {
    String oldRationaleText = rationaleText;
    rationaleText = newRationaleText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT, oldRationaleText, rationaleText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclineComment()
  {
    return declineComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclineComment(String newDeclineComment)
  {
    String oldDeclineComment = declineComment;
    declineComment = newDeclineComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT, oldDeclineComment, declineComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcceptComment()
  {
    return acceptComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptComment(String newAcceptComment)
  {
    String oldAcceptComment = acceptComment;
    acceptComment = newAcceptComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT, oldAcceptComment, acceptComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOtherComment()
  {
    return otherComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOtherComment(String newOtherComment)
  {
    String oldOtherComment = otherComment;
    otherComment = newOtherComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT, oldOtherComment, otherComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserActionType getUserAction()
  {
    return userAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserAction(UserActionType newUserAction)
  {
    UserActionType oldUserAction = userAction;
    userAction = newUserAction == null ? USER_ACTION_EDEFAULT : newUserAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__USER_ACTION, oldUserAction, userAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutesToNextEvaluation()
  {
    return minutesToNextEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutesToNextEvaluation(int newMinutesToNextEvaluation)
  {
    int oldMinutesToNextEvaluation = minutesToNextEvaluation;
    minutesToNextEvaluation = newMinutesToNextEvaluation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION, oldMinutesToNextEvaluation, minutesToNextEvaluation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getCreatedBy()
  {
    if (createdBy != null && createdBy.eIsProxy())
    {
      InternalEObject oldCreatedBy = (InternalEObject)createdBy;
      createdBy = (User)eResolveProxy(oldCreatedBy);
      if (createdBy != oldCreatedBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.CLINICAL_DECISION__CREATED_BY, oldCreatedBy, createdBy));
      }
    }
    return createdBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetCreatedBy()
  {
    return createdBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatedBy(User newCreatedBy)
  {
    User oldCreatedBy = createdBy;
    createdBy = newCreatedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__CREATED_BY, oldCreatedBy, createdBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDecisionID()
  {
    return decisionID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecisionID(String newDecisionID)
  {
    String oldDecisionID = decisionID;
    decisionID = newDecisionID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__DECISION_ID, oldDecisionID, decisionID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusType getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(StatusType newStatus)
  {
    StatusType oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patient getPatient()
  {
    if (eContainerFeatureID() != ApplicationPackage.CLINICAL_DECISION__PATIENT) return null;
    return (Patient)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patient basicGetPatient()
  {
    if (eContainerFeatureID() != ApplicationPackage.CLINICAL_DECISION__PATIENT) return null;
    return (Patient)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPatient, ApplicationPackage.CLINICAL_DECISION__PATIENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatient(Patient newPatient)
  {
    if (newPatient != eInternalContainer() || (eContainerFeatureID() != ApplicationPackage.CLINICAL_DECISION__PATIENT && newPatient != null))
    {
      if (EcoreUtil.isAncestor(this, newPatient))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPatient != null)
        msgs = ((InternalEObject)newPatient).eInverseAdd(this, ApplicationPackage.PATIENT__DECISIONS, Patient.class, msgs);
      msgs = basicSetPatient(newPatient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CLINICAL_DECISION__PATIENT, newPatient, newPatient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void advise(final String message)
  {
    ClinicalDecision _this = this;
    String _adviceText = _this.getAdviceText();
    int _length = _adviceText.length();
    boolean _equals = (_length == 0);
    if (_equals)
    {
      ClinicalDecision _this_1 = this;
      _this_1.setAdviceText(message);
    }
    else
    {
      ClinicalDecision _this_2 = this;
      ClinicalDecision _this_3 = this;
      String _adviceText_1 = _this_3.getAdviceText();
      String _plus = (_adviceText_1 + message);
      _this_2.setAdviceText(_plus);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetPatient((Patient)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        return basicSetPatient(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        return eInternalContainer().eInverseRemove(this, ApplicationPackage.PATIENT__DECISIONS, Patient.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP:
        return getDecisionTimeStamp();
      case ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE:
        return getObservationDate();
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT:
        return getPatientWeight();
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT:
        return getPatientHeight();
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS:
        return getPatientAgeDays();
      case ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT:
        return getAdviceText();
      case ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT:
        return getRulesFiredText();
      case ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT:
        return getRationaleText();
      case ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT:
        return getDeclineComment();
      case ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT:
        return getAcceptComment();
      case ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT:
        return getOtherComment();
      case ApplicationPackage.CLINICAL_DECISION__USER_ACTION:
        return getUserAction();
      case ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION:
        return getMinutesToNextEvaluation();
      case ApplicationPackage.CLINICAL_DECISION__CREATED_BY:
        if (resolve) return getCreatedBy();
        return basicGetCreatedBy();
      case ApplicationPackage.CLINICAL_DECISION__DECISION_ID:
        return getDecisionID();
      case ApplicationPackage.CLINICAL_DECISION__STATUS:
        return getStatus();
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        if (resolve) return getPatient();
        return basicGetPatient();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP:
        setDecisionTimeStamp((Calendar)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE:
        setObservationDate((Calendar)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT:
        setPatientWeight((Double)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT:
        setPatientHeight((Double)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS:
        setPatientAgeDays((Integer)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT:
        setAdviceText((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT:
        setRulesFiredText((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT:
        setRationaleText((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT:
        setDeclineComment((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT:
        setAcceptComment((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT:
        setOtherComment((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__USER_ACTION:
        setUserAction((UserActionType)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION:
        setMinutesToNextEvaluation((Integer)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__CREATED_BY:
        setCreatedBy((User)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__DECISION_ID:
        setDecisionID((String)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__STATUS:
        setStatus((StatusType)newValue);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        setPatient((Patient)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP:
        setDecisionTimeStamp(DECISION_TIME_STAMP_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE:
        setObservationDate(OBSERVATION_DATE_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT:
        setPatientWeight(PATIENT_WEIGHT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT:
        setPatientHeight(PATIENT_HEIGHT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS:
        setPatientAgeDays(PATIENT_AGE_DAYS_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT:
        setAdviceText(ADVICE_TEXT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT:
        setRulesFiredText(RULES_FIRED_TEXT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT:
        setRationaleText(RATIONALE_TEXT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT:
        setDeclineComment(DECLINE_COMMENT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT:
        setAcceptComment(ACCEPT_COMMENT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT:
        setOtherComment(OTHER_COMMENT_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__USER_ACTION:
        setUserAction(USER_ACTION_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION:
        setMinutesToNextEvaluation(MINUTES_TO_NEXT_EVALUATION_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__CREATED_BY:
        setCreatedBy((User)null);
        return;
      case ApplicationPackage.CLINICAL_DECISION__DECISION_ID:
        setDecisionID(DECISION_ID_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        setPatient((Patient)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP:
        return DECISION_TIME_STAMP_EDEFAULT == null ? decisionTimeStamp != null : !DECISION_TIME_STAMP_EDEFAULT.equals(decisionTimeStamp);
      case ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE:
        return OBSERVATION_DATE_EDEFAULT == null ? observationDate != null : !OBSERVATION_DATE_EDEFAULT.equals(observationDate);
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT:
        return patientWeight != PATIENT_WEIGHT_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT:
        return patientHeight != PATIENT_HEIGHT_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS:
        return patientAgeDays != PATIENT_AGE_DAYS_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT:
        return ADVICE_TEXT_EDEFAULT == null ? adviceText != null : !ADVICE_TEXT_EDEFAULT.equals(adviceText);
      case ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT:
        return RULES_FIRED_TEXT_EDEFAULT == null ? rulesFiredText != null : !RULES_FIRED_TEXT_EDEFAULT.equals(rulesFiredText);
      case ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT:
        return RATIONALE_TEXT_EDEFAULT == null ? rationaleText != null : !RATIONALE_TEXT_EDEFAULT.equals(rationaleText);
      case ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT:
        return DECLINE_COMMENT_EDEFAULT == null ? declineComment != null : !DECLINE_COMMENT_EDEFAULT.equals(declineComment);
      case ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT:
        return ACCEPT_COMMENT_EDEFAULT == null ? acceptComment != null : !ACCEPT_COMMENT_EDEFAULT.equals(acceptComment);
      case ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT:
        return OTHER_COMMENT_EDEFAULT == null ? otherComment != null : !OTHER_COMMENT_EDEFAULT.equals(otherComment);
      case ApplicationPackage.CLINICAL_DECISION__USER_ACTION:
        return userAction != USER_ACTION_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION:
        return minutesToNextEvaluation != MINUTES_TO_NEXT_EVALUATION_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__CREATED_BY:
        return createdBy != null;
      case ApplicationPackage.CLINICAL_DECISION__DECISION_ID:
        return DECISION_ID_EDEFAULT == null ? decisionID != null : !DECISION_ID_EDEFAULT.equals(decisionID);
      case ApplicationPackage.CLINICAL_DECISION__STATUS:
        return status != STATUS_EDEFAULT;
      case ApplicationPackage.CLINICAL_DECISION__PATIENT:
        return basicGetPatient() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case ApplicationPackage.CLINICAL_DECISION___ADVISE__STRING:
        advise((String)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (decisionTimeStamp: ");
    result.append(decisionTimeStamp);
    result.append(", observationDate: ");
    result.append(observationDate);
    result.append(", patientWeight: ");
    result.append(patientWeight);
    result.append(", patientHeight: ");
    result.append(patientHeight);
    result.append(", patientAgeDays: ");
    result.append(patientAgeDays);
    result.append(", adviceText: ");
    result.append(adviceText);
    result.append(", rulesFiredText: ");
    result.append(rulesFiredText);
    result.append(", rationaleText: ");
    result.append(rationaleText);
    result.append(", declineComment: ");
    result.append(declineComment);
    result.append(", acceptComment: ");
    result.append(acceptComment);
    result.append(", otherComment: ");
    result.append(otherComment);
    result.append(", userAction: ");
    result.append(userAction);
    result.append(", minutesToNextEvaluation: ");
    result.append(minutesToNextEvaluation);
    result.append(", decisionID: ");
    result.append(decisionID);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //ClinicalDecisionImpl
