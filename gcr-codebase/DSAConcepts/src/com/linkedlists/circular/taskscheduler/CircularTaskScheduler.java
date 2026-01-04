package com.linkedlists.circular.taskscheduler;

class CircularTaskScheduler {
	
    TaskNode head = null;
    TaskNode current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Task ID
    void removeByTaskId(int id) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }

                    if (head == head.next) { // only one node
                        head = current = null;
                        return;
                    }

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                if (current == temp)
                    current = temp.next;

                System.out.println("Task removed successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found!");
    }

    // View current task and move to next
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Current Task:");
        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks in scheduler.");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with this priority.");
    }

    // Helper method
    void displayTask(TaskNode t) {
        System.out.println(
            "Task ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority +
            ", Due Date: " + t.dueDate
        );
    }
}