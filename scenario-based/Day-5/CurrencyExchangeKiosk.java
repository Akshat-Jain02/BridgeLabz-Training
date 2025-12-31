/* Currency Exchange Kiosk 
Design a currency converter:
1. Take INR amount and target currency.
2. Use a switch to apply the correct rate.
3. Ask if the user wants another conversion (do-while). */

import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            //Taking amount in INR as an input from user
            System.out.print("Enter amount in INR: ");
            double inrAmount = sc.nextDouble();

            //taking the target currency code
            System.out.print("Enter target currency code (USD, EUR, GBP, JPY, AED): ");
            String currency = sc.next().toUpperCase();

            //variable to store convertedamount code
            double convertedAmount = 0.0;
            String targetCurrencyName = "";

            switch (currency) {
                case "USD" -> {
                    convertedAmount = inrAmount / 89.80;
                    targetCurrencyName = "USD";
                }
                case "EUR" -> {
                    convertedAmount = inrAmount / 105.80; 
                    targetCurrencyName = "EUR";
                }
                case "GBP" -> {
                    convertedAmount = inrAmount / 121.30; 
                    targetCurrencyName = "GBP";
                }
                case "JPY" -> {
                    convertedAmount = inrAmount / 0.575;
                    targetCurrencyName = "JPY";
                }
                case "AED" -> {
                    convertedAmount = inrAmount / 24.45; 
                    targetCurrencyName = "AED";
                }
                default -> {
                    System.out.println("Unsupported currency!");
                    break;
                } 
            }

            //Printing the final amount after conversion
            System.out.printf("%.2f INR = %.2f %s\n", inrAmount, convertedAmount, targetCurrencyName);

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the Currency Exchange Kiosk!");
        sc.close();
    }
}