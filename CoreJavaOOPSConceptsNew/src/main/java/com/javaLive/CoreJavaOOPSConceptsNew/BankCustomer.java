package com.javaLive.CoreJavaOOPSConceptsNew;

public class BankCustomer {// Cohesion example
	private int custID;
	private String custName;
	private String custAddress;
	private long custContactNumber;
	private long custAadharID;
	private long custPAN;

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	public long getCustAadharID() {
		return custAadharID;
	}

	public void setCustAadharID(long custAadharID) {
		this.custAadharID = custAadharID;
	}

	public long getCustPAN() {
		return custPAN;
	}

	public void setCustPAN(long custPAN) {
		this.custPAN = custPAN;
	}
}
