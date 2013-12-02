/**
 */
package application.impl;

import application.ApplicationPackage;
import application.LaboratoryTest;
import application.TestResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.TestResultImpl#getResultID <em>Result ID</em>}</li>
 *   <li>{@link application.impl.TestResultImpl#getLoincCode <em>Loinc Code</em>}</li>
 *   <li>{@link application.impl.TestResultImpl#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link application.impl.TestResultImpl#getConventionalTextResult <em>Conventional Text Result</em>}</li>
 *   <li>{@link application.impl.TestResultImpl#getConventionalUnits <em>Conventional Units</em>}</li>
 *   <li>{@link application.impl.TestResultImpl#getLaboratoryTest <em>Laboratory Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestResultImpl extends MinimalEObjectImpl.Container implements TestResult
{
  /**
   * The default value of the '{@link #getResultID() <em>Result ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultID()
   * @generated
   * @ordered
   */
  protected static final String RESULT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultID() <em>Result ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultID()
   * @generated
   * @ordered
   */
  protected String resultID = RESULT_ID_EDEFAULT;

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
   * The default value of the '{@link #getConventionalTextResult() <em>Conventional Text Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConventionalTextResult()
   * @generated
   * @ordered
   */
  protected static final String CONVENTIONAL_TEXT_RESULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConventionalTextResult() <em>Conventional Text Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConventionalTextResult()
   * @generated
   * @ordered
   */
  protected String conventionalTextResult = CONVENTIONAL_TEXT_RESULT_EDEFAULT;

  /**
   * The default value of the '{@link #getConventionalUnits() <em>Conventional Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConventionalUnits()
   * @generated
   * @ordered
   */
  protected static final String CONVENTIONAL_UNITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConventionalUnits() <em>Conventional Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConventionalUnits()
   * @generated
   * @ordered
   */
  protected String conventionalUnits = CONVENTIONAL_UNITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestResultImpl()
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
    return ApplicationPackage.Literals.TEST_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResultID()
  {
    return resultID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultID(String newResultID)
  {
    String oldResultID = resultID;
    resultID = newResultID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__RESULT_ID, oldResultID, resultID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__LOINC_CODE, oldLoincCode, loincCode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__LABEL_NAME, oldLabelName, labelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConventionalTextResult()
  {
    return conventionalTextResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConventionalTextResult(String newConventionalTextResult)
  {
    String oldConventionalTextResult = conventionalTextResult;
    conventionalTextResult = newConventionalTextResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__CONVENTIONAL_TEXT_RESULT, oldConventionalTextResult, conventionalTextResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConventionalUnits()
  {
    return conventionalUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConventionalUnits(String newConventionalUnits)
  {
    String oldConventionalUnits = conventionalUnits;
    conventionalUnits = newConventionalUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__CONVENTIONAL_UNITS, oldConventionalUnits, conventionalUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaboratoryTest getLaboratoryTest()
  {
    if (eContainerFeatureID() != ApplicationPackage.TEST_RESULT__LABORATORY_TEST) return null;
    return (LaboratoryTest)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaboratoryTest basicGetLaboratoryTest()
  {
    if (eContainerFeatureID() != ApplicationPackage.TEST_RESULT__LABORATORY_TEST) return null;
    return (LaboratoryTest)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLaboratoryTest(LaboratoryTest newLaboratoryTest, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newLaboratoryTest, ApplicationPackage.TEST_RESULT__LABORATORY_TEST, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLaboratoryTest(LaboratoryTest newLaboratoryTest)
  {
    if (newLaboratoryTest != eInternalContainer() || (eContainerFeatureID() != ApplicationPackage.TEST_RESULT__LABORATORY_TEST && newLaboratoryTest != null))
    {
      if (EcoreUtil.isAncestor(this, newLaboratoryTest))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newLaboratoryTest != null)
        msgs = ((InternalEObject)newLaboratoryTest).eInverseAdd(this, ApplicationPackage.LABORATORY_TEST__RESULTS, LaboratoryTest.class, msgs);
      msgs = basicSetLaboratoryTest(newLaboratoryTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TEST_RESULT__LABORATORY_TEST, newLaboratoryTest, newLaboratoryTest));
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
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetLaboratoryTest((LaboratoryTest)otherEnd, msgs);
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
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        return basicSetLaboratoryTest(null, msgs);
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
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        return eInternalContainer().eInverseRemove(this, ApplicationPackage.LABORATORY_TEST__RESULTS, LaboratoryTest.class, msgs);
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
      case ApplicationPackage.TEST_RESULT__RESULT_ID:
        return getResultID();
      case ApplicationPackage.TEST_RESULT__LOINC_CODE:
        return getLoincCode();
      case ApplicationPackage.TEST_RESULT__LABEL_NAME:
        return getLabelName();
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_TEXT_RESULT:
        return getConventionalTextResult();
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_UNITS:
        return getConventionalUnits();
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        if (resolve) return getLaboratoryTest();
        return basicGetLaboratoryTest();
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
      case ApplicationPackage.TEST_RESULT__RESULT_ID:
        setResultID((String)newValue);
        return;
      case ApplicationPackage.TEST_RESULT__LOINC_CODE:
        setLoincCode((String)newValue);
        return;
      case ApplicationPackage.TEST_RESULT__LABEL_NAME:
        setLabelName((String)newValue);
        return;
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_TEXT_RESULT:
        setConventionalTextResult((String)newValue);
        return;
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_UNITS:
        setConventionalUnits((String)newValue);
        return;
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        setLaboratoryTest((LaboratoryTest)newValue);
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
      case ApplicationPackage.TEST_RESULT__RESULT_ID:
        setResultID(RESULT_ID_EDEFAULT);
        return;
      case ApplicationPackage.TEST_RESULT__LOINC_CODE:
        setLoincCode(LOINC_CODE_EDEFAULT);
        return;
      case ApplicationPackage.TEST_RESULT__LABEL_NAME:
        setLabelName(LABEL_NAME_EDEFAULT);
        return;
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_TEXT_RESULT:
        setConventionalTextResult(CONVENTIONAL_TEXT_RESULT_EDEFAULT);
        return;
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_UNITS:
        setConventionalUnits(CONVENTIONAL_UNITS_EDEFAULT);
        return;
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        setLaboratoryTest((LaboratoryTest)null);
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
      case ApplicationPackage.TEST_RESULT__RESULT_ID:
        return RESULT_ID_EDEFAULT == null ? resultID != null : !RESULT_ID_EDEFAULT.equals(resultID);
      case ApplicationPackage.TEST_RESULT__LOINC_CODE:
        return LOINC_CODE_EDEFAULT == null ? loincCode != null : !LOINC_CODE_EDEFAULT.equals(loincCode);
      case ApplicationPackage.TEST_RESULT__LABEL_NAME:
        return LABEL_NAME_EDEFAULT == null ? labelName != null : !LABEL_NAME_EDEFAULT.equals(labelName);
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_TEXT_RESULT:
        return CONVENTIONAL_TEXT_RESULT_EDEFAULT == null ? conventionalTextResult != null : !CONVENTIONAL_TEXT_RESULT_EDEFAULT.equals(conventionalTextResult);
      case ApplicationPackage.TEST_RESULT__CONVENTIONAL_UNITS:
        return CONVENTIONAL_UNITS_EDEFAULT == null ? conventionalUnits != null : !CONVENTIONAL_UNITS_EDEFAULT.equals(conventionalUnits);
      case ApplicationPackage.TEST_RESULT__LABORATORY_TEST:
        return basicGetLaboratoryTest() != null;
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
    result.append(" (resultID: ");
    result.append(resultID);
    result.append(", loincCode: ");
    result.append(loincCode);
    result.append(", labelName: ");
    result.append(labelName);
    result.append(", conventionalTextResult: ");
    result.append(conventionalTextResult);
    result.append(", conventionalUnits: ");
    result.append(conventionalUnits);
    result.append(')');
    return result.toString();
  }

} //TestResultImpl
