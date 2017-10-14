import java.io.Serializable;
import java.rmi.*;

public interface MyRemote extends Remote {
	public String method(String w) throws RemoteException;
}
