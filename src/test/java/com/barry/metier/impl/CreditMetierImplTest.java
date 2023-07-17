package com.barry.metier.impl;

import com.barry.metier.CreditMetier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CreditMetierImplTest {

    private static CreditMetier metier;

    @BeforeAll
    static void setUp() {
        metier = new CreditMetierImpl();
    }

    @Test
    void calculateMonthlyCreditTest() {

        double principal = 200_000;
        int duration = 240;
        double rate = 4.5;
        double expected = 1265.2987;

        double result = metier.calculateMonthlyCredit(principal, rate, duration);
        assertEquals(expected, result, 0.0001);
    }
}