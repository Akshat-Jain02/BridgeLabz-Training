package com.day07.foodloop;

public class FoodItem {
    protected String name;
    protected String category;
    protected double price;
    protected boolean availability;
    
    public FoodItem(String name, String category, double price, boolean availability) {
    	this.name = name;
    	this.category = category;
    	this.price = price;
    	this.availability = availability;
    }

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}


	public double getPrice() {
		return price;
	}

	public boolean isAvailability() {
		return availability;
	}
	
	@Override
	public String toString() {
		return "\n" + this.name + " " + this.price;
	}
    
}
