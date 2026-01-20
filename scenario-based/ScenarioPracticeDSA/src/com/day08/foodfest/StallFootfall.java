package com.day08.foodfest;

class StallFootfall {
	
    private String stallName;
    private String zone;
    private int footfallCount;
    private String cuisine;

    public StallFootfall(String stallName, String zone, int footfallCount, String cuisine) {
        this.stallName = stallName;
        this.zone = zone;
        this.footfallCount = footfallCount;
        this.cuisine = cuisine;
    }

    public int getFootfallCount() {
        return footfallCount;
    }

    @Override
    public String toString() {
        return String.format("%-28s %-10s %6d  %s", stallName, zone, footfallCount, cuisine);
    }
}