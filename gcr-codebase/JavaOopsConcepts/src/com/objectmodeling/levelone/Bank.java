package com.objectmodeling.levelone;

public class Bank {
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer, double initialAmount) {
        customer.balance += initialAmount;
        System.out.println("Account opened for " + customer.name +
                " in " + bankName);
    }
}
