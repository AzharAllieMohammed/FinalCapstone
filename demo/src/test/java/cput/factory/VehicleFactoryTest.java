package cput.factory;
/*
VehicleFactoryTest.java
Author: Azhar Allie Mohammed (217250513)
Date: 04/04/2023
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class VehicleFactoryTest {
    @Test
    public void test(){
        Vehicle vehicle = VehicleFactory.createVehicle("Honda", "Honda Accord", "Honda Accord Touring", "2021", "Crystal Black Pearl");
        assertNotNull(vehicle);
        System.out.println(vehicle);
    }

}