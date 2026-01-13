package com.day08.budgetwise;

import java.util.*;

abstract class Budget implements IAnalyzable {
    protected double income;
    protected HashMap<String, Double> categoryLimits;
    protected ArrayList<Transaction> transactions;

    Budget(double income, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions)
            if (t.getType().equalsIgnoreCase("expense"))
                sum += t.getAmount();
        return sum;
    }

    public double netSavings() {
        return income - totalExpenses();
    }
}