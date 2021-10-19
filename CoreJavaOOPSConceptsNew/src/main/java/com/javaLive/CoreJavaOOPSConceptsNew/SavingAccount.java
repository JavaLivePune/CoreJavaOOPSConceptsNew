package com.javaLive.CoreJavaOOPSConceptsNew;

public class SavingAccount extends BankAccount{//is a relationship i.e. inheritance.

	@Override
	public boolean withdrawAmt(double amount) {//abstraction i.e. implementation of abstract method of base class.
			this.setAccountBalance(this.getAccountBalance()-amount);
			return true;
	}

}
