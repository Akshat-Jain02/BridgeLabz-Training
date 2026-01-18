package com.generics.personalizedmealplan;

class Meal<T extends MealPlan> {
    private final T plan;
    private final String goal;
    private final int mealsPerDay;

    public Meal(T plan, String goal, int mealsPerDay) {
        this.plan = plan;
        this.goal = goal;
        this.mealsPerDay = mealsPerDay;
    }

    public T getPlan() {
        return plan;
    }

    public String getGoal() {
        return goal;
    }

    public int getMealsPerDay() {
        return mealsPerDay;
    }
}