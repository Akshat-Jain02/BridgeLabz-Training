package com.day08.gamerzone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamerZoneLeaderboard {
    public static void main(String[] args) {
        Leaderboard board = new Leaderboard();
        Random random = new Random();

        // Simulate players from different regions
        List<Player> matchPlayers = new ArrayList<>();

        // Batch 1: After first match
        matchPlayers.add(new Player("ShadowKiller",  14520, "India"));
        matchPlayers.add(new Player("NovaBlaze",     13890, "USA"));
        matchPlayers.add(new Player("FrostByte",      9760, "Brazil"));
        matchPlayers.add(new Player("AkshatPro",     16230, "India"));
        board.addPlayers(matchPlayers);
        board.showTopPlayers(4);

        // Batch 2: More players join
        matchPlayers.clear();
        matchPlayers.add(new Player("DragonSlayer",  17850, "Germany"));
        matchPlayers.add(new Player("PixelRage",     15210, "Japan"));
        matchPlayers.add(new Player("ViperX",        11980, "India"));
        matchPlayers.add(new Player("ThunderHub",    16540, "USA"));
        matchPlayers.add(new Player("IceQueen",      14370, "Russia"));

        // Add 20 more random players to simulate large dataset
        String[] names = {"Ghost", "Rogue", "Blitz", "Zen", "Storm", "Ninja", "Echo", "Titan"};
        String[] regions = {"India", "USA", "Brazil", "Japan", "Germany", "Russia"};
        for (int i = 0; i < 20; i++) {
            String name = names[random.nextInt(names.length)] + random.nextInt(100);
            int score = 8000 + random.nextInt(10000);
            String region = regions[random.nextInt(regions.length)];
            matchPlayers.add(new Player(name, score, region));
        }

        board.addPlayers(matchPlayers);
        board.showTopPlayers(10);

        
        board.showTopPlayers(15);
    }
}