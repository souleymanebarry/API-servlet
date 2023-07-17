package com.barry.web;

public class CreditModel {


    private double amount;
    private double rate;
    private int duration;
    private double monthlyPayment;

    public CreditModel() {}

    public CreditModel(double amount, double rate, int duration, double monthlyPayment) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.monthlyPayment = monthlyPayment;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
