package com.example.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("Starting CarSimulator......");

        Car myToyota = new Car("Kakanruskea", "Nahka");
        System.out.println("The car color is: " + myToyota.color);
        System.out.println("The car interior is made of: " + myToyota.getInterior());

        myToyota.color = "Blue";

        System.out.println("The new car color is: " + myToyota.color);



    }
}
