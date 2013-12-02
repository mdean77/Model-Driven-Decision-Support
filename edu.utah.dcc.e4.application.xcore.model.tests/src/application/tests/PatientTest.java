/**
 */
package application.tests;

import java.util.GregorianCalendar;

import junit.textui.TestRunner;
import application.ApplicationFactory;
import application.Patient;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link application.Patient#getBirthDateString() <em>Birth Date String</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link application.Patient#getDeltaAgeDays(java.util.Calendar) <em>Get Delta Age Days</em>}</li>
 *   <li>{@link application.Patient#getDeltaAgeYears(java.util.Calendar) <em>Get Delta Age Years</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PatientTest extends PersonTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PatientTest.class);
  }

  /**
   * Constructs a new Patient test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Patient test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Patient getFixture()
  {
    return (Patient)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated NOT
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ApplicationFactory.eINSTANCE.createPatient());
    getFixture().setBirthdate(new GregorianCalendar(2000,0,30));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

  /**
   * Tests the '{@link application.Patient#getBirthDateString() <em>Birth Date String</em>}' feature getter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.Patient#getBirthDateString()
   * @generated NOT
   */
  public void testGetBirthDateString()
  {
    assertEquals("January 30, 2000",getFixture().getBirthDateString());
  }

  /**
   * Tests the '{@link application.Patient#getDeltaAgeDays(java.util.Calendar) <em>Get Delta Age Days</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.Patient#getDeltaAgeDays(java.util.Calendar)
   * @generated NOT
   */
  public void testGetDeltaAgeDays__Calendar()
  {
   assertEquals(3,getFixture().getDeltaAgeDays(new GregorianCalendar(2000,1,2)));
   assertEquals(366,getFixture().getDeltaAgeDays(new GregorianCalendar(2001,0,30)));
   assertEquals(731,getFixture().getDeltaAgeDays(new GregorianCalendar(2002,0,30)));
  }

  /**
   * Tests the '{@link application.Patient#getDeltaAgeYears(java.util.Calendar) <em>Get Delta Age Years</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.Patient#getDeltaAgeYears(java.util.Calendar)
   * @generated NOT
   */
  public void testGetDeltaAgeYears__Calendar()
  {
	  assertEquals(0,getFixture().getDeltaAgeYears(new GregorianCalendar(2000,1,2)));
	  assertEquals(0,getFixture().getDeltaAgeYears(new GregorianCalendar(2000,6,2)));
	  assertEquals(1,getFixture().getDeltaAgeYears(new GregorianCalendar(2001,0,30)));
	  assertEquals(2,getFixture().getDeltaAgeYears(new GregorianCalendar(2002,0,30)));
  }

} //PatientTest
