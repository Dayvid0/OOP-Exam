/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit.test;

import balextranit.Company;
import balextranit.Location;
import balextranit.Passenger;
import org.junit.Test;
import static org.junit.Assert.*;


public class CompanyTest {

    @Test
    public void testScheduleVehicleSuccess() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);

        boolean result = company.scheduleVehicle(passenger, pickup, destination);
        assertTrue("Should schedule vehicle when available", result);
    }

    @Test
    public void testScheduleVehicleFailure() {
        Company company = new Company();
        company.setAllVehiclesBusy(true);
        Passenger passenger = new Passenger();
        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);

        boolean result = company.scheduleVehicle(passenger, pickup, destination);
        assertFalse("Should not schedule when no vehicles are available", result);
    }
}
