import java.util.Scanner;

// Create a DisInYardAndMiles class to convert distance in feet to yard and miles
public class DisInYardAndMiles {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in feet : ");
        double disInFeet = sc.nextInt();
        
        //Converting the distance in feet to Yard
        double disInYard = disInFeet / 3;
        //Converting the distance in yard to Mile
        double disInMile = disInYard / 1760;
        
        //Printing the distance in yard and mile
        System.out.println("Distance in feet is : " + disInFeet +
                           " while the distance in yard is : " + disInYard +
                           " and distance in Mile is " + disInMile );
     
        sc.close();
        
    }
}