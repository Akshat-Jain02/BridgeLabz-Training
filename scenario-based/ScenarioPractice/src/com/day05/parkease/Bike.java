package com.day05.parkease;

class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20, 6);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > allowedHours ? (hours - allowedHours) * 10 : 0;
        return (baseRate * hours) + penalty;
    }
}