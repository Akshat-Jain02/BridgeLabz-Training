package com.day08.gamebox;

class StrategyGame extends Game {
    StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void playDemo() {
        System.out.println("Thinking-based strategy demo");
    }
}