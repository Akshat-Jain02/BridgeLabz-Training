package com.searching.linearsearch;

public class LinearSearchSentence {

    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // First match
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful programming language",
            "Linear search is simple",
            "Data structures are important",
            "Algorithms improve efficiency"
        };

        String word = "search";

        String result = searchSentence(sentences, word);
        System.out.println(result);
    }
}
