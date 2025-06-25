package com.nt.ecommerce.comps;

public class DHL implements ICourier {

    public DHL() {
        System.out.println("DHL Courier initialized");
    }

    @Override
    public String deliverOrder(int orderId) {
        return "DHL Courier is delivering order with ID: " + orderId;
    }
}
