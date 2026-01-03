package com.day01.vehiclerentalapplication;

public class Car extends Vehicle{
    private double insuranceCharge = 200;

    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + insuranceCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car No: " + vehicleNumber);
    }
}
