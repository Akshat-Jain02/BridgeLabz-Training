package com.day06.artexpo;

import java.time.LocalTime;

class Artist {
    private String name;
    private LocalTime registrationTime;

    public Artist(String name, LocalTime registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return String.format("%-15s  %s", name, registrationTime);
    }
}