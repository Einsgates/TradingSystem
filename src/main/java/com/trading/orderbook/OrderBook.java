package com.trading.orderbook;

import com.trading.order.Order;

import java.util.HashMap;
import java.util.PriorityQueue;

public class OrderBook {
    private final PriorityQueue<Order> buyOrders;
    private final PriorityQueue<Order> sellOrders;
    private final HashMap<String, Order> allOrders;

    public OrderBook() {
        this.buyOrders = new PriorityQueue<>((a, b) -> b.getPrice() - a.getPrice());
        this.sellOrders = new PriorityQueue<>((a, b) -> a.getPrice() - b.getPrice());
        this.allOrders = new HashMap<>();
    }

    public void addOrder(Order order) {
        allOrders.put(order.getOrderId(), order);
        if (order.getType() == Order.OrderType.BUY) {
            buyOrders.offer(order);
        } else if (order.getType() == Order.OrderType.SELL) {
            sellOrders.offer(order);
        }
    }

    public boolean removeOrder(String orderId) {
        Order order = allOrders.remove(orderId);
        if (order == null) {
            return false;
        }
        if (order.getType() == Order.OrderType.BUY) {
            buyOrders.remove(order);
        } else if (order.getType() == Order.OrderType.SELL) {
            sellOrders.remove(order);
        }
        return true;
    }

    public Order getBestBuyOrder() {
        return buyOrders.peek();
    }

    public Order getBestSellOrder() {
        return sellOrders.peek();
    }
}
