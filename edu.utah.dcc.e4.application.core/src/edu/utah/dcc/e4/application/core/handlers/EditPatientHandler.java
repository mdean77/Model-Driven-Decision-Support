 
package edu.utah.dcc.e4.application.core.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class EditPatientHandler {
	@Execute
	public void execute() {
		System.out.println("In the execute method of the edit patient handler");
	}
		
}