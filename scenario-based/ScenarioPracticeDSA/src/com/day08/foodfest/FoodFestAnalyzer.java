package com.day08.foodfest;

import java.util.ArrayList;
import java.util.List;

class FoodFestAnalyzer {
    private List<StallFootfall> masterList;

    public FoodFestAnalyzer() {
        this.masterList = new ArrayList<>();
    }

    public void addZoneData(List<StallFootfall> sortedZoneData) {
        masterList = merge(masterList, sortedZoneData);
    }

    private List<StallFootfall> merge(List<StallFootfall> a, List<StallFootfall> b) {
        List<StallFootfall> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).getFootfallCount() >= b.get(j).getFootfallCount()) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    public void printTop(int limit) {
        System.out.println("======================================================");
        System.out.println("           FoodFest – Top Stalls");
        System.out.println("=======================================================");
        System.out.println("Stall                        Zone     Count  Cuisine");
        System.out.println("=======================================================");

        for (int i = 0; i < Math.min(limit, masterList.size()); i++) {
            System.out.println(masterList.get(i));
        }

        System.out.println("=======================================================\n");
    }
}