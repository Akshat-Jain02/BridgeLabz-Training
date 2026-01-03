package com.day01.ewalletapplication;

import java.util.ArrayList;

public class Wallet {
	
    private double balance;
    public ArrayList<Transaction> history = new ArrayList<>();

    public Wallet(double bonus) {
        this.balance = bonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void addMoney(double amount) {
        balance += amount;
        history.add(new Transaction("CREDIT", amount));
    }

    protected boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            history.add(new Transaction("DEBIT", amount));
            return true;
        }
        return false;
    }
}
