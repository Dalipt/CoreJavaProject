package com.java.TelAssignment;
//12.Abstract class with BankAccount its method implementation in concrete class
import java.util.Scanner;

abstract class BankAccount
{
	protected double balance;
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public abstract void depositMethod(double amount);
	
	public abstract void withdrawalMethod(double amount);
	
	public abstract void displayBalanceMethod();
}

class SavingAccounts extends BankAccount
{
	private double interestRate;
	
	public SavingAccounts(double balance, double interestRate) 
	{
		super(balance);
		this.interestRate=interestRate;
	}
	public void depositMethod(double amount)
	{
		balance +=amount*interestRate;
		System.out.println("Deposited amount"+ amount+ " to saving account. New balance is after adding Interest: "+balance );
	}
	@Override
	public void withdrawalMethod(double amount) 
	{
		if(amount<=balance)
		{
			balance -=amount;
            System.out.println("Withdrew " + amount + " from Saving Account. New balance: " + balance);
        }
		else
		{
            System.out.println("Insufficient balance in Saving Account."+balance);
        }	
	}
	public void displayBalanceMethod() {
		System.out.println("Available balance after withdrawl is:" +balance);
		
	}	
	
}

class CheckingAccount extends BankAccount 
{
	    private double overdraftLimit;

	    public CheckingAccount(double balance, double overdraftLimit) {
	        super(balance);
	        this.overdraftLimit = overdraftLimit;
	    }
	   
		@Override
		public void displayBalanceMethod()
		{
			System.out.println("Checking Account balance: " + balance);
			
		}

		@Override
		public void depositMethod(double amount) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void withdrawalMethod(double amount) {
			// TODO Auto-generated method stub
			
		}
	}

public class BankDetails {

	public static void main(String[] args)
	{
		
		SavingAccounts sv= new SavingAccounts(2000.0,15.5);
		sv.depositMethod(10000);
		
 		sv.withdrawalMethod(157000);
 		
 		sv.displayBalanceMethod();
		
		CheckingAccount ca= new CheckingAccount(10000,100);
		ca.displayBalanceMethod();
		
	}

}
