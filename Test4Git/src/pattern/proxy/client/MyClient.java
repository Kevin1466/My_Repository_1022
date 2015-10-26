package pattern.proxy.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import pattern.proxy.server.MyRemote;

public class MyClient {

	/**
	 * client
	 * @param args
	 */
	public static void main(String[] args) {
		new MyClient().go();
	}
	
	//lookup Stub object in RMI registry 
	private void go() {
		try {
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHi();
			
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
