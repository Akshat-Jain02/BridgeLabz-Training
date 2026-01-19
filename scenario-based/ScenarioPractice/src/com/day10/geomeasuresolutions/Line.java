package com.day10.geomeasuresolutions;

public class Line {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public void displayLine() {
        System.out.println("Line: (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
}

