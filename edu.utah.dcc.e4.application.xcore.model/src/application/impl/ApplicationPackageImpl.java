/**
 */
package application.impl;

import application.AccessType;
import application.ApplicationFactory;
import application.ApplicationPackage;
import application.ClinicalDecision;
import application.IntensiveCareUnit;
import application.LaboratoryTest;
import application.Patient;
import application.Person;
import application.StatusType;
import application.TestResult;
import application.User;
import application.UserActionType;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clinicalDecisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intensiveCareUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass laboratoryTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum statusTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum userActionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType calendarEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType gregorianEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see application.ApplicationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ApplicationPackageImpl()
  {
    super(eNS_URI, ApplicationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ApplicationPackage init()
  {
    if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

    // Obtain or create and register package
    ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theApplicationPackage.createPackageContents();

    // Initialize created meta-data
    theApplicationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theApplicationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
    return theApplicationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_LastName()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_FirstName()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_PersonID()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Status()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Name()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatient()
  {
    return patientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_Weight()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_MedRecNum()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_StudyID()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_Birthdate()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_Height()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatient_Decisions()
  {
    return (EReference)patientEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatient_LabTests()
  {
    return (EReference)patientEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatient_CreatedBy()
  {
    return (EReference)patientEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatient_BirthDateString()
  {
    return (EAttribute)patientEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getPatient__GetDeltaAgeDays__Calendar()
  {
    return patientEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getPatient__GetDeltaAgeYears__Calendar()
  {
    return patientEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_AccountRights()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_AccountName()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_PasswordDigest()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_CreatedBy()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClinicalDecision()
  {
    return clinicalDecisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_DecisionTimeStamp()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_ObservationDate()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_PatientWeight()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_PatientHeight()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_PatientAgeDays()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_AdviceText()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_RulesFiredText()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_RationaleText()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_DeclineComment()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_AcceptComment()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_OtherComment()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_UserAction()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_MinutesToNextEvaluation()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClinicalDecision_CreatedBy()
  {
    return (EReference)clinicalDecisionEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_DecisionID()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClinicalDecision_Status()
  {
    return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClinicalDecision_Patient()
  {
    return (EReference)clinicalDecisionEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getClinicalDecision__Advise__String()
  {
    return clinicalDecisionEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntensiveCareUnit()
  {
    return intensiveCareUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntensiveCareUnit_IcuID()
  {
    return (EAttribute)intensiveCareUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntensiveCareUnit_HospitalName()
  {
    return (EAttribute)intensiveCareUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntensiveCareUnit_Acronym()
  {
    return (EAttribute)intensiveCareUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntensiveCareUnit_Patients()
  {
    return (EReference)intensiveCareUnitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntensiveCareUnit_Users()
  {
    return (EReference)intensiveCareUnitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLaboratoryTest()
  {
    return laboratoryTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLaboratoryTest_TestID()
  {
    return (EAttribute)laboratoryTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLaboratoryTest_Valid()
  {
    return (EAttribute)laboratoryTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLaboratoryTest_CreatedBy()
  {
    return (EReference)laboratoryTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLaboratoryTest_TimeOfSpecimenCollection()
  {
    return (EAttribute)laboratoryTestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLaboratoryTest_LoincCode()
  {
    return (EAttribute)laboratoryTestEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLaboratoryTest_LabelName()
  {
    return (EAttribute)laboratoryTestEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLaboratoryTest_Results()
  {
    return (EReference)laboratoryTestEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLaboratoryTest_Patient()
  {
    return (EReference)laboratoryTestEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestResult()
  {
    return testResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestResult_ResultID()
  {
    return (EAttribute)testResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestResult_LoincCode()
  {
    return (EAttribute)testResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestResult_LabelName()
  {
    return (EAttribute)testResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestResult_ConventionalTextResult()
  {
    return (EAttribute)testResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestResult_ConventionalUnit()
  {
    return (EAttribute)testResultEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestResult_LaboratoryTest()
  {
    return (EReference)testResultEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType()
  {
    return accessTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStatusType()
  {
    return statusTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUserActionType()
  {
    return userActionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcalendar()
  {
    return calendarEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getgregorian()
  {
    return gregorianEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationFactory getApplicationFactory()
  {
    return (ApplicationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__LAST_NAME);
    createEAttribute(personEClass, PERSON__FIRST_NAME);
    createEAttribute(personEClass, PERSON__PERSON_ID);
    createEAttribute(personEClass, PERSON__STATUS);
    createEAttribute(personEClass, PERSON__NAME);

    patientEClass = createEClass(PATIENT);
    createEAttribute(patientEClass, PATIENT__WEIGHT);
    createEAttribute(patientEClass, PATIENT__MED_REC_NUM);
    createEAttribute(patientEClass, PATIENT__STUDY_ID);
    createEAttribute(patientEClass, PATIENT__BIRTHDATE);
    createEAttribute(patientEClass, PATIENT__HEIGHT);
    createEReference(patientEClass, PATIENT__DECISIONS);
    createEReference(patientEClass, PATIENT__LAB_TESTS);
    createEReference(patientEClass, PATIENT__CREATED_BY);
    createEAttribute(patientEClass, PATIENT__BIRTH_DATE_STRING);
    createEOperation(patientEClass, PATIENT___GET_DELTA_AGE_DAYS__CALENDAR);
    createEOperation(patientEClass, PATIENT___GET_DELTA_AGE_YEARS__CALENDAR);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__ACCOUNT_RIGHTS);
    createEAttribute(userEClass, USER__ACCOUNT_NAME);
    createEAttribute(userEClass, USER__PASSWORD_DIGEST);
    createEReference(userEClass, USER__CREATED_BY);

    clinicalDecisionEClass = createEClass(CLINICAL_DECISION);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECISION_TIME_STAMP);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__OBSERVATION_DATE);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_WEIGHT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_HEIGHT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_AGE_DAYS);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__ADVICE_TEXT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__RULES_FIRED_TEXT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__RATIONALE_TEXT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECLINE_COMMENT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__ACCEPT_COMMENT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__OTHER_COMMENT);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__USER_ACTION);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION);
    createEReference(clinicalDecisionEClass, CLINICAL_DECISION__CREATED_BY);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECISION_ID);
    createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__STATUS);
    createEReference(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT);
    createEOperation(clinicalDecisionEClass, CLINICAL_DECISION___ADVISE__STRING);

    intensiveCareUnitEClass = createEClass(INTENSIVE_CARE_UNIT);
    createEAttribute(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__ICU_ID);
    createEAttribute(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__HOSPITAL_NAME);
    createEAttribute(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__ACRONYM);
    createEReference(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__PATIENTS);
    createEReference(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__USERS);

    laboratoryTestEClass = createEClass(LABORATORY_TEST);
    createEAttribute(laboratoryTestEClass, LABORATORY_TEST__TEST_ID);
    createEAttribute(laboratoryTestEClass, LABORATORY_TEST__VALID);
    createEReference(laboratoryTestEClass, LABORATORY_TEST__CREATED_BY);
    createEAttribute(laboratoryTestEClass, LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION);
    createEAttribute(laboratoryTestEClass, LABORATORY_TEST__LOINC_CODE);
    createEAttribute(laboratoryTestEClass, LABORATORY_TEST__LABEL_NAME);
    createEReference(laboratoryTestEClass, LABORATORY_TEST__RESULTS);
    createEReference(laboratoryTestEClass, LABORATORY_TEST__PATIENT);

    testResultEClass = createEClass(TEST_RESULT);
    createEAttribute(testResultEClass, TEST_RESULT__RESULT_ID);
    createEAttribute(testResultEClass, TEST_RESULT__LOINC_CODE);
    createEAttribute(testResultEClass, TEST_RESULT__LABEL_NAME);
    createEAttribute(testResultEClass, TEST_RESULT__CONVENTIONAL_TEXT_RESULT);
    createEAttribute(testResultEClass, TEST_RESULT__CONVENTIONAL_UNIT);
    createEReference(testResultEClass, TEST_RESULT__LABORATORY_TEST);

    // Create enums
    accessTypeEEnum = createEEnum(ACCESS_TYPE);
    statusTypeEEnum = createEEnum(STATUS_TYPE);
    userActionTypeEEnum = createEEnum(USER_ACTION_TYPE);

    // Create data types
    calendarEDataType = createEDataType(CALENDAR);
    gregorianEDataType = createEDataType(GREGORIAN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    patientEClass.getESuperTypes().add(this.getPerson());
    userEClass.getESuperTypes().add(this.getPerson());

    // Initialize classes, features, and operations; add parameters
    initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_LastName(), theEcorePackage.getEString(), "lastName", "", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_FirstName(), theEcorePackage.getEString(), "firstName", "", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_PersonID(), theEcorePackage.getEString(), "personID", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Status(), this.getStatusType(), "status", "Current", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Person.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPatient_Weight(), theEcorePackage.getEDoubleObject(), "weight", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatient_MedRecNum(), theEcorePackage.getEString(), "medRecNum", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatient_StudyID(), theEcorePackage.getEString(), "studyID", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatient_Birthdate(), this.getcalendar(), "birthdate", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatient_Height(), theEcorePackage.getEDoubleObject(), "height", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatient_Decisions(), this.getClinicalDecision(), this.getClinicalDecision_Patient(), "decisions", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getPatient_Decisions().getEKeys().add(this.getClinicalDecision_ObservationDate());
    getPatient_Decisions().getEKeys().add(this.getClinicalDecision_UserAction());
    initEReference(getPatient_LabTests(), this.getLaboratoryTest(), this.getLaboratoryTest_Patient(), "labTests", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatient_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatient_BirthDateString(), theEcorePackage.getEString(), "birthDateString", null, 0, 1, Patient.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getPatient__GetDeltaAgeDays__Calendar(), theEcorePackage.getELong(), "getDeltaAgeDays", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getcalendar(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getPatient__GetDeltaAgeYears__Calendar(), theEcorePackage.getELong(), "getDeltaAgeYears", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getcalendar(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_AccountRights(), this.getAccessType(), "accountRights", "Normal", 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_AccountName(), theEcorePackage.getEString(), "accountName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_PasswordDigest(), theEcorePackage.getEString(), "passwordDigest", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUser_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clinicalDecisionEClass, ClinicalDecision.class, "ClinicalDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClinicalDecision_DecisionTimeStamp(), this.getcalendar(), "decisionTimeStamp", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_ObservationDate(), this.getcalendar(), "observationDate", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_PatientWeight(), theEcorePackage.getEDouble(), "patientWeight", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_PatientHeight(), theEcorePackage.getEDouble(), "patientHeight", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_PatientAgeDays(), theEcorePackage.getEInt(), "patientAgeDays", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_AdviceText(), theEcorePackage.getEString(), "adviceText", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_RulesFiredText(), theEcorePackage.getEString(), "rulesFiredText", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_RationaleText(), theEcorePackage.getEString(), "rationaleText", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_DeclineComment(), theEcorePackage.getEString(), "declineComment", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_AcceptComment(), theEcorePackage.getEString(), "acceptComment", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_OtherComment(), theEcorePackage.getEString(), "otherComment", "", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_UserAction(), this.getUserActionType(), "userAction", "Pending", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_MinutesToNextEvaluation(), theEcorePackage.getEInt(), "minutesToNextEvaluation", "999999", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClinicalDecision_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_DecisionID(), theEcorePackage.getEString(), "decisionID", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClinicalDecision_Status(), this.getStatusType(), "status", "Current", 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClinicalDecision_Patient(), this.getPatient(), this.getPatient_Decisions(), "patient", null, 1, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = initEOperation(getClinicalDecision__Advise__String(), null, "advise", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(intensiveCareUnitEClass, IntensiveCareUnit.class, "IntensiveCareUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntensiveCareUnit_IcuID(), theEcorePackage.getEString(), "icuID", null, 0, 1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntensiveCareUnit_HospitalName(), theEcorePackage.getEString(), "hospitalName", null, 0, 1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntensiveCareUnit_Acronym(), theEcorePackage.getEString(), "acronym", null, 0, 1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntensiveCareUnit_Patients(), this.getPatient(), null, "patients", null, 0, -1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIntensiveCareUnit_Patients().getEKeys().add(this.getPerson_LastName());
    getIntensiveCareUnit_Patients().getEKeys().add(this.getPerson_FirstName());
    getIntensiveCareUnit_Patients().getEKeys().add(this.getPatient_MedRecNum());
    getIntensiveCareUnit_Patients().getEKeys().add(this.getPatient_StudyID());
    initEReference(getIntensiveCareUnit_Users(), this.getUser(), null, "users", null, 0, -1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    getIntensiveCareUnit_Users().getEKeys().add(this.getPerson_LastName());
    getIntensiveCareUnit_Users().getEKeys().add(this.getPerson_FirstName());

    initEClass(laboratoryTestEClass, LaboratoryTest.class, "LaboratoryTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLaboratoryTest_TestID(), theEcorePackage.getEString(), "testID", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLaboratoryTest_Valid(), theEcorePackage.getEBoolean(), "valid", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLaboratoryTest_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLaboratoryTest_TimeOfSpecimenCollection(), this.getcalendar(), "timeOfSpecimenCollection", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLaboratoryTest_LoincCode(), theEcorePackage.getEString(), "loincCode", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLaboratoryTest_LabelName(), theEcorePackage.getEString(), "labelName", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLaboratoryTest_Results(), this.getTestResult(), this.getTestResult_LaboratoryTest(), "results", null, 1, -1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLaboratoryTest_Patient(), this.getPatient(), this.getPatient_LabTests(), "patient", null, 0, 1, LaboratoryTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testResultEClass, TestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestResult_ResultID(), theEcorePackage.getEString(), "resultID", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestResult_LoincCode(), theEcorePackage.getEString(), "loincCode", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestResult_LabelName(), theEcorePackage.getEString(), "labelName", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestResult_ConventionalTextResult(), theEcorePackage.getEString(), "conventionalTextResult", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestResult_ConventionalUnit(), theEcorePackage.getEString(), "conventionalUnit", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestResult_LaboratoryTest(), this.getLaboratoryTest(), this.getLaboratoryTest_Results(), "laboratoryTest", null, 0, 1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
    addEEnumLiteral(accessTypeEEnum, AccessType.NORMAL);
    addEEnumLiteral(accessTypeEEnum, AccessType.ADMINISTRATIVE);
    addEEnumLiteral(accessTypeEEnum, AccessType.SUPERUSER);

    initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
    addEEnumLiteral(statusTypeEEnum, StatusType.CURRENT);
    addEEnumLiteral(statusTypeEEnum, StatusType.ARCHIVED);
    addEEnumLiteral(statusTypeEEnum, StatusType.INVALID);
    addEEnumLiteral(statusTypeEEnum, StatusType.SAMPLE);

    initEEnum(userActionTypeEEnum, UserActionType.class, "UserActionType");
    addEEnumLiteral(userActionTypeEEnum, UserActionType.ACCEPT);
    addEEnumLiteral(userActionTypeEEnum, UserActionType.DECLINE);
    addEEnumLiteral(userActionTypeEEnum, UserActionType.BACKCHART);
    addEEnumLiteral(userActionTypeEEnum, UserActionType.PASSIVE);
    addEEnumLiteral(userActionTypeEEnum, UserActionType.PENDING);

    // Initialize data types
    initEDataType(calendarEDataType, Calendar.class, "calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gregorianEDataType, GregorianCalendar.class, "gregorian", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2011/Xcore
    createXcoreAnnotations();
    // teneo.jpa
    createTeneoAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createXcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2011/Xcore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "TeneoJpa", "teneo.jpa"
       });																																							
  }

  /**
   * Initializes the annotations for <b>teneo.jpa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createTeneoAnnotations()
  {
    String source = "teneo.jpa";				
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "appinfo", "@GenericGenerator(name=\"system-uuid\", strategy = \"uuid2\")"
       });			
    addAnnotation
      (getPerson_LastName(), 
       source, 
       new String[] 
       {
       "appinfo", "@Basic(optional=false) @Column(name=LASTNAME)"
       });		
    addAnnotation
      (getPerson_FirstName(), 
       source, 
       new String[] 
       {
       "appinfo", "@Basic(optional=false) @Column(name=FIRSTNAME)"
       });		
    addAnnotation
      (getPerson_PersonID(), 
       source, 
       new String[] 
       {
       "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")\n"
       });			
    addAnnotation
      (getPerson_Status(), 
       source, 
       new String[] 
       {
       "appinfo", "@Basic(optional=false) @Column(name=STATUS)"
       });																					
    addAnnotation
      (getClinicalDecision_DecisionID(), 
       source, 
       new String[] 
       {
       "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")"
       });								
    addAnnotation
      (getIntensiveCareUnit_IcuID(), 
       source, 
       new String[] 
       {
       "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")"
       });			
    addAnnotation
      (getLaboratoryTest_TestID(), 
       source, 
       new String[] 
       {
       "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")"
       });				
    addAnnotation
      (getTestResult_ResultID(), 
       source, 
       new String[] 
       {
       "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")"
       });
  }

} //ApplicationPackageImpl
