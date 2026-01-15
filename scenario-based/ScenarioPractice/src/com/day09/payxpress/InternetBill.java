package com.day09.payxpress;

import java.time.LocalDate;

class InternetBill extends Bill implements IPayable {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        if (isPaid()) {
            System.out.println("Internet bill already paid!");
        } else {
            markAsPaid();
            System.out.println("Internet bill of ₹" + amount + " paid successfully!");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println(" Internet Bill Reminder ");
        System.out.println("Amount: ₹" + amount + " | Due: " + dueDate);
        if (isOverdue()) {
            System.out.println("!!! OVERDUE !!! Pay ₹" + String.format("%.2f", calculateLateFee()) + " now");
        }
    }
}