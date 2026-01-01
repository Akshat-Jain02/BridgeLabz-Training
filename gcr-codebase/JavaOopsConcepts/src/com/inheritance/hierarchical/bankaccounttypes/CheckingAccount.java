package com.inheritance.hierarchical.bankaccounttypes;

public class CheckingAccount extends BankAccount{
	private double withdrawalLimit;  // daily limit

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Type: Checking Account");
        System.out.println("Daily Withdrawal Limit: $" + withdrawalLimit);
    }
}
