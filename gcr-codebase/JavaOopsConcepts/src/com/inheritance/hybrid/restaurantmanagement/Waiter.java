package com.inheritance.hybrid.restaurantmanagement;

public class Waiter extends Person implements Worker{
	private int tableSection;

    public Waiter(String name, int id, int tableSection) {
        super(name, id);
        this.tableSection = tableSection;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers in table section " + tableSection + ".");
    }

    public void showDetails() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Table Section: " + tableSection);
        performDuties();
        System.out.println("---");
    }
}
