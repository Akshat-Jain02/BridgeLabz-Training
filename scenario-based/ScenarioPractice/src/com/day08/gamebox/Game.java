package com.day08.gamebox;

class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public double applyOffer(double discount) {
        return price - discount;
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Playing demo of game");
    }
}