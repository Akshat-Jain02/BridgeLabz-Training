package com.day10.hospitalqueuemanagement;

import java.time.LocalDateTime;

public class Patient {
    private  int id;
    private  String name;
    private  LocalDateTime checkInTime;

    public Patient(int id, String name, LocalDateTime checkInTime) {
        this.id = id;
        this.name = name;
        this.checkInTime = checkInTime;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    @Override
    public String toString() {
        return name + " -> " + checkInTime;
    }
}
