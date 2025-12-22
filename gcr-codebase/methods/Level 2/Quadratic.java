import java.util.Scanner;

public class Quadratic {

    //static method to findRoots using delta
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b,2) - 4 * a * c;

       if (delta < 0) {
           return new double[0];
       }

       if (delta == 0) {
           double root = -b / (2 * a);
           return new double[]{root};
       }

       double sqrtDelta = Math.sqrt(delta);

       double root1 = (-b + sqrtDelta) / (2 * a);
       double root2 = (-b - sqrtDelta) / (2 * a);

       return new double[]{root1, root2};
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the value of a, b and c from user as an input
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c : ");
        double c = sc.nextDouble();

        //calling the findRoots method with the a,b and c arguments
        double[] roots = findRoots(a, b, c);

        //Print the roots if exits
        if (roots.length == 0) {
            System.out.println("No real roots exit ");
        } else if (roots.length == 1) {
            System.out.println("The only root is : " + roots[0]);
        } else {
            System.out.println("The two roots are : " + roots[0] + " and "+roots[1] );
        }

        sc.close();
    }
}