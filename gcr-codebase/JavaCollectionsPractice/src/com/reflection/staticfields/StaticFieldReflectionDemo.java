package com.reflection.staticfields;

import java.lang.reflect.Field;

public class StaticFieldReflectionDemo {

    public static void main(String[] args) {

        Class<?> clazz;
		try {
		clazz = Class.forName("com.reflection.staticfields.Configuration");
		

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY");

        System.out.println("Modified API_KEY: " + field.get(null));
        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
