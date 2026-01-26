package com.regex.validatessn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidator {

    public static void main(String[] args) {

        String[] ssns = {
            "123-45-6789",
            "123456789",
            "000-12-3456"
        };

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        for (String ssn : ssns) {
            Matcher matcher = pattern.matcher(ssn);
            if (matcher.matches()) {
                System.out.println(ssn + " → Valid SSN");
            } else {
                System.out.println(ssn + " → Invalid SSN");
            }
        }
    }
}
