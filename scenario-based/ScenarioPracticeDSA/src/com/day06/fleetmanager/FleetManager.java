package com.day06.fleetmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FleetManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Vehicle>> depots = new ArrayList<>();

        System.out.print("depots: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int d = 1; d <= n; d++) {
            System.out.print("vehicles in depot " + d + ": ");
            int count = sc.nextInt();
            sc.nextLine();

            List<Vehicle> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                System.out.print("reg mileage: ");
                String[] p = sc.nextLine().split(" ");
                list.add(new Vehicle(p[0], Integer.parseInt(p[1]), "D" + d));
            }
            depots.add(list);
        }

        List<Vehicle> result = Merger.mergeAll(depots);

        System.out.println("result:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println((i+1) + " " + result.get(i));
        }

        sc.close();
    }
}