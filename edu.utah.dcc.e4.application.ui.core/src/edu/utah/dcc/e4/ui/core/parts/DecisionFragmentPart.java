package edu.utah.dcc.e4.ui.core.parts;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import edu.utah.dcc.e4.ui.core.parts.composites.CoreDecisionGroup;
import edu.utah.dcc.e4.ui.core.parts.composites.CoreExplainGroup;

public class DecisionFragmentPart 
{
  protected static final String EMPTY_STRING = "";
  
	private SashForm parentSash;
  private SashForm decisionexplainSash;

  
	private CoreDecisionGroup decisionGroup;
  private CoreExplainGroup explainGroup;




  public DecisionFragmentPart(Composite part) {
    
    parentSash = new SashForm(part, SWT.VERTICAL | SWT.H_SCROLL);
    decisionexplainSash = new SashForm(parentSash, 
        SWT.VERTICAL | SWT.V_SCROLL);
      
      //resManager = new LocalResourceManager(JFaceResources.getResources(), part);
      //font = resManager.createFont(FontDescriptor.createFrom("Lucida Grande", 13, SWT.NORMAL));
      
    decisionGroup = new CoreDecisionGroup(decisionexplainSash);
    explainGroup = new CoreExplainGroup(decisionexplainSash);
  }


  public void addTheme(IStylingEngine engine)
  {
    engine.setClassname(parentSash, "decision-fragment-sash");
    decisionGroup.addTheme(engine);
    explainGroup.addTheme(engine);
  }



  

  

  

  
  
  public SashForm getParentSashForm()
	{
	  return parentSash;
	}




  public void moveToTop(Composite domainFieldsComposite) {
    
    domainFieldsComposite.moveAbove(decisionexplainSash);

    
  }
	
	

}
