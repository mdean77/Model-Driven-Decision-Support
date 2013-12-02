/**
 */
package application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see application.ApplicationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/edu.utah.dcc.e4.application.xcore.model/src' importerID='org.eclipse.emf.importer.ecore' editorDirectory='/edu.utah.dcc.e4.application.xcore.model/src' editDirectory='/edu.utah.dcc.e4.application.xcore.model/src' testsDirectory='/edu.utah.dcc.e4.application.xcore.model.tests/src' providerRootExtendsClass='' tableProviders='true'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore TeneoJpa='teneo.jpa'"
 *        annotation="teneo.jpa appinfo='@GenericGenerator(name=\"system-uuid\", strategy = \"uuid2\")'"
 * @generated
 */
public interface ApplicationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "application";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://edu/utah/dcc/e4/application/xcore/model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "edu.utah.dcc.e4";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplicationPackage eINSTANCE = application.impl.ApplicationPackageImpl.init();

  /**
   * The meta object id for the '{@link application.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.PersonImpl
   * @see application.impl.ApplicationPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LAST_NAME = 0;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FIRST_NAME = 1;

  /**
   * The feature id for the '<em><b>Person ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__PERSON_ID = 2;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__STATUS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 4;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link application.impl.PatientImpl <em>Patient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.PatientImpl
   * @see application.impl.ApplicationPackageImpl#getPatient()
   * @generated
   */
  int PATIENT = 1;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__LAST_NAME = PERSON__LAST_NAME;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__FIRST_NAME = PERSON__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Person ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__PERSON_ID = PERSON__PERSON_ID;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__STATUS = PERSON__STATUS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__NAME = PERSON__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__WEIGHT = PERSON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Med Rec Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__MED_REC_NUM = PERSON_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Study ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__STUDY_ID = PERSON_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Birthdate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__BIRTHDATE = PERSON_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__HEIGHT = PERSON_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__DECISIONS = PERSON_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Lab Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__LAB_TESTS = PERSON_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__CREATED_BY = PERSON_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Birth Date String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT__BIRTH_DATE_STRING = PERSON_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Patient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 9;

  /**
   * The operation id for the '<em>Get Delta Age Days</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT___GET_DELTA_AGE_DAYS__CALENDAR = PERSON_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Get Delta Age Years</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT___GET_DELTA_AGE_YEARS__CALENDAR = PERSON_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Patient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link application.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.UserImpl
   * @see application.impl.ApplicationPackageImpl#getUser()
   * @generated
   */
  int USER = 2;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__LAST_NAME = PERSON__LAST_NAME;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__FIRST_NAME = PERSON__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Person ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__PERSON_ID = PERSON__PERSON_ID;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__STATUS = PERSON__STATUS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = PERSON__NAME;

  /**
   * The feature id for the '<em><b>Account Rights</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__ACCOUNT_RIGHTS = PERSON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Account Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__ACCOUNT_NAME = PERSON_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Password Digest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__PASSWORD_DIGEST = PERSON_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__CREATED_BY = PERSON_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link application.impl.ClinicalDecisionImpl <em>Clinical Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.ClinicalDecisionImpl
   * @see application.impl.ApplicationPackageImpl#getClinicalDecision()
   * @generated
   */
  int CLINICAL_DECISION = 3;

  /**
   * The feature id for the '<em><b>Decision Time Stamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__DECISION_TIME_STAMP = 0;

  /**
   * The feature id for the '<em><b>Observation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__OBSERVATION_DATE = 1;

  /**
   * The feature id for the '<em><b>Patient Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__PATIENT_WEIGHT = 2;

  /**
   * The feature id for the '<em><b>Patient Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__PATIENT_HEIGHT = 3;

  /**
   * The feature id for the '<em><b>Patient Age Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__PATIENT_AGE_DAYS = 4;

  /**
   * The feature id for the '<em><b>Advice Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__ADVICE_TEXT = 5;

  /**
   * The feature id for the '<em><b>Rules Fired Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__RULES_FIRED_TEXT = 6;

  /**
   * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__RATIONALE_TEXT = 7;

  /**
   * The feature id for the '<em><b>Decline Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__DECLINE_COMMENT = 8;

  /**
   * The feature id for the '<em><b>Accept Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__ACCEPT_COMMENT = 9;

  /**
   * The feature id for the '<em><b>Other Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__OTHER_COMMENT = 10;

  /**
   * The feature id for the '<em><b>User Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__USER_ACTION = 11;

  /**
   * The feature id for the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION = 12;

  /**
   * The feature id for the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__CREATED_BY = 13;

  /**
   * The feature id for the '<em><b>Decision ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__DECISION_ID = 14;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__STATUS = 15;

  /**
   * The feature id for the '<em><b>Patient</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION__PATIENT = 16;

  /**
   * The number of structural features of the '<em>Clinical Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION_FEATURE_COUNT = 17;

  /**
   * The operation id for the '<em>Advise</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION___ADVISE__STRING = 0;

  /**
   * The number of operations of the '<em>Clinical Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINICAL_DECISION_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link application.impl.IntensiveCareUnitImpl <em>Intensive Care Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.IntensiveCareUnitImpl
   * @see application.impl.ApplicationPackageImpl#getIntensiveCareUnit()
   * @generated
   */
  int INTENSIVE_CARE_UNIT = 4;

  /**
   * The feature id for the '<em><b>Icu ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT__ICU_ID = 0;

  /**
   * The feature id for the '<em><b>Hospital Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT__HOSPITAL_NAME = 1;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT__ACRONYM = 2;

  /**
   * The feature id for the '<em><b>Patients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT__PATIENTS = 3;

  /**
   * The feature id for the '<em><b>Users</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT__USERS = 4;

  /**
   * The number of structural features of the '<em>Intensive Care Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Intensive Care Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENSIVE_CARE_UNIT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link application.impl.LaboratoryTestImpl <em>Laboratory Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.LaboratoryTestImpl
   * @see application.impl.ApplicationPackageImpl#getLaboratoryTest()
   * @generated
   */
  int LABORATORY_TEST = 5;

  /**
   * The feature id for the '<em><b>Test ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__TEST_ID = 0;

  /**
   * The feature id for the '<em><b>Valid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__VALID = 1;

  /**
   * The feature id for the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__CREATED_BY = 2;

  /**
   * The feature id for the '<em><b>Time Of Specimen Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION = 3;

  /**
   * The feature id for the '<em><b>Loinc Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__LOINC_CODE = 4;

  /**
   * The feature id for the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__LABEL_NAME = 5;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__RESULTS = 6;

  /**
   * The feature id for the '<em><b>Patient</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST__PATIENT = 7;

  /**
   * The number of structural features of the '<em>Laboratory Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Laboratory Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABORATORY_TEST_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link application.impl.TestResultImpl <em>Test Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.impl.TestResultImpl
   * @see application.impl.ApplicationPackageImpl#getTestResult()
   * @generated
   */
  int TEST_RESULT = 6;

  /**
   * The feature id for the '<em><b>Result ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__RESULT_ID = 0;

  /**
   * The feature id for the '<em><b>Loinc Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__LOINC_CODE = 1;

  /**
   * The feature id for the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__LABEL_NAME = 2;

  /**
   * The feature id for the '<em><b>Conventional Text Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__CONVENTIONAL_TEXT_RESULT = 3;

  /**
   * The feature id for the '<em><b>Conventional Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__CONVENTIONAL_UNITS = 4;

  /**
   * The feature id for the '<em><b>Laboratory Test</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT__LABORATORY_TEST = 5;

  /**
   * The number of structural features of the '<em>Test Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Test Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RESULT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link application.AccessType <em>Access Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.AccessType
   * @see application.impl.ApplicationPackageImpl#getAccessType()
   * @generated
   */
  int ACCESS_TYPE = 7;

  /**
   * The meta object id for the '{@link application.StatusType <em>Status Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.StatusType
   * @see application.impl.ApplicationPackageImpl#getStatusType()
   * @generated
   */
  int STATUS_TYPE = 8;

  /**
   * The meta object id for the '{@link application.UserActionType <em>User Action Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.UserActionType
   * @see application.impl.ApplicationPackageImpl#getUserActionType()
   * @generated
   */
  int USER_ACTION_TYPE = 9;

  /**
   * The meta object id for the '<em>calendar</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Calendar
   * @see application.impl.ApplicationPackageImpl#getcalendar()
   * @generated
   */
  int CALENDAR = 10;

  /**
   * The meta object id for the '<em>gregorian</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.GregorianCalendar
   * @see application.impl.ApplicationPackageImpl#getgregorian()
   * @generated
   */
  int GREGORIAN = 11;


  /**
   * Returns the meta object for class '{@link application.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see application.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link application.Person#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see application.Person#getLastName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_LastName();

  /**
   * Returns the meta object for the attribute '{@link application.Person#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see application.Person#getFirstName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_FirstName();

  /**
   * Returns the meta object for the attribute '{@link application.Person#getPersonID <em>Person ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Person ID</em>'.
   * @see application.Person#getPersonID()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_PersonID();

  /**
   * Returns the meta object for the attribute '{@link application.Person#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see application.Person#getStatus()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Status();

  /**
   * Returns the meta object for the attribute '{@link application.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see application.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for class '{@link application.Patient <em>Patient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patient</em>'.
   * @see application.Patient
   * @generated
   */
  EClass getPatient();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see application.Patient#getWeight()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_Weight();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getMedRecNum <em>Med Rec Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Med Rec Num</em>'.
   * @see application.Patient#getMedRecNum()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_MedRecNum();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getStudyID <em>Study ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Study ID</em>'.
   * @see application.Patient#getStudyID()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_StudyID();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getBirthdate <em>Birthdate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Birthdate</em>'.
   * @see application.Patient#getBirthdate()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_Birthdate();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see application.Patient#getHeight()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_Height();

  /**
   * Returns the meta object for the containment reference list '{@link application.Patient#getDecisions <em>Decisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decisions</em>'.
   * @see application.Patient#getDecisions()
   * @see #getPatient()
   * @generated
   */
  EReference getPatient_Decisions();

  /**
   * Returns the meta object for the containment reference list '{@link application.Patient#getLabTests <em>Lab Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lab Tests</em>'.
   * @see application.Patient#getLabTests()
   * @see #getPatient()
   * @generated
   */
  EReference getPatient_LabTests();

  /**
   * Returns the meta object for the reference '{@link application.Patient#getCreatedBy <em>Created By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created By</em>'.
   * @see application.Patient#getCreatedBy()
   * @see #getPatient()
   * @generated
   */
  EReference getPatient_CreatedBy();

  /**
   * Returns the meta object for the attribute '{@link application.Patient#getBirthDateString <em>Birth Date String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Birth Date String</em>'.
   * @see application.Patient#getBirthDateString()
   * @see #getPatient()
   * @generated
   */
  EAttribute getPatient_BirthDateString();

  /**
   * Returns the meta object for the '{@link application.Patient#getDeltaAgeDays(java.util.Calendar) <em>Get Delta Age Days</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Delta Age Days</em>' operation.
   * @see application.Patient#getDeltaAgeDays(java.util.Calendar)
   * @generated
   */
  EOperation getPatient__GetDeltaAgeDays__Calendar();

  /**
   * Returns the meta object for the '{@link application.Patient#getDeltaAgeYears(java.util.Calendar) <em>Get Delta Age Years</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Delta Age Years</em>' operation.
   * @see application.Patient#getDeltaAgeYears(java.util.Calendar)
   * @generated
   */
  EOperation getPatient__GetDeltaAgeYears__Calendar();

  /**
   * Returns the meta object for class '{@link application.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see application.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link application.User#getAccountRights <em>Account Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account Rights</em>'.
   * @see application.User#getAccountRights()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_AccountRights();

  /**
   * Returns the meta object for the attribute '{@link application.User#getAccountName <em>Account Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account Name</em>'.
   * @see application.User#getAccountName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_AccountName();

  /**
   * Returns the meta object for the attribute '{@link application.User#getPasswordDigest <em>Password Digest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password Digest</em>'.
   * @see application.User#getPasswordDigest()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_PasswordDigest();

  /**
   * Returns the meta object for the reference '{@link application.User#getCreatedBy <em>Created By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created By</em>'.
   * @see application.User#getCreatedBy()
   * @see #getUser()
   * @generated
   */
  EReference getUser_CreatedBy();

  /**
   * Returns the meta object for class '{@link application.ClinicalDecision <em>Clinical Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clinical Decision</em>'.
   * @see application.ClinicalDecision
   * @generated
   */
  EClass getClinicalDecision();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Time Stamp</em>'.
   * @see application.ClinicalDecision#getDecisionTimeStamp()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_DecisionTimeStamp();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getObservationDate <em>Observation Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Observation Date</em>'.
   * @see application.ClinicalDecision#getObservationDate()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_ObservationDate();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Patient Weight</em>'.
   * @see application.ClinicalDecision#getPatientWeight()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_PatientWeight();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getPatientHeight <em>Patient Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Patient Height</em>'.
   * @see application.ClinicalDecision#getPatientHeight()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_PatientHeight();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Patient Age Days</em>'.
   * @see application.ClinicalDecision#getPatientAgeDays()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_PatientAgeDays();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getAdviceText <em>Advice Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Advice Text</em>'.
   * @see application.ClinicalDecision#getAdviceText()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_AdviceText();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rules Fired Text</em>'.
   * @see application.ClinicalDecision#getRulesFiredText()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_RulesFiredText();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getRationaleText <em>Rationale Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale Text</em>'.
   * @see application.ClinicalDecision#getRationaleText()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_RationaleText();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decline Comment</em>'.
   * @see application.ClinicalDecision#getDeclineComment()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_DeclineComment();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accept Comment</em>'.
   * @see application.ClinicalDecision#getAcceptComment()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_AcceptComment();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getOtherComment <em>Other Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Other Comment</em>'.
   * @see application.ClinicalDecision#getOtherComment()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_OtherComment();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getUserAction <em>User Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Action</em>'.
   * @see application.ClinicalDecision#getUserAction()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_UserAction();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutes To Next Evaluation</em>'.
   * @see application.ClinicalDecision#getMinutesToNextEvaluation()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_MinutesToNextEvaluation();

  /**
   * Returns the meta object for the reference '{@link application.ClinicalDecision#getCreatedBy <em>Created By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created By</em>'.
   * @see application.ClinicalDecision#getCreatedBy()
   * @see #getClinicalDecision()
   * @generated
   */
  EReference getClinicalDecision_CreatedBy();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getDecisionID <em>Decision ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision ID</em>'.
   * @see application.ClinicalDecision#getDecisionID()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_DecisionID();

  /**
   * Returns the meta object for the attribute '{@link application.ClinicalDecision#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see application.ClinicalDecision#getStatus()
   * @see #getClinicalDecision()
   * @generated
   */
  EAttribute getClinicalDecision_Status();

  /**
   * Returns the meta object for the container reference '{@link application.ClinicalDecision#getPatient <em>Patient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Patient</em>'.
   * @see application.ClinicalDecision#getPatient()
   * @see #getClinicalDecision()
   * @generated
   */
  EReference getClinicalDecision_Patient();

  /**
   * Returns the meta object for the '{@link application.ClinicalDecision#advise(java.lang.String) <em>Advise</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Advise</em>' operation.
   * @see application.ClinicalDecision#advise(java.lang.String)
   * @generated
   */
  EOperation getClinicalDecision__Advise__String();

  /**
   * Returns the meta object for class '{@link application.IntensiveCareUnit <em>Intensive Care Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intensive Care Unit</em>'.
   * @see application.IntensiveCareUnit
   * @generated
   */
  EClass getIntensiveCareUnit();

  /**
   * Returns the meta object for the attribute '{@link application.IntensiveCareUnit#getIcuID <em>Icu ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icu ID</em>'.
   * @see application.IntensiveCareUnit#getIcuID()
   * @see #getIntensiveCareUnit()
   * @generated
   */
  EAttribute getIntensiveCareUnit_IcuID();

  /**
   * Returns the meta object for the attribute '{@link application.IntensiveCareUnit#getHospitalName <em>Hospital Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hospital Name</em>'.
   * @see application.IntensiveCareUnit#getHospitalName()
   * @see #getIntensiveCareUnit()
   * @generated
   */
  EAttribute getIntensiveCareUnit_HospitalName();

  /**
   * Returns the meta object for the attribute '{@link application.IntensiveCareUnit#getAcronym <em>Acronym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acronym</em>'.
   * @see application.IntensiveCareUnit#getAcronym()
   * @see #getIntensiveCareUnit()
   * @generated
   */
  EAttribute getIntensiveCareUnit_Acronym();

  /**
   * Returns the meta object for the containment reference list '{@link application.IntensiveCareUnit#getPatients <em>Patients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patients</em>'.
   * @see application.IntensiveCareUnit#getPatients()
   * @see #getIntensiveCareUnit()
   * @generated
   */
  EReference getIntensiveCareUnit_Patients();

  /**
   * Returns the meta object for the containment reference list '{@link application.IntensiveCareUnit#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Users</em>'.
   * @see application.IntensiveCareUnit#getUsers()
   * @see #getIntensiveCareUnit()
   * @generated
   */
  EReference getIntensiveCareUnit_Users();

  /**
   * Returns the meta object for class '{@link application.LaboratoryTest <em>Laboratory Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Laboratory Test</em>'.
   * @see application.LaboratoryTest
   * @generated
   */
  EClass getLaboratoryTest();

  /**
   * Returns the meta object for the attribute '{@link application.LaboratoryTest#getTestID <em>Test ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test ID</em>'.
   * @see application.LaboratoryTest#getTestID()
   * @see #getLaboratoryTest()
   * @generated
   */
  EAttribute getLaboratoryTest_TestID();

  /**
   * Returns the meta object for the attribute '{@link application.LaboratoryTest#isValid <em>Valid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valid</em>'.
   * @see application.LaboratoryTest#isValid()
   * @see #getLaboratoryTest()
   * @generated
   */
  EAttribute getLaboratoryTest_Valid();

  /**
   * Returns the meta object for the reference '{@link application.LaboratoryTest#getCreatedBy <em>Created By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Created By</em>'.
   * @see application.LaboratoryTest#getCreatedBy()
   * @see #getLaboratoryTest()
   * @generated
   */
  EReference getLaboratoryTest_CreatedBy();

  /**
   * Returns the meta object for the attribute '{@link application.LaboratoryTest#getTimeOfSpecimenCollection <em>Time Of Specimen Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Of Specimen Collection</em>'.
   * @see application.LaboratoryTest#getTimeOfSpecimenCollection()
   * @see #getLaboratoryTest()
   * @generated
   */
  EAttribute getLaboratoryTest_TimeOfSpecimenCollection();

  /**
   * Returns the meta object for the attribute '{@link application.LaboratoryTest#getLoincCode <em>Loinc Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loinc Code</em>'.
   * @see application.LaboratoryTest#getLoincCode()
   * @see #getLaboratoryTest()
   * @generated
   */
  EAttribute getLaboratoryTest_LoincCode();

  /**
   * Returns the meta object for the attribute '{@link application.LaboratoryTest#getLabelName <em>Label Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Name</em>'.
   * @see application.LaboratoryTest#getLabelName()
   * @see #getLaboratoryTest()
   * @generated
   */
  EAttribute getLaboratoryTest_LabelName();

  /**
   * Returns the meta object for the containment reference list '{@link application.LaboratoryTest#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Results</em>'.
   * @see application.LaboratoryTest#getResults()
   * @see #getLaboratoryTest()
   * @generated
   */
  EReference getLaboratoryTest_Results();

  /**
   * Returns the meta object for the container reference '{@link application.LaboratoryTest#getPatient <em>Patient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Patient</em>'.
   * @see application.LaboratoryTest#getPatient()
   * @see #getLaboratoryTest()
   * @generated
   */
  EReference getLaboratoryTest_Patient();

  /**
   * Returns the meta object for class '{@link application.TestResult <em>Test Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Result</em>'.
   * @see application.TestResult
   * @generated
   */
  EClass getTestResult();

  /**
   * Returns the meta object for the attribute '{@link application.TestResult#getResultID <em>Result ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result ID</em>'.
   * @see application.TestResult#getResultID()
   * @see #getTestResult()
   * @generated
   */
  EAttribute getTestResult_ResultID();

  /**
   * Returns the meta object for the attribute '{@link application.TestResult#getLoincCode <em>Loinc Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loinc Code</em>'.
   * @see application.TestResult#getLoincCode()
   * @see #getTestResult()
   * @generated
   */
  EAttribute getTestResult_LoincCode();

  /**
   * Returns the meta object for the attribute '{@link application.TestResult#getLabelName <em>Label Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Name</em>'.
   * @see application.TestResult#getLabelName()
   * @see #getTestResult()
   * @generated
   */
  EAttribute getTestResult_LabelName();

  /**
   * Returns the meta object for the attribute '{@link application.TestResult#getConventionalTextResult <em>Conventional Text Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conventional Text Result</em>'.
   * @see application.TestResult#getConventionalTextResult()
   * @see #getTestResult()
   * @generated
   */
  EAttribute getTestResult_ConventionalTextResult();

  /**
   * Returns the meta object for the attribute '{@link application.TestResult#getConventionalUnits <em>Conventional Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conventional Units</em>'.
   * @see application.TestResult#getConventionalUnits()
   * @see #getTestResult()
   * @generated
   */
  EAttribute getTestResult_ConventionalUnits();

  /**
   * Returns the meta object for the container reference '{@link application.TestResult#getLaboratoryTest <em>Laboratory Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Laboratory Test</em>'.
   * @see application.TestResult#getLaboratoryTest()
   * @see #getTestResult()
   * @generated
   */
  EReference getTestResult_LaboratoryTest();

  /**
   * Returns the meta object for enum '{@link application.AccessType <em>Access Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type</em>'.
   * @see application.AccessType
   * @generated
   */
  EEnum getAccessType();

  /**
   * Returns the meta object for enum '{@link application.StatusType <em>Status Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Status Type</em>'.
   * @see application.StatusType
   * @generated
   */
  EEnum getStatusType();

  /**
   * Returns the meta object for enum '{@link application.UserActionType <em>User Action Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>User Action Type</em>'.
   * @see application.UserActionType
   * @generated
   */
  EEnum getUserActionType();

  /**
   * Returns the meta object for data type '{@link java.util.Calendar <em>calendar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>calendar</em>'.
   * @see java.util.Calendar
   * @model instanceClass="java.util.Calendar"
   * @generated
   */
  EDataType getcalendar();

  /**
   * Returns the meta object for data type '{@link java.util.GregorianCalendar <em>gregorian</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>gregorian</em>'.
   * @see java.util.GregorianCalendar
   * @model instanceClass="java.util.GregorianCalendar"
   * @generated
   */
  EDataType getgregorian();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplicationFactory getApplicationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link application.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.PersonImpl
     * @see application.impl.ApplicationPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

    /**
     * The meta object literal for the '<em><b>Person ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__PERSON_ID = eINSTANCE.getPerson_PersonID();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__STATUS = eINSTANCE.getPerson_Status();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '{@link application.impl.PatientImpl <em>Patient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.PatientImpl
     * @see application.impl.ApplicationPackageImpl#getPatient()
     * @generated
     */
    EClass PATIENT = eINSTANCE.getPatient();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__WEIGHT = eINSTANCE.getPatient_Weight();

    /**
     * The meta object literal for the '<em><b>Med Rec Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__MED_REC_NUM = eINSTANCE.getPatient_MedRecNum();

    /**
     * The meta object literal for the '<em><b>Study ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__STUDY_ID = eINSTANCE.getPatient_StudyID();

    /**
     * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__BIRTHDATE = eINSTANCE.getPatient_Birthdate();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__HEIGHT = eINSTANCE.getPatient_Height();

    /**
     * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATIENT__DECISIONS = eINSTANCE.getPatient_Decisions();

    /**
     * The meta object literal for the '<em><b>Lab Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATIENT__LAB_TESTS = eINSTANCE.getPatient_LabTests();

    /**
     * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATIENT__CREATED_BY = eINSTANCE.getPatient_CreatedBy();

    /**
     * The meta object literal for the '<em><b>Birth Date String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATIENT__BIRTH_DATE_STRING = eINSTANCE.getPatient_BirthDateString();

    /**
     * The meta object literal for the '<em><b>Get Delta Age Days</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation PATIENT___GET_DELTA_AGE_DAYS__CALENDAR = eINSTANCE.getPatient__GetDeltaAgeDays__Calendar();

    /**
     * The meta object literal for the '<em><b>Get Delta Age Years</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation PATIENT___GET_DELTA_AGE_YEARS__CALENDAR = eINSTANCE.getPatient__GetDeltaAgeYears__Calendar();

    /**
     * The meta object literal for the '{@link application.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.UserImpl
     * @see application.impl.ApplicationPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Account Rights</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__ACCOUNT_RIGHTS = eINSTANCE.getUser_AccountRights();

    /**
     * The meta object literal for the '<em><b>Account Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__ACCOUNT_NAME = eINSTANCE.getUser_AccountName();

    /**
     * The meta object literal for the '<em><b>Password Digest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__PASSWORD_DIGEST = eINSTANCE.getUser_PasswordDigest();

    /**
     * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__CREATED_BY = eINSTANCE.getUser_CreatedBy();

    /**
     * The meta object literal for the '{@link application.impl.ClinicalDecisionImpl <em>Clinical Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.ClinicalDecisionImpl
     * @see application.impl.ApplicationPackageImpl#getClinicalDecision()
     * @generated
     */
    EClass CLINICAL_DECISION = eINSTANCE.getClinicalDecision();

    /**
     * The meta object literal for the '<em><b>Decision Time Stamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__DECISION_TIME_STAMP = eINSTANCE.getClinicalDecision_DecisionTimeStamp();

    /**
     * The meta object literal for the '<em><b>Observation Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__OBSERVATION_DATE = eINSTANCE.getClinicalDecision_ObservationDate();

    /**
     * The meta object literal for the '<em><b>Patient Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__PATIENT_WEIGHT = eINSTANCE.getClinicalDecision_PatientWeight();

    /**
     * The meta object literal for the '<em><b>Patient Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__PATIENT_HEIGHT = eINSTANCE.getClinicalDecision_PatientHeight();

    /**
     * The meta object literal for the '<em><b>Patient Age Days</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__PATIENT_AGE_DAYS = eINSTANCE.getClinicalDecision_PatientAgeDays();

    /**
     * The meta object literal for the '<em><b>Advice Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__ADVICE_TEXT = eINSTANCE.getClinicalDecision_AdviceText();

    /**
     * The meta object literal for the '<em><b>Rules Fired Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__RULES_FIRED_TEXT = eINSTANCE.getClinicalDecision_RulesFiredText();

    /**
     * The meta object literal for the '<em><b>Rationale Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__RATIONALE_TEXT = eINSTANCE.getClinicalDecision_RationaleText();

    /**
     * The meta object literal for the '<em><b>Decline Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__DECLINE_COMMENT = eINSTANCE.getClinicalDecision_DeclineComment();

    /**
     * The meta object literal for the '<em><b>Accept Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__ACCEPT_COMMENT = eINSTANCE.getClinicalDecision_AcceptComment();

    /**
     * The meta object literal for the '<em><b>Other Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__OTHER_COMMENT = eINSTANCE.getClinicalDecision_OtherComment();

    /**
     * The meta object literal for the '<em><b>User Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__USER_ACTION = eINSTANCE.getClinicalDecision_UserAction();

    /**
     * The meta object literal for the '<em><b>Minutes To Next Evaluation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION = eINSTANCE.getClinicalDecision_MinutesToNextEvaluation();

    /**
     * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLINICAL_DECISION__CREATED_BY = eINSTANCE.getClinicalDecision_CreatedBy();

    /**
     * The meta object literal for the '<em><b>Decision ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__DECISION_ID = eINSTANCE.getClinicalDecision_DecisionID();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLINICAL_DECISION__STATUS = eINSTANCE.getClinicalDecision_Status();

    /**
     * The meta object literal for the '<em><b>Patient</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLINICAL_DECISION__PATIENT = eINSTANCE.getClinicalDecision_Patient();

    /**
     * The meta object literal for the '<em><b>Advise</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation CLINICAL_DECISION___ADVISE__STRING = eINSTANCE.getClinicalDecision__Advise__String();

    /**
     * The meta object literal for the '{@link application.impl.IntensiveCareUnitImpl <em>Intensive Care Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.IntensiveCareUnitImpl
     * @see application.impl.ApplicationPackageImpl#getIntensiveCareUnit()
     * @generated
     */
    EClass INTENSIVE_CARE_UNIT = eINSTANCE.getIntensiveCareUnit();

    /**
     * The meta object literal for the '<em><b>Icu ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENSIVE_CARE_UNIT__ICU_ID = eINSTANCE.getIntensiveCareUnit_IcuID();

    /**
     * The meta object literal for the '<em><b>Hospital Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENSIVE_CARE_UNIT__HOSPITAL_NAME = eINSTANCE.getIntensiveCareUnit_HospitalName();

    /**
     * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENSIVE_CARE_UNIT__ACRONYM = eINSTANCE.getIntensiveCareUnit_Acronym();

    /**
     * The meta object literal for the '<em><b>Patients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENSIVE_CARE_UNIT__PATIENTS = eINSTANCE.getIntensiveCareUnit_Patients();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENSIVE_CARE_UNIT__USERS = eINSTANCE.getIntensiveCareUnit_Users();

    /**
     * The meta object literal for the '{@link application.impl.LaboratoryTestImpl <em>Laboratory Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.LaboratoryTestImpl
     * @see application.impl.ApplicationPackageImpl#getLaboratoryTest()
     * @generated
     */
    EClass LABORATORY_TEST = eINSTANCE.getLaboratoryTest();

    /**
     * The meta object literal for the '<em><b>Test ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABORATORY_TEST__TEST_ID = eINSTANCE.getLaboratoryTest_TestID();

    /**
     * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABORATORY_TEST__VALID = eINSTANCE.getLaboratoryTest_Valid();

    /**
     * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABORATORY_TEST__CREATED_BY = eINSTANCE.getLaboratoryTest_CreatedBy();

    /**
     * The meta object literal for the '<em><b>Time Of Specimen Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABORATORY_TEST__TIME_OF_SPECIMEN_COLLECTION = eINSTANCE.getLaboratoryTest_TimeOfSpecimenCollection();

    /**
     * The meta object literal for the '<em><b>Loinc Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABORATORY_TEST__LOINC_CODE = eINSTANCE.getLaboratoryTest_LoincCode();

    /**
     * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABORATORY_TEST__LABEL_NAME = eINSTANCE.getLaboratoryTest_LabelName();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABORATORY_TEST__RESULTS = eINSTANCE.getLaboratoryTest_Results();

    /**
     * The meta object literal for the '<em><b>Patient</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABORATORY_TEST__PATIENT = eINSTANCE.getLaboratoryTest_Patient();

    /**
     * The meta object literal for the '{@link application.impl.TestResultImpl <em>Test Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.impl.TestResultImpl
     * @see application.impl.ApplicationPackageImpl#getTestResult()
     * @generated
     */
    EClass TEST_RESULT = eINSTANCE.getTestResult();

    /**
     * The meta object literal for the '<em><b>Result ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RESULT__RESULT_ID = eINSTANCE.getTestResult_ResultID();

    /**
     * The meta object literal for the '<em><b>Loinc Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RESULT__LOINC_CODE = eINSTANCE.getTestResult_LoincCode();

    /**
     * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RESULT__LABEL_NAME = eINSTANCE.getTestResult_LabelName();

    /**
     * The meta object literal for the '<em><b>Conventional Text Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RESULT__CONVENTIONAL_TEXT_RESULT = eINSTANCE.getTestResult_ConventionalTextResult();

    /**
     * The meta object literal for the '<em><b>Conventional Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RESULT__CONVENTIONAL_UNITS = eINSTANCE.getTestResult_ConventionalUnits();

    /**
     * The meta object literal for the '<em><b>Laboratory Test</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_RESULT__LABORATORY_TEST = eINSTANCE.getTestResult_LaboratoryTest();

    /**
     * The meta object literal for the '{@link application.AccessType <em>Access Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.AccessType
     * @see application.impl.ApplicationPackageImpl#getAccessType()
     * @generated
     */
    EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

    /**
     * The meta object literal for the '{@link application.StatusType <em>Status Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.StatusType
     * @see application.impl.ApplicationPackageImpl#getStatusType()
     * @generated
     */
    EEnum STATUS_TYPE = eINSTANCE.getStatusType();

    /**
     * The meta object literal for the '{@link application.UserActionType <em>User Action Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see application.UserActionType
     * @see application.impl.ApplicationPackageImpl#getUserActionType()
     * @generated
     */
    EEnum USER_ACTION_TYPE = eINSTANCE.getUserActionType();

    /**
     * The meta object literal for the '<em>calendar</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Calendar
     * @see application.impl.ApplicationPackageImpl#getcalendar()
     * @generated
     */
    EDataType CALENDAR = eINSTANCE.getcalendar();

    /**
     * The meta object literal for the '<em>gregorian</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.GregorianCalendar
     * @see application.impl.ApplicationPackageImpl#getgregorian()
     * @generated
     */
    EDataType GREGORIAN = eINSTANCE.getgregorian();

  }

} //ApplicationPackage
