public class ZaraBonus {

     //Method to generate random employee salary and years of service
     public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {
            
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            //Years of service 
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    //Method to calculate bonus and new salary based on the year of serrvice
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    //Method to display the final report
    public static void displayReport(int[][] oldData, double[][] newData) {

         double totalOldSalary = 0;
         double totalNewSalary = 0;
         double totalBonus = 0;

         System.out.println("Emp | Old Salary | Years | Bonus | New Salary");
         for (int i = 0; i < oldData.length; i++) {

             int oldSalary = oldData[i][0];
             int years = oldData[i][1];
             double bonus = newData[i][1];
             double newSalary = newData[i][0];

             totalOldSalary += oldSalary;
             totalBonus += bonus;
             totalNewSalary += newSalary;

             System.out.println(
                (i + 1) + "   | " +
                oldSalary + "     | " +
                years + "     | " +
                bonus + " | " +
                newSalary
                );
          }

       System.out.println("--------------------------------------------------");
       System.out.println("Total Old Salary : " + totalOldSalary);
       System.out.println("Total Bonus      : " + totalBonus);
       System.out.println("Total New Salary : " + totalNewSalary);
    }

    public static void main(String[] args) {

        final int EMPLOYEES = 10;

        int[][] employeeData = generateEmployeeData(EMPLOYEES);
        double[][] newSalaryData = calculateNewSalaryAndBonus(employeeData);
        //Calling the method to display results
        displayReport(employeeData, newSalaryData);
    }
     
}