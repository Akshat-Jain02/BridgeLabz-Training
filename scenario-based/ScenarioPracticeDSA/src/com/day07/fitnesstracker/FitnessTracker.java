package com.day07.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

class FitnessTracker {
    private List<UserStep> users;

    public FitnessTracker() {
        users = new ArrayList<>();
    }

    public void addUser(String name, int initialSteps) {
        users.add(new UserStep(name, initialSteps));
    }

    public void updateSteps(String name, int newSteps) {
        for (UserStep user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                user.setSteps(newSteps);
                return;
            }
        }
    }

    public void bubbleSortByStepsDescending() {
        int n = users.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (users.get(j).getSteps() < users.get(j + 1).getSteps()) {
                    UserStep temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
    }

    public void showLeaderboard() {
        bubbleSortByStepsDescending();

        System.out.println("\n      Daily Step Leaderboard");
        System.out.println("-------------------------------------");
        System.out.println("Rank | Name               | Steps   ");
        System.out.println("-------------------------------------");

        for (int i = 0; i < users.size(); i++) {
            UserStep u = users.get(i);
            System.out.printf("%4d | %s%n", (i + 1), u);
        }

        System.out.println("-------------------------------------");
        System.out.println("Total participants: " + users.size() + "\n");
    }
}