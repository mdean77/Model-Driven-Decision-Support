/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intensive Care Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.IntensiveCareUnit#getIcuID <em>Icu ID</em>}</li>
 *   <li>{@link application.IntensiveCareUnit#getHospitalName <em>Hospital Name</em>}</li>
 *   <li>{@link application.IntensiveCareUnit#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link application.IntensiveCareUnit#getPatients <em>Patients</em>}</li>
 *   <li>{@link application.IntensiveCareUnit#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getIntensiveCareUnit()
 * @model
 * @generated
 */
public interface IntensiveCareUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Icu ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icu ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icu ID</em>' attribute.
   * @see #setIcuID(String)
   * @see application.ApplicationPackage#getIntensiveCareUnit_IcuID()
   * @model unique="false" id="true"
   *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")'"
   * @generated
   */
  String getIcuID();

  /**
   * Sets the value of the '{@link application.IntensiveCareUnit#getIcuID <em>Icu ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icu ID</em>' attribute.
   * @see #getIcuID()
   * @generated
   */
  void setIcuID(String value);

  /**
   * Returns the value of the '<em><b>Hospital Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hospital Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hospital Name</em>' attribute.
   * @see #setHospitalName(String)
   * @see application.ApplicationPackage#getIntensiveCareUnit_HospitalName()
   * @model unique="false"
   * @generated
   */
  String getHospitalName();

  /**
   * Sets the value of the '{@link application.IntensiveCareUnit#getHospitalName <em>Hospital Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hospital Name</em>' attribute.
   * @see #getHospitalName()
   * @generated
   */
  void setHospitalName(String value);

  /**
   * Returns the value of the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acronym</em>' attribute.
   * @see #setAcronym(String)
   * @see application.ApplicationPackage#getIntensiveCareUnit_Acronym()
   * @model unique="false"
   * @generated
   */
  String getAcronym();

  /**
   * Sets the value of the '{@link application.IntensiveCareUnit#getAcronym <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acronym</em>' attribute.
   * @see #getAcronym()
   * @generated
   */
  void setAcronym(String value);

  /**
   * Returns the value of the '<em><b>Patients</b></em>' containment reference list.
   * The list contents are of type {@link application.Patient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patients</em>' containment reference list.
   * @see application.ApplicationPackage#getIntensiveCareUnit_Patients()
   * @model containment="true" keys="lastName firstName medRecNum studyID"
   * @generated
   */
  EList<Patient> getPatients();

  /**
   * Returns the value of the '<em><b>Users</b></em>' containment reference list.
   * The list contents are of type {@link application.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' containment reference list.
   * @see application.ApplicationPackage#getIntensiveCareUnit_Users()
   * @model containment="true" keys="lastName firstName"
   * @generated
   */
  EList<User> getUsers();

} // IntensiveCareUnit
