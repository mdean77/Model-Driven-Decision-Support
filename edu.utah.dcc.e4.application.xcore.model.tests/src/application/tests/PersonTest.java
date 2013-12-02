/**
 */
package application.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import application.ApplicationFactory;
import application.Person;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link application.Person#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PersonTest extends TestCase
{

  /**
   * The fixture for this Person test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Person fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PersonTest.class);
  }

  /**
   * Constructs a new Person test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Person test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Person fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Person test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Person getFixture()
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
    setFixture(ApplicationFactory.eINSTANCE.createPerson());
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
   * Tests the '{@link application.Person#getName() <em>Get Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see application.Person#getName()
   * @generated NOT
   */
  public void testGetName()
  {
   getFixture().setFirstName("John");
   getFixture().setLastName("Smith");
   assertEquals("Smith, John", getFixture().getName());
  }

} //PersonTest
