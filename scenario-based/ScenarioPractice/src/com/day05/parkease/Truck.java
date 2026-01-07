package com.day05.parkease;
class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80, 4);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > allowedHours ? (hours - allowedHours) * 40 : 0;
        return (baseRate * hours) + penalty;
    }
}