package com.regex.validatecreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidator {

    public static void main(String[] args) {

        String[] cards = {
            "4111111111111111", // Visa
            "5111111111111111", // MasterCard
            "6111111111111111", // Invalid
            "411111111111111"   // Invalid (15 digits)
        };

        String regex = "^(4\\d{15}|5\\d{15})$";

        Pattern pattern = Pattern.compile(regex);

        for (String card : cards) {
            Matcher matcher = pattern.matcher(card);
            if (matcher.matches()) {
                System.out.println(card + " → Valid Credit Card");
            } else {
                System.out.println(card + " → Invalid Credit Card");
            }
        }
    }
}
