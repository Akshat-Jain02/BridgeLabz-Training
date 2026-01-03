package com.day01.universitycourseenrollmentsystem;

public class Undergraduate extends Student{
    public Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public String getProgramType() {
        return "Undergraduate";
    }
}
