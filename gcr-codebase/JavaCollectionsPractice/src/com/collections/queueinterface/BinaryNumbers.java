package com.collections.queueinterface;

import java.util.*;

public class BinaryNumbers {

    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String current = q.remove();
            System.out.print(current + " ");

            q.add(current + "0");
            q.add(current + "1");
        }
    }

    public static void main(String[] args) {
        generateBinary(5);
    }
}
