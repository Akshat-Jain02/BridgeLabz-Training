package com.day06.artexpo;

class ArtistManager {
    private Artist[] artists;
    private int size;

    public ArtistManager(int capacity) {
        artists = new Artist[capacity];
        size = 0;
    }

    // Insert new artist and keep list sorted by registration time (Insertion Sort style)
    public void addArtist(Artist newArtist) {
        if (size >= artists.length) {
            System.out.println("Exhibition registration full!");
            return;
        }

        int i = size - 1;
        
        // Shift larger (later) times to the right
        while (i >= 0 && artists[i].getRegistrationTime().isAfter(newArtist.getRegistrationTime())) {
            artists[i + 1] = artists[i];
            i--;
        }
        
        artists[i + 1] = newArtist;
        size++;
    }

    public void displaySortedArtists() {
        if (size == 0) {
            System.out.println("No artists registered yet.");
            return;
        }

        System.out.println("\nCurrent Booth Assignment Order (sorted by registration time):");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d. %s%n", (i + 1), artists[i]);
        }
        System.out.println("-----------------------------------------------------");
    }
}