package com.day06.fleetmanager;

import java.util.ArrayList;
import java.util.List;

class Merger {

    static List<Vehicle> merge(List<Vehicle> a, List<Vehicle> b) {
        List<Vehicle> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).mileage <= b.get(j).mileage) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    static List<Vehicle> mergeAll(List<List<Vehicle>> depots) {
        if (depots.isEmpty()) return new ArrayList<>();

        List<Vehicle> result = new ArrayList<>(depots.get(0));

        for (int i = 1; i < depots.size(); i++) {
            result = merge(result, depots.get(i));
        }

        return result;
    }
}