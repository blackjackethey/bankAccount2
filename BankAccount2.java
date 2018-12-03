/*
 * How do i make it so that it returns the customers balance and if they withdraw
 * it takes out an amount from their balance and when they deposit it adds to their current balance
 * 
 * I used Scanner but it only enters numbers doesn't really do anything
 */

import java.util.*;

public class BankAccount2 
{
	private String name;
	private double balance;
	Scanner input = new Scanner(System.in);
	
	public BankAccount2()
	{
		name = "";
		balance = 0.0;
	}
	public void setName()
	{
		System.out.println("Im Pablo, enter your name:");
		String nm = input.next();
		name = nm;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(double n)
	{
		balance = n;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setDeposit()
	{
		System.out.println("Enter an amount: ");
		double deposit = input.nextDouble();
		balance += deposit;
	}
	public double getDeposit()
	{
		return balance;
	}
	public void withDraw()
	{
		System.out.println("Enter an amount: ");
		double withDraw = input.nextDouble();
		balance += withDraw;
	}
	public String toString()
	{
		return "";
	}
}
