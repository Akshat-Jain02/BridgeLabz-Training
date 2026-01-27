package com.day02.songvault;

public class SongVaultMain {
    public static void main(String[] args) {
        SongVaultManager<Song> vault = new SongVaultManager<>();

        String songFolder = "samplefiles/songvault";

        try {
            vault.loadSongsFromFolder(songFolder);

            vault.showAllSongsSorted();
            vault.showSongsByGenre("Rock");
            vault.showUniqueArtists();

            vault.showLongSongs("5:00");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
