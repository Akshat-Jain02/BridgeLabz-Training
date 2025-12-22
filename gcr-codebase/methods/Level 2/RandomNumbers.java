import java.util.Scanner;

public class RandomNumbers {
    
   //Method to generate 4 digits random array
    public int[] generate4DigitRandomArray(int size) {
        
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    //Method to find average, minimum and maximum of generated numbers
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
  
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        RandomNumbers rn = new RandomNumbers();
        int[] randomNumbers = rn.generate4DigitRandomArray(5);

        //calling the method to get Average,minimum and maximum of numbers
        double[] results = rn.findAverageMinMax(randomNumbers);

        System.out.println("The generated random numbers are : ");

        //Printing the generated numbers
        for (int i = 0; i <randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
         
        //Printing the average, minimum and maximum of the generated numbers 
        System.out.println("\n Average is : " + results[0] +
                           "\n  Minimum is : " + results[1] + 
                            "\n Maximun is : " + results[2] );

       sc.close();
    }
}