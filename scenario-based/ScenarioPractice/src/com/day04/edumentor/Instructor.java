package com.day04.edumentor;

class Instructor extends User {

    private String expertise;

    public Instructor(String name, String email, int userId, String expertise) {
        super(name, email, userId);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }
}
