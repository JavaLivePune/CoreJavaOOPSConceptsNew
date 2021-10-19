package com.javaLive.CoreJavaOOPSConceptsNew;

import java.util.List;

/**
 * @author JavaLive.com
 * description This is the base class of account classes of Banking System application.
 * Go through it and read the comments provided very carefully thereby try to
 * understand the OOPS concept of Java. 
 */
public abstract class BankAccount {
	private double accountBalance;// Encapsulation
	private List<BankCustomer> accountHolder;//has-a relationship i.e. association among classes.
	private long accountNumber;				//This is also example of coupling.

	public double getAccountBalance() {// Encapsulation
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {// Encapsulation
		this.accountBalance = accountBalance;
	}

	public List<BankCustomer> getAccountHolder() {// Encapsulation
		return accountHolder;
	}

	public void setAccountHolder(List<BankCustomer> accountHolder) {// Encapsulation
		this.accountHolder = accountHolder;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean depositAmt(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount");
			return false;
		} else {
			this.accountBalance = this.accountBalance + amount;
			return true;
		}
	}

	public abstract boolean withdrawAmt(double amount);//Abstaction: Method with only declaration and without implementation.

	public void displayBalanceAmt() {
		System.out.println("Account balance is "+this.getAccountBalance());
	}
	
	public boolean transferAmount(double amount, long accountNumber) {
		//Here is the code to get particular account number details and
		// add the said amount to its balance.
		return true;
	}
}
