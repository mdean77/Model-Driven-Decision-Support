/**
 */
package glucose.impl;

import application.ApplicationPackage;

import glucose.CarbohydrateStatusType;
import glucose.GlucoseDecision;
import glucose.GlucoseFactory;
import glucose.GlucosePackage;

import java.util.Calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlucosePackageImpl extends EPackageImpl implements GlucosePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass glucoseDecisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum carbohydrateStatusTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType calendarEDataType = null;

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
   * @see glucose.GlucosePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GlucosePackageImpl()
  {
    super(eNS_URI, GlucoseFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GlucosePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GlucosePackage init()
  {
    if (isInited) return (GlucosePackage)EPackage.Registry.INSTANCE.getEPackage(GlucosePackage.eNS_URI);

    // Obtain or create and register package
    GlucosePackageImpl theGlucosePackage = (GlucosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GlucosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GlucosePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ApplicationPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGlucosePackage.createPackageContents();

    // Initialize created meta-data
    theGlucosePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGlucosePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GlucosePackage.eNS_URI, theGlucosePackage);
    return theGlucosePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlucoseDecision()
  {
    return glucoseDecisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_PreviousGlucoseConcentration()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_PreviousObservationTime()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_SerumGlucoseConcentration()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_CurrentInsulinDripRate()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_CarbohydrateStatus()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_RecommendedInsulinDripRate()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_RecommendedInsulinBolus()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_RecommendedGlucoseBolus()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_PreviousPrevGlucose()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlucoseDecision_InsulinMode()
  {
    return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCarbohydrateStatusType()
  {
    return carbohydrateStatusTypeEEnum;
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
  public GlucoseFactory getGlucoseFactory()
  {
    return (GlucoseFactory)getEFactoryInstance();
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
    glucoseDecisionEClass = createEClass(GLUCOSE_DECISION);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__CARBOHYDRATE_STATUS);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__PREVIOUS_PREV_GLUCOSE);
    createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__INSULIN_MODE);

    // Create enums
    carbohydrateStatusTypeEEnum = createEEnum(CARBOHYDRATE_STATUS_TYPE);

    // Create data types
    calendarEDataType = createEDataType(CALENDAR);
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
    ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    glucoseDecisionEClass.getESuperTypes().add(theApplicationPackage.getClinicalDecision());

    // Initialize classes, features, and operations; add parameters
    initEClass(glucoseDecisionEClass, GlucoseDecision.class, "GlucoseDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlucoseDecision_PreviousGlucoseConcentration(), theEcorePackage.getEIntegerObject(), "previousGlucoseConcentration", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_PreviousObservationTime(), this.getcalendar(), "previousObservationTime", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_SerumGlucoseConcentration(), theEcorePackage.getEIntegerObject(), "serumGlucoseConcentration", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_CurrentInsulinDripRate(), theEcorePackage.getEDoubleObject(), "currentInsulinDripRate", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_CarbohydrateStatus(), this.getCarbohydrateStatusType(), "carbohydrateStatus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_RecommendedInsulinDripRate(), theEcorePackage.getEDoubleObject(), "recommendedInsulinDripRate", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_RecommendedInsulinBolus(), theEcorePackage.getEDoubleObject(), "recommendedInsulinBolus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_RecommendedGlucoseBolus(), theEcorePackage.getEDoubleObject(), "recommendedGlucoseBolus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_PreviousPrevGlucose(), theEcorePackage.getEDoubleObject(), "previousPrevGlucose", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlucoseDecision_InsulinMode(), theEcorePackage.getEString(), "insulinMode", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.class, "CarbohydrateStatusType");
    addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.UNCHANGED);
    addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.DECREASED);
    addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.INCREASED);

    // Initialize data types
    initEDataType(calendarEDataType, Calendar.class, "calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GlucosePackageImpl
