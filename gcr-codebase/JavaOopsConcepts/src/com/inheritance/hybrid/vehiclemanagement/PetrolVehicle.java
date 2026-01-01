package com.inheritance.hybrid.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable{
	private int fuelTankCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling its " + fuelTankCapacity + "L petrol tank.");
    }

    @Override
    public void showDetails() {
        displayInfo();
        System.out.println("Type: Petrol Vehicle");
        System.out.println("Fuel Tank: " + fuelTankCapacity + " liters");
        refuel();
        System.out.println("---");
    }
}
