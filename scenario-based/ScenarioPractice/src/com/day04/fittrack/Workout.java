package com.day04.fittrack;

class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    private String[] workoutLogs = new String[5]; // internal logs (PRIVATE)

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public void calculateCalories() {
        caloriesBurned = duration * 5; // default logic
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}
