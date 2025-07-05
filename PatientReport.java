/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

public class PatientReport {
    void generateReport(String patientId) {
        System.out.println("Basic report for " + patientId);
    }

    void generateReport(String patientId, boolean detailed) {
        if (detailed) System.out.println("Detailed report for " + patientId);
        else System.out.println("Basic report for " + patientId);
    }
    public static void main(String[] args) {
    Company company = new Company();
    PassengerSource source = new PassengerSource(company);
    boolean scheduled = source.requestPickup();
    System.out.println("Pickup scheduled: " + scheduled);
}
}