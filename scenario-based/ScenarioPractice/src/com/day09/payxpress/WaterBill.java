package com.day09.payxpress;

import java.time.LocalDate;

class WaterBill extends Bill implements IPayable {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        if (isPaid()) {
            System.out.println("Water bill already paid!");
        } else {
            markAsPaid();
            System.out.println("Water bill of ₹" + amount + " paid successfully!");
        }
    }

    @Override
    public void sendReminder() {
        System.out.print("Reminder: WATER bill of ₹" + amount);
        System.out.println(" due date: " + dueDate);
        if (isOverdue()) {
            System.out.println("→ LATE! Total now: ₹" + String.format("%.2f", calculateLateFee()));
        }
    }
}