package com.day06.icecreamrush;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    // Simple display format
    public String toString() {
        return String.format("%-18s : %4d cups", name, sales);
    }
}