package com.linkedlists.circular.roundrobinschedulingalgorithm;

class RoundRobinScheduler {
	
    ProcessNode head = null;

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display processes
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println(
                "PID: " + temp.pid +
                ", Remaining Time: " + temp.remainingTime +
                ", Priority: " + temp.priority
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin Scheduling
    void schedule(int quantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = null;
        int time = 0;
        int processCount = countProcesses();
        int completed = 0;

        while (completed < processCount) {

            if (current.remainingTime > 0) {
                int execTime = Math.min(quantum, current.remainingTime);
                current.remainingTime -= execTime;
                time += execTime;

                // Update waiting time for other processes
                ProcessNode temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0)
                        temp.waitingTime += execTime;
                    temp = temp.next;
                } while (temp != head);

                // If process completed
                if (current.remainingTime == 0) {
                    current.turnaroundTime = time;
                    completed++;

                    // Remove process from circular list
                    if (current == head && head.next == head) {
                        head = null;
                        break;
                    }

                    if (current == head) {
                        ProcessNode last = head;
                        while (last.next != head)
                            last = last.next;

                        head = head.next;
                        last.next = head;
                        current = head;
                        continue;
                    } else {
                        prev.next = current.next;
                        current = current.next;
                        continue;
                    }
                }
            }

            prev = current;
            current = current.next;

            System.out.println("\nProcesses after this round:");
            displayProcesses();
        }

        calculateAverages();
    }

    // Count processes
    int countProcesses() {
        if (head == null) return 0;

        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Calculate averages
    void calculateAverages() {
        double totalWT = 0, totalTAT = 0;
        int count = countProcesses();

        ProcessNode temp = head;
        if (temp == null) return;

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\n--- Scheduling Results ---");
        System.out.println("Average Waiting Time: " + (totalWT / count));
        System.out.println("Average Turnaround Time: " + (totalTAT / count));
    }
}
