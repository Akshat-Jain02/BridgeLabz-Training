package com.linkedlists.circular.roundrobinschedulingalgorithm;

import java.util.Scanner;

public class RoundRobinScheduling {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter PID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Burst Time: ");
            int burst = sc.nextInt();
            System.out.print("Enter Priority: ");
            int priority = sc.nextInt();
            scheduler.addProcess(pid, burst, priority);
        }

        System.out.print("Enter Time Quantum: ");
        int quantum = sc.nextInt();

        scheduler.schedule(quantum);
        sc.close();
    }
}
