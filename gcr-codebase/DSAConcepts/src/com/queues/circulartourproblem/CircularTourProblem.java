package com.queues.circulartourproblem;

public class CircularTourProblem {
	
    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int start = CircularTour.findStartingPump(pumps);

        if (start == -1) {
            System.out.println("No circular tour possible");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
