package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Department {
	
    String departmentName;
    ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
}
