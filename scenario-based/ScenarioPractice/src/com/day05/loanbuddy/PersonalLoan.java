package com.day05.loanbuddy;

class PersonalLoan extends LoanApplication {
	
    public PersonalLoan(int term) {
        super("Personal Loan", term, 12.5);
    }

    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
            setApproved(true);
        }
        return isApproved();
    }
}