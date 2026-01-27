package com.annotations.taskinfo;

public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Akshat")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
