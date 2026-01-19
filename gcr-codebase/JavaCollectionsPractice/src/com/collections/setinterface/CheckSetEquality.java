package com.collections.setinterface;

import java.util.*;

public class CheckSetEquality {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Give size of set1");
     int n1 = sc.nextInt();
     Set<Integer> set1 = new HashSet<>();
     System.out.println("Enter elements of set1");
     for (int i = 0; i < n1; i++) {
         set1.add(sc.nextInt());
     }

     System.out.println("Give size of set2");
     int n2 = sc.nextInt();
     Set<Integer> set2 = new HashSet<>();
     System.out.println("Enter elements of set2");
     for (int i = 0; i < n2; i++) {
         set2.add(sc.nextInt());
     }

     System.out.println(set1.equals(set2));
 	}
}

