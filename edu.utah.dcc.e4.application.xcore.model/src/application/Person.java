/**
 */
package application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Person entity is used as a base class for patients and users.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link application.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link application.Person#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link application.Person#getStatus <em>Status</em>}</li>
 *   <li>{@link application.Person#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see application.ApplicationPackage#getPerson_LastName()
   * @model default="" unique="false"
   *        annotation="teneo.jpa appinfo='@Basic(optional=false) @Column(name=LASTNAME)'"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link application.Person#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see application.ApplicationPackage#getPerson_FirstName()
   * @model default="" unique="false"
   *        annotation="teneo.jpa appinfo='@Basic(optional=false) @Column(name=FIRSTNAME)'"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link application.Person#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Person ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person ID</em>' attribute.
   * @see #setPersonID(String)
   * @see application.ApplicationPackage#getPerson_PersonID()
   * @model unique="false" id="true"
   *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")\n'"
   * @generated
   */
  String getPersonID();

  /**
   * Sets the value of the '{@link application.Person#getPersonID <em>Person ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person ID</em>' attribute.
   * @see #getPersonID()
   * @generated
   */
  void setPersonID(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The default value is <code>"Current"</code>.
   * The literals are from the enumeration {@link application.StatusType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status of the person record.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see application.StatusType
   * @see #setStatus(StatusType)
   * @see application.ApplicationPackage#getPerson_Status()
   * @model default="Current" unique="false"
   *        annotation="teneo.jpa appinfo='@Basic(optional=false) @Column(name=STATUS)'"
   * @generated
   */
  StatusType getStatus();

  /**
   * Sets the value of the '{@link application.Person#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see application.StatusType
   * @see #getStatus()
   * @generated
   */
  void setStatus(StatusType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see application.ApplicationPackage#getPerson_Name()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%application.Person%> _this = this;\n<%java.lang.String%> _lastName = _this.getLastName();\n<%java.lang.String%> _trim = _lastName.trim();\n<%java.lang.String%> _plus = (_trim + \", \");\n<%application.Person%> _this_1 = this;\n<%java.lang.String%> _firstName = _this_1.getFirstName();\n<%java.lang.String%> _trim_1 = _firstName.trim();\n<%java.lang.String%> _plus_1 = (_plus + _trim_1);\nreturn _plus_1;'"
   * @generated
   */
  String getName();

} // Person
