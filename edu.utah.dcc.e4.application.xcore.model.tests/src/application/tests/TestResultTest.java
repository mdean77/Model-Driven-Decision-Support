/**
 */
package application.tests;

import application.ApplicationFactory;
import application.TestResult;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestResultTest extends TestCase
{

  /**
   * The fixture for this Test Result test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestResult fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TestResultTest.class);
  }

  /**
   * Constructs a new Test Result test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestResultTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Test Result test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TestResult fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Test Result test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestResult getFixture()
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
    setFixture(ApplicationFactory.eINSTANCE.createTestResult());
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

} //TestResultTest
