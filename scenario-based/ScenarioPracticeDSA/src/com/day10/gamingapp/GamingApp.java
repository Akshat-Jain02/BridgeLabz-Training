package com.day10.gamingapp;

public class GamingApp {
	
    public static void main(String[] args) {
        LeaderboardAVL board = new LeaderboardAVL();

        board.addOrUpdatePlayer(1, "Alpha", 1200);
        board.addOrUpdatePlayer(2, "Bravo", 1800);
        board.addOrUpdatePlayer(3, "Charlie", 1500);
        board.addOrUpdatePlayer(4, "Delta", 2000);

        board.addOrUpdatePlayer(3, "Charlie", 2100);
        board.removePlayer(1);

        for (Player p : board.topPlayers(10))
            System.out.println(p);
    }
}
