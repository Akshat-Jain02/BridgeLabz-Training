package com.day09.musicapp;

class Node {
	
    Song song;
    Node left;
    Node right;

    Node(Song song) {
        this.song = song;
        this.left = null;
        this.right = null;
    }
    
}