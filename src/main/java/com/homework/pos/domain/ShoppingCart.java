package com.homework.pos.domain;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ShoppingCart
{
    private List<ShoppingCartItem> items = newArrayList();

    public void add(Good good, Integer amount)
    {
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(good, amount);
        items.add(shoppingCartItem);
    }

    public List<ShoppingCartItem> getItems()
    {
        return items;
    }
}
