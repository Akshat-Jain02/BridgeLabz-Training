package com.day08.movietime;

import java.util.ArrayList;
import java.util.List;

class ShowtimeManager {
    private List<MovieShow> schedule;

    public ShowtimeManager() {
        this.schedule = new ArrayList<>();
    }

    public void addShow(MovieShow show) {
        schedule.add(show);
        sortByInsertion();
    }

    private void sortByInsertion() {
        for (int i = 1; i < schedule.size(); i++) {
            MovieShow key = schedule.get(i);
            int j = i - 1;

            while (j >= 0 && schedule.get(j).getStartTime().isAfter(key.getStartTime())) {
                schedule.set(j + 1, schedule.get(j));
                j--;
            }
            schedule.set(j + 1, key);
        }
    }

    public void printTodaySchedule() {
        System.out.println("══════════════════════════════════════════");
        System.out.println("          Today's Movie Schedule");
        System.out.println("══════════════════════════════════════════");

        if (schedule.isEmpty()) {
            System.out.println("No shows scheduled yet.");
            return;
        }

        for (MovieShow show : schedule) {
            System.out.println(show);
        }
        System.out.println("══════════════════════════════════════════\n");
    }
}