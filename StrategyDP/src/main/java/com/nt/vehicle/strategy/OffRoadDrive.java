package com.nt.vehicle.strategy;

public class OffRoadDrive implements DriveStrategy {

    @Override
    public String drive() {
        return "Driving off-road through rugged terrain.";
    }
}
