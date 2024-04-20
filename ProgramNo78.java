// 78. WAP TO STORE RCB PLAYERS NAME IN AN ARRAY AND DISPLAY IT.

import java.util.Scanner;

public class ProgramNo78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare an array to store RCB players' names
        String[] rcbPlayers = new String[5]; // Assuming 11 players in the squad

        // Create a Scanner object to read input

        // Input RCB players' names
        System.out.println("Enter RCB players' names:");
        for (int i = 0; i < rcbPlayers.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            rcbPlayers[i] = scanner.nextLine();
        }

        // Display RCB players' names
        System.out.println("\nRCB Players:");
        for (int i = 0; i < rcbPlayers.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + rcbPlayers[i]);
        }
        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}