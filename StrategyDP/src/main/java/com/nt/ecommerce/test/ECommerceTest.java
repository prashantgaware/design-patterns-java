package com.nt.ecommerce.test;

import com.nt.ecommerce.factory.ECommerceFactory;
import com.nt.ecommerce.store.ECommerceStore;

public class ECommerceTest {
    public static void main(String[] args) {
        ECommerceStore dtdcStore = ECommerceFactory.getInstance("DTDC");
        String result = dtdcStore.shopping(
                new String[] {"Mobile", "Laptop", "Headphones"},
                new double[] {10000, 20000, 3000});

        System.out.println("Order Status: " + result);
    }
}
