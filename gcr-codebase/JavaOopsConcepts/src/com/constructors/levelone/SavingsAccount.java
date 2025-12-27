package com.constructors.levelone;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);   // protected
        System.out.println("Balance: " + getBalance());           // private via public method
        System.out.println("-----------------------");
    }

    // Main method
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "Akshat Jain", 10000);

        sa.displayAccountDetails();

        sa.deposit(5000);
        System.out.println("After Deposit:");
        sa.displayAccountDetails();

        sa.withdraw(3000);
        System.out.println("After Withdrawal:");
        sa.displayAccountDetails();
    }
}
