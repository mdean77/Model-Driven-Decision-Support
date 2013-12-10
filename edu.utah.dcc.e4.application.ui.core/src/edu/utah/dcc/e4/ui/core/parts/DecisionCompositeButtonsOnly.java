package edu.utah.dcc.e4.ui.core.parts;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class DecisionCompositeButtonsOnly {

	private Button acceptButton;
	private Button chartButton;
	private Button declineButton;
	private Button decisionButton;
	private Composite buttonComposite;
	private LocalResourceManager resManager;

//	public DecisionCompositeButtonsOnly(Composite parent){
//		System.out.println("In Decision Composite Buttons Only Constructor");
//		createButtonsComposite(parent);
//	}
	
	//TODO Fix the logic for enabling the buttons
	//If all required fields are filled in, 

	 public DecisionCompositeButtonsOnly(Composite parent) {
		// TODO Auto-generated constructor stub
	}

	protected void createControls(Composite parent) {
		parent.setLayout(new FormLayout());
		resManager = new LocalResourceManager(JFaceResources.getResources(), parent);
		parent.setBackground(resManager.createColor(new RGB(169, 173, 240)));
		//parent.setBackground(resManager.createColor(new RGB(255, 0, 0))); ALL RED!
		makeDecisionButtonComposite(parent);
		parent.layout();

	}

	/**
	 * create buttons/controls for user to calculate, accept, decline or chart a
	 * decision for selected patient
	 */
	private void makeDecisionButtonComposite(Composite parent) {
		resManager = new LocalResourceManager(JFaceResources.getResources(), parent);
		createButtonComposite(parent);
		createCalculateDecisionButton();
		createAcceptDecisionButton();
		createDeclineDecisionButton();
		createChartDataButton();
	}

	private void createButtonComposite(Composite parent) {
		buttonComposite = new Composite(parent, SWT.NONE);
		setupButtonFormLayout();
		//buttonComposite.setBackground(SWTResourceManager.getColor(83, 102, 240));
		buttonComposite.setBackground(resManager.createColor(new RGB(83, 102, 240)));
	}

	private void setupButtonFormLayout() {
		FormLayout buttonCompositeLayout = new FormLayout();
		FormData buttonCompositeLData = setupButtonCompositeFormData();
		buttonComposite.setLayoutData(buttonCompositeLData);
		buttonComposite.setLayout(buttonCompositeLayout);
	}

	private FormData setupButtonCompositeFormData() {
		FormData buttonCompositeLData = new FormData();
		buttonCompositeLData.width = 721;
		buttonCompositeLData.height = 49;
		buttonCompositeLData.left = new FormAttachment(10, 1000, 0);
		buttonCompositeLData.right = new FormAttachment(991, 1000, 0);
		buttonCompositeLData.top = new FormAttachment(885, 1000, 0);
		buttonCompositeLData.bottom = new FormAttachment(1000, 1000, -7);
		return buttonCompositeLData;
	}

	private void createAcceptDecisionButton() {
		acceptButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);
		setAcceptDecisionButtonLayout();
		acceptButton.setText("Accept Decision");
		acceptButton.setEnabled(false);
	}

	private void setAcceptDecisionButtonLayout() {
		FormData acceptButtonLData = new FormData();
		acceptButtonLData.width = 126;
		acceptButtonLData.height = 28;
		acceptButtonLData.left = new FormAttachment(285, 1000, 0);
		acceptButtonLData.right = new FormAttachment(461, 1000, 0);
		acceptButtonLData.top = new FormAttachment(178, 1000, 0);
		acceptButtonLData.bottom = new FormAttachment(845, 1000, 0);
		acceptButton.setLayoutData(acceptButtonLData);
	}

	private void createDeclineDecisionButton() {
		declineButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);
		setDeclineDecisionButtonLayout();
		declineButton.setText("Decline Decision");
		declineButton.setEnabled(false);
	}

	private void setDeclineDecisionButtonLayout() {
		FormData declineButtonLData = new FormData();
		declineButtonLData.width = 133;
		declineButtonLData.height = 28;
		declineButtonLData.left = new FormAttachment(530, 1000, 0);
		declineButtonLData.right = new FormAttachment(716, 1000, 0);
		declineButtonLData.top = new FormAttachment(178, 1000, 0);
		declineButtonLData.bottom = new FormAttachment(845, 1000, 0);
		declineButton.setLayoutData(declineButtonLData);
	}

	private void createCalculateDecisionButton() {
		decisionButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);
		setCalculateDecisionButtonLayout();
		decisionButton.setText("Calculate Decision");
		decisionButton.setAlignment(SWT.CENTER);
		decisionButton.setEnabled(false);
	}

	private void setCalculateDecisionButtonLayout() {
		FormData decisionButtonLData = new FormData();
		decisionButtonLData.width = 140;
		decisionButtonLData.height = 28;
		decisionButtonLData.left = new FormAttachment(30, 1000, 0);
		decisionButtonLData.right = new FormAttachment(226, 1000, 0);
		decisionButtonLData.top = new FormAttachment(178, 1000, 0);
		decisionButtonLData.bottom = new FormAttachment(845, 1000, 0);
		decisionButton.setLayoutData(decisionButtonLData);
	}

	private void createChartDataButton() {
		chartButton = new Button(buttonComposite, SWT.PUSH | SWT.CENTER);
		setChartDataButtonLayout();
		chartButton.setText("Charting Only");
		chartButton.setEnabled(false);
	}

	private void setChartDataButtonLayout() {
		FormData chartButtonLData = new FormData();
		chartButtonLData.width = 112;
		chartButtonLData.height = 28;
		chartButtonLData.left = new FormAttachment(794, 1000, 0);
		chartButtonLData.right = new FormAttachment(951, 1000, 0);
		chartButtonLData.top = new FormAttachment(178, 1000, 0);
		chartButtonLData.bottom = new FormAttachment(845, 1000, 0);
		chartButton.setLayoutData(chartButtonLData);
	}

	public void turnOffAllButtons() {
		acceptButton.setEnabled(false);
		chartButton.setEnabled(false);
		decisionButton.setEnabled(false);
		declineButton.setEnabled(false);
	}

	public final void setAcceptDeclineOn() {
		getAcceptButton().setEnabled(true);
		getChartButton().setEnabled(false);
		getDecisionButton().setEnabled(false);
		getDeclineButton().setEnabled(true);
	}

	public final void setAcceptDeclineOff() {
		getAcceptButton().setEnabled(false);
		getChartButton().setEnabled(true);
		getDecisionButton().setEnabled(true);
		getDeclineButton().setEnabled(false);
	}
	
	public  boolean allRequiredFieldsFilledIn(){
		//TODO This needs to be overridden for each domain specific editor.
		// It may be better to use some kind of injection on this.
		return false;
	};
	
	public Button getDecisionButton() {
		return decisionButton;
	}

	public Button getAcceptButton() {
		return acceptButton;
	}

	public Button getDeclineButton() {
		return declineButton;
	}

	public Button getChartButton() {
		return chartButton;
	}

}
