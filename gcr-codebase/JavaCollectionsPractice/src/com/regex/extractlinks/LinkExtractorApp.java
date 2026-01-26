package com.regex.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractorApp {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "https?://[^\\s]+";

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
