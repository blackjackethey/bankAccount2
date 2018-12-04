import java.util.Scanner;

public class bankteller 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BankAccount2 cust1 = new BankAccount2();
		cust1.getName();
		String nm = input.next();
		
		cust1.getBalance();
		double n = input.nextDouble();
		
		cust1.getDeposit();
		double amount = input.nextDouble();
		System.out.println(cust1.getDeposit());
		cust1.getwithDraw();
		double amount2 = input.nextDouble();
		System.out.println(cust1.getwithDraw());
	}
}
