package com.regex.extractprogramminglanguagenames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LanguageExtractor {

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = { "Java", "Python", "JavaScript", "Go" };

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;
        while (matcher.find()) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(matcher.group());
            first = false;
        }
    }
}
