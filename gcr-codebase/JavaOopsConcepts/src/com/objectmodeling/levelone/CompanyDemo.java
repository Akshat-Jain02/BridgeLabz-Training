package com.objectmodeling.levelone;

public class CompanyDemo {
	
    public static void main(String[] args) {

        Company techCompany = new Company("TechSoft");

        Department dev = new Department("Development");
        dev.addEmployee("Aman");
        dev.addEmployee("Ravi");

        Department hr = new Department("HR");
        hr.addEmployee("Neha");

        techCompany.addDepartment(dev);
        techCompany.addDepartment(hr);

        // Closing company
        techCompany.closeCompany();
    }
}
