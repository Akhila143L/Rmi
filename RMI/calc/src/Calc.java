import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {

	

	String doAdd(double d1, double d2)throws RemoteException;

}
