package com.day10.gamingapp;

import java.util.*;

public class LeaderboardAVL {
    private AVLNode root;
    private final Map<Integer, Player> players = new HashMap<>();

    public void addOrUpdatePlayer(int id, String name, int points) {
        if (players.containsKey(id)) {
            Player p = players.get(id);
            root = delete(root, p);
            p.setPoints(points);
            root = insert(root, p);
        } else {
            Player p = new Player(id, name, points);
            players.put(id, p);
            root = insert(root, p);
        }
    }

    public void removePlayer(int id) {
        if (!players.containsKey(id))
            return;
        Player p = players.remove(id);
        root = delete(root, p);
    }

    public List<Player> topPlayers(int k) {
        List<Player> result = new ArrayList<>();
        collect(root, result, k);
        return result;
    }

    private void collect(AVLNode node, List<Player> list, int k) {
        if (node == null || list.size() >= k)
            return;
        collect(node.right, list, k);
        if (list.size() < k)
            list.add(node.player);
        collect(node.left, list, k);
    }

    private AVLNode insert(AVLNode node, Player player) {
        if (node == null)
            return new AVLNode(player);

        if (isLess(player, node.player))
            node.left = insert(node.left, player);
        else
            node.right = insert(node.right, player);

        updateHeight(node);
        return rebalance(node);
    }

    private AVLNode delete(AVLNode node, Player player) {
        if (node == null)
            return null;

        if (isLess(player, node.player))
            node.left = delete(node.left, player);
        else if (isGreater(player, node.player))
            node.right = delete(node.right, player);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                AVLNode successor = min(node.right);
                node.player = successor.player;
                node.right = delete(node.right, successor.player);
            }
        }

        if (node == null)
            return null;

        updateHeight(node);
        return rebalance(node);
    }

    private AVLNode min(AVLNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    private boolean isLess(Player a, Player b) {
        if (a.getPoints() != b.getPoints())
            return a.getPoints() < b.getPoints();
        return a.getId() < b.getId();
    }

    private boolean isGreater(Player a, Player b) {
        if (a.getPoints() != b.getPoints())
            return a.getPoints() > b.getPoints();
        return a.getId() > b.getId();
    }

    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    private void updateHeight(AVLNode node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    private int balanceFactor(AVLNode node) {
        return height(node.left) - height(node.right);
    }

    private AVLNode rebalance(AVLNode node) {
        int balance = balanceFactor(node);

        if (balance > 1) {
            if (balanceFactor(node.left) < 0)
                node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1) {
            if (balanceFactor(node.right) > 0)
                node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t = x.right;

        x.right = y;
        y.left = t;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t = y.left;

        y.left = x;
        x.right = t;

        updateHeight(x);
        updateHeight(y);

        return y;
    }
}
