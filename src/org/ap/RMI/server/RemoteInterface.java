/**
 * 
 */
package org.ap.RMI.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Aswathy
 *
 */
public interface RemoteInterface extends Remote {
	
	int cube(int x) throws RemoteException;

}
