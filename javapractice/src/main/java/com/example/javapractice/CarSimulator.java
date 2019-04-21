package com.example.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("Starting CarSimulator......");

        Car myToyota = new Car("Kakanruskea", "Nahka");
        myToyota.drive();

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();

    }
}
