package com.day01.vehiclerentalapplication;

public class Truck extends Vehicle{
    private double loadCharge = 500;

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1500);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck No: " + vehicleNumber);
    }
}
