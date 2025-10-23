package com.parkinglot;

import com.parkinglot.vehicles.Vehicle;

public class ParkingSlot implements Comparable<ParkingSlot> {
    private int slotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    @Override
    public String toString() {
        if (isOccupied) {
            return "Slot " + slotNumber + ": " + parkedVehicle.toString();
        } else {
            return "Slot " + slotNumber + ": Empty";
        }
    }

    @Override
    public int compareTo(ParkingSlot other) {
        return this.slotNumber - other.slotNumber; // for PriorityQueue ordering
    }
}
