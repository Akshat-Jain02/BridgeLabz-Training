package com.generics.personalizedmealplan;

class VeganMeal implements MealPlan {
    @Override
    public String getDietType() {
        return "Vegan";
    }

    @Override
    public boolean isValidForGoal(String goal) {
        return true;
    }

    @Override
    public String getSampleMeal() {
        return "Chickpea Curry, Quinoa, Roasted Vegetables, Hummus";
    }
}