package com.generics.personalizedmealplan;

class VegetarianMeal implements MealPlan {
    private String preference;

    public VegetarianMeal(String preference) {
        this.preference = preference;
    }

    @Override
    public String getDietType() {
        return "Vegetarian";
    }

    @Override
    public boolean isValidForGoal(String goal) {
        return !goal.equalsIgnoreCase("high-protein-strict");
    }

    @Override
    public String getSampleMeal() {
        return preference.equalsIgnoreCase("Indian")
                ? "Dal, Rice, Paneer Sabzi, Roti, Salad"
                : "Veggie Pasta, Garlic Bread, Greek Salad";
    }
}