import java.util.Scanner;
class CelsiusToFahrenheit {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        double tempInCel = sc.nextDouble();
        double tempInFahr = (tempInCel * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is : " + tempInFahr);
    }
}