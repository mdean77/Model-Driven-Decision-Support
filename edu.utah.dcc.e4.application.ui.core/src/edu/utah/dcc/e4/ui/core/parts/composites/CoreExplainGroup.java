package edu.utah.dcc.e4.ui.core.parts.composites;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class CoreExplainGroup extends Group {

  private static final String EMPTY_STRING = "";
  private StyledText explanationText;


  public CoreExplainGroup(Composite parent)
  {
    this(parent, SWT.None);
  }
  
  public CoreExplainGroup(Composite parent, int style) {
    super(parent, style);
    init();
  }

  
  private void init() 
  {
    FormData explainGroupLData = setupExplainGroupGridLayout();
    setLayoutData(explainGroupLData);
    setText("Why did the protocol make this recommendation?");
    createExplanationText();    
  }
  

  private FormData setupExplainGroupGridLayout() {
    GridLayout explainGroupLayout = new GridLayout();
    explainGroupLayout.makeColumnsEqualWidth = true;
    setLayout(explainGroupLayout);
    FormData explainGroupLData = setupExplanationFormData();
    return explainGroupLData;
  }
  
  private void createExplanationText() {
    explanationText = new StyledText(this, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
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
  
  public void addTheme(IStylingEngine engine)
  {
    engine.setClassname(explanationText, "fragment-styledtext");
    
  }
  
  @Override
  protected void checkSubclass() {
    return;
  }


}
