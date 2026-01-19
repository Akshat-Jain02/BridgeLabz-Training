package com.collections.mapinterface;
import java.util.*;
public class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
    
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {
            deptMap
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        System.out.println(deptMap);
    }
}
