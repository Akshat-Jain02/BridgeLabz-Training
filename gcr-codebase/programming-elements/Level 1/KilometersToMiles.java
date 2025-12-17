// Create KilometersToMiles class to convert distance of 10.8 km to miles

public class KilometersToMiles {

    public static void main(String[]args) {

        //create a variable name disInKilom to store distance in kilometer 
        double disInKilom = 10.8;

        //create a variable disInMiles to store the distance in miles
        double disInMiles = disInKilom * 1.6;

        //Print the distance in miles
        System.out.println("The distance "+ disInKilom + "Km in miles is " +  disInMiles);
    }
}