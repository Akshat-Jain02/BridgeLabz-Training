package com.day07.fitnesstracker;

public class FitnessTrackerApp {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        // Initial group of users (small group < 20)
        tracker.addUser("Akshat", 12450);
        tracker.addUser("Priya", 10890);
        tracker.addUser("Rahul", 15670);
        tracker.addUser("Sneha", 9870);
        tracker.addUser("Vikram", 14230);
        tracker.addUser("Ananya", 11540);
        tracker.addUser("Rohan", 8760);
        tracker.addUser("Meera", 13120);

        System.out.println("Initial leaderboard:");
        tracker.showLeaderboard();

        // Simulate late syncs / updates during the day
        System.out.println("Some users synced more steps late in the day...\n");

        tracker.updateSteps("Priya", 14850);
        tracker.updateSteps("Rohan", 13440);
        tracker.updateSteps("Sneha", 11290);
        tracker.updateSteps("Akshat", 13870);

        System.out.println("Updated leaderboard after late syncs:");
        tracker.showLeaderboard();

        // One more update example
        System.out.println("Final burst of activity...\n");
        tracker.updateSteps("Meera", 17210);
        tracker.updateSteps("Vikram", 15980);

        System.out.println("Final Daily Leaderboard:");
        tracker.showLeaderboard();
    }
}