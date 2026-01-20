package com.day07.eduresults;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EduResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RankSheet rankSheet = new RankSheet();

        System.out.print("Enter number of districts: ");
        int districts = sc.nextInt();
        sc.nextLine();

        for (int d = 1; d <= districts; d++) {
            System.out.println("\nDistrict " + d + " (already sorted by marks descending):");

            List<Student> districtList = new ArrayList<>();

            System.out.print("Number of students in district " + d + ": ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Student " + (i + 1) + " (name roll marks): ");
                String line = sc.nextLine();
                String[] parts = line.trim().split("\\s+");

                if (parts.length != 3) {
                    System.out.println("Invalid input. Skipping...");
                    i--;
                    continue;
                }

                String name = parts[0];
                int roll = Integer.parseInt(parts[1]);
                int marks = Integer.parseInt(parts[2]);

                districtList.add(new Student(name, roll, marks, "Dist-" + d));
            }

            rankSheet.addDistrictList(districtList);
        }

        System.out.println("\nMerging all district lists using Merge Sort...");
        rankSheet.generateFinalRankList();

        rankSheet.displayRankSheet();

        sc.close();
    }
}