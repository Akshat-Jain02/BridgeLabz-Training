package com.collections.listinterface;
import java.util.ArrayList;
import java.util.List;

public class RotateList {

    public static void rotateLeft(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;   

        List<Integer> temp = new ArrayList<>();

        // store first k elements
        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        // shift remaining elements
        for (int i = k; i < n; i++) {
            list.set(i - k, list.get(i));
        }

        // add stored elements at the end
        for (int i = 0; i < temp.size(); i++) {
            list.set(n - k + i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original: " + numbers);
        rotateLeft(numbers, 2);
        System.out.println("Rotated: " + numbers);
    }
}

