package com.day08.movietime;

import java.time.LocalTime;

public class MovieTimeShowtime {
    public static void main(String[] args) {
        ShowtimeManager theater = new ShowtimeManager();

        // Adding shows in random order (as they might arrive in real system)
        theater.addShow(new MovieShow("Deadpool & Wolverine", LocalTime.of(9, 45), "Audi 3"));
        theater.addShow(new MovieShow("Dune: Part Two",      LocalTime.of(10, 30), "Audi 1"));
        theater.printTodaySchedule();

        theater.addShow(new MovieShow("Interstellar",        LocalTime.of(12, 0),  "Audi 2"));
        theater.addShow(new MovieShow("Inception",           LocalTime.of(13, 20), "Audi 4"));
        theater.printTodaySchedule();

        theater.addShow(new MovieShow("Oppenheimer",         LocalTime.of(14, 15), "Audi 1"));
        theater.addShow(new MovieShow("The Matrix",          LocalTime.of(17, 30), "Audi 5"));
        theater.addShow(new MovieShow("Avengers: Endgame",   LocalTime.of(20, 0),  "Audi 3"));
        theater.printTodaySchedule();
    }
}