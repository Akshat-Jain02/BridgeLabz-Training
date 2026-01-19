package com.day10.bagnballorganizer;

public class BagNBall {


    public static void main(String[] args) {

        Bag bag1 = new Bag(101, "Red", 3);

        Ball b1 = new Ball(1, "Blue", "Small");
        Ball b2 = new Ball(2, "Green", "Medium");
        Ball b3 = new Ball(3, "Yellow", "Large");
        Ball b4 = new Ball(4, "Black", "Small");

        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3);
        bag1.addBall(b4);

        System.out.println();
        bag1.display();
        bag1.displayBalls();

        System.out.println();
        bag1.removeBall(2);

        System.out.println();
        bag1.display();
        bag1.displayBalls();
    }
}

