package com.annotations.logexecutiontime;

public class ExecutionTimeAnalyzer {

    public static void main(String[] args) {
        PerformanceService service = new PerformanceService();
        ExecutionTimeProcessor.process(service);
    }
}
