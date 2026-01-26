package com.day10.gamingapp;

public class Player {
	
    private  int id;
    private  String name;
    private int points;

    public Player(int id, String name, int points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return name + " (" + points + ")";
    }
}
