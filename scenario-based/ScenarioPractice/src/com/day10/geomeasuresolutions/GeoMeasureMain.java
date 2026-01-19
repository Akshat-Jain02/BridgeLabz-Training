package com.day10.geomeasuresolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeoMeasureMain {

    public static void compareLines(Line line1, Line line2) {

        double len1 = line1.calculateLength();
        double len2 = line2.calculateLength();

        if (len1 == len2) {
            System.out.println("Both lines are equal in length");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer");
        } else {
            System.out.println("Line 2 is longer");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {

            System.out.println("Enter coordinates for Line " + i);

            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            Line line = new Line(x1, y1, x2, y2);
            lines.add(line);
        }

        compareLines(lines.get(0), lines.get(1));
        scanner.close();
    }
}

