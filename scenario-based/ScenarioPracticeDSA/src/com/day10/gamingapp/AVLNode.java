package com.day10.gamingapp;

public class AVLNode {
	
    Player player;
    AVLNode left;
    AVLNode right;
    int height;

    public AVLNode(Player player) {
        this.player = player;
        this.height = 1;
    }
}
