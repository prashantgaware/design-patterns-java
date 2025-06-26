package com.nt.vehicle.components;

import com.nt.vehicle.strategy.NormalDrive;

public class GoodVehicle extends Vehicle {

    public GoodVehicle() {
        super(new NormalDrive());
        System.out.println("GoodVehicle :: 0-param constructor");
    }
}
