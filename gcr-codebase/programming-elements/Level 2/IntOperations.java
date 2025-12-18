import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //  enter values for a, b, and c
        System.out.println("Enter integer value for a:");
        int a = sc.nextInt();

        System.out.println("Enter integer value for b:");
        int b = sc.nextInt();

        System.out.println("Enter integer value for c:");
        int c = sc.nextInt();

       

        // Compute the integer operations based on operator precedence
        // a + b * c (Multiplication has higher precedence than addition)
        int result1 = a + b * c;

        // a * b + c (Multiplication has higher precedence than addition)
        int result2 = a * b + c;

        // c + a / b (Division has higher precedence than addition)
        int result3 = c + a / b;

        // a % b + c (Modulo has higher precedence than addition)
        int result4 = a % b + c;

        // Print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 +
                           ", " + result3 + ", and " + result4 + " in java");
      
        sc.close();
    }
}
