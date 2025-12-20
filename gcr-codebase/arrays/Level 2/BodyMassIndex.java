import java.util.Scanner;

//Create a class BodyMassIndex to generate BMI status of persons
public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Take input for number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = sc.nextInt();

        //Create arrays to store weight height bmi and status
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];
 
        //Taking the weight and height of persons as an input from users
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height : ");
            height[i] = sc.nextDouble();
         }
        
        //iteratively storing the bmi status of an person
        for (int i = 0; i < numberOfPersons; i++) {
            //calculating bmi using the appropriate formula
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
 
        //Printing the BMI status
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\n The BMI report of " + (i + 1) + " Person is " +
                               "\n height : " + height[i] + "\n weight is : " + weight[i] +
                                "\n BMI is : " + bmi[i] + "\n status : " + status[i]
            ); 
        }

        sc.close();
    }
}