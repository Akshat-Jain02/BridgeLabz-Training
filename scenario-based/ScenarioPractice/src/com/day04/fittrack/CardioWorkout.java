package com.day04.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8; // higher burn
    }
}
