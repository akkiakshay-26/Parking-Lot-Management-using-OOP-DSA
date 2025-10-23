package com.parkinglot.exceptions;

public class VehicleAlreadyParkedException extends Exception {
    public VehicleAlreadyParkedException(String message) {
        super(message);
    }
}
