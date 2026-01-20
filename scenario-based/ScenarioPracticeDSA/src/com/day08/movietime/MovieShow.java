package com.day08.movietime;

import java.time.LocalTime;

class MovieShow {
    private String title;
    private LocalTime startTime;
    private String screen;

    public MovieShow(String title, LocalTime startTime, String screen) {
        this.title = title;
        this.startTime = startTime;
        this.screen = screen;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return startTime + "  " + title + "  (Screen " + screen + ")";
    }
}