package com.searching.stringbuffer;

import java.util.Scanner;

public class StringBufferConcatenateStrings {

    // Function to concatenate strings using StringBuffer
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Take input strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Call function
        String result = concatenate(arr);

        // Display output
        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}
