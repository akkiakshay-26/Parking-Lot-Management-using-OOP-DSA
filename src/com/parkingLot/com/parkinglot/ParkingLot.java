package com.parkinglot;

import com.parkinglot.vehicles.Vehicle;
import com.parkinglot.exceptions.*;

import java.util.*;

public class ParkingLot {
    private PriorityQueue<ParkingSlot> freeSlots; // min-heap for nearest free slot
    private Map<String, ParkingSlot> vehicleMap;  // vehicleNumber -> ParkingSlot
    private List<ParkingSlot> allSlots;           // all slots for display

    public ParkingLot(int capacity) {
        freeSlots = new PriorityQueue<>();
        vehicleMap = new HashMap<>();
        allSlots = new ArrayList<>();

        for (int i = 1; i <= capacity; i++) {
            ParkingSlot slot = new ParkingSlot(i);
            freeSlots.add(slot);
            allSlots.add(slot);
        }
    }

    public void parkVehicle(Vehicle vehicle) throws SlotFullException, VehicleAlreadyParkedException {
        if (vehicleMap.containsKey(vehicle.getVehicleNumber())) {
            throw new VehicleAlreadyParkedException("Vehicle " + vehicle.getVehicleNumber() + " is already parked.");
        }

        if (freeSlots.isEmpty()) {
            throw new SlotFullException("Parking lot is full!");
        }

        ParkingSlot slot = freeSlots.poll();
        slot.parkVehicle(vehicle);
        vehicleMap.put(vehicle.getVehicleNumber(), slot);
        System.out.println("Parked at slot: " + slot.getSlotNumber());
    }

    public void removeVehicle(String vehicleNumber) throws InvalidVehicleException {
        if (!vehicleMap.containsKey(vehicleNumber)) {
            throw new InvalidVehicleException("Vehicle " + vehicleNumber + " not found.");
        }

        ParkingSlot slot = vehicleMap.get(vehicleNumber);
        slot.removeVehicle();
        freeSlots.add(slot);
        vehicleMap.remove(vehicleNumber);
        System.out.println("Vehicle removed from slot: " + slot.getSlotNumber());
    }

    public void findVehicle(String vehicleNumber) {
        if (vehicleMap.containsKey(vehicleNumber)) {
            ParkingSlot slot = vehicleMap.get(vehicleNumber);
            System.out.println("Vehicle found at slot: " + slot.getSlotNumber());
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public void displayStatus() {
        System.out.println("Parking Lot Status:");
        for (ParkingSlot slot : allSlots) {
            System.out.println(slot);
        }
    }

    public void showAvailableSlots() {
        System.out.println("Available Slots:");
        for (ParkingSlot slot : freeSlots) {
            System.out.println("Slot " + slot.getSlotNumber() + " is free.");
        }
    }
}
