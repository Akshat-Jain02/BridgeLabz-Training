package com.exceptionhandling.banktransactionsystem;

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}