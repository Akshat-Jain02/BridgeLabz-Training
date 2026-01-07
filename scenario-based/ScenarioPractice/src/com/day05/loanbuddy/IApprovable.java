package com.day05.loanbuddy;

interface IApprovable {
	
    boolean approveLoan(Applicant applicant);
    double calculateEMI(double principal, double rate, int term);
}