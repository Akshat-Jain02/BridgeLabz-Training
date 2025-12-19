import java.util.Scanner;

//Create a class YoungestAndtallest to find the youngest and tallest of three friends
public class YoungestAndTallest {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      
      //Taking the age as input of three friends
       System.out.println("Enter the amar age: ");
       int amarAge  = sc.nextInt();
       System.out.println("Enter the friend akbar age :");
       int akbarAge = sc.nextInt();
       System.out.println("Enter the friend anthony age ");
       int anthonyAge = sc.nextInt();
       
       //Taking the height as an input from user
       System.out.println("Enter the amar height: ");
       int amarHeight  = sc.nextInt();
       System.out.println("Enter the friend akbar height :");
       int akbarHeight = sc.nextInt();
       System.out.println("Enter the friend anthony Height ");
       int anthonyHeight = sc.nextInt(); 
       
       //Checking for the youngest of the three
       if (amarAge <= akbarAge && amarAge <= anthonyAge) {
          System.out.println("The youngest friend is Amar");
       }  else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
          System.out.println("The youngest friend is Akbar");
       } else {
           System.out.println("The youngest friend is Anthony");
       }
       
       //checking for the tallest of three
       if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
          System.out.println("The Tallest friend is Amar");
       }  else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
          System.out.println("The Tallest friend is Akbar");
       } else {
          System.out.println("The Tallest friend is Anthony");
       }
       
       sc.close();

    }
}