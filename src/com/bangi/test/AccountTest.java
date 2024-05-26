package com.bangi.test;

import java.util.Scanner;
import com.bangi.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account1 = new Account();

		System.out.println("Enter the details of first account : ");
		System.out.println("Enter the account number : ");
		long accountNumber = input.nextLong();
		account1.setAccountNumber(accountNumber);

		System.out.println("Enter the account type : ");
		String accountType = input.next();
		account1.setAccountType(accountType);

		System.out.println("Enter the account name : ");
		String accountName = input.next();
		account1.setAccountName(accountName);

		System.out.println("Enter the account balance  : ");
		double accountBalance = input.nextDouble();
		account1.setAccountBalance(accountBalance);

		System.out.println("Account Number : " + account1.getAccountNumber());
		System.out.println("Account Type : " + account1.getAccountType());
		System.out.println("Account Name : " + account1.getAccountName());
		System.out.println("Account Balance : " + account1.getAccountBalance());

		System.out.println("\n");

		Account account2 = new Account();

		System.out.println("Enter the details of second account : ");
		System.out.println("Enter the account number : ");
		accountNumber = input.nextLong();
		account2.setAccountNumber(accountNumber);

		System.out.println("Enter the account type : ");
		accountType = input.next();
		account2.setAccountType(accountType);

		System.out.println("Enter the account name : ");
		accountName = input.next();
		account2.setAccountName(accountName);

		System.out.println("Enter the account balance  : ");
		accountBalance = input.nextDouble();
		account2.setAccountBalance(accountBalance);

		System.out.println("Account Number : " + account1.getAccountNumber());
		System.out.println("Account Type : " + account1.getAccountType());
		System.out.println("Account Name : " + account1.getAccountName());
		System.out.println("Account Balance : " + account1.getAccountBalance());

	}
}
