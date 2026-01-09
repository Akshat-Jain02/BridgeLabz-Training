package com.day07.skillforge;

class Course {
    private String title;
    private Instructor instructor;
    private String[] modules;
    protected double rating;   // protected logic
    private final String[] reviews = {"Excellent", "Very Good"}; // read-only

    // Default modules constructor
    Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Intro", "Basics", "Advanced"});
    }

    // Custom modules constructor
    Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String[] getReviews() {
        return reviews; // read-only access
    }

    protected void calculateRating(int totalScore, int students) {
        rating = totalScore / (double) students;
    }

    // Polymorphic behavior
    public void generateCertificate() {
        System.out.println("Basic Course Certificate");
    }
}
