package com.annotations.logexecutiontime;

public class PerformanceService {

    @LogExecutionTime
    public void fastOperation() {
        for (int i = 0; i < 1_000_000; i++) {
            int x = i * i;
        }
    }

    @LogExecutionTime
    public void slowOperation() {
        for (int i = 0; i < 100_000_000; i++) {
            int x = i * i;
        }
    }

    public void normalOperation() {
        System.out.println("This method is not logged");
    }
}
