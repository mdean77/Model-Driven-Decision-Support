package edu.utah.e4.ui.core.parts;

import javax.inject.Inject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import com.swtdesigner.SWTResourceManager;


public class DecisionFieldsAddedComposite extends DecisionCompositeButtonsOnly //implements IDecisionListener 
{
	protected static final String EMPTY_STRING = "";
	private SashForm decisionComposite;
	private Group decisionGroup;
	private StyledText decisionText;
	private Group explainGroup;
	private StyledText explanationText;
	//private Boolean decisionFiredFlag;
	public Composite domainFieldsComposite;

	@Inject
	public DecisionFieldsAddedComposite(Composite parent) {
		super();
		makeDecisionComposite(parent);
	}

	//@PostConstruct
	private void makeDecisionComposite(Composite parent) {
		createDomainFieldsComposite(parent);
		createDecisionComposite(parent);
		createDecisionGroup();
		createExplainGroup();
		
	}



	private void createDecisionComposite(Composite parent) {
		decisionComposite = new SashForm(parent, SWT.VERTICAL | SWT.V_SCROLL | SWT.BORDER);
		
		FormData decisionCompositeLData = setupDecisionCompositeFormData();
		decisionComposite.setLayoutData(decisionCompositeLData);
	}

	private FormData setupDecisionCompositeFormData() {
		FormData decisionCompositeLData = new FormData();
		decisionCompositeLData.width = 719;
		decisionCompositeLData.height = 278;
		decisionCompositeLData.left = new FormAttachment(10, 1000, 0);
		decisionCompositeLData.right = new FormAttachment(991, 1000, 0);
		decisionCompositeLData.top = new FormAttachment(400, 1000, 0);
		decisionCompositeLData.bottom = new FormAttachment(899, 1000, 0);
		return decisionCompositeLData;
	}

	private void createDecisionGroup() {
		decisionGroup = new Group(decisionComposite, SWT.NONE);
		FormData decisionGroupLData = setupDecisionGroupGridLayout();
		decisionGroup.setLayoutData(decisionGroupLData);
		decisionGroup.setText("Decision Recommended by Protocol:");
		createDecisionText();
	}

	private FormData setupDecisionGroupGridLayout() {
		GridLayout decisionGroupLayout = new GridLayout();
		decisionGroupLayout.makeColumnsEqualWidth = true;
		decisionGroup.setLayout(decisionGroupLayout);
		FormData decisionGroupLData = setupDecisionFormData();
		return decisionGroupLData;
	}

	private FormData setupDecisionFormData() {
		FormData decisionGroupLData = new FormData();
		decisionGroupLData.width = 692;
		decisionGroupLData.height = 78;
		decisionGroupLData.left = new FormAttachment(0, 1000, 7);
		decisionGroupLData.right = new FormAttachment(993, 1000, 0);
		decisionGroupLData.top = new FormAttachment(21, 1000, 0);
		decisionGroupLData.bottom = new FormAttachment(304, 1000, 0);
		return decisionGroupLData;
	}

	private void createExplainGroup() {
		explainGroup = new Group(decisionComposite, SWT.NONE);
		FormData explainGroupLData = setupExplainGroupGridLayout();
		explainGroup.setLayoutData(explainGroupLData);
		explainGroup.setText("Why did the protocol make this recommendation?");
		createExplanationText();
	}

	private FormData setupExplainGroupGridLayout() {
		GridLayout explainGroupLayout = new GridLayout();
		explainGroupLayout.makeColumnsEqualWidth = true;
		explainGroup.setLayout(explainGroupLayout);
		FormData explainGroupLData = setupExplanationFormData();
		return explainGroupLData;
	}

	private FormData setupExplanationFormData() {
		FormData explainGroupLData = new FormData();
		explainGroupLData.width = 692;
		explainGroupLData.height = 92;
		explainGroupLData.left = new FormAttachment(10, 1000, 0);
		explainGroupLData.right = new FormAttachment(993, 1000, 0);
		explainGroupLData.top = new FormAttachment(324, 1000, 0);
		explainGroupLData.bottom = new FormAttachment(646, 1000, 0);
		return explainGroupLData;
	}

	private void createDecisionText() {
		decisionText = new StyledText(decisionGroup, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		decisionText.setFont(SWTResourceManager.getFont("Lucida Grande", 13, SWT.NORMAL));
		GridData decisionTextLData = new GridData();
		decisionTextLData.grabExcessHorizontalSpace = true;
		decisionTextLData.grabExcessVerticalSpace = true;
		decisionTextLData.horizontalAlignment = GridData.FILL;
		decisionTextLData.verticalAlignment = GridData.FILL;
		decisionTextLData.verticalSpan = 3;
		decisionText.setLayoutData(decisionTextLData);
		decisionText.setText(EMPTY_STRING);
		decisionText.setToolTipText("The recommended clinical decision. ");
	}

	private void createExplanationText() {
		explanationText = new StyledText(explainGroup, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		explanationText.setFont(SWTResourceManager.getFont("Lucida Grande", 13, SWT.NORMAL));
		GridData explanationTextLData = new GridData();
		explanationTextLData.verticalAlignment = GridData.FILL;
		explanationTextLData.horizontalAlignment = GridData.FILL;
		explanationTextLData.verticalSpan = 3;
		explanationTextLData.grabExcessHorizontalSpace = true;
		explanationTextLData.grabExcessVerticalSpace = true;
		explanationText.setLayoutData(explanationTextLData);
		explanationText.setText(EMPTY_STRING);
		explanationText.setToolTipText("The explanation for the recommended decision.");
	}

	private void createDomainFieldsComposite(Composite parent) {
		domainFieldsComposite = new Composite(parent, SWT.BORDER);
		setupDomainGridLayout();	
	}
	
	private FormData setupDomainCompositeFormData() {
		FormData fd_domainFieldsComposite = new FormData();
		fd_domainFieldsComposite.top = new FormAttachment(getDeclineButton(), 10, SWT.TOP);
		fd_domainFieldsComposite.width = 719;
		fd_domainFieldsComposite.height = 75;
		fd_domainFieldsComposite.left = new FormAttachment(10, 1000, 0);
		fd_domainFieldsComposite.right = new FormAttachment(991, 1000, 0);
		fd_domainFieldsComposite.bottom = new FormAttachment(305, 1000, 24);
		return fd_domainFieldsComposite;
	}

	private void setupDomainGridLayout() {
		GridLayout domainCompositeLayout = new GridLayout();
		domainCompositeLayout.numColumns = 6;
		domainCompositeLayout.makeColumnsEqualWidth = true;
		FormData domainCompositeLData = setupDomainCompositeFormData();
		domainFieldsComposite.setLayoutData(domainCompositeLData);
		domainFieldsComposite.setLayout(domainCompositeLayout);
	}
	
	public void clearOutputEditorFields() {
		getDecisionText().setText(EMPTY_STRING);
		getExplanationText().setText(EMPTY_STRING);
	}

	public StyledText getDecisionText() {
		return decisionText;
	}

//	public void clearAdvice() {
//		clearOutputEditorFields();
		//setDecisionFiredFlag(false);
//	}

//	public void setDecisionFiredFlag(Boolean decisionFiredFlag) {
//		this.decisionFiredFlag = decisionFiredFlag;
//	}
//
//	public Boolean getDecisionFiredFlag() {
//		return decisionFiredFlag;
//	}

	public StyledText getExplanationText() {
		return explanationText;
	}

//	public void decisionChanged(ClinicalDecision decision) {
//		if (decision == null) {
//			getDecisionText().setText("");
//			getExplanationText().setText("");
//		} else {
//			getDecisionText().setText(decision.getAdviceText());
//			getExplanationText().setText(decision.getRationaleText());
//		}
//	}
//
//	public void decisionStored(ClinicalDecision decision) {
//	}

}
