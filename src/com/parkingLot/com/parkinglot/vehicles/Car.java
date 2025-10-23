package com.parkinglot.vehicles;

public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
