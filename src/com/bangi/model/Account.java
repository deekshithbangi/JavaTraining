package com.bangi.model;

public class Account {

	private long accountNumber;
	private String accountType;
	private String accountName;
	private double accountBalance;

	// Default constructor
	public Account() {
		this.accountNumber = 0;
		this.accountType = "";
		this.accountName = "";
		this.accountBalance = 0.0;
	}

	// Parameterized constructor
	public Account(long accountNumber, String accountType, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}

}
