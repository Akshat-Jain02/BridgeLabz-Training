package com.reflection.dynamicobjectcreation;

class Student {
    private int id;
    private String name;

    public Student() {
        this.id = 1;
        this.name = "Default";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
