/**
 */
package application.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import application.ApplicationFactory;
import application.ClinicalDecision;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clinical Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link application.ClinicalDecision#advise(java.lang.String) <em>Advise</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClinicalDecisionTest extends TestCase
{

  /**
   * The fixture for this Clinical Decision test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalDecision fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ClinicalDecisionTest.class);
  }

  /**
   * Constructs a new Clinical Decision test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalDecisionTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Clinical Decision test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(ClinicalDecision fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Clinical Decision test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalDecision getFixture()
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
    setFixture(ApplicationFactory.eINSTANCE.createClinicalDecision());
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
   * Tests the '{@link application.ClinicalDecision#advise(java.lang.String) <em>Advise</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.ClinicalDecision#advise(java.lang.String)
   * @generated NOT
   */
  public void testAdvise__String()
  {
   getFixture().setAdviceText("");
   getFixture().advise("Advice");
   assertEquals("Advice", getFixture().getAdviceText());
   getFixture().advise("Advice");
   assertEquals("AdviceAdvice", getFixture().getAdviceText());
  }

} //ClinicalDecisionTest
