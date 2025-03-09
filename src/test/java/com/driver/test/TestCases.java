package com.driver.test;

import com.driver.Boat;
import com.driver.Car;
import com.driver.F1;
import com.driver.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    // Test case for Vehicle class
    @Test
    public void testVehicle() {
        Vehicle vehicle = new Vehicle("Car");
        assertEquals("Car", vehicle.getName());
    }

    // Test case for Car class
    @Test
    public void testCar() {
        Car car = new Car("Honda", 4, 4, 5, true, "Sedan", 5);
        assertEquals(4, car.getWheels());
        assertEquals("Honda", car.getName());
    }

    // Test case for F1 class
    @Test
    public void testF1() {
        F1 f1 = new F1("Mercedes", false);
        assertEquals("Mercedes", f1.getName());
        f1.accelerate(20); // Check if accelerate method works
    }

    // Test case for Boat class
    @Test
    public void testBoat() {
        Boat boat = new Boat("Yacht", 10);
        assertEquals("Yacht", boat.getVehicleName());
        assertEquals(10, boat.getVehicleCapacity());
    }
}

