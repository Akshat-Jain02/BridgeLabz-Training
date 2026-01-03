package com.day01.hospitalpatientmanagementsystem;

public class Bill implements Payable{
    private double consultationFee;
    private double medicineCost;
    private double taxRate = 0.05;   // 5% tax
    private double discount = 100;

    public Bill(double consultationFee, double medicineCost) {
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineCost;
        double tax = total * taxRate;
        return total + tax - discount;
    }
}
