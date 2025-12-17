import java.util.Scanner;

// Create HeightInFeetAndInches class to convert height in cm to feet and inches

public class HeightInFeetAndInches {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the height in cm");
        double heightInCm = sc.nextDouble();
        //Converting height from cm to inches
        double heightInInches = heightInCm / 2.54;
        //convert height in Feet
        double heightInFoot = heightInInches / 12;
        //Print the height in feet and inches
        System.out.println("Your Height in cm is "+ heightInCm+" While in feet is " + heightInFoot + 
                           "and inches is " + heightInInches );

        sc.close();
         
    }
}