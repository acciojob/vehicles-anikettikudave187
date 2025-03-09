package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create and test a Vehicle object
        Vehicle vehicle = new Vehicle("Toyota");
        vehicle.steer(30);
        vehicle.move(50, 90);
        vehicle.stop();

        // Create and test a Car object
        Car car = new Car("Honda", 4, 4, 5, true, "Sedan", 5);
        car.changeGear(2);
        car.changeSpeed(60, 90);

        // Create and test an F1 object
        F1 f1Car = new F1("Mercedes", false);
        f1Car.accelerate(20);
        f1Car.accelerate(60);
        f1Car.accelerate(150);

        // Create and test a Boat object
        Boat boat = new Boat("Yacht", 10);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }

}
