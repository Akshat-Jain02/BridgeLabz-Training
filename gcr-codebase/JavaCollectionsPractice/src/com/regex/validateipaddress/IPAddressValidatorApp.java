package com.regex.validateipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidatorApp {

    public static void main(String[] args) {

        String[] testIPs = {
            "192.168.1.1",
            "255.255.255.255",
            "256.100.50.0",
            "192.168.1",
            "01.02.03.04"
        };

        String regex = "\\b((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\b";

        Pattern pattern = Pattern.compile(regex);

        for (String ip : testIPs) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + " → Valid IP");
            } else {
                System.out.println(ip + " → Invalid IP");
            }
        }
    }
}
