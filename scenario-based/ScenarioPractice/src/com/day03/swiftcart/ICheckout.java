package com.day03.swiftcart;

interface ICheckout {
    void generateBill();
    void applyDiscount(double couponValue); // couponValue is flat discount amount
}