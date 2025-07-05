/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

/**
 *
 * @author Matrix Computer Accs
 */

public class Company {
    private boolean allVehiclesBusy = false;

    public boolean scheduleVehicle(Passenger passenger, Location pickup, Location destination) {
        return !allVehiclesBusy;
    }

    public void setAllVehiclesBusy(boolean busy) {
        this.allVehiclesBusy = busy;
    }
}

