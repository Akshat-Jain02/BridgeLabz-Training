import java.util.Scanner;

public class StudentGradeTwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for number of students from the user
        System.out.println("Enter the number of student");
        int n = sc.nextInt();

        // Create arrays to store marks, percentage and grade
        int[][] marks = new int[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Taking input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the markss in physics");
            marks[i][0] = sc.nextInt();
            System.out.println("Enter the markss in chemistry");
            marks[i][1] = sc.nextInt();
            System.out.println("Enter the markss in maths");
            marks[i][2] = sc.nextInt();

            // Check for negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Invalid marks, please enter positive values");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display marks, percentage and grade
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student " + (i + 1) +
                ": Physics = " + marks[i][0] +
                ", Chemistry = " + marks[i][1] +
                ", Maths = " + marks[i][2] +
                ", Percentage = " + percentage[i] +
                ", Grade = " + grade[i]
            );
        }
    }
}