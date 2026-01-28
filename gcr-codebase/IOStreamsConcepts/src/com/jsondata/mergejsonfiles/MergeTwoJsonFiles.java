package com.jsondata.mergejsonfiles;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class MergeTwoJsonFiles {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        
        JsonNode json1 = mapper.readTree(new File("src/com/jsondata/user.json"));
        JsonNode json2 = mapper.readTree(new File("src/com/jsondata/students.json"));

        ObjectNode merged = mapper.createObjectNode();

        Iterator<Map.Entry<String, JsonNode>> fields1 = json1.fields();
        while (fields1.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields1.next();
            merged.set(entry.getKey(), entry.getValue());
        }

        Iterator<Map.Entry<String, JsonNode>> fields2 = json2.fields();
        while (fields2.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields2.next();
            merged.set(entry.getKey(), entry.getValue());
        }

        System.out.println(mapper.writeValueAsString(merged));
    }
}
