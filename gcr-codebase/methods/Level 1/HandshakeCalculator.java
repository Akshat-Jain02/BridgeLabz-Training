import java.util.Scanner;

//Create a class HandshakeCalculator to calculate number of hand shakes
public class HandshakeCalculator {

    // Method to calculate maximum handshakes and returning the results to the caller
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result stored in the handShakes variable
        System.out.println("Maximum number of possible handshakes: " + handshakes);

        sc.close();
    }
}
