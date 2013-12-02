/**
 */
package application.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import application.ApplicationFactory;
import application.IntensiveCareUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intensive Care Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntensiveCareUnitTest extends TestCase
{

  /**
   * The fixture for this Intensive Care Unit test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntensiveCareUnit fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(IntensiveCareUnitTest.class);
  }

  /**
   * Constructs a new Intensive Care Unit test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntensiveCareUnitTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Intensive Care Unit test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(IntensiveCareUnit fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Intensive Care Unit test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntensiveCareUnit getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ApplicationFactory.eINSTANCE.createIntensiveCareUnit());
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

  public void testCreation()
  {
   assertNotNull(getFixture());
   assertNull(getFixture().getAcronym());
  }
  
} //IntensiveCareUnitTest
