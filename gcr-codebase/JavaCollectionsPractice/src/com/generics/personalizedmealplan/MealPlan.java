package com.generics.personalizedmealplan;

interface MealPlan {
    String getDietType();
    boolean isValidForGoal(String goal);
    String getSampleMeal();
}