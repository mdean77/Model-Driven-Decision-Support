/**
 */
package application.impl;

import application.ApplicationPackage;
import application.IntensiveCareUnit;
import application.Patient;
import application.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intensive Care Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.IntensiveCareUnitImpl#getIcuID <em>Icu ID</em>}</li>
 *   <li>{@link application.impl.IntensiveCareUnitImpl#getHospitalName <em>Hospital Name</em>}</li>
 *   <li>{@link application.impl.IntensiveCareUnitImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link application.impl.IntensiveCareUnitImpl#getPatients <em>Patients</em>}</li>
 *   <li>{@link application.impl.IntensiveCareUnitImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntensiveCareUnitImpl extends MinimalEObjectImpl.Container implements IntensiveCareUnit
{
  /**
   * The default value of the '{@link #getIcuID() <em>Icu ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcuID()
   * @generated
   * @ordered
   */
  protected static final String ICU_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcuID() <em>Icu ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcuID()
   * @generated
   * @ordered
   */
  protected String icuID = ICU_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getHospitalName() <em>Hospital Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHospitalName()
   * @generated
   * @ordered
   */
  protected static final String HOSPITAL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHospitalName() <em>Hospital Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHospitalName()
   * @generated
   * @ordered
   */
  protected String hospitalName = HOSPITAL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected static final String ACRONYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected String acronym = ACRONYM_EDEFAULT;

  /**
   * The cached value of the '{@link #getPatients() <em>Patients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatients()
   * @generated
   * @ordered
   */
  protected EList<Patient> patients;

  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<User> users;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntensiveCareUnitImpl()
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
    return ApplicationPackage.Literals.INTENSIVE_CARE_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcuID()
  {
    return icuID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcuID(String newIcuID)
  {
    String oldIcuID = icuID;
    icuID = newIcuID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.INTENSIVE_CARE_UNIT__ICU_ID, oldIcuID, icuID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHospitalName()
  {
    return hospitalName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHospitalName(String newHospitalName)
  {
    String oldHospitalName = hospitalName;
    hospitalName = newHospitalName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.INTENSIVE_CARE_UNIT__HOSPITAL_NAME, oldHospitalName, hospitalName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcronym()
  {
    return acronym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcronym(String newAcronym)
  {
    String oldAcronym = acronym;
    acronym = newAcronym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.INTENSIVE_CARE_UNIT__ACRONYM, oldAcronym, acronym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Patient> getPatients()
  {
    if (patients == null)
    {
      patients = new EObjectContainmentEList<Patient>(Patient.class, this, ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS);
    }
    return patients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<User> getUsers()
  {
    if (users == null)
    {
      users = new EObjectContainmentEList<User>(User.class, this, ApplicationPackage.INTENSIVE_CARE_UNIT__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS:
        return ((InternalEList<?>)getPatients()).basicRemove(otherEnd, msgs);
      case ApplicationPackage.INTENSIVE_CARE_UNIT__USERS:
        return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ICU_ID:
        return getIcuID();
      case ApplicationPackage.INTENSIVE_CARE_UNIT__HOSPITAL_NAME:
        return getHospitalName();
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ACRONYM:
        return getAcronym();
      case ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS:
        return getPatients();
      case ApplicationPackage.INTENSIVE_CARE_UNIT__USERS:
        return getUsers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ICU_ID:
        setIcuID((String)newValue);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__HOSPITAL_NAME:
        setHospitalName((String)newValue);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ACRONYM:
        setAcronym((String)newValue);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS:
        getPatients().clear();
        getPatients().addAll((Collection<? extends Patient>)newValue);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends User>)newValue);
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
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ICU_ID:
        setIcuID(ICU_ID_EDEFAULT);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__HOSPITAL_NAME:
        setHospitalName(HOSPITAL_NAME_EDEFAULT);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ACRONYM:
        setAcronym(ACRONYM_EDEFAULT);
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS:
        getPatients().clear();
        return;
      case ApplicationPackage.INTENSIVE_CARE_UNIT__USERS:
        getUsers().clear();
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
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ICU_ID:
        return ICU_ID_EDEFAULT == null ? icuID != null : !ICU_ID_EDEFAULT.equals(icuID);
      case ApplicationPackage.INTENSIVE_CARE_UNIT__HOSPITAL_NAME:
        return HOSPITAL_NAME_EDEFAULT == null ? hospitalName != null : !HOSPITAL_NAME_EDEFAULT.equals(hospitalName);
      case ApplicationPackage.INTENSIVE_CARE_UNIT__ACRONYM:
        return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
      case ApplicationPackage.INTENSIVE_CARE_UNIT__PATIENTS:
        return patients != null && !patients.isEmpty();
      case ApplicationPackage.INTENSIVE_CARE_UNIT__USERS:
        return users != null && !users.isEmpty();
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
    result.append(" (icuID: ");
    result.append(icuID);
    result.append(", hospitalName: ");
    result.append(hospitalName);
    result.append(", acronym: ");
    result.append(acronym);
    result.append(')');
    return result.toString();
  }

} //IntensiveCareUnitImpl
