package com.generics.aidrivenresumescreening;

class Screening {
    public static void main(String[] args) {
        Resume r1 = new Resume("Aman", 4, "Java", "Spring", "SQL");
        Resume r2 = new Resume("Priya", 2, "Python", "ML", "Pandas");
        Resume r3 = new Resume("Rahul", 1, "Java", "HTML");
        
        JobApplication<SoftwareEngineer> app1 = 
            new JobApplication<>(r1, new SoftwareEngineer());
            
        JobApplication<DataScientist> app2 = 
            new JobApplication<>(r2, new DataScientist());
            
        JobApplication<SoftwareEngineer> app3 = 
            new JobApplication<>(r3, new SoftwareEngineer());
        
        // Show results
        System.out.println(app1.getInfo());
        System.out.println(app2.getInfo());
        System.out.println(app3.getInfo());
    }
}