//Create a class penDistribution to calculate pen per student and remaining pens

public class PenDistribution {

    public static void main(String[]args) {

       //Create a variable to hold total pens and total students 
       int totalPens = 14, students = 3;
      
       //Create a variable penPerStudent to hold the pen per student get
       int penPerStudent = totalPens / students;

       //Create a variable remainingPen to hold the remaining pen left after distribution
       int remainingPen = totalPens % students;
       
       //Print the pen per student and the pen remaining
       System.out.println("The Pen Per Student is  " + penPerStudent +
                          "  and the remaining pen not distributed is " + remainingPen);
    }
}