package com.lamdaexpressions.shoppingecommercesystem;

@FunctionalInterface
public interface DiscountCalculator {
    double apply(double price);
}
