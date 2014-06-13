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

public class CoreDecisionGroup extends Group {

  private static final String EMPTY_STRING = "";
  private StyledText decisionText;


  public CoreDecisionGroup(Composite parent)
  {
    this(parent, SWT.None);
  }
  
  public CoreDecisionGroup(Composite parent, int style) {
    super(parent, style);
    init();
  }

  
  private void init() 
  {
    FormData decisionGroupLData = setupDecisionGroupGridLayout();
    setLayoutData(decisionGroupLData);
    setText("Decision Recommended by Protocol:");
    createDecisionText();
  }
  
   private FormData setupDecisionGroupGridLayout() {
      GridLayout decisionGroupLayout = new GridLayout();
      decisionGroupLayout.makeColumnsEqualWidth = true;
      setLayout(decisionGroupLayout);
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
  
  private void createDecisionText() {
    decisionText = new StyledText(this, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
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
  
  public void addTheme(IStylingEngine engine)
  {
    engine.setClassname(decisionText, "fragment-styledtext");
    
  }
  
  @Override
  protected void checkSubclass() {
    return;
  }

}
