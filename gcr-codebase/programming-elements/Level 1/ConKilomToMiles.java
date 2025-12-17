import java.util.Scanner;

//Create ConKilomToMiles class to convert the distance from kilometers to miles
public class ConKilomToMiles {

    public static void main(String[]args) {
        //Create a scanner object for the input
        Scanner sc = new Scanner(System.in);

        //create a variable to hold distance in km
        double km = sc.nextDouble();

        //converting distnce in miles 
        double distInMiles = km / 1.6;
        
        //Print the distance in miles for distance in kilometer
        System.out.println("The total miles is " + distInMiles + " mile for the given "+km +" Km");
        
        
    }
}