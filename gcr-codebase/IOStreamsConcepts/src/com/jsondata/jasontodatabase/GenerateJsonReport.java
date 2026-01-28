package com.jsondata.jasontodatabase;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateJsonReport {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:h2:mem:testdb";
        String user = "sa";
        String password = "";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement stmt = connection.createStatement();

        stmt.execute("""
            CREATE TABLE students (
                id INT,
                name VARCHAR(50),
                age INT,
                email VARCHAR(50)
            )
        """);

        stmt.execute("""
            INSERT INTO students VALUES
            (1, 'Divyansh', 21, 'divyansh@example.com'),
            (2, 'Amit', 28, 'amit@example.com')
        """);

        ResultSet rs = stmt.executeQuery(
                "SELECT id, name, age, email FROM students"
        );

        List<Map<String, Object>> report = new ArrayList<>();

        while (rs.next()) {
            Map<String, Object> row = new HashMap<>();
            row.put("id", rs.getInt("id"));
            row.put("name", rs.getString("name"));
            row.put("age", rs.getInt("age"));
            row.put("email", rs.getString("email"));
            report.add(row);
        }

        rs.close();
        stmt.close();
        connection.close();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(report);

        System.out.println(json);
    }
}
