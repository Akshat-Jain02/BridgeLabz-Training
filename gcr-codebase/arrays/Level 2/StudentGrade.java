import java.util.Scanner;

//Create a class StudentGrade to display results and grade of students
public class StudentGrade {

    public static void main(String[] args) {

        // Take input for number of students and create array to store marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();

        // Create arrays to store marks
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        // Create arrays to store percentage and grade
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the markss in physics");
            physics[i] = sc.nextInt();
            System.out.println("Enter the markss in chemistry");
            chemistry[i] = sc.nextInt();
            System.out.println("Enter the markss in maths");
            maths[i] = sc.nextInt();

            // Check for negative marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.err.println("Invalid marks, please enter positive values");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            int total = physics[i] + chemistry[i] + maths[i];
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

        // Displaying marks, percentage and grade
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + physics[i] + ", Chemistry = " + chemistry[i] + ", Maths = " + maths[i] + ", Percentage = " + percentage[i] + ", Grade = " + grade[i]);
        }
    }
}