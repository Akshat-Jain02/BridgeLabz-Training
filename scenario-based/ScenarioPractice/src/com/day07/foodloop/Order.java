package com.day07.foodloop;

import java.util.*;

public class Order implements IOrderable{
    private List<FoodItem> items;
    private double totalPrice;
    private double discountedPrice;
    
    public Order() {
    	this.items = new ArrayList<>();
    }
    
	@Override
	public void placeOrder(FoodItem item) {
		items.add(item);
		totalPrice += item.getPrice();
	}
 
	public void placeOrder(FoodItem... combo) {
		for (FoodItem item : combo) {
			items.add(item);
			totalPrice += item.getPrice();
		}
	}
	
	@Override
	public void cancelOrder(FoodItem item) {
		if (items.contains(item)) {
			items.remove(item);
		    totalPrice -= item.getPrice();
		    System.out.println("canelled order successfully");
		} else {
			System.out.println("You haven't purchased this item");
		}    
	}
	
	public void applyDiscount(double percentage) {
		double discount = (totalPrice * percentage) / 100;
		double discountedPrice = totalPrice - discount;
	}
  
    public void display() {
    	for (FoodItem item : items) {
    		System.out.println(item);
    	}
    	
    	System.out.println("-----------------BILL------------" +
    	                   "\nTOTAL BILL : " + totalPrice +
    	                   "\nDISCOUNT : " + discountedPrice +
    	                   "\nBILL AFTER DISCOUNT : " + (totalPrice - discountedPrice));
    	
    }
}
