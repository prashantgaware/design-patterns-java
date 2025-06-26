package com.nt.vehicle.strategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public String drive() {
        return "Driving normally on the road.";
    }
}
