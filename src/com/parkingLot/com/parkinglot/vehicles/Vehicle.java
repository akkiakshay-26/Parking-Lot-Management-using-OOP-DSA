package com.parkinglot.vehicles;

import com.parkinglot.interfaces.Parkable;

public abstract class Vehicle implements Parkable {
    private String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public abstract String getVehicleType();

    @Override
    public String toString() {
        return getVehicleType() + " - " + vehicleNumber;
    }
}
