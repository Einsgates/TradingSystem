package com.trading.order;

import com.trading.order.Order.OrderType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTests {

    @Test
    public void testOrderType() {
        OrderType type1 = OrderType.BUY;
        OrderType type2 = OrderType.SELL;
        assertEquals(type1, OrderType.BUY);
        assertEquals(type2, OrderType.SELL);
    }
}
