package com.jsondata.jsontolist;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class ConvertListToJson {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Car> cars = Arrays.asList(
                new Car("Honda", "City", 1200000),
                new Car("Hyundai", "i20", 900000),
                new Car("Toyota", "Innova", 2500000)
        );

        String jsonArray = mapper.writeValueAsString(cars);

        System.out.println(jsonArray);
    }
}
