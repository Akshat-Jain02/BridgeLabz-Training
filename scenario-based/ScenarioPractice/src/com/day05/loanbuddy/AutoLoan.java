package com.day05.loanbuddy;

class AutoLoan extends LoanApplication {
	
    public AutoLoan(int term) {
        super("Auto Loan", term, 9.5);
    }

    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 680 && applicant.getIncome() >= 40000) {
            setApproved(true);
        }
        return isApproved();
    }
}