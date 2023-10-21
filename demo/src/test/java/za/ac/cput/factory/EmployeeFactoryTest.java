package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Pizzeria;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.PizzeriaFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
 * EmployeeFactoryTest.java
 * Author: Dawood Kamalie  (220147760)
 * Date: 8/4/2023
 * */

class EmployeeFactoryTest {

    private static Pizzeria pizzeria = PizzeriaFactory.buildPizzaria("Hill Crest","Hotel Transalvania");
    @Test
    void createEmployee() {
        Employee employee = EmployeeFactory.buildEmployee( "Dawood", "Kamalie", "068-553-1111", "kamalie@gmail.com", pizzeria);
        System.out.println(employee);
        assertNotNull(employee);
    }
}