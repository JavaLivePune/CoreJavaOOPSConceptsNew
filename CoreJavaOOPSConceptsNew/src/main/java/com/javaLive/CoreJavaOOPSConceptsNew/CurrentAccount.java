package com.javaLive.CoreJavaOOPSConceptsNew;

public class CurrentAccount extends BankAccount {//is a relationship i.e. inheritance.
	private int minimumBalance = 5000;

	@Override
	public boolean withdrawAmt(double amount) {//abstraction i.e. implementation of abstract method of base class.
		if ((getAccountBalance() - amount) < this.minimumBalance) {
			System.out.println("Insufficient funds......");
			return false;
		} else {
			this.setAccountBalance(this.getAccountBalance() - amount);
			return true;
		}
	}

	public void displayBalanceAmt() {// Polymorphism : Method overriding i.e. redefining method already defined in base class.
		System.out.println("Account balance is " + this.getAccountBalance());
		System.out.println("Over draft amount is ........... and the due date is........");
		System.out.println("Rate of interest for OD amount is ......");
	}
}
