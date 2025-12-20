import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five numbers");
     
        int number[] = new int[5];
        
        //Taking input in the number array
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        
        //iteratively looping over the array
        for (int i = 0; i < number.length; i++) {
            
            if (number[i] > 0) {
                
                if (number[i] % 2 == 0) {
                    System.out.println("The number " + number[i] + "is even");
                } else {
                    System.out.println("The number " + number[i] + "is odd");
                }

            } else if(number[i] < 0) {
                System.out.println("Negative");
            }  else {
                System.out.println("Zero");
            }
        }
       
        //checking the frist and last number of array
        if (number[0] == number[number.length - 1]) {
            System.out.println("Both the first and last number of array is Equal");
        } else if(number[0] < number[number.length - 1]){
            System.out.println("the first number is lesser than last");
        } else {
            System.out.println("The first number is greater than last one");
        }
        
        sc.close();
        
    }
}