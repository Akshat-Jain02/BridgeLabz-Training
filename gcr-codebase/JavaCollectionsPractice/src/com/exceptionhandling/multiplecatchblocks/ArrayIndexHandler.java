package com.exceptionhandling.multiplecatchblocks;

import java.util.Scanner;

public class ArrayIndexHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n > 0) {
            arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("Enter index to retrieve: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
        }
    }
}
