package com.barry.console;

import com.barry.metier.impl.CreditMetierImpl;

public class Application {

    public static void main(String[] args) {
        CreditMetierImpl metier = new CreditMetierImpl();
        double principal = 200_000;
        int duration = 240;
        double rate = 4.5;

        double monthlyCredit = metier.calculateMonthlyCredit(principal, rate, duration);
        System.out.println("monthlyCredit = " + monthlyCredit);
    }
}
