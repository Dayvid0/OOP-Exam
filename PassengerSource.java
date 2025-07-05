/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

import java.util.Random;
import java.util.Objects;

public class PassengerSource {
    private static final Random RNG = new Random();
    private final Company company;

    public PassengerSource(Company company) {
        this.company = Objects.requireNonNull(company);
    }

    public boolean requestPickup() {
        Passenger passenger = new Passenger();
        Location pickup = randomLocation();
        Location destination = randomLocation();
        return company.scheduleVehicle(passenger, pickup, destination);
    }

    private Location randomLocation() {
        int x = RNG.nextInt(101);
        int y = RNG.nextInt(101);
        return new Location(x, y);
    }
}
