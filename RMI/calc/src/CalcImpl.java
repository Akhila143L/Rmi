import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements Calc {

	protected CalcImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String doAdd(double d1,double d2) {
		// TODO Auto-generated method stub
		
		return "d1+d2";
	}
	
}

