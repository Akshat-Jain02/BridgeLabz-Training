package com.generics.personalizedmealplan;

class KetoMeal implements MealPlan {
    @Override
    public String getDietType() {
        return "Keto";
    }

    @Override
    public boolean isValidForGoal(String goal) {
        return goal.toLowerCase().contains("weight-loss") || 
               goal.toLowerCase().contains("fat-loss");
    }

    @Override
    public String getSampleMeal() {
        return "Grilled Salmon, Avocado, Eggs, Spinach with Butter";
    }
}