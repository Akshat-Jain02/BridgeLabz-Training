package com.regex.validatehexcolorcode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        Matcher matcher = pattern.matcher(color);

        if (matcher.matches()) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }

        sc.close();
    }
}
