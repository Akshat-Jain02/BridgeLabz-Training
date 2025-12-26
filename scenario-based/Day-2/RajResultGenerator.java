import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks using for loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Assign grade using switch
        switch ((int) average / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
