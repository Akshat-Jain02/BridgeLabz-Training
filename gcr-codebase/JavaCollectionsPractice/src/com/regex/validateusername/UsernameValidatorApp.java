package com.regex.validateusername;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        boolean isValid = Pattern.matches(regex, username);

        if (isValid) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
        
        sc.close();
        
    }
}
