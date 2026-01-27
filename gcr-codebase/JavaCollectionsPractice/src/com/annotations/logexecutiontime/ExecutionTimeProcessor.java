package com.annotations.logexecutiontime;
import java.lang.reflect.Method;

public class ExecutionTimeProcessor {

    public static void process(Object obj) {

        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long start = System.nanoTime();
                    method.invoke(obj);
                    long end = System.nanoTime();

                    long timeInMs = (end - start) / 1_000_000;

                    System.out.println(
                        method.getName() + " executed in " + timeInMs + " ms"
                    );

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
