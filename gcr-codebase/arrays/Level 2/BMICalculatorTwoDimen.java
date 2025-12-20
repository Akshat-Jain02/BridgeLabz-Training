import java.util.Scanner;

//Created a BMICalculatorTwoDimen class to calculate BMI status of persons
public class BMICalculatorTwoDimen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        int i = 0;

        // Input weight and height with validation of only positive allowed
        while (i < number) {
            System.out.println("\nPerson " + (i + 1));

            // Weight validation
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Weight must be positive. Try again.");
            }

            // Height validation
            while (true) {
                System.out.print("Enter height : ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Height must be positive. Try again.");
            }

            i++;
        }

        //Calculate BMI and status
        i = 0;
        while (i < number) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }

            i++;
        }

        //Display result
        System.out.println("\n----- BMI REPORT -----");

        i = 0;
        while (i < number) {
           System.out.println("\n The BMI report of " + (i + 1) + " Person is " + "\n height: "
                               +  personData[i][1] + "\n weight is : " +personData[i][0] +
                                "\n BMI is : " +  personData[i][2] + "\n status : " + weightStatus[i]
                              ); 

                    
                   
            i++;
        }

        sc.close();
    }
}
