package com.driver;

public class F1 extends Car {

    // Constructor for F1 (uses arbitrary values for some parameters)
    public F1(String name, boolean isManual) {
        super(name, 4, 4, 6, isManual, "auto", 6); // Default F1 values
    }

    // Method to accelerate and change gear
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate; // Update speed based on the rate

        // Speed and gear change logic
        if (newSpeed == 0) {
            stop();  // Stop the car
            changeGear(1);  // Set gear to 1
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        // Apply the new speed and direction
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
