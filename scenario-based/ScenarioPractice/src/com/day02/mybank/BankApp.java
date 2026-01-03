package com.day02.mybank;

import java.util.Scanner;

public class BankApp {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MyBank");
        System.out.print("Enter account type (1 = Savings, 2 = Current): ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        Account account = null;

        if (type == 1) {
            System.out.print("Enter interest rate (%): ");
            double rate = sc.nextDouble();
            account = new SavingsAccount(accNum, rate);
        } else {
            account = new CurrentAccount(accNum);
        }

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                account.deposit(amt);
            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                double amt = sc.nextDouble();
                account.withdraw(amt);
            } else if (choice == 3) {
                System.out.println("Balance: " + account.checkBalance());
            } else if (choice == 4) {
                System.out.println("Interest: " + account.calculateInterest());
            } else if (choice == 5) {
                System.out.println("Thank you!");
                break;
            }
        }

        sc.close();
    }
}