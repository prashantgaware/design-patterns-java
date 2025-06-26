package com.nt.vehicle.strategy;

public class SportsDrive implements DriveStrategy {

    @Override
    public String drive() {
        return "Driving at high speed on a racetrack with precision handling.";
    }
}
