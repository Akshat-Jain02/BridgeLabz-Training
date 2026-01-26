package com.day10.hospitalqueuemanagement;

import java.time.LocalDateTime;
import java.util.*;

public class HospitalQueueAVL {
    private AVLNode root;
    private final Map<Integer, Patient> patientMap = new HashMap<>();

    public void registerPatient(int id, String name, LocalDateTime time) {
        Patient patient = new Patient(id, name, time);
        patientMap.put(id, patient);
        root = insert(root, patient);
    }

    public void dischargePatient(int id) {
        if (!patientMap.containsKey(id))
            return;
        Patient patient = patientMap.remove(id);
        root = delete(root, patient);
    }

    public List<Patient> displayByArrival() {
        List<Patient> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(AVLNode node, List<Patient> list) {
        if (node == null)
            return;
        inorder(node.left, list);
        list.add(node.patient);
        inorder(node.right, list);
    }

    private AVLNode insert(AVLNode node, Patient patient) {
        if (node == null)
            return new AVLNode(patient);

        if (isBefore(patient, node.patient))
            node.left = insert(node.left, patient);
        else
            node.right = insert(node.right, patient);

        updateHeight(node);
        return rebalance(node);
    }

    private AVLNode delete(AVLNode node, Patient patient) {
        if (node == null)
            return null;

        if (isBefore(patient, node.patient))
            node.left = delete(node.left, patient);
        else if (isAfter(patient, node.patient))
            node.right = delete(node.right, patient);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                AVLNode successor = min(node.right);
                node.patient = successor.patient;
                node.right = delete(node.right, successor.patient);
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

    private boolean isBefore(Patient a, Patient b) {
        if (!a.getCheckInTime().equals(b.getCheckInTime()))
            return a.getCheckInTime().isBefore(b.getCheckInTime());
        return a.getId() < b.getId();
    }

    private boolean isAfter(Patient a, Patient b) {
        if (!a.getCheckInTime().equals(b.getCheckInTime()))
            return a.getCheckInTime().isAfter(b.getCheckInTime());
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
