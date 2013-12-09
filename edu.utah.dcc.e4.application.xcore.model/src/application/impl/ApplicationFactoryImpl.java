/**
 */
package application.impl;

import application.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApplicationFactory init()
  {
    try
    {
      ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
      if (theApplicationFactory != null)
      {
        return theApplicationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApplicationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApplicationPackage.PATIENT: return createPatient();
      case ApplicationPackage.USER: return createUser();
      case ApplicationPackage.CLINICAL_DECISION: return createClinicalDecision();
      case ApplicationPackage.INTENSIVE_CARE_UNIT: return createIntensiveCareUnit();
      case ApplicationPackage.LABORATORY_TEST: return createLaboratoryTest();
      case ApplicationPackage.TEST_RESULT: return createTestResult();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplicationPackage.ACCESS_TYPE:
        return createAccessTypeFromString(eDataType, initialValue);
      case ApplicationPackage.STATUS_TYPE:
        return createStatusTypeFromString(eDataType, initialValue);
      case ApplicationPackage.USER_ACTION_TYPE:
        return createUserActionTypeFromString(eDataType, initialValue);
      case ApplicationPackage.CALENDAR:
        return createcalendarFromString(eDataType, initialValue);
      case ApplicationPackage.GREGORIAN:
        return creategregorianFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ApplicationPackage.ACCESS_TYPE:
        return convertAccessTypeToString(eDataType, instanceValue);
      case ApplicationPackage.STATUS_TYPE:
        return convertStatusTypeToString(eDataType, instanceValue);
      case ApplicationPackage.USER_ACTION_TYPE:
        return convertUserActionTypeToString(eDataType, instanceValue);
      case ApplicationPackage.CALENDAR:
        return convertcalendarToString(eDataType, instanceValue);
      case ApplicationPackage.GREGORIAN:
        return convertgregorianToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patient createPatient()
  {
    PatientImpl patient = new PatientImpl();
    return patient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalDecision createClinicalDecision()
  {
    ClinicalDecisionImpl clinicalDecision = new ClinicalDecisionImpl();
    return clinicalDecision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntensiveCareUnit createIntensiveCareUnit()
  {
    IntensiveCareUnitImpl intensiveCareUnit = new IntensiveCareUnitImpl();
    return intensiveCareUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaboratoryTest createLaboratoryTest()
  {
    LaboratoryTestImpl laboratoryTest = new LaboratoryTestImpl();
    return laboratoryTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestResult createTestResult()
  {
    TestResultImpl testResult = new TestResultImpl();
    return testResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue)
  {
    AccessType result = AccessType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue)
  {
    StatusType result = StatusType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStatusTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserActionType createUserActionTypeFromString(EDataType eDataType, String initialValue)
  {
    UserActionType result = UserActionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUserActionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calendar createcalendarFromString(EDataType eDataType, String initialValue)
  {
    return (Calendar)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcalendarToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GregorianCalendar creategregorianFromString(EDataType eDataType, String initialValue)
  {
    return (GregorianCalendar)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertgregorianToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationPackage getApplicationPackage()
  {
    return (ApplicationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApplicationPackage getPackage()
  {
    return ApplicationPackage.eINSTANCE;
  }

} //ApplicationFactoryImpl
