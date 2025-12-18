import java.util.Scanner;

//Create a IsEligibleForVote class to check for voting eligibility based on age

public class IsEligibleForVote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Take the age as input 
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
       
        //check for the eligibility for vote based on age
        if (age >=  18) {
            System.out.println("The person's age is " + age +" and can vote");
        } else {
            System.out.println("The person's age is "+ age +" and cannot vote");
        }

        sc.close();
    }
}