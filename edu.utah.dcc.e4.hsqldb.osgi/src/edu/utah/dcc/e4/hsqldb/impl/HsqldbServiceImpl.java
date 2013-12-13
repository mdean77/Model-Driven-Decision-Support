package edu.utah.dcc.e4.hsqldb.impl;

import org.hsqldb.server.Server;

import edu.utah.dcc.e4.hsqldb.osgi.HsqldbService;

public class HsqldbServiceImpl implements HsqldbService {

	private static Server hsqlServer = new Server();
	@Override
	public Server getServer() {
		System.out.println("In get server method of OSGI service");
		return hsqlServer;
	}

	@Override
	public boolean isRunning() {
		System.out.println("In isRunning method of OSGI service");
		return false;
	}

	@Override
	public void startServer() {
		System.out.println("In start server method of OSGI service");
		hsqlServer.start();
	}

	@Override
	public void stopServer() {
		System.out.println("In stop server method of OSGI service");
		hsqlServer.stop();
	}

	@Override
	public void setDatabase(String database) {
		System.out.println("In configure server method of OSGI service");
        hsqlServer.setDatabaseName(0, database);
        hsqlServer.setDatabasePath(0, database);		
	}

}
