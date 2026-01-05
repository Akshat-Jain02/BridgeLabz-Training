package com.queues.circulartourproblem;

class CircularTour {

    public static int findStartingPump(PetrolPump[] pumps) {
        int n = pumps.length;

        Queue queue = new Queue(n);
        int surplusPetrol = 0;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {

            surplusPetrol += pumps[i].petrol - pumps[i].distance;
            queue.enqueue(i);

            // If petrol becomes negative, remove pumps from front
            while (surplusPetrol < 0 && !queue.isEmpty()) {
                int removedIndex = queue.dequeue();
                surplusPetrol -= (pumps[removedIndex].petrol
                                - pumps[removedIndex].distance);
                startIndex = removedIndex + 1;
            }
        }

        return queue.isEmpty() ? -1 : startIndex;
    }
}
