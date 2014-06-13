package edu.utah.dcc.e4.ventilator.parts;

import java.util.Calendar;
import java.util.GregorianCalendar;



import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.swt.widgets.Composite;


import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.DateTime;








import com.swtdesigner.SWTResourceManager;










import edu.utah.dcc.e4.ui.core.parts.DecisionFragmentPart;

import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;

@SuppressWarnings("unused")
public class VentilatorFieldsAddedToDomainComposite extends
	DecisionFragmentPart {

	private DateTime observationTime;
	private Label observationTimeLabel;
	private DateTime observationDate;
	private Label observationDateLabel;
	private Button refreshDataButton;
	private Text text;
	private Text pHText;
	private Text paO2Text;
	private Text pCO2Text;
	private Text inspiredO2Text;
	private Text meanAirwayPressureText;
	private Text saturationO2Text;
	private Text ventilatorRateText;
	private Text tidalVolumeText;
	private Text peepText;
	private Text pipText;
	private Text pHText_2;
	private Text paO2Text_2;
	private Text pCO2Text_2;
	private Text inspiredO2Text_2;
	private Text meanAirwayPressureText_2;
	private Text saturationO2Text_2;
	private Text ventilatorRateText_2;
	private Text tidalVolumeText_2;
	private Text peepText_2;
	private Text pipText_2;
	private Text pHText_3;
	private Text paO2Text_3;
	private Text pCO2Text_3;
	private Text inspiredO2Text_3;
	private Text saturationO2Text_3;
	private Text meanAirwayPressureText_3;
	private Text frequencyText_3;
	private Text amplitudeText_3;
	private Text pHText_4;
	private Text paO2Text_4;
	private Text pCO2Text_4;
	private Text inspiredO2Text_4;
	private Text saturationO2Text_4;
	private Text meanAirwayPressureText_4;
	private Text ventilatorRateText_4;
	private Text tidalVolumeText_4;
	private Text peepText_4;
	private Text plateauPressureText_4;
	private CTabFolder ventilatorTabFolder;
	private Button btnPressureControl;
	private CTabItem tbtmVolumeControl;
	private CTabItem tbtmHighFrequency;
	private CTabItem tbtmPressureRegulatedVc;
	private CTabItem tbtmPressureControl;
	protected CTabItem[] tabs;
	private Button btnPrvc;
	private Button btnHfov;
	private Button btnVolumeControl;
	private Button btnNewAbg;
	private Label lblLastDate_pH_2;
	private Label lblLastDate_PaO2_2;
	private Label lblLastDate_PCO2_2;
	private Label lblLastDate_pH;
	private Label lblLastDate_PaO2;
	private Label lblLastDate_PCO2;
	private Label lblLastDate_pH_3;
	private Label lblLastDate_PaO2_3;
	private Label lblLastDate_PCO2_3;
	private Label lblLastDate_pH_4;
	private Label lblLastDate_PaO2_4;
	private Label lblLastDate_PCO2_4;
	private Label tidalVolumePerKgLabel;
	private Label tidalVolumePerKgLabel4;
	private Label tidalVolumePerKgLabel2;
	
	/*
	 
	static Logger log = Logger
			.getLogger(VentilatorFieldsAddedToDomainComposite.class);
			*/
	static private int numColumns = 6;
	static private int normalFontSize = 11;
	static private int smallFontSize = 9;
	private Button btnExtubated;
	private CTabItem tbtmExtubated;
	private Composite composite_1;
	private Text pHText_5;
	private Text paO2Text_5;
	private Text pCO2Text_5;
	private Label labelLastPco2_5;
	private Label labelLastPh_5;
	private Label labelLastPo2_5;
	private Text inspiredO2Text_5;
	private Text saturationO2Text_5;
	private Label label_4;
	private Color required = SWTResourceManager.getColor(255, 255, 153);
	private Group ventilatorModeGroup;
	private Text endTidalCO2Text_4;
	private Text endTidalCO2Text_2;
	private Text endTidalCO2Text;
  private Composite domainFieldsComposite;

  
  @Inject IStylingEngine engine;
  
	@Inject
	public VentilatorFieldsAddedToDomainComposite(Composite part) {
		super(part);
		//super.createControls(parent);
		//getDecisionText().setFont(SWTResourceManager.getFont("Tahoma", 10, SWT.NORMAL));
		//TODO We need to put a menu item in the program that will let the user make font bigger or smaller
		//     The setting KS put in here is actually SMALLER on the Mac and looks terrible.  I think that
		//     SWT selects fonts that are designed for each native so there needs to be a more general solution.
		
		
		domainFieldsComposite = new Composite(this.getParentSashForm(), 0);
		domainFieldsComposite.setLayout(new FormLayout());
		
		Composite composite = createTopComposite();

		FormData fd_group = createVentilatorRadioGroup(composite);

		createVentilatorTabFolder(composite, fd_group);
		createPressureControlVentilatorPanel();
		createPressureRegulatedVentilatorPanel();
		createHighFrequencyVentilatorPanel();
		createVolumeControlVentilatorPanel();
		createExtubatedPanel();

		super.moveToTop(domainFieldsComposite);
	}


	@PostConstruct
	public void postConstruct() 
	{
	  addTheme(engine);
	}

	private void createVentilatorTabFolder(Composite composite,
			FormData fd_group) {
		ventilatorTabFolder = new CTabFolder(domainFieldsComposite, SWT.NONE);
		ventilatorTabFolder
				.setToolTipText("Editors for respective modes of ventilation");
		ventilatorTabFolder.setBorderVisible(true);
		fd_group.bottom = new FormAttachment(ventilatorTabFolder, 0, SWT.BOTTOM);
		fd_group.right = new FormAttachment(ventilatorTabFolder, -6);

		FormData fd_tabFolder = new FormData();
		fd_tabFolder.left = new FormAttachment(0, 163);
		fd_tabFolder.right = new FormAttachment(100, -10);
		fd_tabFolder.top = new FormAttachment(composite, 6);
		fd_tabFolder.bottom = new FormAttachment(100, 0);
		ventilatorTabFolder.setLayoutData(fd_tabFolder);

		ventilatorTabFolder.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (ventilatorTabFolder.getSelection().equals(
						tbtmPressureControl)) {
					clearModeGroupButtons();
					btnPressureControl.setSelection(true);
				}
				if (ventilatorTabFolder.getSelection().equals(
						tbtmPressureRegulatedVc)) {
					clearModeGroupButtons();
					btnPrvc.setSelection(true);
				}
				if (ventilatorTabFolder.getSelection()
						.equals(tbtmHighFrequency)) {
					clearModeGroupButtons();
					btnHfov.setSelection(true);
				}
				if (ventilatorTabFolder.getSelection()
						.equals(tbtmVolumeControl)) {
					clearModeGroupButtons();
					btnVolumeControl.setSelection(true);
				}
				if (ventilatorTabFolder.getSelection()
						.equals(tbtmExtubated)) {
					clearModeGroupButtons();
					btnExtubated.setSelection(true);
				}
				//enableCorrectButtonCombination();
			}
		});
	}


	private void createVolumeControlVentilatorPanel() {
		GridData gd_bloodGasDateTime;
		tbtmVolumeControl = new CTabItem(ventilatorTabFolder, SWT.NONE);
		tbtmVolumeControl.setText("Volume Control");

		Composite composite_VolumeControl = new Composite(ventilatorTabFolder,
				SWT.NONE);
		tbtmVolumeControl.setControl(composite_VolumeControl);
		composite_VolumeControl.setLayout(new GridLayout(numColumns, true));

		makePhLabel(composite_VolumeControl);

		pHText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		pHText_4.setEditable(false);
		//pHText_4.setBackground(required);
		pHText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		makePaO2Label(composite_VolumeControl);

		paO2Text_4 = new Text(composite_VolumeControl, SWT.BORDER);
		paO2Text_4.setEditable(false);
		//paO2Text_4.setBackground(required);
		paO2Text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		makePco2Label(composite_VolumeControl);

		pCO2Text_4 = new Text(composite_VolumeControl, SWT.BORDER);
		pCO2Text_4.setEditable(false);
		pCO2Text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		
		new Label(composite_VolumeControl, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_pH_4 = new Label(composite_VolumeControl, SWT.NONE);
		lblLastDate_pH_4.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_pH_4.setText("Last Date");
		lblLastDate_pH_4.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		
		new Label(composite_VolumeControl, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PaO2_4 = new Label(composite_VolumeControl, SWT.NONE);
		lblLastDate_PaO2_4.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PaO2_4.setText("Last Date");
		lblLastDate_PaO2_4.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		new Label(composite_VolumeControl, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PCO2_4 = new Label(composite_VolumeControl, SWT.NONE);
		lblLastDate_PCO2_4.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PCO2_4.setText("Last Date");
		lblLastDate_PCO2_4.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));

		makeFiO2Label(composite_VolumeControl);

		inspiredO2Text_4 = new Text(composite_VolumeControl, SWT.BORDER);
		inspiredO2Text_4.setBackground(SWTResourceManager.getColor(255, 255,
				153));
		inspiredO2Text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(inspiredO2Text_4);
		inspiredO2Text_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireOxygenChanged(inspiredO2Text_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeSatLabel(composite_VolumeControl);

		saturationO2Text_4 = new Text(composite_VolumeControl, SWT.BORDER);
		saturationO2Text_4.setBackground(SWTResourceManager.getColor(255, 255,
				153));
		saturationO2Text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(saturationO2Text_4);
		saturationO2Text_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireSaturationChanged(saturationO2Text_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeEndTidalLabel(composite_VolumeControl);
	
		endTidalCO2Text_4 = new Text(composite_VolumeControl, SWT.BORDER);
		endTidalCO2Text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(endTidalCO2Text_4);
		endTidalCO2Text_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireEndTidalCO2Changed(endTidalCO2Text_4.getText());
			}		
			public void focusGained(FocusEvent e) {
			}
		});

		makeVentilatorRateLabel(composite_VolumeControl);

		ventilatorRateText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		ventilatorRateText_4.setBackground(SWTResourceManager.getColor(255,
				255, 153));
		ventilatorRateText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(ventilatorRateText_4);
		ventilatorRateText_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireVentilatorRateChanged(ventilatorRateText_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeTidalVolumeLabel(composite_VolumeControl);

		tidalVolumeText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		tidalVolumeText_4.setBackground(SWTResourceManager.getColor(255, 255,
				153));
		tidalVolumeText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(tidalVolumeText_4);
		tidalVolumeText_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireTidalVolumeChanged(tidalVolumeText_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		tidalVolumePerKgLabel4 = new Label(composite_VolumeControl, SWT.NONE);
		tidalVolumePerKgLabel4.setText("(Calculated ml/kg)");
		tidalVolumePerKgLabel4.setFont(SWTResourceManager
				.getFont("Lucida Grande", smallFontSize, SWT.NORMAL));
		
		new Label(composite_VolumeControl, SWT.NONE);

		makePeepLabel(composite_VolumeControl);

		peepText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		peepText_4.setBackground(required);
		peepText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(peepText_4);
		peepText_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				firePeepChanged(peepText_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		Label lblPlateauPressure = new Label(composite_VolumeControl, SWT.NONE);
		lblPlateauPressure.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblPlateauPressure.setText("Plateau Pressure:");

		plateauPressureText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		plateauPressureText_4.setBackground(SWTResourceManager.getColor(255,
				255, 153));
		plateauPressureText_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(plateauPressureText_4);
		
		makeMeanAirwayPressureLabel(composite_VolumeControl);

		meanAirwayPressureText_4 = new Text(composite_VolumeControl, SWT.BORDER);
		meanAirwayPressureText_4.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		addListenersToTextField(meanAirwayPressureText_4);
		meanAirwayPressureText_4.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireAirwayPressureChanged(meanAirwayPressureText_4.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		

		new Label(composite_VolumeControl, SWT.NONE);
		new Label(composite_VolumeControl, SWT.NONE);
		new Label(composite_VolumeControl, SWT.NONE);
		new Label(composite_VolumeControl, SWT.NONE);
		
		
	}



	private void createHighFrequencyVentilatorPanel() {
		GridData gd_bloodGasDateTime;
		tbtmHighFrequency = new CTabItem(ventilatorTabFolder, SWT.NONE);
		tbtmHighFrequency.setText("High Frequency Oscillatory");

		Composite composite_HFOV = new Composite(ventilatorTabFolder, SWT.NONE);
		tbtmHighFrequency.setControl(composite_HFOV);
		composite_HFOV.setLayout(new GridLayout(numColumns, true));

		makePhLabel(composite_HFOV);

		pHText_3 = new Text(composite_HFOV, SWT.BORDER);
		pHText_3.setEditable(false);
		//pHText_3.setBackground(required);
		pHText_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		makePaO2Label(composite_HFOV);

		paO2Text_3 = new Text(composite_HFOV, SWT.BORDER);
		paO2Text_3.setEditable(false);
		//paO2Text_3.setBackground(required);
		paO2Text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		makePco2Label(composite_HFOV);

		pCO2Text_3 = new Text(composite_HFOV, SWT.BORDER);
		pCO2Text_3.setEditable(false);
		pCO2Text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		new Label(composite_HFOV, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_pH_3 = new Label(composite_HFOV, SWT.NONE);
		lblLastDate_pH_3
				.setToolTipText("time of the most recent pH measurement");
		lblLastDate_pH_3.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_pH_3.setText("Last Date");
		lblLastDate_pH_3.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		new Label(composite_HFOV, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PaO2_3 = new Label(composite_HFOV, SWT.NONE);
		lblLastDate_PaO2_3
				.setToolTipText("time of the most recent PaO2 measurement");
		lblLastDate_PaO2_3.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PaO2_3.setText("Last Date");
		lblLastDate_PaO2_3.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		new Label(composite_HFOV, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PCO2_3 = new Label(composite_HFOV, SWT.NONE);
		lblLastDate_PCO2_3
				.setToolTipText("time of the most recent PCO2 measurement");
		lblLastDate_PCO2_3.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PCO2_3.setText("Last Date");
		lblLastDate_PCO2_3.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));

		makeFiO2Label(composite_HFOV);

		inspiredO2Text_3 = new Text(composite_HFOV, SWT.BORDER);
		inspiredO2Text_3.setEnabled(true);
		inspiredO2Text_3.setBackground(SWTResourceManager.getColor(255, 255,
				153));
		inspiredO2Text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(inspiredO2Text_3);
		inspiredO2Text_3.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireOxygenChanged(inspiredO2Text_3.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeSatLabel(composite_HFOV);

		saturationO2Text_3 = new Text(composite_HFOV, SWT.BORDER);
		saturationO2Text_3.setEnabled(true);
		saturationO2Text_3.setBackground(required);
		saturationO2Text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(saturationO2Text_3);
		saturationO2Text_3.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireSaturationChanged(saturationO2Text_3.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		new Label(composite_HFOV, SWT.NONE);
		new Label(composite_HFOV, SWT.NONE);

		Label lblFrequency_3 = new Label(composite_HFOV, SWT.NONE);
		lblFrequency_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblFrequency_3.setText("Frequency (Hz):");

		frequencyText_3 = new Text(composite_HFOV, SWT.BORDER);
		frequencyText_3.setEnabled(true);
		frequencyText_3.setBackground(required);
		frequencyText_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(frequencyText_3);

		Label lblAmplitude_3 = new Label(composite_HFOV, SWT.NONE);
		lblAmplitude_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAmplitude_3.setText("Amplitude:");

		amplitudeText_3 = new Text(composite_HFOV, SWT.BORDER);
		amplitudeText_3.setEnabled(true);
		amplitudeText_3.setBackground(required);
		amplitudeText_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(amplitudeText_3);

		makeMeanAirwayPressureLabel(composite_HFOV);

		meanAirwayPressureText_3 = new Text(composite_HFOV, SWT.BORDER);
		meanAirwayPressureText_3.setEnabled(true);
		meanAirwayPressureText_3
				.setBackground(required);
		meanAirwayPressureText_3.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		addListenersToTextField(meanAirwayPressureText_3);
		meanAirwayPressureText_3.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireAirwayPressureChanged(meanAirwayPressureText_3.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		

	}

	private void setColorRequired(Text text) {
		text.setBackground(required);
	}

	private void createPressureRegulatedVentilatorPanel() {
		GridData gd_bloodGasDateTime;
		tbtmPressureRegulatedVc = new CTabItem(ventilatorTabFolder, SWT.NONE);
		tbtmPressureRegulatedVc.setText("Pressure Regulated VC");

		Composite composite_PRVC = new Composite(ventilatorTabFolder, SWT.NONE);
		tbtmPressureRegulatedVc.setControl(composite_PRVC);
		composite_PRVC.setLayout(new GridLayout(numColumns, true));

		makePhLabel(composite_PRVC);

		pHText_2 = new Text(composite_PRVC, SWT.BORDER);
		pHText_2.setEditable(false);
		pHText_2.setToolTipText("pH from the most recent Arterial Blood Gas");
		//setColorRequired(pHText_2);
		pHText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		makePaO2Label(composite_PRVC);

		paO2Text_2 = new Text(composite_PRVC, SWT.BORDER);
		paO2Text_2.setEditable(false);
		//setColorRequired(paO2Text_2);
		paO2Text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		makePco2Label(composite_PRVC);

		pCO2Text_2 = new Text(composite_PRVC, SWT.BORDER);
		pCO2Text_2.setEditable(false);
		pCO2Text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		new Label(composite_PRVC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_pH_2 = new Label(composite_PRVC, SWT.NONE);
		lblLastDate_pH_2
				.setToolTipText("time of the most recent pH measurement");
		lblLastDate_pH_2.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_pH_2.setText("Last Date");
		lblLastDate_pH_2.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		new Label(composite_PRVC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PaO2_2 = new Label(composite_PRVC, SWT.NONE);
		lblLastDate_PaO2_2
				.setToolTipText("time of the most recent PaO2 measurement");
		lblLastDate_PaO2_2.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PaO2_2.setText("Last Date");
		lblLastDate_PaO2_2.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		new Label(composite_PRVC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PCO2_2 = new Label(composite_PRVC, SWT.NONE);
		lblLastDate_PCO2_2
				.setToolTipText("time of the most recent PCO2 measurement");
		lblLastDate_PCO2_2.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PCO2_2.setText("Last Date");
		lblLastDate_PCO2_2.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));

		makeFiO2Label(composite_PRVC);

		inspiredO2Text_2 = new Text(composite_PRVC, SWT.BORDER);
		inspiredO2Text_2.setEnabled(true);
		inspiredO2Text_2.setToolTipText("FiO2 as a decimal number");
		setColorRequired(inspiredO2Text_2);
		inspiredO2Text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(inspiredO2Text_2);
		inspiredO2Text_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireOxygenChanged(inspiredO2Text_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeSatLabel(composite_PRVC);

		saturationO2Text_2 = new Text(composite_PRVC, SWT.BORDER);
		saturationO2Text_2.setEnabled(true);
		saturationO2Text_2.setToolTipText("O2 sat from the pulse oximeter");
		setColorRequired(saturationO2Text_2);
		saturationO2Text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(saturationO2Text_2);
		saturationO2Text_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireSaturationChanged(saturationO2Text_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeEndTidalLabel(composite_PRVC);
		
		endTidalCO2Text_2 = new Text(composite_PRVC, SWT.BORDER);
		endTidalCO2Text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(endTidalCO2Text_2);
		endTidalCO2Text_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireEndTidalCO2Changed(endTidalCO2Text_2.getText());
			}		
			public void focusGained(FocusEvent e) {
			}
		});

		makeVentilatorRateLabel(composite_PRVC);

		ventilatorRateText_2 = new Text(composite_PRVC, SWT.BORDER);
		ventilatorRateText_2.setEnabled(true);
		setColorRequired(ventilatorRateText_2);
		ventilatorRateText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(ventilatorRateText_2);
		ventilatorRateText_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireVentilatorRateChanged(ventilatorRateText_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeTidalVolumeLabel(composite_PRVC);

		tidalVolumeText_2 = new Text(composite_PRVC, SWT.BORDER);
		tidalVolumeText_2.setEnabled(true);
		setColorRequired(tidalVolumeText_2);
		tidalVolumeText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(tidalVolumeText_2);
		tidalVolumeText_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireTidalVolumeChanged(tidalVolumeText_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		tidalVolumePerKgLabel2 = new Label(composite_PRVC, SWT.NONE);
		tidalVolumePerKgLabel2.setFont(SWTResourceManager
				.getFont("Lucida Grande", smallFontSize, SWT.NORMAL));
		tidalVolumePerKgLabel2.setText("(Calculated ml/kg)");
		new Label(composite_PRVC, SWT.NONE);

		makePeepLabel(composite_PRVC);

		peepText_2 = new Text(composite_PRVC, SWT.BORDER);
		peepText_2.setEnabled(true);
		setColorRequired(peepText_2);
		peepText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(peepText_2);
		peepText_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				firePeepChanged(peepText_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		Label lblPip_2 = new Label(composite_PRVC, SWT.NONE);
		lblPip_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblPip_2.setText("PIP:");

		pipText_2 = new Text(composite_PRVC, SWT.BORDER);
		pipText_2.setEnabled(true);
		setColorRequired(pipText_2);
		pipText_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		addListenersToTextField(pipText_2);
		pipText_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				firePipChanged(pipText_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeMeanAirwayPressureLabel(composite_PRVC);

		meanAirwayPressureText_2 = new Text(composite_PRVC, SWT.BORDER);
		meanAirwayPressureText_2.setEnabled(true);
		meanAirwayPressureText_2.setToolTipText("Mean Airway Pressure");
		meanAirwayPressureText_2.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		addListenersToTextField(meanAirwayPressureText_2);
		meanAirwayPressureText_2.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireAirwayPressureChanged(meanAirwayPressureText_2.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		

		new Label(composite_PRVC, SWT.NONE);
		new Label(composite_PRVC, SWT.NONE);
		new Label(composite_PRVC, SWT.NONE);
		new Label(composite_PRVC, SWT.NONE);
	}

	private void createPressureControlVentilatorPanel() {
		GridData gd_bloodGasDateTime;
		tbtmPressureControl = new CTabItem(ventilatorTabFolder, SWT.NONE);
		tbtmPressureControl.setText("Pressure Control");

		Composite composite_PC = new Composite(ventilatorTabFolder, SWT.NONE);
		tbtmPressureControl.setControl(composite_PC);
		composite_PC.setLayout(new GridLayout(numColumns, true));

		makePhLabel(composite_PC);

		pHText = new Text(composite_PC, SWT.BORDER);
		pHText.setEditable(false);
		pHText.setToolTipText("pH from the most recent Arterial Blood Gas");
		//setColorRequired(pHText);
		pHText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));

		makePaO2Label(composite_PC);

		paO2Text = new Text(composite_PC, SWT.BORDER);
		paO2Text.setEditable(false);
		paO2Text.setToolTipText("PaO2 from the most recent Arterial Blood Gas");
		//setColorRequired(paO2Text);
		paO2Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		makePco2Label(composite_PC);

		pCO2Text = new Text(composite_PC, SWT.BORDER);
		pCO2Text.setEditable(false);
		pCO2Text.setToolTipText("pCO2 from the most recent Arterial Blood Gas");
		pCO2Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		new Label(composite_PC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_pH = new Label(composite_PC, SWT.NONE);
		lblLastDate_pH.setToolTipText("time of the most recent pH measurement");
		lblLastDate_pH.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_pH.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		lblLastDate_pH.setText("Last Date");
		new Label(composite_PC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;

		lblLastDate_PaO2 = new Label(composite_PC, SWT.NONE);
		lblLastDate_PaO2
				.setToolTipText("time of the most recent PaO2 measurement");
		lblLastDate_PaO2.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PaO2.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		lblLastDate_PaO2.setText("Last Date");
		new Label(composite_PC, SWT.NONE);

		gd_bloodGasDateTime = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_bloodGasDateTime.widthHint = 75;
		lblLastDate_PCO2 = new Label(composite_PC, SWT.NONE);
		lblLastDate_PCO2
				.setToolTipText("time of the most recent PCO2 measurement");
		lblLastDate_PCO2.setLayoutData(gd_bloodGasDateTime);
		lblLastDate_PCO2.setFont(SWTResourceManager.getFont("Lucida Grande",
				smallFontSize, SWT.NORMAL));
		lblLastDate_PCO2.setText("Last Date");

		makeFiO2Label(composite_PC);

		inspiredO2Text = new Text(composite_PC, SWT.BORDER);
		inspiredO2Text.setEnabled(true);
		inspiredO2Text.setToolTipText("FiO2 as a decimal number");
		setColorRequired(inspiredO2Text);
		inspiredO2Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(inspiredO2Text);
		inspiredO2Text.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireOxygenChanged(inspiredO2Text.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeSatLabel(composite_PC);

		saturationO2Text = new Text(composite_PC, SWT.BORDER);
		saturationO2Text.setEnabled(true);
		saturationO2Text.setEditable(false);
		saturationO2Text.setToolTipText("SpO2 Disabled for Lamb Ventilator");
		//setColorRequired(saturationO2Text);
		saturationO2Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(saturationO2Text);
		saturationO2Text.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireSaturationChanged(saturationO2Text.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeEndTidalLabel(composite_PC);

		endTidalCO2Text = new Text(composite_PC, SWT.BORDER);
		endTidalCO2Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(endTidalCO2Text);
		endTidalCO2Text.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireEndTidalCO2Changed(endTidalCO2Text.getText());
			}		
			public void focusGained(FocusEvent e) {
			}
		});

		makeVentilatorRateLabel(composite_PC);

		ventilatorRateText = new Text(composite_PC, SWT.BORDER);
		ventilatorRateText.setEnabled(true);
		setColorRequired(ventilatorRateText);
		ventilatorRateText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(ventilatorRateText);
		ventilatorRateText.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireVentilatorRateChanged(ventilatorRateText.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});

		makeTidalVolumeLabel(composite_PC);

		tidalVolumeText = new Text(composite_PC, SWT.BORDER);
		tidalVolumeText.setEnabled(true);
		tidalVolumeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		addListenersToTextField(tidalVolumeText);
		tidalVolumeText.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireTidalVolumeChanged(tidalVolumeText.getText());
			}

			public void focusGained(FocusEvent e) {
			}
		});

		tidalVolumePerKgLabel = new Label(composite_PC, SWT.NONE);
		tidalVolumePerKgLabel.setFont(SWTResourceManager
				.getFont("Lucida Grande", smallFontSize, SWT.NORMAL));
		tidalVolumePerKgLabel.setText("(Calculated ml/kg)");
		tidalVolumePerKgLabel.setToolTipText("Calculated ml/kg");
		new Label(composite_PC, SWT.NONE);

		makePeepLabel(composite_PC);

		peepText = new Text(composite_PC, SWT.BORDER);
		peepText.setEnabled(true);
		setColorRequired(peepText);
		peepText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		addListenersToTextField(peepText);
		peepText.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				firePeepChanged(peepText.getText());
			}
			public void focusGained(FocusEvent e) {
			}
		});

		Label lblPip = new Label(composite_PC, SWT.NONE);
		lblPip.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblPip.setText("PIP:");

		pipText = new Text(composite_PC, SWT.BORDER);
		pipText.setEnabled(true);
		setColorRequired(pipText);
		pipText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		addListenersToTextField(pipText);
		pipText.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				firePipChanged(pipText.getText());
			}

			public void focusGained(FocusEvent e) {
			}
		});

		makeMeanAirwayPressureLabel(composite_PC);

		meanAirwayPressureText = new Text(composite_PC, SWT.BORDER);
		meanAirwayPressureText.setEnabled(true);
		meanAirwayPressureText.setToolTipText("Mean Airway Pressure");
		meanAirwayPressureText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		addListenersToTextField(meanAirwayPressureText);
		meanAirwayPressureText.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				fireAirwayPressureChanged(meanAirwayPressureText.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		

		new Label(composite_PC, SWT.NONE);
		new Label(composite_PC, SWT.NONE);
		new Label(composite_PC, SWT.NONE);
	}


	private void createExtubatedPanel() {
		tbtmExtubated = new CTabItem(ventilatorTabFolder, SWT.NONE);
		tbtmExtubated.setText("Extubated");
		
		composite_1 = new Composite(ventilatorTabFolder, SWT.NONE);
		tbtmExtubated.setControl(composite_1);
		composite_1.setLayout(new GridLayout(6, true));
		
//		label_4 = new Label(composite_1, SWT.NONE);
//		label_4.setText("pH:");
//		label_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		makePhLabel(composite_1);
		
		pHText_5 = new Text(composite_1, SWT.BORDER);
		pHText_5.setEditable(false);
		//pHText_5.setBackground(required);
		pHText_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
//		Label lblPao = new Label(composite_1, SWT.NONE);
//		lblPao.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lblPao.setText("PaO2:");
		
		makePaO2Label(composite_1);
		
		paO2Text_5 = new Text(composite_1, SWT.BORDER);
		paO2Text_5.setEditable(false);
		//paO2Text_5.setBackground(required);
		paO2Text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
//		Label lblPco = new Label(composite_1, SWT.NONE);
//		lblPco.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lblPco.setText("pCO2:");
		
		makePco2Label(composite_1);
		
		pCO2Text_5 = new Text(composite_1, SWT.BORDER);
		pCO2Text_5.setEditable(false);
		pCO2Text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_1, SWT.NONE);
		
		labelLastPh_5 = new Label(composite_1, SWT.NONE);
		labelLastPh_5.setText("Last Date");
		labelLastPh_5.setFont(SWTResourceManager.getFont("Lucida Grande", 9, SWT.NORMAL));
		new Label(composite_1, SWT.NONE);
		
		labelLastPo2_5 = new Label(composite_1, SWT.NONE);
		labelLastPo2_5.setText("Last Date");
		labelLastPo2_5.setFont(SWTResourceManager.getFont("Lucida Grande", 9, SWT.NORMAL));
		new Label(composite_1, SWT.NONE);
		
		labelLastPco2_5 = new Label(composite_1, SWT.NONE);
		GridData gd_labelLastPco2_5 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		gd_labelLastPco2_5.widthHint = 75;
		labelLastPco2_5.setLayoutData(gd_labelLastPco2_5);
		labelLastPco2_5.setText("Last Date");
		labelLastPco2_5.setFont(SWTResourceManager.getFont("Lucida Grande", 9, SWT.NORMAL));
		
//		Label lblFio = new Label(composite_1, SWT.NONE);
//		lblFio.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lblFio.setText("FiO2:");
		
		makeFiO2Label(composite_1);
		
		inspiredO2Text_5 = new Text(composite_1, SWT.BORDER);
		inspiredO2Text_5.setBackground(required);
		inspiredO2Text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		addListenersToTextField(inspiredO2Text_5);
		inspiredO2Text_5.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				System.out.println("Oxygen text field losing focus");
				fireOxygenChanged(inspiredO2Text_5.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		
//		Label lblSpo = new Label(composite_1, SWT.NONE);
//		lblSpo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
//		lblSpo.setText("SpO2:");
		
		makeSatLabel(composite_1);
		
		saturationO2Text_5 = new Text(composite_1, SWT.BORDER);
		saturationO2Text_5.setBackground(required);
		saturationO2Text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		addListenersToTextField(saturationO2Text_5);
		saturationO2Text_5.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				System.out.println("Saturation text field losing focus");
				fireSaturationChanged(saturationO2Text_5.getText());
			}

			
			public void focusGained(FocusEvent e) {
			}
		});
		
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
	}
	
	private FormData createVentilatorRadioGroup(Composite composite) {
		ventilatorModeGroup = new Group(domainFieldsComposite, SWT.NONE);
		FormData fd_group = new FormData();
		fd_group.left = new FormAttachment(0, 10);
		fd_group.top = new FormAttachment(composite, 6);
		ventilatorModeGroup.setLayoutData(fd_group);

		btnPressureControl = new Button(ventilatorModeGroup, SWT.RADIO);
		btnPressureControl.setBounds(10, 10, 113, 18);
		btnPressureControl.setText("Pressure Control");
		btnPressureControl.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ventilatorTabFolder.setSelection(tbtmPressureControl);
				//enableCorrectButtonCombination();
			}
		});

		btnPrvc = new Button(ventilatorModeGroup, SWT.RADIO);
		btnPrvc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ventilatorTabFolder.setSelection(tbtmPressureRegulatedVc);
				//enableCorrectButtonCombination();
			}
		});
		btnPrvc.setBounds(10, 34, 91, 18);
		btnPrvc.setText("PRVC");

		btnHfov = new Button(ventilatorModeGroup, SWT.RADIO);
		btnHfov.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ventilatorTabFolder.setSelection(tbtmHighFrequency);
				//enableCorrectButtonCombination();
			}
		});
		btnHfov.setBounds(10, 58, 91, 18);
		btnHfov.setText("HFOV");

		btnVolumeControl = new Button(ventilatorModeGroup, SWT.RADIO);
		btnVolumeControl.setBounds(10, 82, 113, 18);
		btnVolumeControl.setText("Volume Control");
		btnVolumeControl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ventilatorTabFolder.setSelection(tbtmVolumeControl);
				//enableCorrectButtonCombination();
			}
		});
		
		btnExtubated = new Button(ventilatorModeGroup, SWT.RADIO);
		btnExtubated.setText("Extubated");
		btnExtubated.setBounds(10, 108, 113, 18);		
		btnExtubated.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ventilatorTabFolder.setSelection(tbtmExtubated);
				//enableCorrectButtonCombination();
			}
		});
		
		return fd_group;
	}

	private Composite createTopComposite() {
		Composite composite = new Composite(domainFieldsComposite, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.right = new FormAttachment(100, -10);
		fd_composite.left = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new GridLayout(6, true));

		createDateTimeRefreshButton(composite);

		Label lblObservationDate = new Label(composite, SWT.HORIZONTAL
				| SWT.RIGHT);
		lblObservationDate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				true, false, 1, 1));
		lblObservationDate.setAlignment(SWT.CENTER);
		lblObservationDate.setText("Observation Date:");

		observationDate = new DateTime(composite, SWT.BORDER);

		Label lblTimehhmm = new Label(composite, SWT.RIGHT);
		lblTimehhmm.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true,
				false, 1, 1));
		lblTimehhmm.setText("Time (hh:mm):");

		observationTime = new DateTime(composite, SWT.BORDER | SWT.TIME);

		btnNewAbg = new Button(composite, SWT.NONE);

		GridData gd_btnNewAbg = new GridData(SWT.CENTER, SWT.CENTER, true,
				false, 1, 1);
		gd_btnNewAbg.widthHint = 77;
		btnNewAbg.setLayoutData(gd_btnNewAbg);
		btnNewAbg.setText("New ABG");
		return composite;
	}

	private void addListenersToTextField(Text text) {
		text.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				//Verify.verifyIntegerText(e);
			}
		});
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				//clearAdvice();
				//enableCorrectButtonCombination();
			}
		});
	}

	private void makePeepLabel(Composite composite) {
		makeLabel(composite,"PEEP:");
	}

	private void makeTidalVolumeLabel(Composite composite) {
		makeLabel(composite,"VT (total ml):");
	}

	private void makeVentilatorRateLabel(Composite composite) {
		makeLabel(composite,"Ventilator Rate:");
	}

	private void makeMeanAirwayPressureLabel(Composite composite) {
		makeLabel(composite,"MAP:");
	}

	private void makeSatLabel(Composite composite) {
		makeLabel(composite,"SpO2:");
	}
	
	private void makeEndTidalLabel(Composite composite){
		makeLabel(composite,"ETCO2");
	}

	private void makeFiO2Label(Composite composite) {
		makeLabel(composite,"FiO2:");
	}

	private void makePco2Label(Composite composite) {
		makeLabel(composite,"pCO2:");
	}

	private void makePaO2Label(Composite composite) {
		makeLabel(composite,"PaO2:");
	}

	private void makePhLabel(Composite composite) {
		makeLabel(composite, "pH:");
	}
	
	private void makeLabel(Composite composite, String string){
		Label label = new Label(composite, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label.setText(string);
	}
	
	private void fireVentilatorRateChanged(String text) {
		ventilatorRateText.setText(text);
		ventilatorRateText_2.setText(text);
		ventilatorRateText_4.setText(text);
	}

	private void fireTidalVolumeChanged(String text) {
		tidalVolumeText.setText(text);
		tidalVolumeText_2.setText(text);
		tidalVolumeText_4.setText(text);
		//fireGuiFieldsChanged(this);
	}

	private void firePeepChanged(String text) {
		peepText.setText(text);
		peepText_2.setText(text);
		peepText_4.setText(text);
	}

	private void firePipChanged(String text) {
		pipText.setText(text);
		pipText_2.setText(text);
	}

	private void fireAirwayPressureChanged(String text) {
		meanAirwayPressureText.setText(text);
		meanAirwayPressureText_2.setText(text);
		meanAirwayPressureText_3.setText(text);
		meanAirwayPressureText_4.setText(text);
	}

	private void fireSaturationChanged(String text) {
		saturationO2Text.setText(text);
		saturationO2Text_2.setText(text);
		saturationO2Text_3.setText(text);
		saturationO2Text_4.setText(text);
		saturationO2Text_5.setText(text);
	}

	private void fireOxygenChanged(String text) {
		inspiredO2Text.setText(text);
		inspiredO2Text_2.setText(text);
		inspiredO2Text_3.setText(text);
		inspiredO2Text_4.setText(text);
		inspiredO2Text_5.setText(text);
	}

	private void fireEndTidalCO2Changed(String text) {
		endTidalCO2Text.setText(text);
		endTidalCO2Text_2.setText(text);
		endTidalCO2Text_4.setText(text);
		
	}
	
	private void clearModeGroupButtons() {
		btnHfov.setSelection(false);
		btnPressureControl.setSelection(false);
		btnVolumeControl.setSelection(false);
		btnPrvc.setSelection(false);
		btnExtubated.setSelection(false);	
	}

	private void createDateTimeRefreshButton(Composite composite) {
		Button btnRefreshDateTime = new Button(composite, SWT.NONE);
		btnRefreshDateTime.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER,
				true, false, 1, 1));
		btnRefreshDateTime.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GregorianCalendar temp = new GregorianCalendar();
				observationDate.setDate(temp.get(Calendar.YEAR),
						temp.get(Calendar.MONTH),
						temp.get(Calendar.DAY_OF_MONTH));
				observationTime.setTime(temp.get(Calendar.HOUR_OF_DAY),
						temp.get(Calendar.MINUTE), 0);
				resetFocus();
			}
		});
		btnRefreshDateTime.setText("Refresh Date Time");
	}

	public boolean allRequiredFieldsFilledIn() {
		if(btnHfov.getSelection()==true){
			return allHfovFieldsFilledIn();
		}
		if(btnPressureControl.getSelection()==true){
			return allPcFieldsFilledIn();
		}
		if(btnVolumeControl.getSelection()==true){
			return allVcFieldsFilledIn();
		}
		if(btnPrvc.getSelection()==true){
			return allPrvcFieldsFilledIn();
		}
		if(btnExtubated.getSelection()==true){
			return allExtFieldsFilledIn();
		}
		return false;
	}
	
	private boolean allHfovFieldsFilledIn() {
		if(inspiredO2Text_3.getText().length()>1 &&
				saturationO2Text_3.getText().length()>1 &&
				meanAirwayPressureText_3.getText().length()>0 &&
				frequencyText_3.getText().length()>0 &&
				amplitudeText_3.getText().length()>0)
			return true;
		return false;
	}

	private boolean allPcFieldsFilledIn() {
		if(inspiredO2Text.getText().length()>1 &&
				//saturationO2Text.getText().length()>1 && not required for lamb vent
				ventilatorRateText.getText().length()>0 &&
				peepText.getText().length()>0 &&
				pipText.getText().length()>0)
			return true;
		return false;
	}

	private boolean allVcFieldsFilledIn() {
		if(inspiredO2Text_4.getText().length()>1 &&
				saturationO2Text_4.getText().length()>1 &&
				ventilatorRateText_4.getText().length()>0 &&
				tidalVolumeText_4.getText().length()>0 &&
				peepText_4.getText().length()>0 &&
				plateauPressureText_4.getText().length()>0)
			return true;
		return false;
	}

	private boolean allPrvcFieldsFilledIn() {
		if(inspiredO2Text_2.getText().length()>1 &&
				saturationO2Text_2.getText().length()>1 &&
				ventilatorRateText_2.getText().length()>0 &&
				tidalVolumeText_2.getText().length()>0 &&
				peepText_2.getText().length()>0 &&
				pipText_2.getText().length()>0)
			return true;
		return false;
	}



	private boolean allExtFieldsFilledIn() {
		if(inspiredO2Text_5.getText().length()>1 && 
				saturationO2Text_5.getText().length()>1)
			return true;
		return false;
	}



	public void resetFocus() {
		System.out.println("Reset Focus reached");
		 ventilatorModeGroup.setFocus();
	}

	
	
	
	
	// Getters that are included below are used by the editor containing this
	// composite
	// to adjust labels in the composite. For example, the composite does not
	// know
	// anything about blood gas times, patient weight, etc.

	public Button getBtnNewAbg() {
		return btnNewAbg;
	}

	public DateTime getObservationTime() {
		return observationTime;
	}

	public DateTime getObservationDate() {
		return observationDate;
	}

	public Text getpHText() {
		return pHText;
	}

	public Text getPaO2Text() {
		return paO2Text;
	}

	public Text getpCO2Text() {
		return pCO2Text;
	}

	public Text getpHText_2() {
		return pHText_2;
	}

	public Text getPaO2Text_2() {
		return paO2Text_2;
	}

	public Text getpCO2Text_2() {
		return pCO2Text_2;
	}

	public Text getpHText_3() {
		return pHText_3;
	}

	public Text getPaO2Text_3() {
		return paO2Text_3;
	}

	public Text getpCO2Text_3() {
		return pCO2Text_3;
	}

	public Text getpHText_4() {
		return pHText_4;
	}

	public Text getPaO2Text_4() {
		return paO2Text_4;
	}

	public Text getpCO2Text_4() {
		return pCO2Text_4;
	}

	public Label getLabelLastPco2_5() {
		return labelLastPco2_5;
	}

	public void setLabelLastPco2_5(Label labelLastPco2_5) {
		this.labelLastPco2_5 = labelLastPco2_5;
	}

	public Label getLabelLastPh_5() {
		return labelLastPh_5;
	}

	public void setLabelLastPh_5(Label labelLastPh_5) {
		this.labelLastPh_5 = labelLastPh_5;
	}

	public Label getLabelLastPo2_5() {
		return labelLastPo2_5;
	}

	public void setLabelLastPo2_5(Label labelLastPo2_5) {
		this.labelLastPo2_5 = labelLastPo2_5;
	}

	public Text getInspiredO2Text_5() {
		return inspiredO2Text_5;
	}

	public void setInspiredO2Text_5(Text inspiredO2Text_5) {
		this.inspiredO2Text_5 = inspiredO2Text_5;
	}

	public Text getpHText_5() {
		return pHText_5;
	}

	public Text getPaO2Text_5() {
		return paO2Text_5;
	}

	public Text getpCO2Text_5() {
		return pCO2Text_5;
	}

	public Label getLblLastDate_pH_2() {
		return lblLastDate_pH_2;
	}

	public Label getLblLastDate_PaO2_2() {
		return lblLastDate_PaO2_2;
	}

	public Label getLblLastDate_PCO2_2() {
		return lblLastDate_PCO2_2;
	}

	public Label getLblLastDate_pH() {
		return lblLastDate_pH;
	}

	public Label getLblLastDate_PaO2() {
		return lblLastDate_PaO2;
	}

	public Label getLblLastDate_PCO2() {
		return lblLastDate_PCO2;
	}

	public Label getLblLastDate_pH_3() {
		return lblLastDate_pH_3;
	}

	public Label getLblLastDate_PaO2_3() {
		return lblLastDate_PaO2_3;
	}

	public Label getLblLastDate_PCO2_3() {
		return lblLastDate_PCO2_3;
	}

	public Label getLblLastDate_pH_4() {
		return lblLastDate_pH_4;
	}

	public Label getLblLastDate_PaO2_4() {
		return lblLastDate_PaO2_4;
	}

	public Label getLblLastDate_PCO2_4() {
		return lblLastDate_PCO2_4;
	}

	public Label getTidalVolumePerKgLabel() {
		return tidalVolumePerKgLabel;
	}

	public Label getTidalVolumePerKgLabel4() {
		return tidalVolumePerKgLabel4;
	}

	public Label getTidalVolumePerKgLabel2() {
		return tidalVolumePerKgLabel2;
	}



	public Text getInspiredO2Text() {
		return inspiredO2Text;
	}



	public Text getMeanAirwayPressureText() {
		return meanAirwayPressureText;
	}



	public Text getSaturationO2Text() {
		return saturationO2Text;
	}



	public Text getVentilatorRateText() {
		return ventilatorRateText;
	}



	public Text getTidalVolumeText() {
		return tidalVolumeText;
	}



	public Text getPeepText() {
		return peepText;
	}



	public Text getPipText() {
		return pipText;
	}



	public Text getInspiredO2Text_2() {
		return inspiredO2Text_2;
	}



	public Text getMeanAirwayPressureText_2() {
		return meanAirwayPressureText_2;
	}



	public Text getSaturationO2Text_2() {
		return saturationO2Text_2;
	}



	public Text getVentilatorRateText_2() {
		return ventilatorRateText_2;
	}



	public Text getTidalVolumeText_2() {
		return tidalVolumeText_2;
	}



	public Text getPeepText_2() {
		return peepText_2;
	}



	public Text getPipText_2() {
		return pipText_2;
	}



	public Text getInspiredO2Text_3() {
		return inspiredO2Text_3;
	}



	public Text getSaturationO2Text_3() {
		return saturationO2Text_3;
	}



	public Text getMeanAirwayPressureText_3() {
		return meanAirwayPressureText_3;
	}



	public Text getFrequencyText_3() {
		return frequencyText_3;
	}



	public Text getAmplitudeText_3() {
		return amplitudeText_3;
	}



	public Text getInspiredO2Text_4() {
		return inspiredO2Text_4;
	}



	public Text getSaturationO2Text_4() {
		return saturationO2Text_4;
	}



	public Text getMeanAirwayPressureText_4() {
		return meanAirwayPressureText_4;
	}



	public Text getVentilatorRateText_4() {
		return ventilatorRateText_4;
	}



	public Text getTidalVolumeText_4() {
		return tidalVolumeText_4;
	}



	public Text getPeepText_4() {
		return peepText_4;
	}



	public Text getPlateauPressureText_4() {
		return plateauPressureText_4;
	}



	public Text getSaturationO2Text_5() {
		return saturationO2Text_5;
	}


	public Text getEndTidalCO2Text_4() {
		return endTidalCO2Text_4;
	}

	public Text getEndTidalCO2Text_2() {
		return endTidalCO2Text_2;
	}


	public Text getEndTidalCO2Text() {
		return endTidalCO2Text;
	}



	public Button getBtnPressureControl() {
		return btnPressureControl;
	}

	public Button getBtnPrvc() {
		return btnPrvc;
	}

	public Button getBtnHfov() {
		return btnHfov;
	}

	public Button getBtnVolumeControl() {
		return btnVolumeControl;
	}

	public Button getBtnExtubated() {
		return btnExtubated;
	}

	/*
	public ListenerList getGuiFieldsChangedListeners() {
		return guiFieldsChangedListeners;
	}

	public void setGuiFieldsChangedListeners(
			ListenerList guiFieldsChangedListeners) {
		this.guiFieldsChangedListeners = guiFieldsChangedListeners;
	}

	public void addGuiFieldsChangeListener(final IGuiListener listener) {
		log.debug("Adding GUI change listener: " + listener);
		if (guiFieldsChangedListeners == null) {
			guiFieldsChangedListeners = new ListenerList();
		}
		guiFieldsChangedListeners.add(listener);
	}

	public void removeGuiFieldsChangeListener(final IGuiListener listener) {
		log.debug("Removing decision listener: " + listener);
		if (guiFieldsChangedListeners != null) {
			guiFieldsChangedListeners.remove(listener);
			if (guiFieldsChangedListeners.isEmpty())
				guiFieldsChangedListeners = null;
		}
	}

	public void fireGuiFieldsChanged(
			final VentilatorFieldsAddedToDomainComposite composite) {
		System.out.println("Firing GUI fields changed in composite: "
				+ composite);
		if (guiFieldsChangedListeners == null)
			return;
		Object[] rls = guiFieldsChangedListeners.getListeners();
		for (Object o : rls) {
			IGuiListener listener = (IGuiListener) o;
			listener.guiFieldsChanged(composite);
		}
	}

*/

	public StyledText getMAPText() {
		// TODO Auto-generated method stub
		return null;
	}
}