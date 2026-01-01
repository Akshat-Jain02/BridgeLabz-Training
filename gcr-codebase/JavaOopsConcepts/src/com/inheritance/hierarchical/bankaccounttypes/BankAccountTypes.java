package com.inheritance.hierarchical.bankaccounttypes;

public class BankAccountTypes {
	public static void main(String[] args) {
        System.out.println("=== Bank Account Types System ===\n");

        // Create different types of accounts
        BankAccount savings = new SavingsAccount("SA-1001", 5000, 4.5);
        BankAccount checking = new CheckingAccount("CA-2001", 2000, 500);
        BankAccount fixed = new FixedDepositAccount("FD-3001", 10000, 12, 10800);

        // Display details using polymorphism
        BankAccount[] accounts = {savings, checking, fixed};

        for (BankAccount account : accounts) {
            account.showDetails();
        }

        // Extra: Test deposit
        System.out.println("After depositing $1000 to Savings Account:");
        savings.deposit(1000);
        savings.showDetails();
    }
}
