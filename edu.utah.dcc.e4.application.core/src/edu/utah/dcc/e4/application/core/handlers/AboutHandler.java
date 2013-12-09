 
package edu.utah.dcc.e4.application.core.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class AboutHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		MessageDialog.openInformation(shell, "About", "Eclipse 4 Application example. This should be replaced\n"
				+ "with a domain specific about handler contributed from a model fragment.");
	}
	

}
		