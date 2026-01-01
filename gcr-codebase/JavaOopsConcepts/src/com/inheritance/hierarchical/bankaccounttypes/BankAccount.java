package com.inheritance.hierarchical.bankaccounttypes;

public class BankAccount {
	protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " | New Balance: $" + balance);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // To be overridden by subclasses
    public void displayAccountType() {
        System.out.println("Type: Generic Bank Account");
    }

    public void showDetails() {
        displayInfo();
        displayAccountType();
        System.out.println("---");
    }
}
