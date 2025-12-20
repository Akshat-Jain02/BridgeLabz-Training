import java.util.Scanner;

//Created a YoungestAndTallest class to get the youngest and tallest friend
public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"}; 

        int[] age = new int[3];
        int[] height = new int[3];
        
        //Taking the age and height of the three from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details for " + names[i]);

            System.out.println("Enter age : ");
            age[i] = sc.nextInt();
            System.out.println("Enter height ");
            height[i] = sc.nextInt();
        } 
        
        //declare two variables to keep record
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        //finding the youngest and tallest index for string array to get the names
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            } 
        }
      
        //Printing the results
        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + ")");
     
        sc.close();
    }
}