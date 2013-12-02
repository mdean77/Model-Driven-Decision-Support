/**
 */
package glucose;

import application.ApplicationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see glucose.GlucoseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/edu.utah.dcc.e4.glucose.xcore.model/src' importerID='org.eclipse.emf.importer.ecore' editorDirectory='/edu.utah.dcc.e4.glucose.xcore.model/src' editDirectory='/edu.utah.dcc.e4.glucose.xcore.model/src' testsDirectory='/edu.utah.dcc.e4.glucose.xcore.model.tests/src' providerRootExtendsClass='' tableProviders='true'"
 * @generated
 */
public interface GlucosePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "glucose";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "glucose";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "glucose";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GlucosePackage eINSTANCE = glucose.impl.GlucosePackageImpl.init();

  /**
   * The meta object id for the '{@link glucose.impl.GlucoseDecisionImpl <em>Decision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see glucose.impl.GlucoseDecisionImpl
   * @see glucose.impl.GlucosePackageImpl#getGlucoseDecision()
   * @generated
   */
  int GLUCOSE_DECISION = 0;

  /**
   * The feature id for the '<em><b>Decision Time Stamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__DECISION_TIME_STAMP = ApplicationPackage.CLINICAL_DECISION__DECISION_TIME_STAMP;

  /**
   * The feature id for the '<em><b>Observation Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__OBSERVATION_DATE = ApplicationPackage.CLINICAL_DECISION__OBSERVATION_DATE;

  /**
   * The feature id for the '<em><b>Patient Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PATIENT_WEIGHT = ApplicationPackage.CLINICAL_DECISION__PATIENT_WEIGHT;

  /**
   * The feature id for the '<em><b>Patient Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PATIENT_HEIGHT = ApplicationPackage.CLINICAL_DECISION__PATIENT_HEIGHT;

  /**
   * The feature id for the '<em><b>Patient Age Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PATIENT_AGE_DAYS = ApplicationPackage.CLINICAL_DECISION__PATIENT_AGE_DAYS;

  /**
   * The feature id for the '<em><b>Advice Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__ADVICE_TEXT = ApplicationPackage.CLINICAL_DECISION__ADVICE_TEXT;

  /**
   * The feature id for the '<em><b>Rules Fired Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__RULES_FIRED_TEXT = ApplicationPackage.CLINICAL_DECISION__RULES_FIRED_TEXT;

  /**
   * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__RATIONALE_TEXT = ApplicationPackage.CLINICAL_DECISION__RATIONALE_TEXT;

  /**
   * The feature id for the '<em><b>Decline Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__DECLINE_COMMENT = ApplicationPackage.CLINICAL_DECISION__DECLINE_COMMENT;

  /**
   * The feature id for the '<em><b>Accept Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__ACCEPT_COMMENT = ApplicationPackage.CLINICAL_DECISION__ACCEPT_COMMENT;

  /**
   * The feature id for the '<em><b>Other Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__OTHER_COMMENT = ApplicationPackage.CLINICAL_DECISION__OTHER_COMMENT;

  /**
   * The feature id for the '<em><b>User Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__USER_ACTION = ApplicationPackage.CLINICAL_DECISION__USER_ACTION;

  /**
   * The feature id for the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__MINUTES_TO_NEXT_EVALUATION = ApplicationPackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION;

  /**
   * The feature id for the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__CREATED_BY = ApplicationPackage.CLINICAL_DECISION__CREATED_BY;

  /**
   * The feature id for the '<em><b>Decision ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__DECISION_ID = ApplicationPackage.CLINICAL_DECISION__DECISION_ID;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__STATUS = ApplicationPackage.CLINICAL_DECISION__STATUS;

  /**
   * The feature id for the '<em><b>Patient</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PATIENT = ApplicationPackage.CLINICAL_DECISION__PATIENT;

  /**
   * The feature id for the '<em><b>Previous Glucose Concentration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Previous Observation Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Serum Glucose Concentration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Current Insulin Drip Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Carbohydrate Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__CARBOHYDRATE_STATUS = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Recommended Insulin Drip Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Recommended Insulin Bolus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Recommended Glucose Bolus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Insulin Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION__INSULIN_MODE = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION_FEATURE_COUNT = ApplicationPackage.CLINICAL_DECISION_FEATURE_COUNT + 9;

  /**
   * The operation id for the '<em>Advise</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION___ADVISE__STRING = ApplicationPackage.CLINICAL_DECISION___ADVISE__STRING;

  /**
   * The number of operations of the '<em>Decision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLUCOSE_DECISION_OPERATION_COUNT = ApplicationPackage.CLINICAL_DECISION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see glucose.CarbohydrateStatusType
   * @see glucose.impl.GlucosePackageImpl#getCarbohydrateStatusType()
   * @generated
   */
  int CARBOHYDRATE_STATUS_TYPE = 1;

  /**
   * The meta object id for the '<em>calendar</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Calendar
   * @see glucose.impl.GlucosePackageImpl#getcalendar()
   * @generated
   */
  int CALENDAR = 2;


  /**
   * Returns the meta object for class '{@link glucose.GlucoseDecision <em>Decision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision</em>'.
   * @see glucose.GlucoseDecision
   * @generated
   */
  EClass getGlucoseDecision();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getPreviousGlucoseConcentration <em>Previous Glucose Concentration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Previous Glucose Concentration</em>'.
   * @see glucose.GlucoseDecision#getPreviousGlucoseConcentration()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_PreviousGlucoseConcentration();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getPreviousObservationTime <em>Previous Observation Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Previous Observation Time</em>'.
   * @see glucose.GlucoseDecision#getPreviousObservationTime()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_PreviousObservationTime();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getSerumGlucoseConcentration <em>Serum Glucose Concentration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Serum Glucose Concentration</em>'.
   * @see glucose.GlucoseDecision#getSerumGlucoseConcentration()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_SerumGlucoseConcentration();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getCurrentInsulinDripRate <em>Current Insulin Drip Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Insulin Drip Rate</em>'.
   * @see glucose.GlucoseDecision#getCurrentInsulinDripRate()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_CurrentInsulinDripRate();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getCarbohydrateStatus <em>Carbohydrate Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carbohydrate Status</em>'.
   * @see glucose.GlucoseDecision#getCarbohydrateStatus()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_CarbohydrateStatus();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedInsulinDripRate <em>Recommended Insulin Drip Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recommended Insulin Drip Rate</em>'.
   * @see glucose.GlucoseDecision#getRecommendedInsulinDripRate()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_RecommendedInsulinDripRate();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedInsulinBolus <em>Recommended Insulin Bolus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recommended Insulin Bolus</em>'.
   * @see glucose.GlucoseDecision#getRecommendedInsulinBolus()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_RecommendedInsulinBolus();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedGlucoseBolus <em>Recommended Glucose Bolus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recommended Glucose Bolus</em>'.
   * @see glucose.GlucoseDecision#getRecommendedGlucoseBolus()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_RecommendedGlucoseBolus();

  /**
   * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getInsulinMode <em>Insulin Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Insulin Mode</em>'.
   * @see glucose.GlucoseDecision#getInsulinMode()
   * @see #getGlucoseDecision()
   * @generated
   */
  EAttribute getGlucoseDecision_InsulinMode();

  /**
   * Returns the meta object for enum '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Carbohydrate Status Type</em>'.
   * @see glucose.CarbohydrateStatusType
   * @generated
   */
  EEnum getCarbohydrateStatusType();

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
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GlucoseFactory getGlucoseFactory();

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
     * The meta object literal for the '{@link glucose.impl.GlucoseDecisionImpl <em>Decision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see glucose.impl.GlucoseDecisionImpl
     * @see glucose.impl.GlucosePackageImpl#getGlucoseDecision()
     * @generated
     */
    EClass GLUCOSE_DECISION = eINSTANCE.getGlucoseDecision();

    /**
     * The meta object literal for the '<em><b>Previous Glucose Concentration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION = eINSTANCE.getGlucoseDecision_PreviousGlucoseConcentration();

    /**
     * The meta object literal for the '<em><b>Previous Observation Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME = eINSTANCE.getGlucoseDecision_PreviousObservationTime();

    /**
     * The meta object literal for the '<em><b>Serum Glucose Concentration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION = eINSTANCE.getGlucoseDecision_SerumGlucoseConcentration();

    /**
     * The meta object literal for the '<em><b>Current Insulin Drip Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE = eINSTANCE.getGlucoseDecision_CurrentInsulinDripRate();

    /**
     * The meta object literal for the '<em><b>Carbohydrate Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__CARBOHYDRATE_STATUS = eINSTANCE.getGlucoseDecision_CarbohydrateStatus();

    /**
     * The meta object literal for the '<em><b>Recommended Insulin Drip Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE = eINSTANCE.getGlucoseDecision_RecommendedInsulinDripRate();

    /**
     * The meta object literal for the '<em><b>Recommended Insulin Bolus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS = eINSTANCE.getGlucoseDecision_RecommendedInsulinBolus();

    /**
     * The meta object literal for the '<em><b>Recommended Glucose Bolus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS = eINSTANCE.getGlucoseDecision_RecommendedGlucoseBolus();

    /**
     * The meta object literal for the '<em><b>Insulin Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLUCOSE_DECISION__INSULIN_MODE = eINSTANCE.getGlucoseDecision_InsulinMode();

    /**
     * The meta object literal for the '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see glucose.CarbohydrateStatusType
     * @see glucose.impl.GlucosePackageImpl#getCarbohydrateStatusType()
     * @generated
     */
    EEnum CARBOHYDRATE_STATUS_TYPE = eINSTANCE.getCarbohydrateStatusType();

    /**
     * The meta object literal for the '<em>calendar</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Calendar
     * @see glucose.impl.GlucosePackageImpl#getcalendar()
     * @generated
     */
    EDataType CALENDAR = eINSTANCE.getcalendar();

  }

} //GlucosePackage
