package com.regex.findrepeatingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

public class RepeatingWordFinderApp {

    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}
