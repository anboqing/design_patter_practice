import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		System.out.println("服务启动成功");
	}

	public String method(String word) throws RemoteException {
		return "hello client" + word;
	}
	public static void main(String[] args) {
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://test:18888/sayHello", service);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
