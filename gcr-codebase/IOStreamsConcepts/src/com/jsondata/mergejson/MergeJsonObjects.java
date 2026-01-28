package com.jsondata.mergejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonObjects {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("src/com/jsondata/json1.json"));
        JsonNode json2 = mapper.readTree(new File("src/com/jsondata/json2.json"));

        ObjectNode merged = mapper.createObjectNode();

        merged.setAll((ObjectNode) json1);
        merged.setAll((ObjectNode) json2);

        String result = mapper.writeValueAsString(merged);

        System.out.println(result);
    }
}
