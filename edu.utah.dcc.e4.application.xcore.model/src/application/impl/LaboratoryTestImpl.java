/**
 */
package application.impl;

import application.ApplicationPackage;
import application.LaboratoryTest;
import application.Patient;
import application.TestResult;
import application.User;

import java.util.Calendar;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Laboratory Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.LaboratoryTestImpl#getTestID <em>Test ID</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getTimeOfSpecimenCollection <em>Time Of Specimen Collection</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getLoincCode <em>Loinc Code</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getResults <em>Results</em>}</li>
 *   <li>{@link application.impl.LaboratoryTestImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaboratoryTestImpl extends MinimalEObjectImpl.Container implements LaboratoryTest
{
  /**
   * The default value of the '{@link #getTestID() <em>Test ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestID()
   * @generated
   * @ordered
   */
  protected static final String TEST_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTestID() <em>Test ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestID()
   * @generated
   * @ordered
   */
  protected String testID = TEST_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValid()
   * @generated
   * @ordered
   */
  protected static final boolean VALID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValid()
   * @generated
   * @ordered
   */
  protected boolean valid = VALID_EDEFAULT;

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
   * The default value of the '{@link #getTimeOfSpecimenCollection() <em>Time Of Specimen Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOfSpecimenCollection()
   * @generated
   * @ordered
   */
  protected static final Calendar TIME_OF_SPECIMEN_COLLECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeOfSpecimenCollection() <em>Time Of Specimen Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOfSpecimenCollection()
   * @generated
   * @ordered
   */
  protected Calendar timeOfSpecimenCollection = TIME_OF_SPECIMEN_COLLECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getLoincCode() <em>Loinc Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoincCode()
   * @generated
   * @ordered
   */
  protected static final String LOINC_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoincCode() <em>Loinc Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoincCode()
   * @generated
   * @ordered
   */
  protected String loincCode = LOINC_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelName()
   * @generated
   * @ordered
   */
  protected static final String LABEL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelName()
   * @generated
   * @ordered
   */
  protected String labelName = LABEL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResults()
   * @generated
   * @ordered
   */
  protected EList<TestResult> results;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaboratoryTestImpl()
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
    return ApplicationPackage.Literals.LABORATORY_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTestID()
  {
    return testID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestID(String newTestID)
  {
    String oldTestID = testID;
    testID = newTestID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__TEST_ID, oldTestID, testID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isValid()
  {
    return valid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValid(boolean newValid)
  {
    boolean oldValid = valid;
    valid = newValid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__VALID, oldValid, valid));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.LABORATORY_TEST__CREATED_BY, oldCreatedBy, createdBy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__CREATED_BY, oldCreatedBy, createdBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calendar getTimeOfSpecimenCollection()
  {
    return timeOfSpecimenCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeOfSpecimenCollection(Calendar newTimeOfSpecimenCollection)
  {
    Calendar oldTimeOfSpecimenCollection = timeOfSpecimenCollection;
    timeOfSpecimenCollection = newTimeOfSpecimenCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION, oldTimeOfSpecimenCollection, timeOfSpecimenCollection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoincCode()
  {
    return loincCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoincCode(String newLoincCode)
  {
    String oldLoincCode = loincCode;
    loincCode = newLoincCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__LOINC_CODE, oldLoincCode, loincCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabelName()
  {
    return labelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelName(String newLabelName)
  {
    String oldLabelName = labelName;
    labelName = newLabelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__LABEL_NAME, oldLabelName, labelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TestResult> getResults()
  {
    if (results == null)
    {
      results = new EObjectContainmentWithInverseEList<TestResult>(TestResult.class, this, ApplicationPackage.LABORATORY_TEST__RESULTS, ApplicationPackage.TEST_RESULT__LABORATORY_TEST);
    }
    return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patient getPatient()
  {
    if (eContainerFeatureID() != ApplicationPackage.LABORATORY_TEST__PATIENT) return null;
    return (Patient)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patient basicGetPatient()
  {
    if (eContainerFeatureID() != ApplicationPackage.LABORATORY_TEST__PATIENT) return null;
    return (Patient)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPatient, ApplicationPackage.LABORATORY_TEST__PATIENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatient(Patient newPatient)
  {
    if (newPatient != eInternalContainer() || (eContainerFeatureID() != ApplicationPackage.LABORATORY_TEST__PATIENT && newPatient != null))
    {
      if (EcoreUtil.isAncestor(this, newPatient))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPatient != null)
        msgs = ((InternalEObject)newPatient).eInverseAdd(this, ApplicationPackage.PATIENT__LAB_TESTS, Patient.class, msgs);
      msgs = basicSetPatient(newPatient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.LABORATORY_TEST__PATIENT, newPatient, newPatient));
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
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
        return eInternalContainer().eInverseRemove(this, ApplicationPackage.PATIENT__LAB_TESTS, Patient.class, msgs);
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
      case ApplicationPackage.LABORATORY_TEST__TEST_ID:
        return getTestID();
      case ApplicationPackage.LABORATORY_TEST__VALID:
        return isValid();
      case ApplicationPackage.LABORATORY_TEST__CREATED_BY:
        if (resolve) return getCreatedBy();
        return basicGetCreatedBy();
      case ApplicationPackage.LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION:
        return getTimeOfSpecimenCollection();
      case ApplicationPackage.LABORATORY_TEST__LOINC_CODE:
        return getLoincCode();
      case ApplicationPackage.LABORATORY_TEST__LABEL_NAME:
        return getLabelName();
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        return getResults();
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.LABORATORY_TEST__TEST_ID:
        setTestID((String)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__VALID:
        setValid((Boolean)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__CREATED_BY:
        setCreatedBy((User)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION:
        setTimeOfSpecimenCollection((Calendar)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__LOINC_CODE:
        setLoincCode((String)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__LABEL_NAME:
        setLabelName((String)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        getResults().clear();
        getResults().addAll((Collection<? extends TestResult>)newValue);
        return;
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
      case ApplicationPackage.LABORATORY_TEST__TEST_ID:
        setTestID(TEST_ID_EDEFAULT);
        return;
      case ApplicationPackage.LABORATORY_TEST__VALID:
        setValid(VALID_EDEFAULT);
        return;
      case ApplicationPackage.LABORATORY_TEST__CREATED_BY:
        setCreatedBy((User)null);
        return;
      case ApplicationPackage.LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION:
        setTimeOfSpecimenCollection(TIME_OF_SPECIMEN_COLLECTION_EDEFAULT);
        return;
      case ApplicationPackage.LABORATORY_TEST__LOINC_CODE:
        setLoincCode(LOINC_CODE_EDEFAULT);
        return;
      case ApplicationPackage.LABORATORY_TEST__LABEL_NAME:
        setLabelName(LABEL_NAME_EDEFAULT);
        return;
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        getResults().clear();
        return;
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
      case ApplicationPackage.LABORATORY_TEST__TEST_ID:
        return TEST_ID_EDEFAULT == null ? testID != null : !TEST_ID_EDEFAULT.equals(testID);
      case ApplicationPackage.LABORATORY_TEST__VALID:
        return valid != VALID_EDEFAULT;
      case ApplicationPackage.LABORATORY_TEST__CREATED_BY:
        return createdBy != null;
      case ApplicationPackage.LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION:
        return TIME_OF_SPECIMEN_COLLECTION_EDEFAULT == null ? timeOfSpecimenCollection != null : !TIME_OF_SPECIMEN_COLLECTION_EDEFAULT.equals(timeOfSpecimenCollection);
      case ApplicationPackage.LABORATORY_TEST__LOINC_CODE:
        return LOINC_CODE_EDEFAULT == null ? loincCode != null : !LOINC_CODE_EDEFAULT.equals(loincCode);
      case ApplicationPackage.LABORATORY_TEST__LABEL_NAME:
        return LABEL_NAME_EDEFAULT == null ? labelName != null : !LABEL_NAME_EDEFAULT.equals(labelName);
      case ApplicationPackage.LABORATORY_TEST__RESULTS:
        return results != null && !results.isEmpty();
      case ApplicationPackage.LABORATORY_TEST__PATIENT:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (testID: ");
    result.append(testID);
    result.append(", valid: ");
    result.append(valid);
    result.append(", timeOfSpecimenCollection: ");
    result.append(timeOfSpecimenCollection);
    result.append(", loincCode: ");
    result.append(loincCode);
    result.append(", labelName: ");
    result.append(labelName);
    result.append(')');
    return result.toString();
  }

} //LaboratoryTestImpl
