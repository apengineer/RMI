package org.ap.RMI.server;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends UnicastRemoteObject implements RemoteInterface{

	public ServerRMI() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cube(int x) throws RemoteException {
		// TODO Auto-generated method stub
		return x*x*x;
	}
	
	

}
