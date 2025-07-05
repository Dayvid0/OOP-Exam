/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

import java.util.Arrays;

public class AirQualityMonitor {
    public static void main(String[] args) {
        // Generate 30 random AQI readings (1 to 300)
        int[] aqiReadings = new int[30];
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = (int) (Math.random() * 300 + 1);
        }

        // Compute median AQI
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length / 2 - 1] + aqiReadings[aqiReadings.length / 2]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }

        // Count hazardous days (AQI > 200)
        int hazardousDays = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDays++;
            }
        }

        // Display results
        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));
        System.out.println("Median AQI: " + median);
        System.out.println("Hazardous Days (AQI > 200): " + hazardousDays);
    }
}
