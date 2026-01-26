package com.reflection.accessprivatefield;
import java.lang.reflect.Field;

public class PrivateFieldAccess {
	
    public static void main(String[] args) throws Exception {

        Person person = new Person();

        Class<?> clazz = person.getClass();

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);

        ageField.set(person, 30);

        int ageValue = (int) ageField.get(person);

        System.out.println("Modified Age: " + ageValue);
    }
}
