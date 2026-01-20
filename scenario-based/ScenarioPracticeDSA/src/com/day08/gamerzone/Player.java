package com.day08.gamerzone;

class Player {
	
    private String username;
    private int score;
    private String region;

    public Player(String username, int score, String region) {
        this.username = username;
        this.score = score;
        this.region = region;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%-20s %8d  %s", username, score, region);
    }
}