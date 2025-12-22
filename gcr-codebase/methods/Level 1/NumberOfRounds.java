import java.util.Scanner;

//Create a class NumberOfRounds to calculate the number of rounds to complete 5km 
public class NumberOfRounds {
  
    //create a method roundsNeeded to calculate rounds and return it
    public static int roundsNeeded(double perimeter) {
        int totalDistance = 5000;
        int rounds = (int)((totalDistance + (perimeter - 1)) / perimeter);
        return rounds;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking the sides of triangular park in m
        System.out.println("Enter the  sides of triangle (in m)");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        
        int rounds = roundsNeeded(perimeter);

        //Printing the rounds needed
        System.out.println( "The number of rounds user needs to do to complete 5km run is "+
                            rounds);
        sc.close();
     }
    
}