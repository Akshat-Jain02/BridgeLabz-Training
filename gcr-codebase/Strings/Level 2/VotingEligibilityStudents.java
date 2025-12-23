import java.util.Scanner;

public class VotingEligibilityStudents {

    // Method to generate random 2-digit ages for n students using Math.random()
    public static int[] generateStudentAges(int n) {
        int[] ages = new int[n];

        //Generating random ages using Math.random() method
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; 
        }
        return ages;
    }

    // Method to validate age and check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //Enter the number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();   
 
        //Calling the appropriate method
        int[] ages = generateStudentAges(n);
        String[][] table = checkVotingEligibility(ages);
         
        //Printing the results
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        sc.close();
    }
}
