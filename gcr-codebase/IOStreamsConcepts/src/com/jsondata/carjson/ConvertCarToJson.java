package com.jsondata.carjson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertCarToJson {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Car car = new Car("Honda", "City", 1200000);

        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}
