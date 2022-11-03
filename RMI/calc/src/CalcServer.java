import java.rmi.Naming;
import java.rmi.RMISecurityManager;


public class CalcServer {

	public static void main(String[] args) {
		try
		{
			System.setSecurityManager(new RMISecurityManager());
			Calc c = new CalcImpl();
			Naming.rebind("localhost", c);
			System.out.println("Object is registered...");
			System.out.println("Now the server is waiting for the client request");
		}
		catch (Exception e)
		{
			System.out.println("Error  " + e);
		}
	}
}

