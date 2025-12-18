import java.util.Scanner;

//Created a class SumUntilZeroOrNegative to total sum until user enters zero or negative

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double sum = 0.0;
        
        //Use a while loop to incrementally take value until user enters zero
        while (true) {
              
            //Taking the input from user
            System.out.println("Enter the value : ");
            double val = sc.nextDouble();
              
             //checking if user enters zero value or negative value to break the loop 
             if (val <= 0) {
                 break;
             }
              
             //adding the values to find the total
             sum += val;
        }

        System.out.println("The total value is : " + sum);
         
        sc.close();    
   }
}