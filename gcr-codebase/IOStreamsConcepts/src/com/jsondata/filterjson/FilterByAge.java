package com.jsondata.filterjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterByAge {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootArray = mapper.readTree(new File("src/com/jsondata/students.json"));

        for (JsonNode node : rootArray) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node);
            }
        }
    }
}
