import java.util.Scanner;

//Create a SideOfSquare class to calculate side whose perimeter is given

public class SideOfSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking the perimeter of square
        System.out.println("Enter the perimeter of square ");
        double perimeter = sc.nextDouble();
        
        double side = perimeter / 4.0;
        
        //Print the side of square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}