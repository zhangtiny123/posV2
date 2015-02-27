package com.homework.pos.domain;

public class Receipt
{
    private double totalPayment;

    public Receipt()
    {
        this.totalPayment = 0;
    }

    public double getTotalPayment()
    {
        return totalPayment;
    }

    public void updateTotalPayment(double totalPayment)
    {
        this.totalPayment += totalPayment;
    }
}
