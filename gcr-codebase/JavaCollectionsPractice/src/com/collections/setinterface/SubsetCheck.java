package com.collections.setinterface;
import java.util.*;

public class SubsetCheck {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of elements in Subset (Set 1): ");
     int n1 = sc.nextInt();
     Set<Integer> set1 = new HashSet<>();
     System.out.println("Enter elements of Set 1:");
     for (int i = 0; i < n1; i++) {
         set1.add(sc.nextInt());
     }

     System.out.print("Enter number of elements in Main Set (Set 2): ");
     int n2 = sc.nextInt();
     Set<Integer> set2 = new HashSet<>();
     System.out.println("Enter elements of Set 2:");
     for (int i = 0; i < n2; i++) {
         set2.add(sc.nextInt());
     }

     System.out.println("Is Set 1 a subset of Set 2? " + set2.containsAll(set1));
 }
}
