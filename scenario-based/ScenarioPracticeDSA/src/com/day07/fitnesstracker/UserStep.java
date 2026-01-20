package com.day07.fitnesstracker;

class UserStep {
    private String name;
    private int steps;

    public UserStep(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return String.format("%-18s | %6d steps", name, steps);
    }
}