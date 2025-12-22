import java.util.Scanner;

public class UnitConvertorSecond {
    
    //static method to convert the yards into feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
 
    //static method to convert feet into yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
  
    //static method to convert meters into inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    //static method to convert inches into meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    //static method to convert inches into centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        //Taking the values in various unit to convert
        System.out.println("Enter yards");
        double yards = sc.nextDouble();
        System.out.println("Enter  feet");
        double feet = sc.nextDouble();
        System.out.println("Enter  inches");
        double inches = sc.nextDouble();
        System.out.println("Enter meters");
        double meters = sc.nextDouble();
      
       
        //Printing the conversion
        System.out.println("The respected conversion of unit are : " +
                           "\n" + yards + " yards in feet is " + UnitConvertorSecond.convertYardsToFeet(yards) +
                           "\n" + feet + " feet in yards is " + UnitConvertorSecond.convertFeetToYards(feet) +
                           "\n" + meters + " meters in inches is " + UnitConvertorSecond.convertMetersToInches(meters)+
                           "\n" + inches + " inches in meters is " + UnitConvertorSecond.convertInchesToMeters(inches) +
                           "\n" + inches + " inches in centimeters is " + UnitConvertorSecond.convertInchesToCentimeters(inches));
    }

}