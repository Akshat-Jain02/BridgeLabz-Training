package com.collections.mapinterface;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : text.split("\\s+")) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
