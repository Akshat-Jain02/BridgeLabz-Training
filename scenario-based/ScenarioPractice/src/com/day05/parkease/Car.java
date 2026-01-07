package com.day05.parkease;

class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50, 5);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > allowedHours ? (hours - allowedHours) * 20 : 0;
        return (baseRate * hours) + penalty;
    }
}