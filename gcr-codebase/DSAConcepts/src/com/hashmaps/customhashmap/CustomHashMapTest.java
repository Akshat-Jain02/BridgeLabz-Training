package com.hashmaps.customhashmap;

public class CustomHashMapTest {
	
    public static void main(String[] args) {
    	
        CustomHashMap hashMap = new CustomHashMap();

        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(1001, 30); 

        System.out.println(hashMap.get(1)); 
        System.out.println(hashMap.get(2));    
        System.out.println(hashMap.get(1001));
        System.out.println(hashMap.get(3));   

        hashMap.remove(2);
        System.out.println(hashMap.get(2));
        
    }
}