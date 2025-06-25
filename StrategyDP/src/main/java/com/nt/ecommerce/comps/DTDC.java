package com.nt.ecommerce.comps;

public class DTDC implements ICourier {

    public DTDC() {
        System.out.println("DTDC Courier is ready to deliver orders.");
    }

    @Override
    public String deliverOrder(int orderId) {
        return "DTDC Courier is delivering order with ID: " + orderId;
    }
}
