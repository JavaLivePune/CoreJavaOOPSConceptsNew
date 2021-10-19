package com.javaLive.CoreJavaOOPSConceptsNew;

public class FixedDepositAccount extends BankAccount {

	@Override
	public boolean withdrawAmt(double amount) {//abstraction i.e. implementation of abstract method of base class.
		//this.setAccountBalance(this.getAccountBalance()-amount);
		return false;
	}
	
	public boolean withdrawAmt(double amount, long accountNumber) {// Polymorphism : Method over loading i.e. define new method having same name but different signature than that of defined in base class.
		//here call amountTransfer method to transfer the said amount to the said account.
		return this.transferAmount(amount, accountNumber);
	}

}
