package com.day10.onlineticketbookingbytime;

import java.time.LocalDateTime;

public class Event {
    private  int id;
    private  String name;
    private  LocalDateTime startTime;

    public Event(int id, String name, LocalDateTime startTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return name + " -> " + startTime;
    }
}
