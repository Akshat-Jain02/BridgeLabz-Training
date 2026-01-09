package com.day07.artify;

public class User {
	private String name;
    private double walletBalance;
    
    public User(String name, double walletBalance) {
    	this.name = name;
    	this.walletBalance = walletBalance;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getWalletBalance() {
    	return walletBalance;
    }
    
    public void setWalletBalance(double walletBalance) {
    	this.walletBalance = walletBalance;
    }
}
