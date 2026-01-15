package com.day09.payxpress;

import java.time.LocalDate;

class ElectricityBill extends Bill implements IPayable {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        if (isPaid()) {
            System.out.println("Electricity bill already paid!");
        } else {
            markAsPaid();
            System.out.println("Electricity bill of ₹" + amount + " paid successfully!");
        }
    }

    @Override
    public void sendReminder() {
        System.out.print("Reminder: Your ELECTRICITY bill of ₹" + amount);
        System.out.println(" is due on " + dueDate);
        if (isOverdue()) {
            System.out.println("→ OVERDUE! Please pay ₹" + String.format("%.2f", calculateLateFee()) + " (with late fee)");
        }
    }
}