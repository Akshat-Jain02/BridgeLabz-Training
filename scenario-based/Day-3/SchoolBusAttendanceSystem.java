/* School Bus Attendance System 
Track 10 students' presence.
1. Use for-each loop on names.
2. Ask "Present or Absent?"
3. Print total present and absent counts. */

import java.util.Scanner;

public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array to store the names of student
        String[] studentNames = {"Divyansh Pandey" , "Ashish Mishra", "Hariom Patel", "Raghav Sharma", "Abhinav Jain", "Vedic Choudary" ,"Ravi kumar", "Abhishek puri", 
                                "Shivam Mishra" , "Anuj Vishwakarma"};

        int presentCount = 0;
        int absentCount = 0;

        //for-each loop to iterate over the array to get name
        for (String name : studentNames) {
            System.out.println(name + "?" + "(P/A) :");
            String s = sc.next().toLowerCase();
            if (s.equals("p")) {
                presentCount++;
            } else if (s.equals("a")){
                absentCount++;
            }
        }

        //Printing the final result
        System.out.println("Present Student is : " + presentCount + "\nAbsent student is : " + absentCount);
        sc.close();
    }
}