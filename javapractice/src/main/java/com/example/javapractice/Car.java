package com.example.javapractice;

public class Car {
    public String color = "Black";
    private int mNumberOfSeats = 5;
    protected String mInterior = "Leather";

    public Car() {

    }

    public Car(String chosenColor, String chosenInterior) {
        color = chosenColor;
        mInterior = chosenInterior;
    }

    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void drive() {
        System.out.println("Car is moving!");
    }


}
