package pattern.proxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * remote interface
 * @author renguangkai
 *
 */
public interface MyRemote extends Remote {
	public String sayHi() throws RemoteException;
}
