package com.nt.vehicle.test;

import com.nt.vehicle.components.Vehicle;
import com.nt.vehicle.strategy.NormalDrive;
import com.nt.vehicle.strategy.OffRoadDrive;

public class VehicleTest {
    public static void main(String[] args) {
        // Create a vehicle with normal driving strategy
        Vehicle vehicle1 = new Vehicle(new NormalDrive());
        System.out.println("Vehicle 1 is ready with Normal Drive strategy.");
        vehicle1.drive();
        System.out.println();
        // Create a vehicle with off-road driving strategy
        Vehicle vehicle2 = new Vehicle(new OffRoadDrive());
        System.out.println("Vehicle 2 is ready with Off-Road Drive strategy.");
        vehicle2.drive();
        System.out.println();
        // Change the driving strategy of vehicle1 to off-road
        System.out.println("Changing Vehicle 1's driving strategy to Off-Road Drive.");
        vehicle1 = new Vehicle(new OffRoadDrive());
        System.out.println("Vehicle 1 is now ready with Off-Road Drive strategy.");
        vehicle1.drive();
    }
}
