package com.day04.hospitalqueue;

class Patient {
	
    private String name;
    private int criticalityLevel;

    public Patient(String name, int criticalityLevel) {
        this.name = name;
        this.criticalityLevel = criticalityLevel;
    }

    public String getName() {
        return name;
    }

    public int getCriticalityLevel() {
        return criticalityLevel;
    }
}