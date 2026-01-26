package com.day10.onlineticketbookingbytime;

import java.time.LocalDateTime;
import java.util.*;

public class EventSchedulerAVL {
    private AVLNode root;
    private final Map<Integer, Event> events = new HashMap<>();

    public void addEvent(int id, String name, LocalDateTime time) {
        Event event = new Event(id, name, time);
        events.put(id, event);
        root = insert(root, event);
    }

    public void cancelEvent(int id) {
        if (!events.containsKey(id))
            return;
        Event event = events.remove(id);
        root = delete(root, event);
    }

    public List<Event> showUpcomingEvents() {
        List<Event> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(AVLNode node, List<Event> list) {
        if (node == null)
            return;
        inorder(node.left, list);
        list.add(node.event);
        inorder(node.right, list);
    }

    private AVLNode insert(AVLNode node, Event event) {
        if (node == null)
            return new AVLNode(event);

        if (isBefore(event, node.event))
            node.left = insert(node.left, event);
        else
            node.right = insert(node.right, event);

        updateHeight(node);
        return rebalance(node);
    }

    private AVLNode delete(AVLNode node, Event event) {
        if (node == null)
            return null;

        if (isBefore(event, node.event))
            node.left = delete(node.left, event);
        else if (isAfter(event, node.event))
            node.right = delete(node.right, event);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                AVLNode successor = min(node.right);
                node.event = successor.event;
                node.right = delete(node.right, successor.event);
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

    private boolean isBefore(Event a, Event b) {
        if (!a.getStartTime().equals(b.getStartTime()))
            return a.getStartTime().isBefore(b.getStartTime());
        return a.getId() < b.getId();
    }

    private boolean isAfter(Event a, Event b) {
        if (!a.getStartTime().equals(b.getStartTime()))
            return a.getStartTime().isAfter(b.getStartTime());
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
