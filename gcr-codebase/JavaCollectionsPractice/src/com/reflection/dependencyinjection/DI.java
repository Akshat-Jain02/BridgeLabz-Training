package com.reflection.dependencyinjection;

public class DI {

    public static void main(String[] args) {

        UserService userService =
                SimpleDIContainer.getBean(UserService.class);

        userService.process();
    }
}
