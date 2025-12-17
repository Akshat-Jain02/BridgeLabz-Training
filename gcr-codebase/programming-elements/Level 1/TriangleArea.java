import java.util.Scanner;

// Create a TriangleArea class to calculate area of triangle

public class TriangleArea {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of triangle in inches : " );
        double baseInInches = sc.nextDouble();

        
        System.out.println("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert the area to square centimeters 
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;
        
        //Displaying the area of triangle in square inches and square centimeters
        System.out.println("Area of triangle in square inches is : " + areaInSquareInches +
                           " and in square centimeters is : " + areaInSquareCentimeters);

        sc.close();
    }
}