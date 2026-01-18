package com.generics.personalizedmealplan;

class HighProteinMeal implements MealPlan {
    @Override
    public String getDietType() {
        return "High-Protein";
    }

    @Override
    public boolean isValidForGoal(String goal) {
        String g = goal.toLowerCase();
        return g.contains("muscle") || g.contains("strength") || g.contains("protein");
    }

    @Override
    public String getSampleMeal() {
        return "Chicken Breast, Egg Whites, Greek Yogurt, Protein Shake";
    }
}