package com.day08.foodfest;

import java.util.ArrayList;
import java.util.List;

public class FoodFestApp {
    public static void main(String[] args) {
        FoodFestAnalyzer fest = new FoodFestAnalyzer();

        List<StallFootfall> zoneA = new ArrayList<>(List.of(
                new StallFootfall("Biryani House", "A", 1245, "Indian"),
                new StallFootfall("Tandoori Flames", "A", 980, "Indian"),
                new StallFootfall("Pasta Paradise", "A", 720, "Italian"),
                new StallFootfall("Vada Pav Express", "A", 510, "Street")
        ));

        List<StallFootfall> zoneB = new ArrayList<>(List.of(
                new StallFootfall("Cheese Burst Pizza", "B", 1520, "Italian"),
                new StallFootfall("Momoman", "B", 1340, "Chinese"),
                new StallFootfall("Falafel Corner", "B", 890, "Middle Eastern"),
                new StallFootfall("Chaat Kingdom", "B", 650, "Street")
        ));

        List<StallFootfall> zoneC = new ArrayList<>(List.of(
                new StallFootfall("Sushi Mania", "C", 1650, "Japanese"),
                new StallFootfall("Burger Bonanza", "C", 1420, "American"),
                new StallFootfall("Tacos Fiesta", "C", 930, "Mexican"),
                new StallFootfall("Bubble Tea Bliss", "C", 480, "Drinks")
        ));

        fest.addZoneData(zoneA);
        fest.printTop(5);

        fest.addZoneData(zoneB);
        fest.printTop(7);

        fest.addZoneData(zoneC);
        fest.printTop(10);
    }
}