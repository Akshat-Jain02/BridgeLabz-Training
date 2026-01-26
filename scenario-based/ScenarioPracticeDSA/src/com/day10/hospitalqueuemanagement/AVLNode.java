package com.day10.hospitalqueuemanagement;

public class AVLNode {
	
    Patient patient;
    AVLNode left;
    AVLNode right;
    int height;

    public AVLNode(Patient patient) {
        this.patient = patient;
        this.height = 1;
    }
}
