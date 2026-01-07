package com.day05.parkease;

abstract class Vehicle implements IPayable {
	
    protected String vehicleNumber;
    protected double baseRate;
    protected int allowedHours;

    public Vehicle(String vehicleNumber, double baseRate, int allowedHours) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
        this.allowedHours = allowedHours;
    }
}