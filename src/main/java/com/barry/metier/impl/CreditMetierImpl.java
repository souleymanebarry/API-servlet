package com.barry.metier.impl;

import com.barry.metier.CreditMetier;

public class CreditMetierImpl implements CreditMetier {

    @Override
    public double calculateMonthlyCredit(double principal, double rate, int duration) {
        double t = rate / 100;
        double t1 = principal * (t / 12);
        double t2 = 1 - Math.pow((1 + t / 12), - duration);
        return t1 / t2;
    }
}
