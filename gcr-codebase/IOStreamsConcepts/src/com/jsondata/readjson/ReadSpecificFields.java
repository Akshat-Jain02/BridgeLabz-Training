package com.jsondata.readjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadSpecificFields {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(new File("src/com/jsondata/user.json"));

        String name = rootNode.get("name").asText();
        String email = rootNode.get("email").asText();

        System.out.println(name);
        System.out.println(email);
    }
}
