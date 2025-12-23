import java.util.Scanner;

public class BodyMassIndex {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to create final 2D String array
    public static String[][] prepareBMIReport(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display result in table format
    public static void displayReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t" +
                    report[i][3]
            );
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];
          
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = prepareBMIReport(data);

        //Calling the display method to print the result
        displayReport(bmiReport);

        sc.close();
    }
}
