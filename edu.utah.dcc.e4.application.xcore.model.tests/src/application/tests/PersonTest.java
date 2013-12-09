/**
 */
package application.tests;

import junit.framework.TestCase;
import application.Person;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link application.Person#getName() <em>Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PersonTest extends TestCase
{

  /**
   * The fixture for this Person test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Person fixture = null;

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
