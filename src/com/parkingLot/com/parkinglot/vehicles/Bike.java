package com.parkinglot.vehicles;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}
