package com.day04.zipzipmart;

import java.time.LocalDate;

class Sale {
    LocalDate date;
    double amount;
    String branch;
    
    public Sale(LocalDate date, double amount, String branch) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
    }
}