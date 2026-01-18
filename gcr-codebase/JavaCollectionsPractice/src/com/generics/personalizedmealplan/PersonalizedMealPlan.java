package com.generics.personalizedmealplan;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        try {
            // Valid plans
            Meal<VegetarianMeal> veg = MealPlanGenerator.createPersonalizedPlan(
                new VegetarianMeal("Indian"),
                "maintenance",
                4
            );

            Meal<KetoMeal> keto = MealPlanGenerator.createPersonalizedPlan(
                new KetoMeal(),
                "weight-loss",
                5
            );

            Meal<HighProteinMeal> protein = MealPlanGenerator.createPersonalizedPlan(
                new HighProteinMeal(),
                "muscle gain",
                5
            );

            System.out.println("\nYour Meal Plans:");
            MealPlanGenerator.printMealPlan(veg);
            MealPlanGenerator.printMealPlan(keto);
            MealPlanGenerator.printMealPlan(protein);

            // This should fail (demonstrating validation)
            System.out.println("\nTrying invalid combination...");
            MealPlanGenerator.createPersonalizedPlan(
                new VegetarianMeal("Italian"),
                "high-protein-strict",
                4
            );

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}