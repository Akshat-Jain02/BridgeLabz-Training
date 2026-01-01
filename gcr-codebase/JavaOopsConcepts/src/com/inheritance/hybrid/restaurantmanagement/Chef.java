package com.inheritance.hybrid.restaurantmanagement;

public class Chef extends Person implements Worker{
	private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious " + specialty + " dishes.");
    }

    public void showDetails() {
        displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        performDuties();
        System.out.println("---");
    }
}
