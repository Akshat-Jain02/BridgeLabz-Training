package com.day10.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {

    private int bagId;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {

        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to Bag " + bagId);
        } else {
            System.out.println("Bag " + bagId + " is full");
        }
    }

    public void removeBall(int ballId) {

        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).getId() == ballId) {
                balls.remove(i);
                System.out.println("Ball removed from Bag " + bagId);
                return;
            }
        }

        System.out.println("Ball not found in Bag " + bagId);
    }

    public void display() {
        System.out.println("Bag ID: " + bagId + " | Color: " + color + " | Balls: " + balls.size());
    }

    public void displayBalls() {
        for (Ball ball : balls) {
            ball.display();
        }
    }
}

