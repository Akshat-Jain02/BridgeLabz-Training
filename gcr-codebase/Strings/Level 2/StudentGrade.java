import java.util.Scanner;

public class StudentGrade {

    //Method to generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    //Calculate total, average, percentage (rounded to 2 decimals)
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, %

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    //Calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80)
                grades[i][0] = "A";
            else if (percent >= 70)
                grades[i][0] = "B";
            else if (percent >= 60)
                grades[i][0] = "C";
            else if (percent >= 50)
                grades[i][0] = "D";
            else if (percent >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    //Display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tTotal\tAverage\t%\tGrade");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i][0]
            );
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        //Calling the appropriate method 
        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);

        sc.close();
    }
}
