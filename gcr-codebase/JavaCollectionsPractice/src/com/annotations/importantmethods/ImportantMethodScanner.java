package com.annotations.importantmethods;
import java.lang.reflect.Method;

public class ImportantMethodScanner {

    public static void main(String[] args) {

        Class<ServiceManager> clazz = ServiceManager.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println(
                        "Method: " + method.getName() +
                        ", Level: " + annotation.level()
                );
            }
        }
    }
}
