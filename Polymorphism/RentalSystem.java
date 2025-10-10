package org.officeAssignment.Polymorphism;

    // Parent class
    class Vehicle {
        public void calculateRentalCost(int units) {
            System.out.println("Calculating rental cost for a generic vehicle...");
        }
    }

    // Child class 1
    class Car extends Vehicle {
        @Override
        public void calculateRentalCost(int hours) {
            int cost = hours * 500; // ₹500 per hour
            System.out.println("Car rental cost: ₹" + cost);
        }
    }

    // Child class 2
    class Bike extends Vehicle {
        @Override
        public void calculateRentalCost(int hours) {
            int cost = hours * 100; // ₹100 per hour
            System.out.println("Bike rental cost: ₹" + cost);
        }
    }

    // Child class 3
    class Truck extends Vehicle {
        @Override
        public void calculateRentalCost(int km) {
            int cost = km * 50 + 2000; // ₹50 per km + ₹2000 base charge
            System.out.println("Truck rental cost: ₹" + cost);
        }
    }

    // Main class
    public class RentalSystem {
        public static void main(String[] args) {
            Vehicle v1 = new Car();
            Vehicle v2 = new Bike();
            Vehicle v3 = new Truck();

            v1.calculateRentalCost(4);   // Car version called
            v2.calculateRentalCost(3);   // Bike version called
            v3.calculateRentalCost(100); // Truck version called
        }
    }
