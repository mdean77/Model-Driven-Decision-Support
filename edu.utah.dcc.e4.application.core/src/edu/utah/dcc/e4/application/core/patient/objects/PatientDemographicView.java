package edu.utah.dcc.e4.application.core.patient.objects;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

//
//import java.text.DecimalFormat;
//
//import org.eclipse.core.commands.ExecutionException;
//import org.eclipse.core.commands.NotEnabledException;
//import org.eclipse.core.commands.NotHandledException;
//import org.eclipse.core.commands.common.NotDefinedException;
//import org.eclipse.jface.resource.FontRegistry;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.custom.CLabel;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.graphics.FontData;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.handlers.IHandlerService;
//import org.eclipse.ui.part.ViewPart;
//import com.swtdesigner.SWTResourceManager;
////import core.patient.object.IPatientsListener;
////import core.patient.object.Patient;
////import edu.utah.cdmcc.decisionsupport.controller.core.ApplicationControllers;
//
//import application.Patient;
//
//public class PatientDemographicView extends ViewPart implements IPatientsListener {
//	public PatientDemographicView() {
//	}
public class PatientDemographicView {
	
//	@Inject
//	public PatientDemographicView(Composite parent){
//		// TODO remove this constructor after I figure out DI
//	}
		
		
//
	private CLabel weightText;
	private CLabel heightText;
	private CLabel birthdateText;
	private CLabel medRecText;
	private CLabel patientNameText;
	private int x = 10, y = 10, width = 120, height = 25;
	private Button selectPatientButton;
	private LocalResourceManager resManager;
	
//	public static final String ID = "edu.utah.cdmcc.decisionsupport.views.PatientDemographicView";
//
	@PostConstruct
	public void createPartControl(Composite parent) {

		//ApplicationControllers.getPatientController().addPatientsListener(this);
		
		final Composite composite = new Composite(parent, SWT.NONE);
		resManager = new LocalResourceManager(JFaceResources.getResources(), composite);
		setupPatientName(composite);
		setupMedicalRecNumber(composite);
		setupBirthdate(composite);
		setupHeight(composite);
		setupWeight(composite);

		selectPatientButton = new Button(composite, SWT.NONE);
//		selectPatientButton.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(final SelectionEvent e) {
//				IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class);
//				try {
//					handlerService.executeCommand("edu.utah.cdmcc.commands.SelectPatient", null);
//				} catch (ExecutionException e1) {
//					e1.printStackTrace();
//				} catch (NotDefinedException e1) {
//					e1.printStackTrace();
//				} catch (NotEnabledException e1) {
//					e1.printStackTrace();
//				} catch (NotHandledException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
		selectPatientButton.setToolTipText("Select or change  active patient");
//		if (ApplicationControllers.getPatientController().getActivePatient() == null) {
			selectPatientButton.setText("Select Active Patient");
//		} else {
//			selectPatientButton.setText("Change Active Patient");
//		}
		selectPatientButton.setBounds(10, 164, 240, 28);
		initPatientFields();
	}
//	
//	public void patientsChanged(Patient patient) {
//		if (patient == null && !patientNameText.getText().equals("Select a patient")){
//			// do nothing - leave old patient settings in place
//		} else if (patient == null)
//			initPatientFields();			
//		else
//			refreshFields(patient);
//	}
//
//	public void refreshFields(Patient patient) {
//		DecimalFormat formatter = new DecimalFormat("###.##");
//		patientNameText.setText(patient.getName());
//		medRecText.setText(patient.getMedRecNum());
//		birthdateText.setText(patient.getBirthdateString());
//		weightText.setText(formatter.format(patient.getWeight()));
//		//weightText.setText(patient.getWeight().toString());
//		heightText.setText(formatter.format(patient.getHeight()));
//		//heightText.setText(patient.getHeight().toString());
//		selectPatientButton.setText("Change Active Patient");
//	}
//
	public void initPatientFields() {
		patientNameText.setText("Select a patient");
		medRecText.setText("123-34-345");
		birthdateText.setText("September 24, 1989");
		weightText.setText("4.5");
		heightText.setText("134");
		selectPatientButton.setText("Select Active Patient");
	}
//	
	private void setupWeight(Composite composite) {
		final CLabel weightLabel = new CLabel(composite, SWT.NONE);
		weightLabel.setAlignment(SWT.RIGHT);
		weightLabel.setBounds(x, y + height * 4, width, height);
		weightLabel.setText("Weight (kg):");

		weightText = new CLabel(composite, SWT.NONE);
		weightText.setAlignment(SWT.LEFT);
		weightText.setText("");
		weightText.setBounds(x + width, y + height * 4, width, height);
	}
//
	private void setupHeight( Composite composite) {
		final CLabel heightLabel = new CLabel(composite, SWT.NONE);
		heightLabel.setAlignment(SWT.RIGHT);
		heightLabel.setBounds(x, y + height * 3, width, height);
		heightLabel.setText("Height (cm):");

		heightText = new CLabel(composite, SWT.NONE);
		heightText.setAlignment(SWT.LEFT);
		heightText.setText("");
		heightText.setBounds(x + width, y + height * 3, width, height);
	}
//
	private void setupBirthdate( Composite composite) {
		final CLabel birthdateLabel = new CLabel(composite, SWT.NONE);
		birthdateLabel.setAlignment(SWT.RIGHT);
		birthdateLabel.setBounds(x, y + height * 2, width, height);
		birthdateLabel.setText("Date of Birth:");

		birthdateText = new CLabel(composite, SWT.NONE);
		birthdateText.setAlignment(SWT.LEFT);
		birthdateText.setText("");
		birthdateText.setBounds(130, 60, 142, 25);
	}
//
	private void setupMedicalRecNumber( Composite composite) {
		final CLabel medRecLabel = new CLabel(composite, SWT.NONE);
		medRecLabel.setAlignment(SWT.RIGHT);
		medRecLabel.setBounds(x, y + height, width, height);
		medRecLabel.setText("Medical Record:");

		medRecText = new CLabel(composite, SWT.NONE);
		medRecText.setAlignment(SWT.LEFT);
		medRecText.setText("");
		medRecText.setBounds(x + width, y + height, width, height);
	}
//
	private void setupPatientName( Composite composite) {
		FontRegistry fontRegistry = new FontRegistry();
		fontRegistry.put("patientname", new FontData[] { new FontData("Lucida Grande", 18, SWT.NORMAL) });

		patientNameText = new CLabel(composite, SWT.NONE);
		patientNameText.setAlignment(SWT.CENTER);
		patientNameText.setText("Select a patient");
		Font font = resManager.createFont(FontDescriptor.createFrom("Lucida Grande", 18, SWT.BOLD));
		patientNameText.setFont(font);
		patientNameText.setBounds(x, y, width * 2, height);
	}
//
@Focus
public void setFocus() {
	patientNameText.setFocus();
	}
}
