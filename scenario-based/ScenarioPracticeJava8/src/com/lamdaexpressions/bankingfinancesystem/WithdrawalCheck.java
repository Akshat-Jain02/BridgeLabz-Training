package com.lamdaexpressions.bankingfinancesystem;

@FunctionalInterface
public interface WithdrawalCheck {
    boolean isValid(double balance, double amount);
}
