package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantManagement {
	public static void main(String[] args) {
        System.out.println("=== Restaurant Management System ===\n");

        Chef chef = new Chef("Gordon Ramsay", 101, "Italian");
        Waiter waiter = new Waiter("Maria Lopez", 201, 5);

        // Display individual details
        chef.showDetails();
        waiter.showDetails();

        // Demonstrate polymorphism using Worker interface
        System.out.println("All Workers Performing Duties:");
        Worker[] staff = {chef, waiter};

        for (Worker worker : staff) {
            worker.performDuties();
        }

        // Also possible with Person reference
        System.out.println("\nTreated as Person:");
        Person[] people = {chef, waiter};
        for (Person p : people) {
            p.displayInfo();
        }
    }
}
