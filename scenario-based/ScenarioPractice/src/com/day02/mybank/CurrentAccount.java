package com.day02.mybank;
public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public CurrentAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public double calculateInterest() {
        return 0.0;
    }
}