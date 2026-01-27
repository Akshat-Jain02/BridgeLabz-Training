package com.annotations.jsonfield;

public class JsonSerializationApp {

    public static void main(String[] args) {

        User user = new User("Akshat", 22, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
