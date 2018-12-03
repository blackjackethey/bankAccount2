import java.util.*;

public class bankteller 
{
	public static void main(String[] args)
	{
		BankAccount2 cust1 = new BankAccount2();
		
		System.out.println(cust1.getName());
		System.out.println(cust1.getBalance());
		cust1.withDraw();
		System.out.println(cust1.getDeposit());
	}
}
