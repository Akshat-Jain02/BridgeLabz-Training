import java.util.Scanner;

//Creating a WindChillCalculator class to calculate the WindChill
public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 
                + (0.6215 * temperature) 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input temperature and wind speed from the user
        System.out.print("Enter temperature :  ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed : ");
        double windSpeed = sc.nextDouble();

        // Create object and calculate wind chill as it is not a static method
        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Display the final windChill
        System.out.println("Wind Chill Temperature: " + windChill);

        sc.close();
    }
}

