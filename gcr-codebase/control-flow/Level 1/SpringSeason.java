//Create a SpringSeason class to find whether its spring season or not

public class SpringSeason {

    public static void main(String[] args) {
        
         //Taking the day and month in number as an input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        //check whether the given date and month lies in spring season or not
        boolean isSpring = true;
        if (month >= 3 && month <=6) {
            if (month == 3 && day < 20) {
                isSpring = false;
            }  else if (month == 6 && day >20) {
                isSpring = false;
            }
        }  else {
            isSpring = false;
        }
        
        //Printing whether the given month date lies in Sping season or not
        System.out.println(isSpring ?  "Its a Spring Season" :  "Not a Spring Season");
    
     }
}