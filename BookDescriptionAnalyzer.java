/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balextranit;

import java.util.Scanner;

public class BookDescriptionAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for book description
        System.out.println("Enter book description:");
        String description = scanner.nextLine();
        
        // Count occurrences of "Uganda" (case-insensitive)
        int count = countUgandaOccurrences(description);
        
        // Display result
        System.out.println("The word 'Uganda' appears " + count + " times.");
        
        scanner.close();
    }

    public static int countUgandaOccurrences(String description) {
        if (description == null) return 0;
        
        // Convert to lowercase for case-insensitive counting
        String lowerDescription = description.toLowerCase();
        String target = "uganda";
        int count = 0;
        int index = 0;
        
        // Find all occurrences
        while ((index = lowerDescription.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        
        return count;
    }
}
