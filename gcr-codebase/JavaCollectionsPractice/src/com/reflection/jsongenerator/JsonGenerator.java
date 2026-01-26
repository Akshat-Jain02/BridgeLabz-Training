package com.reflection.jsongenerator;
public class JsonGenerator {

    public static void main(String[] args) {

        Student student = new Student(101, "Akshat", 88.5);

        String json = JsonUtil.toJson(student);

        System.out.println(json);
    }
}
