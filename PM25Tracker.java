/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

public class PM25Tracker {
    public static void main(String[] args) {
        double[] pm25Levels = new double[30];
        for (int day = 0; day < 30; day++) {
            pm25Levels[day] = Math.random() * 100; // Random PM2.5 level
            System.out.println("Day " + (day + 1) + ": PM2.5 = " + pm25Levels[day]);
        }
        
        int day = 0;
        while (day < 30) {
            pm25Levels[day] = Math.random() * 100;
            System.out.println("Day " + (day + 1) + ": PM2.5 = " + pm25Levels[day]);
            day++;
        }
        
    }
}
