import java.rmi.Naming;

public class CalcClient {
	public static void main(String[] args) {
		try
		{
			Calc c = (Calc)Naming.lookup("localhost");
			System.out.println("Client Program");
			System.out.println("Server :  " + c.doAdd(10,20));
		}
		catch (Exception e1)
		{
			System.out.println(e1);
		}
	}
}
