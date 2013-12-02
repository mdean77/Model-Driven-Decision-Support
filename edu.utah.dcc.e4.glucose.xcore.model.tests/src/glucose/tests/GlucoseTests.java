/**
 */
package glucose.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>glucose</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlucoseTests extends TestSuite
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(suite());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Test suite()
  {
    TestSuite suite = new GlucoseTests("glucose Tests");
    suite.addTestSuite(GlucoseDecisionTest.class);
    return suite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlucoseTests(String name)
  {
    super(name);
  }

} //GlucoseTests
