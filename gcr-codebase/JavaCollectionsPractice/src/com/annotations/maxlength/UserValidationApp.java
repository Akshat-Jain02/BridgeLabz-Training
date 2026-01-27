package com.annotations.maxlength;

public class UserValidationApp {

    public static void main(String[] args) {

        User user1 = new User("Akshat");
        System.out.println(user1.getUsername());

        User user2 = new User("VeryLongUsername123");
    }
}
