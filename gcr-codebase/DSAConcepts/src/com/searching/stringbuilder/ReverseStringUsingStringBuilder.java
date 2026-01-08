package com.searching.stringbuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    // Separate function to reverse a string
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the function
        String reversed = reverseString(input);

        // Display result
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
