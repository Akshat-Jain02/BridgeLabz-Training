package com.lamdaexpressions.bankingfinancesystem;

@FunctionalInterface
public interface MinimumBalanceCheck {
    boolean check(double balance);
}
