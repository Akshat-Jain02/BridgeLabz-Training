import java.util.Scanner;

//Create a MultiplicationTable class to print the table of number from 1 to 10
public class MultiplicationTable {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = sc.nextInt();
 
        //created a table array to store table of inputed number
        int table[] = new int[10];

        //filling the table array with the multiples of number
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = i * number;
        }

        //Iterating over the table array to display the table of number
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = "+ table[i]);
        }

        sc.close();
    }
}