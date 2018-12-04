
public class BankAccount2 
{
	private String name;
	private double balance;
	
	public BankAccount2()
	{
		name = "";
		balance = 0.0;
	}
	public void setName(String nm)
	{
		name = nm;
	}
	public String getName()
	{
		System.out.println("Im Pablo, enter your name:");
		return name;
	}
	public void setBalance(double n)
	{
		balance += n;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setDeposit(double amount)
	{
		System.out.println("Enter an amount: ");
		balance += amount;
	}
	public double getDeposit()
	{
		System.out.println("Enter an amount: ");
		return balance;
	}
	public void setwithDraw(double amount2)
	{
		balance -= amount2;
	}
	public double getwithDraw()
	{
		System.out.println("Enter an amount: ");
		return balance;
	}
	public String toString()
	{
		String str;
		str = "Name: " + name + "\n" + "Enter balance amount: $" + balance + "\n";
		return str;
	}
}
