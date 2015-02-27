package com.homework.pos;

import com.homework.pos.domain.Good;
import com.homework.pos.domain.Receipt;
import com.homework.pos.domain.ShoppingCart;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class POSTest
{
    @Test
    public void should_return_receipt_with_total_payment_when_given_one_good_amount_one(){
        // given
        POS pos = new POS();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Good("ITEM000001", 50), 1);

        //when
        Receipt receipt = pos.checkout(shoppingCart);
                
        //then
        assertThat(receipt.getTotalPayment(), is(50.0));
    }
}
