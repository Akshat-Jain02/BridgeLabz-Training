import java.util.Scanner;
public class UnitConvertorOne {
    
    //Static method to convert km to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    //Static method to convert Mles to km
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    } 
    //Static method to convert meters to feet
    public static double convertMeterToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    //Static method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        //Taking the values in various unit to convert
        System.out.println("Enter Km");
        double km = sc.nextDouble();
        System.out.println("Enter  miles");
        double miles = sc.nextDouble();
        System.out.println("Enter  meter");
        double meter = sc.nextDouble();
        System.out.println("Enter feet");
        double feet = sc.nextDouble();
       
        //Printing the conversion
        System.out.println("The respected conversion of unit are : " +
                           "\n" + km + " km in miles is " + UnitConvertorOne.convertKmToMiles(km) +
                           "\n" + miles + " miles in km is " + UnitConvertorOne.convertMilesToKm(miles) +
                           "\n" + meter + " meter in feet is " + UnitConvertorOne.convertMeterToFeet(meter)+
                           "\n" +feet + " feet in meter is " +UnitConvertorOne.convertFeetToMeters(feet));
    }
}

