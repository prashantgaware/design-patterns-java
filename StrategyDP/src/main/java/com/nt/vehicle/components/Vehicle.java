package com.nt.vehicle.components;

import com.nt.vehicle.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
        System.out.println("Vehicle is ready with the specified driving strategy." +
                           " Drive strategy: " + driveStrategy.getClass().getSimpleName());
    }


    public String drive() {
        return driveStrategy.drive();
    }
}
