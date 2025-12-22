import java.util.Scanner;

public class StudentScore {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; 
            marks[i][1] = (int)(Math.random() * 90) + 10; 
            marks[i][2] = (int)(Math.random() * 90) + 10; 
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3]; 

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        // Take input from the users
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] pcmMarks = generatePCMMarks(students);
        double[][] results = calculateResults(pcmMarks);

        displayScoreCard(pcmMarks, results);

        sc.close();
    }
}