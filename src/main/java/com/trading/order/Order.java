package com.trading.order;

public class Order {

    public enum OrderType {
        BUY,
        SELL
    }

    private final String orderId;
    private final OrderType type;
    private final int price;
    private final int quantity;

    public Order(String orderId, OrderType type, int price, int quantity) {
        this.orderId = orderId;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
