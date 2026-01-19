package com.collections.listinterface;
import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 5 values and remove duplicates");
    	int val;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
        	 val= sc.nextInt();
        	numbers.add(val);
        }


        List<Integer> result = removeDuplicates(numbers);
        System.out.println(result);
    }
}

