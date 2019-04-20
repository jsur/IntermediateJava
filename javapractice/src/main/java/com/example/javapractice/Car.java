package com.example.javapractice;

public class Car {
    public String color = "Black";
    private int mNumberOfSeats = 5;
    private String mInterior = "Leather";

    public Car() {

    }

    public Car(String chosenColor, String chosenInterior) {
        color = chosenColor;
        mInterior = chosenInterior;
    }

    public String getInterior() {
        return mInterior;
    }
}
