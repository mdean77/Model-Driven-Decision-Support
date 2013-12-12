package edu.utah.dcc.e4.application.lifecycle;

import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;

public class Manager {
	
	@PostContextCreate
	public void postContextManager(){
		System.out.println("In post context manager");
	}
	
	@ProcessAdditions
	public void processAdditionsManager(){
		System.out.println("In process additions manager");
	}
	
	@ProcessRemovals
	public void processRemovalsManager(){
		System.out.println("In process removals manager");
	}
	
	@PreSave
	public void preSaveManager(){
		System.out.println("In preSave manager");
	}
	
}
