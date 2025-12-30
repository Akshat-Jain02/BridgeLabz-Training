/* Temperature Logger 
Record temperatures over 7 days.
1. Use array and for-loop.
2. Find average and max temperature.
3. Use if for comparisons. Maintain readable naming and modular code blocks. */

import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average = 0.0, sum = 0, maxTemperature = Integer.MIN_VALUE;
        double[] temperatures = new double[7];

        //Taking user input and finding maximum temperature 
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Enter the temperature in Celsius for day " + (i + 1) + " : ");
            temperatures[i] = sc.nextDouble();
            if (maxTemperature < temperatures[i]) {
                maxTemperature = temperatures[i];
            }
            sum += temperatures[i];
        }

        //Calculating the average of temperatures
        average = sum / 7;

        //Printing the final result
        System.out.println("\n---------WELCOME TO TEMPERATURE LOGGER-----------");
        System.out.println("\n Maximum Temperature is : " + maxTemperature +
                           "\n Average Temperature is : "+ average);  
        System.out.println("\n-------------------------------------------------"); 
        
        sc.close();
    }
}