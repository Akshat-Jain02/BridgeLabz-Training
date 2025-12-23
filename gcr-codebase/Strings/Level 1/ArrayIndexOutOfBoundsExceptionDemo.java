import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    //Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        String name = names[names.length];
    }
  
    //Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        System.out.println("\nHandling exception using try-catch...");
        try {
            System.out.println(names[names.length]); // Runtime Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the number of names as input
        System.out.println("Enter number of names");
        int  n = sc.nextInt();

        String[] names = new String[n];

        //takig the names as an input
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name: ");
            names[i] = sc.next();
        }

        //calling the appropriate method
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            handleArrayIndexOutOfBoundsException(names);
        } 

        sc.close();
    }
}
