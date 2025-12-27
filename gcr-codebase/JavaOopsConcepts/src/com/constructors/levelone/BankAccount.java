package com.constructors.levelone;

public class BankAccount {
	    public int accountNumber;        // Public
	    protected String accountHolder;  // Protected
	    private double balance;          // Private

	    // Constructor
	    public BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // Public method to get balance
	    public double getBalance() {
	        return balance;
	    }

	    // Public method to modify balance (deposit)
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    // Public method to modify balance (withdraw)
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
}
