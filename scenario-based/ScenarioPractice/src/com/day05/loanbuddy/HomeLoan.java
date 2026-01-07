package com.day05.loanbuddy;

class HomeLoan extends LoanApplication {
	
    public HomeLoan(int term) {
        super("Home Loan", term, 8.5);
    }

    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 50000) {
            setApproved(true);
        }
        return isApproved();
    }
}