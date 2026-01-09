package com.day07.skillforge;

class Student extends User implements ICertifiable {
    private int completedModules;
    private Course course;

    Student(String name, Course course) {
        super(name);
        this.course = course;
    }

    public void completeModule() {
        completedModules++;
    }

    public double getProgress() {
        return (completedModules * 100.0) / course.getTotalModules();
    }

    @Override
    public void generateCertificate() {
        if (getProgress() == 100) {
            System.out.println("Certificate: Completion Certificate for " + course.getTitle());
        } else {
            System.out.println("Complete all modules to get certificate.");
        }
    }
}
