package com.day05.loanbuddy;

import java.util.Scanner;

public class LoanBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your credit score");
        int creditScore = sc.nextInt();
        System.out.println("Please enter your income");
        double income = sc.nextDouble();
        System.out.println("Please enter loan amount");
        double loanAmount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please enter loan type");
        String loanType = sc.nextLine();
        System.out.println("please enter term");
        int term = sc.nextInt();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);
        LoanApplication loan;

        if (loanType.equalsIgnoreCase("personal")) {
            loan = new PersonalLoan(term);
        } else if (loanType.equalsIgnoreCase("home")) {
            loan = new HomeLoan(term);
        } else {
            loan = new AutoLoan(term);
        }

        if (loan.approveLoan(applicant)) {
            double emi = loan.calculateEMI(loanAmount, loan.interestRate, loan.term);
            System.out.println("Approved");
            System.out.println(Math.round(emi));
        } else {
            System.out.println("Rejected");
        }
    }
}