 
package edu.utah.dcc.e4.application.core.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SuperuserPerspectiveHandler {
	@Execute
	public void execute(MApplication app, EPartService partService, EModelService modelService) {
		System.out.println("In the Execute method of changing to superuser perspective");
		MPerspective element = (MPerspective) modelService.find("edu.utah.dcc.e4.application.core.perspective.superuser", app);
		partService.switchPerspective(element);

	}
	
	@CanExecute
	public boolean canExecute(MPerspective myPerspective) {
		if (!myPerspective.getElementId().equals("edu.utah.dcc.e4.application.core.perspective.superuser"))
		return true;  
		return false;
	}
		
}