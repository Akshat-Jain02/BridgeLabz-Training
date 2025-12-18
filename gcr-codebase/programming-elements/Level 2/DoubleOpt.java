import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.println("Enter three double values (a, b, c):");
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();

        // Compute operations

        //  a + b * c: Multiplication first
        double result1 = a + b * c;

        // a * b + c: Multiplication first
        double result2 = a * b + c;

        // c + a / b: Division first 
        double result3 = c + a / b;

        // a % b + c: Modulo first 
        double result4 = a % b + c;

        // Print the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " +
                           result4 + ".");

        sc.close();
    }
}