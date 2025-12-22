import java.util.Scanner;

public class Collinear {

    //Method to determine points is collinear using slope
    public static boolean isCollinearUsingSlope(double x1, double y1, 
                                                double x2, double y2,
                                                double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }
   
    //Method to determine point is collinear using area 
    public static boolean isCollinearUsingArea(double x1, double y1,
                                              double x2, double y2,
                                              double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the input from user
        System.out.println("Enter the first point (x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter the second point (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter the third point (x3, y3) : ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
    
        boolean slopeResult = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        //Printing the results
        System.out.println("\nUsing Slope Method: " +
                (slopeResult ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Method: " +
                (areaResult ? "Collinear" : "Not Collinear"));
        sc.close();
    }
}