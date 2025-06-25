package com.nt.ecommerce.store;

import com.nt.ecommerce.comps.ICourier;

import java.util.Arrays;

public class ECommerceStore {
    private ICourier courier;

    public ECommerceStore() {
        System.out.println("ECommerceStore: 0-param constructor");
    }

    public void setCourier(ICourier courier) {
        this.courier = courier;
    }

    public String shopping(String[] items, double[] amount) {
        double billAmt = 0.0;
        for (double price : amount) {
            billAmt += price;
        }

        String billMessage = Arrays.toString(items)
                + "with prices " + Arrays.toString(amount)
                + " and total amount is " + billAmt;

        int orderId = (int) (Math.random() * 1000);
        String deliveryMessage = courier.deliverOrder(orderId);
        return billMessage + "\n" + deliveryMessage;
    }
}
