package org.ap.RMI.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.ap.RMI.server.RemoteInterface;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			RemoteInterface interfaceRMI = (RemoteInterface) Naming.lookup("localhost/remoteServer");
			int result = interfaceRMI.cube(4);
			System.out.println(result);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
