package com.day09.musicapp;

class Song {
	
    String trackId;      
    String title;
    String artist;
    int durationSeconds; 

    public Song(String trackId, String title, String artist, int durationSeconds) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    @Override
    public String toString() {
        int min = durationSeconds / 60;
        int sec = durationSeconds % 60;
        return String.format("%s - %s by %s (%d:%02d)", 
                             trackId, title, artist, min, sec);
    }
}