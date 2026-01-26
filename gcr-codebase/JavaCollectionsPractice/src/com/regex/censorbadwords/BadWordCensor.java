package com.regex.censorbadwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWordCensor {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = { "damn", "stupid" };

        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        String censoredText = matcher.replaceAll("****");

        System.out.println(censoredText);
    }
}
