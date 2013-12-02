/**
 */
package application.impl;

import application.ApplicationPackage;
import application.ClinicalDecision;
import application.LaboratoryTest;
import application.Patient;
import application.User;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getLabTests <em>Lab Tests</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.impl.PatientImpl#getBirthDateString <em>Birth Date String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientImpl extends PersonImpl implements Patient
{
  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final Double WEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Double weight = WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getMedRecNum() <em>Med Rec Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedRecNum()
   * @generated
   * @ordered
   */
  protected static final String MED_REC_NUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMedRecNum() <em>Med Rec Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedRecNum()
   * @generated
   * @ordered
   */
  protected String medRecNum = MED_REC_NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getStudyID() <em>Study ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyID()
   * @generated
   * @ordered
   */
  protected static final String STUDY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStudyID() <em>Study ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyID()
   * @generated
   * @ordered
   */
  protected String studyID = STUDY_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthdate()
   * @generated
   * @ordered
   */
  protected static final Calendar BIRTHDATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthdate()
   * @generated
   * @ordered
   */
  protected Calendar birthdate = BIRTHDATE_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final Double HEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected Double height = HEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisions()
   * @generated
   * @ordered
   */
  protected EList<ClinicalDecision> decisions;

  /**
   * The cached value of the '{@link #getLabTests() <em>Lab Tests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabTests()
   * @generated
   * @ordered
   */
  protected EList<LaboratoryTest> labTests;

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
   * The default value of the '{@link #getBirthDateString() <em>Birth Date String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthDateString()
   * @generated
   * @ordered
   */
  protected static final String BIRTH_DATE_STRING_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatientImpl()
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
    return ApplicationPackage.Literals.PATIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(Double newWeight)
  {
    Double oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMedRecNum()
  {
    return medRecNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMedRecNum(String newMedRecNum)
  {
    String oldMedRecNum = medRecNum;
    medRecNum = newMedRecNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__MED_REC_NUM, oldMedRecNum, medRecNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStudyID()
  {
    return studyID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStudyID(String newStudyID)
  {
    String oldStudyID = studyID;
    studyID = newStudyID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__STUDY_ID, oldStudyID, studyID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calendar getBirthdate()
  {
    return birthdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBirthdate(Calendar newBirthdate)
  {
    Calendar oldBirthdate = birthdate;
    birthdate = newBirthdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__BIRTHDATE, oldBirthdate, birthdate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(Double newHeight)
  {
    Double oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClinicalDecision> getDecisions()
  {
    if (decisions == null)
    {
      decisions = new EObjectContainmentWithInverseEList<ClinicalDecision>(ClinicalDecision.class, this, ApplicationPackage.PATIENT__DECISIONS, ApplicationPackage.CLINICAL_DECISION__PATIENT);
    }
    return decisions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LaboratoryTest> getLabTests()
  {
    if (labTests == null)
    {
      labTests = new EObjectContainmentWithInverseEList<LaboratoryTest>(LaboratoryTest.class, this, ApplicationPackage.PATIENT__LAB_TESTS, ApplicationPackage.LABORATORY_TEST__PATIENT);
    }
    return labTests;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.PATIENT__CREATED_BY, oldCreatedBy, createdBy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PATIENT__CREATED_BY, oldCreatedBy, createdBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBirthDateString()
  {
    String _xifexpression = null;
    Patient _this = this;
    Calendar _birthdate = _this.getBirthdate();
    boolean _notEquals = (!Objects.equal(_birthdate, null));
    if (_notEquals)
    {
      DateFormat _dateInstance = DateFormat.getDateInstance(DateFormat.LONG);
      Patient _this_1 = this;
      Calendar _birthdate_1 = _this_1.getBirthdate();
      Date _time = _birthdate_1.getTime();
      String _format = _dateInstance.format(_time);
      _xifexpression = _format;
    }
    return _xifexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getDeltaAgeDays(final Calendar date)
  {
    Long _xifexpression = null;
    Patient _this = this;
    Calendar _birthdate = _this.getBirthdate();
    boolean _notEquals = (!Objects.equal(_birthdate, null));
    if (_notEquals)
    {
      Patient _this_1 = this;
      Calendar _birthdate_1 = _this_1.getBirthdate();
      long _timeInMillis = _birthdate_1.getTimeInMillis();
      long _timeInMillis_1 = date.getTimeInMillis();
      long _minus = (_timeInMillis - _timeInMillis_1);
      long _abs = Math.abs(_minus);
      int _multiply = (1000 * 60);
      int _multiply_1 = (_multiply * 60);
      int _multiply_2 = (_multiply_1 * 24);
      long _divide = (_abs / _multiply_2);
      _xifexpression = Long.valueOf(_divide);
    }
    return (_xifexpression).longValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getDeltaAgeYears(final Calendar date)
  {
    Patient _this = this;
    long _deltaAgeDays = _this.getDeltaAgeDays(date);
    long _divide = (_deltaAgeDays / 365);
    return _divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationPackage.PATIENT__DECISIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecisions()).basicAdd(otherEnd, msgs);
      case ApplicationPackage.PATIENT__LAB_TESTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabTests()).basicAdd(otherEnd, msgs);
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
      case ApplicationPackage.PATIENT__DECISIONS:
        return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
      case ApplicationPackage.PATIENT__LAB_TESTS:
        return ((InternalEList<?>)getLabTests()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplicationPackage.PATIENT__WEIGHT:
        return getWeight();
      case ApplicationPackage.PATIENT__MED_REC_NUM:
        return getMedRecNum();
      case ApplicationPackage.PATIENT__STUDY_ID:
        return getStudyID();
      case ApplicationPackage.PATIENT__BIRTHDATE:
        return getBirthdate();
      case ApplicationPackage.PATIENT__HEIGHT:
        return getHeight();
      case ApplicationPackage.PATIENT__DECISIONS:
        return getDecisions();
      case ApplicationPackage.PATIENT__LAB_TESTS:
        return getLabTests();
      case ApplicationPackage.PATIENT__CREATED_BY:
        if (resolve) return getCreatedBy();
        return basicGetCreatedBy();
      case ApplicationPackage.PATIENT__BIRTH_DATE_STRING:
        return getBirthDateString();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.PATIENT__WEIGHT:
        setWeight((Double)newValue);
        return;
      case ApplicationPackage.PATIENT__MED_REC_NUM:
        setMedRecNum((String)newValue);
        return;
      case ApplicationPackage.PATIENT__STUDY_ID:
        setStudyID((String)newValue);
        return;
      case ApplicationPackage.PATIENT__BIRTHDATE:
        setBirthdate((Calendar)newValue);
        return;
      case ApplicationPackage.PATIENT__HEIGHT:
        setHeight((Double)newValue);
        return;
      case ApplicationPackage.PATIENT__DECISIONS:
        getDecisions().clear();
        getDecisions().addAll((Collection<? extends ClinicalDecision>)newValue);
        return;
      case ApplicationPackage.PATIENT__LAB_TESTS:
        getLabTests().clear();
        getLabTests().addAll((Collection<? extends LaboratoryTest>)newValue);
        return;
      case ApplicationPackage.PATIENT__CREATED_BY:
        setCreatedBy((User)newValue);
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
      case ApplicationPackage.PATIENT__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case ApplicationPackage.PATIENT__MED_REC_NUM:
        setMedRecNum(MED_REC_NUM_EDEFAULT);
        return;
      case ApplicationPackage.PATIENT__STUDY_ID:
        setStudyID(STUDY_ID_EDEFAULT);
        return;
      case ApplicationPackage.PATIENT__BIRTHDATE:
        setBirthdate(BIRTHDATE_EDEFAULT);
        return;
      case ApplicationPackage.PATIENT__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case ApplicationPackage.PATIENT__DECISIONS:
        getDecisions().clear();
        return;
      case ApplicationPackage.PATIENT__LAB_TESTS:
        getLabTests().clear();
        return;
      case ApplicationPackage.PATIENT__CREATED_BY:
        setCreatedBy((User)null);
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
      case ApplicationPackage.PATIENT__WEIGHT:
        return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
      case ApplicationPackage.PATIENT__MED_REC_NUM:
        return MED_REC_NUM_EDEFAULT == null ? medRecNum != null : !MED_REC_NUM_EDEFAULT.equals(medRecNum);
      case ApplicationPackage.PATIENT__STUDY_ID:
        return STUDY_ID_EDEFAULT == null ? studyID != null : !STUDY_ID_EDEFAULT.equals(studyID);
      case ApplicationPackage.PATIENT__BIRTHDATE:
        return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
      case ApplicationPackage.PATIENT__HEIGHT:
        return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
      case ApplicationPackage.PATIENT__DECISIONS:
        return decisions != null && !decisions.isEmpty();
      case ApplicationPackage.PATIENT__LAB_TESTS:
        return labTests != null && !labTests.isEmpty();
      case ApplicationPackage.PATIENT__CREATED_BY:
        return createdBy != null;
      case ApplicationPackage.PATIENT__BIRTH_DATE_STRING:
        return BIRTH_DATE_STRING_EDEFAULT == null ? getBirthDateString() != null : !BIRTH_DATE_STRING_EDEFAULT.equals(getBirthDateString());
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
      case ApplicationPackage.PATIENT___GET_DELTA_AGE_DAYS__CALENDAR:
        return getDeltaAgeDays((Calendar)arguments.get(0));
      case ApplicationPackage.PATIENT___GET_DELTA_AGE_YEARS__CALENDAR:
        return getDeltaAgeYears((Calendar)arguments.get(0));
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
    result.append(" (weight: ");
    result.append(weight);
    result.append(", medRecNum: ");
    result.append(medRecNum);
    result.append(", studyID: ");
    result.append(studyID);
    result.append(", birthdate: ");
    result.append(birthdate);
    result.append(", height: ");
    result.append(height);
    result.append(')');
    return result.toString();
  }

} //PatientImpl
