package com.day04.fittrack;

public class FitTrack {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Akshat", 22, 70.5, "Weight Loss");

        Workout cardio = new CardioWorkout(30);
        cardio.startWorkout();
        cardio.calculateCalories();
        cardio.stopWorkout();

        int dailyTarget = 500;
        int progress = dailyTarget - cardio.getCaloriesBurned();

        System.out.println("Calories Burned: " + cardio.getCaloriesBurned());
        System.out.println("Remaining Calories to Target: " + progress);
    }
}
