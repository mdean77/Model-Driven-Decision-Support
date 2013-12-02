/**
 */
package application.tests;

import application.ApplicationFactory;
import application.LaboratoryTest;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Laboratory Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaboratoryTestTest extends TestCase
{

  /**
   * The fixture for this Laboratory Test test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaboratoryTest fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(LaboratoryTestTest.class);
  }

  /**
   * Constructs a new Laboratory Test test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaboratoryTestTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Laboratory Test test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(LaboratoryTest fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Laboratory Test test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaboratoryTest getFixture()
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
    setFixture(ApplicationFactory.eINSTANCE.createLaboratoryTest());
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

} //LaboratoryTestTest
