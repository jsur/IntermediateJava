package com.example.javapractice;

public class SelfDrivingCar extends Car {

    public SelfDrivingCar(String chosenColor, String chosenInterior) {
        super(chosenColor, chosenInterior);
        System.out.println("Constructing self-driving car.");
    }

    @Override
    public void drive() {
        super.drive(); // call superclass's drive method first
        System.out.println("Self-driving car is moving towards Mountain View, California.");
    }
}
