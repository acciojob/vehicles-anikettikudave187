package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    // Constructor to initialize name
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;  // Default speed is 0
        this.currentDirection = 0;  // Default direction is 0 (facing north)
    }

    // Method to change the direction (steer)
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    // Method to change speed and direction (move)
    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    // Method to stop the vehicle
    public void stop() {
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
