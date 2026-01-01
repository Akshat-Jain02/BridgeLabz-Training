package com.inheritance.hybrid.vehiclemanagement;

public class ElectricVehicle extends Vehicle{
	private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging its " + batteryCapacity + " kWh battery.");
    }

    @Override
    public void showDetails() {
        displayInfo();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        charge();
        System.out.println("---");
    }
}
