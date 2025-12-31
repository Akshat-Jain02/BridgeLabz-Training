package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Company {
	
    String companyName;
    ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void closeCompany() {
        departments.clear(); // deletes departments and employees
        System.out.println(companyName + " has been closed.");
    }
}
