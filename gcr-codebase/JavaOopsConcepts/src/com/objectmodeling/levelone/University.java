package com.objectmodeling.levelone;

import java.util.ArrayList;

public class University {

    String universityName;
    ArrayList<Department1> departments;
    ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: University creates and owns departments
    public void addDepartment(String departmentName) {
        departments.add(new Department1(departmentName));
    }

    // Aggregation: Faculty added but not owned
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Deleting university deletes departments
    public void closeUniversity() {
        departments.clear();
        System.out.println("University closed. All departments deleted.");
    }
    
}
