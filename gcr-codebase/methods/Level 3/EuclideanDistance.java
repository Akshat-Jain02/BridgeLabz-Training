import java.util.Scanner;

public class EuclideanDistance {

    //Method to calculate the euclidean distance 
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt (Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));
    }

    //Method to find slope and intercept of line
    public static double[] findSlopeAndIntercept(double x1, double y1, double x2, double y2) {
        double[] arr = new double[2];
        
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        arr[0] = m;
        arr[1] = b;
 
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1");
        double x1 = sc.nextDouble();

        System.out.println("Enter y1");
        double y1 = sc.nextDouble();
 
        System.out.println("Enter x2");
        double x2 = sc.nextDouble();

        System.out.println("Enter y2");
        double y2 = sc.nextDouble();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        double[] arr = findSlopeAndIntercept(x1, y1, x2, y2);

        //Displaying the results
        System.out.println("\nEuclidean Distance = " + distance +
                           "\n Slope (m) = " + arr[0] +
                           "\n Y-intercept (b) = " + arr[1] +
                           "\n Equation of line: y = " + arr[0] + "x + " + arr[1]);
        sc.close();
       }
}