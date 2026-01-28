package com.jsondata.csvtojson;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ConvertCsvToJson {

    public static void main(String[] args) throws Exception {

        CsvMapper csvMapper = new CsvMapper();
        ObjectMapper jsonMapper = new ObjectMapper();

        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Map<String, String>> iterator =
                csvMapper.readerFor(Map.class)
                        .with(schema)
                        .readValues(new File("src/com/jsondata/data.csv"));

        List<Map<String, String>> rows = iterator.readAll();

        String json = jsonMapper.writeValueAsString(rows);

        System.out.println(json);
    }
}
