import java.util.Scanner;

public class UnitConvertorThird {
    
    //Created a static method to convert farhenheit to celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
    
    //create a static method to convert celsius to farhenheit 
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    } 
   
    //create a static method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    //Create a static method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    //created a static method to convert gallons to liters
    public static double convertGallonToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    //created a static method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters *  liters2gallons;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        //Taking the input from user
        System.out.println("Enter temperature in Farhenheit : ");
        double farhenheit = sc.nextDouble();
        System.out.println("Enter temperature in celsius : ");
        double celsius = sc.nextDouble(); 
        System.out.println("Enter pounds : ");
        double pounds = sc.nextDouble();
        System.out.println("Enter kilograms");
        double kilograms = sc.nextDouble();
        System.out.println("Enter gallons : ");
        double gallons = sc.nextDouble();
        System.out.println("Enter liters : ");
        double liters = sc.nextDouble();
 
        //Printing the respected conversions
        System.out.println("The respected conversion are : " + 
                           "\n" + farhenheit + " farhenheit to Celsius is : " + UnitConvertorThird.convertFarhenheitToCelsius(farhenheit) +
                           "\n" + celsius + "Celsius to farhenheit is :"+ UnitConvertorThird.convertCelsiusToFarhenheit(celsius) + 
                           "\n" + pounds + " pounds in kilograms is : " + UnitConvertorThird.convertPoundsToKilograms(pounds)+
                           "\n" + kilograms + " kilograms in pounds is : "  +UnitConvertorThird.convertKilogramsToPounds(kilograms) +
                           "\n" + gallons + " gallons in liters is : " + UnitConvertorThird.convertGallonToLiters(gallons) +
                           "\n" + liters + " liters in gallons is : " + UnitConvertorThird.convertLitersToGallons(liters));
    }
}