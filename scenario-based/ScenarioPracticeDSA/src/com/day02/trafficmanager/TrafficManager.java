package com.day02.trafficmanager;

import java.util.Scanner;

public class TrafficManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roundabout roundabout = new Roundabout();
        WaitingQueue waitingQueue = new WaitingQueue(5);

        while (true) {
            System.out.println("1 Add to Queue 2 Enter Roundabout 3 Exit Roundabout 4 Show 5 Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                String car = sc.next();
                waitingQueue.enqueue(car);
            } else if (choice == 2) {
                String car = waitingQueue.dequeue();
                if (car != null) roundabout.addCar(car);
            } else if (choice == 3) {
                roundabout.removeCar();
            } else if (choice == 4) {
                roundabout.printRoundabout();
            } else {
                break;
            }
        }
    }
}