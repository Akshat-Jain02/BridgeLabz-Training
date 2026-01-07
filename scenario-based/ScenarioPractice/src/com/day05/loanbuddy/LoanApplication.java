package com.day05.loanbuddy;

abstract class LoanApplication implements IApprovable {
	
    protected String loanType;
    protected int term;
    protected double interestRate;
    private boolean approved;

    public LoanApplication(String loanType, int term, double interestRate) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.approved = false;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    public double calculateEMI(double P, double R, int N) {
        double r = R / (12 * 100);
        return (P * r * Math.pow(1 + r, N)) / (Math.pow(1 + r, N) - 1);
    }
}
