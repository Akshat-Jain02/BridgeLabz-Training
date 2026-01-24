package com.day09.musicapp;
class MusicLibrary {
    private Node root;

    public MusicLibrary() {
        root = null;
    }

    
    public void add(Song song) {
        root = addRecursive(root, song);
    }

    private Node addRecursive(Node current, Song song) {
        if (current == null) {
            return new Node(song);
        }

        int cmp = song.trackId.compareTo(current.song.trackId);

        if (cmp < 0) {
            current.left = addRecursive(current.left, song);
        } else if (cmp > 0) {
            current.right = addRecursive(current.right, song);
        }
        
        return current;
    }

    
    public Song find(String trackId) {
        Node current = root;
        while (current != null) {
            int cmp = trackId.compareTo(current.song.trackId);
            if (cmp == 0) {
                return current.song;
            }
            current = cmp < 0 ? current.left : current.right;
        }
        return null;
    }

    
    public void showAlphabeticalPlaylist() {
        System.out.println("Playlist (sorted by song title):");
        inorderByTitle(root);
    }

    private void inorderByTitle(Node node) {
        if (node == null) return;
        
        inorderByTitle(node.left);
        System.out.println(node.song);
        inorderByTitle(node.right);
    }

    
    public void showByTrackId() {
        System.out.println("Tracks sorted by track ID:");
        inorderById(root);
    }

    private void inorderById(Node node) {
        if (node == null) return;
        inorderById(node.left);
        System.out.println(node.song);
        inorderById(node.right);
    }
}