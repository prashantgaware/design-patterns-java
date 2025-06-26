package com.nt.vehicle.components;

import com.nt.vehicle.strategy.SportsDrive;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDrive());
        System.out.println("SportsVehicle :: 0-param constructor");
    }
}
