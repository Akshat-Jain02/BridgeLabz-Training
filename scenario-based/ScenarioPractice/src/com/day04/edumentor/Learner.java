package com.day04.edumentor;

class Learner extends User implements ICertifiable {

    private int progress; 
    private String courseType;     

    public Learner(String name, String email, int userId, int progress, String courseType) {
        super(name, email, userId);
        this.progress = progress;
        this.courseType = courseType;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short") && progress >= 80) {
            System.out.println("Short Course Certificate generated for " + getName());
        } 
        else if (courseType.equalsIgnoreCase("full-time") && progress == 100) {
            System.out.println("Full-Time Course Certificate generated for " + getName());
        } 
        else {
            System.out.println("Certificate not eligible yet for " + getName());
        }
    }
}
