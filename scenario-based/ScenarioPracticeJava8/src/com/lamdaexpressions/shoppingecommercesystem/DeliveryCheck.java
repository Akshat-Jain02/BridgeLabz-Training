package com.lamdaexpressions.shoppingecommercesystem;

@FunctionalInterface
public interface DeliveryCheck {
    boolean isFree(double amount);
}
