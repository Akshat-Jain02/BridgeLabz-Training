package com.day08.gamebox;

import java.util.*;

public class GameBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        ArrayList<Game> store = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter game type (arcade/strategy): ");
            String type = sc.next();
            System.out.print("Enter title: ");
            String title = sc.next();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();

            if (type.equalsIgnoreCase("arcade"))
                store.add(new ArcadeGame(title, price, rating));
            else
                store.add(new StrategyGame(title, price, rating));
        }

        System.out.print("Enter seasonal discount: ");
        double discount = sc.nextDouble();

        for (Game g : store) {
            System.out.println("Final price of " + g.title + ": " + g.applyOffer(discount));
            g.playDemo();
            System.out.print("Buy this game? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("yes"))
                user.buyGame(g);
        }

        System.out.println("Owned Games:");
        user.showGames();
    }
}