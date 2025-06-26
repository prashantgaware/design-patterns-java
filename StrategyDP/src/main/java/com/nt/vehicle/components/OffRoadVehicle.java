package com.nt.vehicle.components;

import com.nt.vehicle.strategy.OffRoadDrive;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new OffRoadDrive());
        System.out.println("OffRoadVehicle :: 0-param constructor");
    }
}
