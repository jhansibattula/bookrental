package com.trimindtech.training1.Day8Day9;

public class LoanRate {
    public double overdueRateacodomic;
    public double OverdueRatenonacodamic;
    public static double overdueamount = 0.0;
    public static double amount= 1.0;

    public double getOverdueRateacodomic() {
        return overdueRateacodomic;
    }

    public void setOverdueRateacodomic(double overdueRateacodomic) {
        this.overdueRateacodomic = overdueRateacodomic;
    }

    public double getOverdueRatenonacodamic() {
        return OverdueRatenonacodamic;
    }

    public void setOverdueRatenonacodamic(double overdueRatenonacodamic) {
        OverdueRatenonacodamic = overdueRatenonacodamic;
    }

    public static double getOverdueamount() {
        return overdueamount;
    }

    public static void setOverdueamount(double overdueamount) {
        LoanRate.overdueamount = overdueamount;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        LoanRate.amount = amount;
    }

    public LoanRate(double overdueRateacodomic, double overdueRatenonacodamic) {
        this.overdueRateacodomic = overdueRateacodomic;
        this.OverdueRatenonacodamic = overdueRatenonacodamic;

    }





}
