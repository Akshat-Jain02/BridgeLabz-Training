import java.util.Scanner;

public class StudentVoteChecker {
    
    //Method to check for age is greater or qual to 18 or not and return true and false;
    public boolean canStudentVote(int age) {
        
        if (age<0) {
            return false;
        }

        //if age is greater than or equal to 18 then return true else false
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];
   
        //Using for loop to take input iteratively and print can vote and can not vote accordingly
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);
 
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
            
        }
        sc.close();
    }
}