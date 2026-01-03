package com.day02.cabbygo;

class Vehicle {
	
    protected String vehicleNumber;
    protected int capacity;
    protected String type;
    protected double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }
    
}