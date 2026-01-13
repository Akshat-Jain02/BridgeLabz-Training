package com.day08.budgetwise;

import java.util.*;

class MonthlyBudget extends Budget {
    MonthlyBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    public void generateReport() {
        System.out.println("Monthly Report");
        System.out.println("Net Savings: " + netSavings());
    }

    public void detectOverspend() {
        HashMap<String, Double> spent = new HashMap<>();
        for (Transaction t : transactions)
            if (t.getType().equalsIgnoreCase("expense"))
                spent.put(t.category, spent.getOrDefault(t.category, 0.0) + t.getAmount());

        for (String c : spent.keySet())
            if (spent.get(c) > categoryLimits.getOrDefault(c, Double.MAX_VALUE))
                System.out.println(c + " Overspent");
    }
}