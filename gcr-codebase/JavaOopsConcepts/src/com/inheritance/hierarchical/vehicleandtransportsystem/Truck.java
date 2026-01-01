package com.inheritance.hierarchical.vehicleandtransportsystem;

public class Truck extends Vehicle{
	private double loadCapacity; // in tons
    private boolean hasTrailer;

    public Truck(int maxSpeed, String fuelType, double loadCapacity, boolean hasTrailer) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Has Trailer: " + (hasTrailer ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}
