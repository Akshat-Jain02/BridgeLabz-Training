package com.generics.personalizedmealplan;

class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> createPersonalizedPlan(
            T selectedPlan,
            String fitnessGoal,
            int mealsPerDay) {

        if (selectedPlan == null) {
            throw new IllegalArgumentException("Meal plan type cannot be null");
        }

        if (!selectedPlan.isValidForGoal(fitnessGoal)) {
            throw new IllegalArgumentException(
                "This " + selectedPlan.getDietType() + 
                " plan is not suitable for goal: " + fitnessGoal
            );
        }

        if (mealsPerDay < 3 || mealsPerDay > 6) {
            throw new IllegalArgumentException("Meals per day must be between 3 and 6");
        }

        System.out.println("✓ Created " + selectedPlan.getDietType() + 
                          " plan for: " + fitnessGoal);

        return new Meal<>(selectedPlan, fitnessGoal, mealsPerDay);
    }

    // Print method using wildcard
    public static void printMealPlan(Meal<? extends MealPlan> meal) {
        MealPlan p = meal.getPlan();
        System.out.println("Diet Type     : " + p.getDietType());
        System.out.println("Goal          : " + meal.getGoal());
        System.out.println("Meals per day : " + meal.getMealsPerDay());
        System.out.println("Sample Meal   : " + p.getSampleMeal());
        System.out.println("─".repeat(45));
    }
}