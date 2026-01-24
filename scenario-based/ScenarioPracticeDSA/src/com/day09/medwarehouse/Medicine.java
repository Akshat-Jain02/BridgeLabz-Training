package com.day09.medwarehouse;

import java.time.LocalDate;

class Medicine {
    String name;
    LocalDate expiry;
    
    Medicine(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }
    
    @Override
    public String toString() {
        return name + "  " + expiry;
    }
}