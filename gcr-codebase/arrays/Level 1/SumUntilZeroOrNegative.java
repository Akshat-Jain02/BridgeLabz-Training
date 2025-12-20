import java.util.Scanner;

//Create a class SumUntilZeroOrNegative to get sum until zero or negative and upto 10 numbers
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double number[] = new double[10];
        double total = 0.0;
        int index = 0;
  
        //using loop to take input until user enters negative or index reach maximum limit
        while (true) {
          
            System.out.println("Enter the number : ");
            double value = sc.nextDouble();
            
            //if index become 10 and value enter by user is negative or zero then break 
            if (index == 10 || value <= 0) {
                break;
            }
            number[index] = value;
            //increment the value by 1
            index++; 
        }
        
        //using for loop to iterate over the array and adding sum to get total
        for (int i = 0; i < index; i++) {
            total += number[i];
        }
        
        //Print the total 
        System.out.println("The total value is " + total);

        sc.close();
    }
}