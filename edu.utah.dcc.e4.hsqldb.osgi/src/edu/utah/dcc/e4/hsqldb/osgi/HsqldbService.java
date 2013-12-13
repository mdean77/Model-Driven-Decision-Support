package edu.utah.dcc.e4.hsqldb.osgi;

import org.hsqldb.server.Server;

public interface HsqldbService {
	Server getServer();
	boolean isRunning();
	void startServer();
	void stopServer();
	void setDatabase(String database);
}
