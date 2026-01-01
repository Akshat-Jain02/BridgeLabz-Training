package com.inheritance.hierarchical.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
	private int tenureMonths;
    private double maturityAmount;

    public FixedDepositAccount(String accountNumber, double balance, 
                               int tenureMonths, double maturityAmount) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
        this.maturityAmount = maturityAmount;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenureMonths + " months");
        System.out.println("Maturity Amount: $" + maturityAmount);
    }
}
