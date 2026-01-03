package com.day01.universitycourseenrollmentsystem;

public class Postgraduate extends Student {
    public Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public String getProgramType() {
        return "Postgraduate";
    }
}
