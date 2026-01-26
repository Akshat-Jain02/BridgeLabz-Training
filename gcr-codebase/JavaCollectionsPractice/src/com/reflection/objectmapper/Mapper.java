package com.reflection.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class Mapper {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Akshat");
        data.put("marks", 88.5);

        Student student =
                ObjectMapper.toObject(Student.class, data);

        System.out.println(student);
    }
}
