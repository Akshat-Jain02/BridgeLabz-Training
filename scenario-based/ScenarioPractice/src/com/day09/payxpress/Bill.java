package com.day09.payxpress;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Bill {
    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate) && !isPaid;
    }

    public double calculateLateFee() {
        if (!isOverdue()) return 0;
        long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
        return amount + (daysLate * 10);
    }

    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}