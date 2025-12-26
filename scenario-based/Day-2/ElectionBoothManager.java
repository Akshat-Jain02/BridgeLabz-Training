import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();

            // exit condition to break the loop
            if (age == -1) {
                break;
            }

            // check eligibility to vote
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Press 1 for Candidate A");
                System.out.println("Press 2 for Candidate B");
                System.out.println("Press 3 for Candidate C");

                System.out.print("Enter your vote: ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    vote1++;
                } else if (vote == 2) {
                    vote2++;
                } else if (vote == 3) {
                    vote3++;
                } else {
                    System.out.println("Invalid vote.");
                }
            } else {
                System.out.println("Sorry, you are not eligible to vote.");
            }
        }

        // final result
        System.out.println("\n--- Election Result ---");
        System.out.println("Candidate A votes: " + vote1);
        System.out.println("Candidate B votes: " + vote2);
        System.out.println("Candidate C votes: " + vote3);

        sc.close();
    }
}
