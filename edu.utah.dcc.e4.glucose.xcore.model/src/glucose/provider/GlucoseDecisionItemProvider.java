/**
 */
package glucose.provider;


import application.provider.ClinicalDecisionItemProvider;

import glucose.GlucoseDecision;
import glucose.GlucosePackage;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link glucose.GlucoseDecision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlucoseDecisionItemProvider
  extends ClinicalDecisionItemProvider
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
  public GlucoseDecisionItemProvider(AdapterFactory adapterFactory)
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

      addPreviousGlucoseConcentrationPropertyDescriptor(object);
      addPreviousObservationTimePropertyDescriptor(object);
      addSerumGlucoseConcentrationPropertyDescriptor(object);
      addCurrentInsulinDripRatePropertyDescriptor(object);
      addCarbohydrateStatusPropertyDescriptor(object);
      addRecommendedInsulinDripRatePropertyDescriptor(object);
      addRecommendedInsulinBolusPropertyDescriptor(object);
      addRecommendedGlucoseBolusPropertyDescriptor(object);
      addPreviousPrevGlucosePropertyDescriptor(object);
      addInsulinModePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Previous Glucose Concentration feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPreviousGlucoseConcentrationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_previousGlucoseConcentration_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_previousGlucoseConcentration_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Previous Observation Time feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPreviousObservationTimePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_previousObservationTime_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_previousObservationTime_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Serum Glucose Concentration feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSerumGlucoseConcentrationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_serumGlucoseConcentration_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_serumGlucoseConcentration_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Current Insulin Drip Rate feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCurrentInsulinDripRatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_currentInsulinDripRate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_currentInsulinDripRate_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Carbohydrate Status feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCarbohydrateStatusPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_carbohydrateStatus_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_carbohydrateStatus_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__CARBOHYDRATE_STATUS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Recommended Insulin Drip Rate feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRecommendedInsulinDripRatePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_recommendedInsulinDripRate_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_recommendedInsulinDripRate_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Recommended Insulin Bolus feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRecommendedInsulinBolusPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_recommendedInsulinBolus_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_recommendedInsulinBolus_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Recommended Glucose Bolus feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRecommendedGlucoseBolusPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_recommendedGlucoseBolus_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_recommendedGlucoseBolus_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Previous Prev Glucose feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPreviousPrevGlucosePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_previousPrevGlucose_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_previousPrevGlucose_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__PREVIOUS_PREV_GLUCOSE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Insulin Mode feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addInsulinModePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_GlucoseDecision_insulinMode_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_GlucoseDecision_insulinMode_feature", "_UI_GlucoseDecision_type"),
         GlucosePackage.Literals.GLUCOSE_DECISION__INSULIN_MODE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns GlucoseDecision.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/GlucoseDecision"));
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
    Calendar labelValue = ((GlucoseDecision)object).getDecisionTimeStamp();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_GlucoseDecision_type") :
      getString("_UI_GlucoseDecision_type") + " " + label;
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

    switch (notification.getFeatureID(GlucoseDecision.class))
    {
      case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION:
      case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME:
      case GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION:
      case GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE:
      case GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS:
      case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE:
      case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS:
      case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS:
      case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_PREV_GLUCOSE:
      case GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return GlucoseEditPlugin.INSTANCE;
  }

}
