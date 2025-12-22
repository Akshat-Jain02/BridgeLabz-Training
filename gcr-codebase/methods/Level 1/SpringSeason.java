//Create a class SpringSeason to determine whether the given date or month falls in spring season or not
public class SpringSeason {

   //create a method to check for the constraints of spring season
   public static boolean isSpring(int month, int day) {
 
       if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
           return true;
       }
       return false;
   
   }

   public static void main(String[] args) {
 
       //Passing the command line argument to the isSpring method
       boolean flag = isSpring(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
 
       //Printing whether the give month or date lies in spring season or not
       System.out.println(flag ? "Its a Spring Season" : "Not a Spring Season"); 

   }
}