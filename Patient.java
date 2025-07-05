/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matrix Computer Accs
 */

public class Patient {
    String id;
    String allergyNotes;

    Patient(String id, String allergyNotes) {
        this.id = id; // Resolves conflict with parameter
        this.allergyNotes = allergyNotes;
    }
    public static void main(String[] args) {
    Patient patient = new Patient("P123", "Penicillin");
    System.out.println("ID: " + patient.id + ", Allergies: " + patient.allergyNotes);
}
}
