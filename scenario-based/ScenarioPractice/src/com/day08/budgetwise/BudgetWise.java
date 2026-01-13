package com.day08.budgetwise;

import java.util.*;

public class BudgetWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Enter number of categories: ");
        int c = sc.nextInt();

        HashMap<String, Double> limits = new HashMap<>();
        for (int i = 0; i < c; i++) {
            System.out.print("Enter category name: ");
            String cat = sc.next();
            System.out.print("Enter limit: ");
            double lim = sc.nextDouble();
            limits.put(cat, lim);
        }

        System.out.print("Enter budget type (monthly/annual): ");
        String mode = sc.next();

        Budget budget;
        if (mode.equalsIgnoreCase("monthly"))
            budget = new MonthlyBudget(income, limits);
        else
            budget = new AnnualBudget(income, limits);

        System.out.print("Enter number of transactions: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();
            System.out.print("Enter type (income/expense): ");
            String type = sc.next();
            System.out.print("Enter date: ");
            String date = sc.next();
            System.out.print("Enter category: ");
            String cat = sc.next();
            budget.addTransaction(new Transaction(amt, type, date, cat));
        }

        budget.generateReport();
        budget.detectOverspend();
    }
}