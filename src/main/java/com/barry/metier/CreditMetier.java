package com.barry.metier;

public interface CreditMetier {
    double calculateMonthlyCredit(double principal, double rate, int duration);
}
