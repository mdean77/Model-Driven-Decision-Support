/**
 */
package application.provider;


import application.ApplicationFactory;
import application.ApplicationPackage;
import application.Patient;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link application.Patient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatientItemProvider
  extends PersonItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource,
    ITableItemLabelProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatientItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addWeightPropertyDescriptor(object);
      addMedRecNumPropertyDescriptor(object);
      addStudyIDPropertyDescriptor(object);
      addBirthdatePropertyDescriptor(object);
      addHeightPropertyDescriptor(object);
      addCreatedByPropertyDescriptor(object);
      addBirthDateStringPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Weight feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWeightPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_weight_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_weight_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__WEIGHT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Med Rec Num feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMedRecNumPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_medRecNum_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_medRecNum_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__MED_REC_NUM,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Study ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStudyIDPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_studyID_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_studyID_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__STUDY_ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Birthdate feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBirthdatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_birthdate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_birthdate_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__BIRTHDATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Height feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHeightPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_height_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_height_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__HEIGHT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Created By feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCreatedByPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_createdBy_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_createdBy_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__CREATED_BY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Birth Date String feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBirthDateStringPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Patient_birthDateString_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Patient_birthDateString_feature", "_UI_Patient_type"),
         ApplicationPackage.Literals.PATIENT__BIRTH_DATE_STRING,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ApplicationPackage.Literals.PATIENT__DECISIONS);
      childrenFeatures.add(ApplicationPackage.Literals.PATIENT__LAB_TESTS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Patient.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Patient"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Patient)object).getLastName();
    return label == null || label.length() == 0 ?
      getString("_UI_Patient_type") :
      getString("_UI_Patient_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Patient.class))
    {
      case ApplicationPackage.PATIENT__WEIGHT:
      case ApplicationPackage.PATIENT__MED_REC_NUM:
      case ApplicationPackage.PATIENT__STUDY_ID:
      case ApplicationPackage.PATIENT__BIRTHDATE:
      case ApplicationPackage.PATIENT__HEIGHT:
      case ApplicationPackage.PATIENT__BIRTH_DATE_STRING:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ApplicationPackage.PATIENT__DECISIONS:
      case ApplicationPackage.PATIENT__LAB_TESTS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ApplicationPackage.Literals.PATIENT__DECISIONS,
         ApplicationFactory.eINSTANCE.createClinicalDecision()));

    newChildDescriptors.add
      (createChildParameter
        (ApplicationPackage.Literals.PATIENT__LAB_TESTS,
         ApplicationFactory.eINSTANCE.createLaboratoryTest()));
  }

}
