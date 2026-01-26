package com.reflection.executiontime;
import java.lang.reflect.Method;

public class ExecutionTimer {

    public static void timeMethod(Object obj, String methodName) throws Exception {

        Class<?> clazz = obj.getClass();

        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);

        long start = System.nanoTime();

        method.invoke(obj);

        long end = System.nanoTime();

        System.out.println(
            methodName + " executed in " + (end - start) / 1_000_000 + " ms"
        );
    }
}
