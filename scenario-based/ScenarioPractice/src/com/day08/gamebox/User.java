package com.day08.gamebox;

import java.util.*;

class User {
    private ArrayList<Game> ownedGames;

    User() {
        ownedGames = new ArrayList<>();
    }

    public void buyGame(Game g) {
        ownedGames.add(g);
        g.download();
    }

    public void showGames() {
        for (Game g : ownedGames)
            System.out.println(g.title);
    }
}