package com.lamdaexpressions.employeemanagementsystem;

@FunctionalInterface
public interface PromotionCheck {
    boolean isEligible(int experience);
}
