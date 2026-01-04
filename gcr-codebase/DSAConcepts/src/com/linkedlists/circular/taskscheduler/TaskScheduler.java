package com.linkedlists.circular.taskscheduler;

import java.util.Scanner;

public class TaskScheduler {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        CircularTaskScheduler scheduler = new CircularTaskScheduler();
        
        int choice;

        do {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    String due = sc.nextLine();

                    if (choice == 1)
                        scheduler.addAtBeginning(id, name, priority, due);
                    else if (choice == 2)
                        scheduler.addAtEnd(id, name, priority, due);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        scheduler.addAtPosition(pos, id, name, priority, due);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    scheduler.removeByTaskId(sc.nextInt());
                    break;

                case 5:
                    scheduler.viewCurrentTask();
                    break;

                case 6:
                    scheduler.displayAll();
                    break;

                case 7:
                    System.out.print("Enter Priority: ");
                    scheduler.searchByPriority(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}