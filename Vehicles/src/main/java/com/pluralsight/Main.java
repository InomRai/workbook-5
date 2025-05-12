package com.pluralsight;

import java.sql.SQLOutput;

import static java.awt.Color.red;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(500);
        familyCar.setFuelCapacity(70);

        SemiTruck bigCar = new SemiTruck();
        bigCar.setColor("Gray");
        bigCar.setNumberOfPassengers(8);
        bigCar.setCargoCapacity(1500);
        bigCar.setFuelCapacity(400);

        HoverCraft boat = new HoverCraft();
        boat.setColor("Silver");
        boat.setNumberOfPassengers(9);
        boat.setCargoCapacity(1200);
        boat.setFuelCapacity(250);

        System.out.println("Moped Details: ");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());

        System.out.println("\nCar Details: ");
        System.out.println("Color: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());
        System.out.println("Cargo Capicity: " + familyCar.getCargoCapacity());
        System.out.println("Fuel Capicity: " + familyCar.getFuelCapacity());

        System.out.println("\nSemiTruck Details: ");
        System.out.println("Color: " + bigCar.getColor());
        System.out.println("Passengers: " + bigCar.getNumberOfPassengers());
        System.out.println("Cargo Capicity: " + bigCar.getCargoCapacity());
        System.out.println("Fuel Capicity: " + bigCar.getFuelCapacity());

        System.out.println("\nHoverCraft");
        System.out.println("Color: " + boat.getColor());
        System.out.println("Passengers: " + boat.getNumberOfPassengers());
        System.out.println("Cargo Capicity: " + boat.getCargoCapacity());
        System.out.println("Fuel Capicity: " + boat.getFuelCapacity());


    }
}
