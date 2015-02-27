package com.homework.pos.domain;

public class ShoppingCartItem
{
    private Good good;
    private Integer amount;

    public ShoppingCartItem(Good good, Integer amount)
    {

        this.good = good;
        this.amount = amount;
    }

    public Good getGood()
    {
        return good;
    }

    public Integer getAmount()
    {
        return amount;
    }
}
