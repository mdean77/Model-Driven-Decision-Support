 
package edu.utah.dcc.e4.application.core.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;

public class AddUserHandler {
	@Execute
	public void execute() {
		System.out.println("In add user handler");
	}
	
	
	@CanExecute
	public boolean canExecute(MPerspective myPerspective) {
		System.out.println(myPerspective.getElementId());
		if ((myPerspective.getElementId().equals("edu.utah.dcc.e4.application.core.perspective.superuser"))
				|| (myPerspective.getElementId().equals("edu.utah.dcc.e4.application.core.perspective.admin")))
		return true;  
		return false;
	}
		
}