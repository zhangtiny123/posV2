package com.homework.pos;

import com.homework.pos.domain.Receipt;
import com.homework.pos.domain.ShoppingCart;
import com.homework.pos.domain.ShoppingCartItem;

import java.util.List;

public class POS
{
    public Receipt checkout(ShoppingCart shoppingCart)
    {
        Receipt receipt = new Receipt();
        List<ShoppingCartItem> items = shoppingCart.getItems();
        double totalPayment = 0;
        
        for (ShoppingCartItem item : items) {
            totalPayment += item.getGood().getPrice() * item.getAmount();
        }
        receipt.updateTotalPayment(totalPayment);
        
        return receipt;
    }
}
