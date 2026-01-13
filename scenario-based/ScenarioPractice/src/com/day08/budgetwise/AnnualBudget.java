package com.day08.budgetwise;

import java.util.HashMap;

class AnnualBudget extends Budget {
    AnnualBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    public void generateReport() {
        System.out.println("Annual Report");
        System.out.println("Net Savings: " + netSavings());
    }

    public void detectOverspend() {
        for (Transaction t : transactions)
            if (t.getType().equalsIgnoreCase("expense") && t.getAmount() > 50000)
                System.out.println(t.category + " High Expense");
    }
}
