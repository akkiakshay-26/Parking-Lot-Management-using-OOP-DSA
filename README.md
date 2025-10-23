🚗 Smart Parking Lot System (Java Console Project)

A console-based parking management system built using Core Java, OOP principles, and DSA concepts.
The project efficiently manages vehicle parking, slot allocation, and retrieval with a clean modular architecture and data-structure-based optimization.

🧠 Project Overview

This system simulates a real-world parking lot, where users can:

Park vehicles (Car/Bike)

Remove vehicles

View parking slot status

Search for a vehicle

View available parking slots

The system ensures fast slot allocation, valid input handling, and error-free operations using PriorityQueue, HashMap, and custom exceptions.

🏗️ Tech Stack
Layer	Technology
Language	Java (JDK 17+)
Architecture	Object-Oriented Programming (OOP)
Data Structures	PriorityQueue, HashMap, ArrayList
Exception Handling	Custom Exceptions (e.g., SlotFullException)
Interface	Console-based (CLI)
🧩 Features

✅ Efficient Slot Allocation — Uses PriorityQueue to assign the nearest available slot in O(log n).
✅ Fast Vehicle Lookup — Uses HashMap for O(1) search and removal.
✅ Modular OOP Design — Cleanly separated classes for Vehicle, Slot, and ParkingLot.
✅ Custom Exceptions — Handles invalid inputs, duplicates, and full capacity gracefully.
✅ Input Validation — Prevents invalid vehicle numbers or types.
✅ Scalable Architecture — Easy to extend for trucks, EVs, or smart sensors.

📁 Project Structure
SmartParkingLot/
│
├── src/
│   └── com/
│       └── parkinglot/
│           ├── ParkingSystem.java        # Main console UI
│           ├── ParkingLot.java           # Core parking management logic
│           ├── ParkingSlot.java          # Individual slot structure
│           │
│           ├── exceptions/
│           │   ├── InvalidVehicleException.java
│           │   ├── SlotFullException.java
│           │   └── VehicleAlreadyParkedException.java
│           │
│           ├── interfaces/
│           │   └── Parkable.java
│           │
│           └── vehicles/
│               ├── Vehicle.java          # Abstract base class
│               ├── Car.java              # Car implementation
│               └── Bike.java             # Bike implementation
│
└── README.md

⚙️ How to Run

Clone the repository

git clone https://github.com/<your-username>/SmartParkingLot.git
cd SmartParkingLot


Compile the project

javac -d out src/com/parkinglot/**/*.java


Run the application

java -cp out com.parkinglot.ParkingSystem

🧮 Sample Console Interaction
🚗 Welcome to Smart Parking Lot System 🚗
Enter total number of parking slots: 3

========= MENU =========
1. Park Vehicle
2. Remove Vehicle
3. Display Parking Status
4. Find Vehicle
5. Show Available Slots
6. Exit
Choose an option: 1

Enter Vehicle Number (4 digits): 1234
Enter Vehicle Type (Car/Bike): Car
Parked at slot: 1

💡 Concepts Used
🔸 Object-Oriented Programming

Abstraction → Parkable interface & Vehicle abstract class

Inheritance → Car and Bike extend Vehicle

Encapsulation → Private attributes with getters/setters

Polymorphism → Common methods for different vehicle types

🔸 Data Structures & Algorithms

PriorityQueue → For nearest-slot allocation

HashMap → For constant-time vehicle lookup

ArrayList → For maintaining all slots

🔸 Exception Handling

Handled with custom classes:

InvalidVehicleException

SlotFullException

VehicleAlreadyParkedException

🔮 Future Enhancements

🚀 Add slot reservation via QR code
⚡ Integrate a GUI (JavaFX or Swing)
🌐 Add database (MySQL / MongoDB) support
🤖 Extend to Smart IoT Parking using sensors

👨‍💻 Author

Devatha Akshay
🎓 B.Tech CSE, VJIT
💼 Passionate about Software Engineering, Java, and DSA
🔗 