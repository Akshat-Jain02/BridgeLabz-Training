package com.collections.listinterface;
import java.util.*;

public class NthFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {

        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                return "Invalid N";
            }
            first.next();
        }

        // Move both pointers until first reaches end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Enter number to find values from that end");
        int n = sc.nextInt();
        System.out.println(findNthFromEnd(list, n));
    }
}
