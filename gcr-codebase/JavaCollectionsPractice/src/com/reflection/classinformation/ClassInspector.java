package com.reflection.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = sc.nextLine();

        Class<?> clazz = Class.forName(className);

        System.out.println("\nClass Name:");
        System.out.println(clazz.getName());

        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
