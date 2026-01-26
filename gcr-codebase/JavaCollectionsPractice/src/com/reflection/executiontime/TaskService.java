package com.reflection.executiontime;

public class TaskService {

    public void task() {
        for (int i = 0; i < 1_000_000; i++);
    }
}
