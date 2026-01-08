package com.day06.medistore;

public interface ISellable {
	
    double sell(int quantity);
    boolean checkExpiry();
}
