package com.day06.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicines expire 30 days earlier
        return LocalDate.now().isAfter(getExpiryDate().minusDays(30));
    }
}
