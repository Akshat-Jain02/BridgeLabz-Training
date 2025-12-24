import java.util.Scanner;

public class FibonacciSequence {

    //Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input from user
        System.out.println("Enter the number");
        int number = sc.nextInt();
 
        //Calling the generateFibonacci() to generate and print fibonacci sequence
        generateFibonacci(number);
 
        sc.close();
    }
}