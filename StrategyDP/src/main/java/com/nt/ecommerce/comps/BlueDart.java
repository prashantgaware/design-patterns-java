package com.nt.ecommerce.comps;

public class BlueDart implements ICourier {

    public BlueDart() {
        System.out.println("BlueDart :: 0-param constructor");
    }

    @Override
    public String deliverOrder(int orderId) {
        return "BlueDart :: Order " + orderId + " is delivered";
    }
}
