package com.day07.foodloop;

public interface IOrderable {
	
    void placeOrder(FoodItem item);
    void cancelOrder(FoodItem item);
    
}
