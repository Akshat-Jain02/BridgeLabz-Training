package com.day08.gamerzone;

import java.util.ArrayList;
import java.util.List;

class Leaderboard {
    private List<Player> players;

    public Leaderboard() {
        this.players = new ArrayList<>();
    }

    // Add multiple players at once (e.g., after a match)
    public void addPlayers(List<Player> newPlayers) {
        players.addAll(newPlayers);
        quickSort(players, 0, players.size() - 1);
    }

    // Quick Sort implementation (descending order - highest score first)
    private void quickSort(List<Player> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(List<Player> list, int low, int high) {
        Player pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).getScore() >= pivot.getScore()) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<Player> list, int i, int j) {
        Player temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Display top N players
    public void showTopPlayers(int limit) {
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("           GamerZone Global Leaderboard");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Rank  Username            Score    Region");
        System.out.println("───────────────────────────────────────────────────────");

        int count = 0;
        for (Player p : players) {
            if (count >= limit) break;
            System.out.printf("%-4d  %s%n", ++count, p);
        }

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("Total players ranked: " + players.size() + "\n");
    }
}