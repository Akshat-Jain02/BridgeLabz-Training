package com.inheritance.hierarchical.vehicleandtransportsystem;

public class Motorcycle extends Vehicle{
	private String bikeType; // e.g., Sport, Cruiser, Touring
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, String bikeType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
        System.out.println("Bike Type: " + bikeType);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}
