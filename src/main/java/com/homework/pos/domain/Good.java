package com.homework.pos.domain;

public class Good
{
    private final String name;
    private double price;

    public Good(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    
}
