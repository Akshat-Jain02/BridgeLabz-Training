package com.day01.ewalletapplication;

public class Transaction {
    public String type;
    public double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
