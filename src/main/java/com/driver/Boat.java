package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    // Constructor to initialize Boat attributes
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementing methods from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    // Getters and Setters for Boat attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
