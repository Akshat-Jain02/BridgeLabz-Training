import java.util.Scanner;

//Create a MaximumHandshakes class to calculate maximum number of handshakes

public class MaximumHandshakes {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of students :");
        int numberOfStudents = sc.nextInt();

        //Calculating maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1) ) / 2;

        //Displaying the maximum number of handshakes
        System.out.println("The maximum number of handshakes are: " + maximumHandshakes);

        sc.close();
    }
} 