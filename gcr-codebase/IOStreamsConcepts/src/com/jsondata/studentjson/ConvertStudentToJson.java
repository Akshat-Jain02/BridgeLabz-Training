package com.jsondata.studentjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

public class ConvertStudentToJson {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Student student = new Student(
                "Akshat",
                21,
                Arrays.asList("Maths", "Physics", "Computer Science")
        );

        String json = mapper.writeValueAsString(student);

        System.out.println(json);
    }
}
