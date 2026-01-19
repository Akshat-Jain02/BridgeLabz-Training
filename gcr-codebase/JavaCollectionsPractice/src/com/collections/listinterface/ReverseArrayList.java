package com.collections.listinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {

    public static void reverseArrayList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // swap
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int val = 0;
    	System.out.println("Enter 5 values and reverse array");
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
        	 val= sc.nextInt();
        	 arrayList.add(val);
        }	 

        System.out.println("Original: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed: " + arrayList);
    }
}

