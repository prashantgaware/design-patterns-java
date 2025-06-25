package com.nt.ecommerce.factory;

import com.nt.ecommerce.comps.BlueDart;
import com.nt.ecommerce.comps.DHL;
import com.nt.ecommerce.comps.DTDC;
import com.nt.ecommerce.comps.ICourier;
import com.nt.ecommerce.store.ECommerceStore;

public class ECommerceFactory {
    public static ECommerceStore getInstance(String courierType) {
        if (courierType == null || courierType.isEmpty()) {
            throw new IllegalArgumentException("Courier type cannot be null or empty");
        }

        ICourier courier;
        switch (courierType) {
            case "BlueDart":
                courier = new BlueDart();
                break;
            case "DTDC":
                courier = new DTDC();
                break;
            case "DHL":
                courier = new DHL();
                break;
            default:
                throw new IllegalArgumentException("Invalid courier type: " + courierType);
        }

        ECommerceStore store = new ECommerceStore();
        store.setCourier(courier);
        return store;
    }
}

