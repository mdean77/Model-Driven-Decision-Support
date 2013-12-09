 
package edu.utah.dcc.e4.application.core.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;

public class TransferDataToTargetHandler {
	@Execute
	public void execute() {
		System.out.println("In transfer data to target handler");
	}
	
	
	@CanExecute
	public boolean canExecute(MPerspective myPerspective) {
		System.out.println(myPerspective.getElementId());
		if (myPerspective.getElementId().equals("edu.utah.dcc.e4.application.core.perspective.superuser"))
		return true;  
		return false;
	}
		
}