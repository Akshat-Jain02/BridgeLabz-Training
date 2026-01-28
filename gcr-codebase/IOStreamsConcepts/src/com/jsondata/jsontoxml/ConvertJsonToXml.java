package com.jsondata.jsontoxml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class ConvertJsonToXml {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode = jsonMapper.readTree(
                new File("src/com/jsondata/user.json")
        );

        String xml = xmlMapper.writeValueAsString(jsonNode);

        System.out.println(xml);
    }
}
