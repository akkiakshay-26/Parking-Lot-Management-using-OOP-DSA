package com.parkinglot;

import com.parkinglot.vehicles.*;
import com.parkinglot.exceptions.*;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚗 Welcome to Smart Parking Lot System 🚗");
        System.out.print("Enter total number of parking slots: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        ParkingLot parkingLot = new ParkingLot(capacity);

        boolean running = true;
        while (running) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Parking Status");
            System.out.println("4. Find Vehicle");
            System.out.println("5. Show Available Slots");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        // Vehicle number validation (example: 4-digit numeric)
                        String number;
                        while (true) {
                            System.out.print("Enter Vehicle Number (4 digits): ");
                            number = scanner.nextLine();
                            if (number.matches("\\d{4}")) break;
                            System.out.println("Invalid vehicle number! Must be 4 digits.");
                        }

                        // Vehicle type validation
                        String type;
                        while (true) {
                            System.out.print("Enter Vehicle Type (Car/Bike): ");
                            type = scanner.nextLine();
                            if (type.equalsIgnoreCase("Car") || type.equalsIgnoreCase("Bike")) break;
                            System.out.println("Invalid vehicle type! Please enter Car or Bike.");
                        }

                        Vehicle vehicle;
                        if (type.equalsIgnoreCase("Car")) {
                            vehicle = new Car(number);
                        } else {
                            vehicle = new Bike(number);
                        }

                        parkingLot.parkVehicle(vehicle);

                    } catch (SlotFullException | VehicleAlreadyParkedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number to Remove: ");
                    String vehicleNum = scanner.nextLine();
                    try {
                        parkingLot.removeVehicle(vehicleNum);
                    } catch (InvalidVehicleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    parkingLot.displayStatus();
                    break;

                case 4:
                    System.out.print("Enter Vehicle Number to Search: ");
                    String searchNum = scanner.nextLine();
                    parkingLot.findVehicle(searchNum);
                    break;

                case 5:
                    parkingLot.showAvailableSlots();
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using Smart Parking Lot!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }

        scanner.close();
    }
}
