package com.thoughtworks.recieptsgenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void shouldHaveNoSalesTaxAppliedIfItIsBook() {
        Goods goods = new Goods("book", 12.49);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }
}
