package com.day05.robowarehouse;

class Package {
    private double weight;
    private String id;

    public Package(String id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f kg)", id, weight);
    }
}