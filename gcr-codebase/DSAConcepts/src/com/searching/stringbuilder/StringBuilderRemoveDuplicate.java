package com.searching.stringbuilder;

import java.util.Scanner;
import java.util.HashSet;

public class StringBuilderRemoveDuplicate {

    // Function to remove duplicate characters
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}
