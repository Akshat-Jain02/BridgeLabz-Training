package com.day02.mybank;
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, double interestRate) {
        this(accountNumber, 0.0, interestRate);
    }

    public double calculateInterest() {
        return checkBalance() * interestRate / 100;
    }
}