package pattern.proxy.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * remote service
 * @author renguangkai
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements Remote,
		MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		
	}

	@Override
	public String sayHi() throws RemoteException {
		return "Server says, 'Hiii'";
	}
	
	public static void main(String[] args) {
		try {
			Remote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
