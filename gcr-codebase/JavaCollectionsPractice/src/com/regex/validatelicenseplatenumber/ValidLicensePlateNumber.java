package com.regex.validatelicenseplatenumber;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicensePlateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter license plate number: ");
        String plate = sc.nextLine();

        Matcher matcher = pattern.matcher(plate);

        if (matcher.matches()) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }

        sc.close();
    }
}
