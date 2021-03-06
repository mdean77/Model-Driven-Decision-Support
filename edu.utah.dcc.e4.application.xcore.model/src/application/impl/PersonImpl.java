/**
 */
package application.impl;

import application.ApplicationPackage;
import application.Person;
import application.StatusType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link application.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link application.impl.PersonImpl#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link application.impl.PersonImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link application.impl.PersonImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person
{
  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonID()
   * @generated
   * @ordered
   */
  protected static final String PERSON_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonID()
   * @generated
   * @ordered
   */
  protected String personID = PERSON_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final StatusType STATUS_EDEFAULT = StatusType.CURRENT;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected StatusType status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationPackage.Literals.PERSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PERSON__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonID()
  {
    return personID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonID(String newPersonID)
  {
    String oldPersonID = personID;
    personID = newPersonID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PERSON__PERSON_ID, oldPersonID, personID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusType getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(StatusType newStatus)
  {
    StatusType oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PERSON__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    Person _this = this;
    String _lastName = _this.getLastName();
    String _trim = _lastName.trim();
    String _plus = (_trim + ", ");
    Person _this_1 = this;
    String _firstName = _this_1.getFirstName();
    String _trim_1 = _firstName.trim();
    String _plus_1 = (_plus + _trim_1);
    return _plus_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationPackage.PERSON__LAST_NAME:
        return getLastName();
      case ApplicationPackage.PERSON__FIRST_NAME:
        return getFirstName();
      case ApplicationPackage.PERSON__PERSON_ID:
        return getPersonID();
      case ApplicationPackage.PERSON__STATUS:
        return getStatus();
      case ApplicationPackage.PERSON__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.PERSON__LAST_NAME:
        setLastName((String)newValue);
        return;
      case ApplicationPackage.PERSON__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case ApplicationPackage.PERSON__PERSON_ID:
        setPersonID((String)newValue);
        return;
      case ApplicationPackage.PERSON__STATUS:
        setStatus((StatusType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.PERSON__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case ApplicationPackage.PERSON__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case ApplicationPackage.PERSON__PERSON_ID:
        setPersonID(PERSON_ID_EDEFAULT);
        return;
      case ApplicationPackage.PERSON__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationPackage.PERSON__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case ApplicationPackage.PERSON__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case ApplicationPackage.PERSON__PERSON_ID:
        return PERSON_ID_EDEFAULT == null ? personID != null : !PERSON_ID_EDEFAULT.equals(personID);
      case ApplicationPackage.PERSON__STATUS:
        return status != STATUS_EDEFAULT;
      case ApplicationPackage.PERSON__NAME:
        return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lastName: ");
    result.append(lastName);
    result.append(", firstName: ");
    result.append(firstName);
    result.append(", personID: ");
    result.append(personID);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //PersonImpl
