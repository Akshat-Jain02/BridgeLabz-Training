import java.util.Scanner;

public class BodyMassIndex {

    //Static method to calculate bmi
    public static void calculateBMI (double[][] data) {
        for (int i= 0; i < data.length; i++) {
            
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }

    //static method to determine bmi status based on bmi 
    public static String[] determineBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9){
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
 
        return status;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] bmiData = new double[10][3];

        //taking the weight and height as input from user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();
        }

        //calling the method with the two d array
        calculateBMI(bmiData);

        String[] bmiStatus = determineBMIStatus(bmiData);

        System.out.println("\n--- BMI REPORT ---");
        
        //Iterating over the array and printing the complete report
        for (int i = 0; i < 10; i++) {
            System.out.println("The " + (i + 1) + " person" +
                               "\n weight is : " + bmiData[i][0] +
                               "\n height is : " + bmiData[i][1] +
                               "\n BMI is : " + bmiData[i][2] +
                               "\n BMI status is : " + bmiStatus[i]);
        }
        sc.close();
    }
}




