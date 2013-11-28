/**
 */
package glucose.provider;


import glucose.ClinicalDecision;
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
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link glucose.ClinicalDecision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClinicalDecisionItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDecisionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDecisionTimeStampPropertyDescriptor(object);
			addObservationDatePropertyDescriptor(object);
			addPatientWeightPropertyDescriptor(object);
			addPatientHeightPropertyDescriptor(object);
			addPatientAgeDaysPropertyDescriptor(object);
			addAdviceTextPropertyDescriptor(object);
			addRulesFiredTextPropertyDescriptor(object);
			addRationaleTextPropertyDescriptor(object);
			addDeclineCommentPropertyDescriptor(object);
			addAcceptCommentPropertyDescriptor(object);
			addOtherCommentPropertyDescriptor(object);
			addUserActionPropertyDescriptor(object);
			addMinutesToNextEvaluationPropertyDescriptor(object);
			addCreatedByPropertyDescriptor(object);
			addDecisionIDPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Decision Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionTimeStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_decisionTimeStamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_decisionTimeStamp_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__DECISION_TIME_STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_observationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_observationDate_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__OBSERVATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Patient Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatientWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_patientWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_patientWeight_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__PATIENT_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Patient Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatientHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_patientHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_patientHeight_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__PATIENT_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Patient Age Days feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatientAgeDaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_patientAgeDays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_patientAgeDays_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__PATIENT_AGE_DAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advice Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdviceTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_adviceText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_adviceText_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__ADVICE_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rules Fired Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulesFiredTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_rulesFiredText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_rulesFiredText_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__RULES_FIRED_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rationale Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRationaleTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_rationaleText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_rationaleText_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__RATIONALE_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decline Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclineCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_declineComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_declineComment_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__DECLINE_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accept Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_acceptComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_acceptComment_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__ACCEPT_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_otherComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_otherComment_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__OTHER_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_userAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_userAction_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__USER_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minutes To Next Evaluation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutesToNextEvaluationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_minutesToNextEvaluation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_minutesToNextEvaluation_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Created By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_createdBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_createdBy_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__CREATED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decision ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_decisionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_decisionID_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__DECISION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClinicalDecision_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClinicalDecision_status_feature", "_UI_ClinicalDecision_type"),
				 GlucosePackage.Literals.CLINICAL_DECISION__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ClinicalDecision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClinicalDecision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Calendar labelValue = ((ClinicalDecision)object).getDecisionTimeStamp();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ClinicalDecision_type") :
			getString("_UI_ClinicalDecision_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ClinicalDecision.class)) {
			case GlucosePackage.CLINICAL_DECISION__DECISION_TIME_STAMP:
			case GlucosePackage.CLINICAL_DECISION__OBSERVATION_DATE:
			case GlucosePackage.CLINICAL_DECISION__PATIENT_WEIGHT:
			case GlucosePackage.CLINICAL_DECISION__PATIENT_HEIGHT:
			case GlucosePackage.CLINICAL_DECISION__PATIENT_AGE_DAYS:
			case GlucosePackage.CLINICAL_DECISION__ADVICE_TEXT:
			case GlucosePackage.CLINICAL_DECISION__RULES_FIRED_TEXT:
			case GlucosePackage.CLINICAL_DECISION__RATIONALE_TEXT:
			case GlucosePackage.CLINICAL_DECISION__DECLINE_COMMENT:
			case GlucosePackage.CLINICAL_DECISION__ACCEPT_COMMENT:
			case GlucosePackage.CLINICAL_DECISION__OTHER_COMMENT:
			case GlucosePackage.CLINICAL_DECISION__USER_ACTION:
			case GlucosePackage.CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION:
			case GlucosePackage.CLINICAL_DECISION__DECISION_ID:
			case GlucosePackage.CLINICAL_DECISION__STATUS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GlucoseEditPlugin.INSTANCE;
	}

}
