package com.jsondata.validatejson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJsonSyntax {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("src/com/jsondata/user.json"));
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
