package com.inheritance.hierarchical.bankaccounttypes;

public class SavingsAccount extends BankAccount{
	private double interestRate;  // annual percentage

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "% per year");
    }
}
