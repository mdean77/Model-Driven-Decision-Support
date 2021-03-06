/**
 */
package application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a clinical user of the software, generally a nurse or physician.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.User#getAccountRights <em>Account Rights</em>}</li>
 *   <li>{@link application.User#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link application.User#getPasswordDigest <em>Password Digest</em>}</li>
 *   <li>{@link application.User#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Person
{
  /**
   * Returns the value of the '<em><b>Account Rights</b></em>' attribute.
   * The default value is <code>"Normal"</code>.
   * The literals are from the enumeration {@link application.AccessType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Rights</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Rights</em>' attribute.
   * @see application.AccessType
   * @see #setAccountRights(AccessType)
   * @see application.ApplicationPackage#getUser_AccountRights()
   * @model default="Normal" unique="false"
   * @generated
   */
  AccessType getAccountRights();

  /**
   * Sets the value of the '{@link application.User#getAccountRights <em>Account Rights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account Rights</em>' attribute.
   * @see application.AccessType
   * @see #getAccountRights()
   * @generated
   */
  void setAccountRights(AccessType value);

  /**
   * Returns the value of the '<em><b>Account Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Name</em>' attribute.
   * @see #setAccountName(String)
   * @see application.ApplicationPackage#getUser_AccountName()
   * @model unique="false"
   * @generated
   */
  String getAccountName();

  /**
   * Sets the value of the '{@link application.User#getAccountName <em>Account Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account Name</em>' attribute.
   * @see #getAccountName()
   * @generated
   */
  void setAccountName(String value);

  /**
   * Returns the value of the '<em><b>Password Digest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password Digest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password Digest</em>' attribute.
   * @see #setPasswordDigest(String)
   * @see application.ApplicationPackage#getUser_PasswordDigest()
   * @model unique="false"
   * @generated
   */
  String getPasswordDigest();

  /**
   * Sets the value of the '{@link application.User#getPasswordDigest <em>Password Digest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password Digest</em>' attribute.
   * @see #getPasswordDigest()
   * @generated
   */
  void setPasswordDigest(String value);

  /**
   * Returns the value of the '<em><b>Created By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created By</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created By</em>' reference.
   * @see #setCreatedBy(User)
   * @see application.ApplicationPackage#getUser_CreatedBy()
   * @model
   * @generated
   */
  User getCreatedBy();

  /**
   * Sets the value of the '{@link application.User#getCreatedBy <em>Created By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created By</em>' reference.
   * @see #getCreatedBy()
   * @generated
   */
  void setCreatedBy(User value);

} // User
