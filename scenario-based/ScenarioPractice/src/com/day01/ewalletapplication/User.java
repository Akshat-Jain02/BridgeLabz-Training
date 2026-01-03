package com.day01.ewalletapplication;

public class User implements Transferrable {
    public String name;
    public Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void loadMoney(double amount) {
        wallet.addMoney(amount);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (wallet.deductMoney(amount)) {
            receiver.wallet.addMoney(amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.name);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
