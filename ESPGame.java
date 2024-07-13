package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;


public class ESPGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int correctGuesses = 0;
        
        // Color variables
        String color1 = null;
        String color2 = null;
        String color3 = null;
        String color4 = null;
        String color5 = null;
        String color6 = null;
        String color7 = null;
        String color8 = null;
        String color9 = null;
        String color10 = null;
        String color11 = null;
        String color12 = null;
        String color13 = null;
        String color14 = null;
        String color15 = null;
        String color16 = null;

        // Read and display colors from file
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.print("Enter the filename: ");
        String filename = input.nextLine();
        
        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            
            System.out.println("There are sixteen colors from a file:");
            int lineNumber = 1;
            while (fileReader.hasNextLine()) {
                String color = fileReader.nextLine();
                System.out.println(color);
                switch (lineNumber) {
                    case 1: color1 = color; break;
                    case 2: color2 = color; break;
                    case 3: color3 = color; break;
                    case 4: color4 = color; break;
                    case 5: color5 = color; break;
                    case 6: color6 = color; break;
                    case 7: color7 = color; break;
                    case 8: color8 = color; break;
                    case 9: color9 = color; break;
                    case 10: color10 = color; break;
                    case 11: color11 = color; break;
                    case 12: color12 = color; break;
                    case 13: color13 = color; break;
                    case 14: color14 = color; break;
                    case 15: color15 = color; break;
                    case 16: color16 = color; break;
                }
                lineNumber++;
            }
            
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        
        // Game rounds
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nRound " + i);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it one of list of colors above?  ");
            System.out.print("Enter your guess: ");
            String userGuess = input.nextLine().trim();
            
            int randomColorIndex = rand.nextInt(16) + 1;
            String selectedColor = null;
            
            switch(randomColorIndex) {
                case 1: selectedColor = color1; break;
                case 2: selectedColor = color2; break;
                case 3: selectedColor = color3; break;
                case 4: selectedColor = color4; break;
                case 5: selectedColor = color5; break;
                case 6: selectedColor = color6; break;
                case 7: selectedColor = color7; break;
                case 8: selectedColor = color8; break;
                case 9: selectedColor = color9; break;
                case 10: selectedColor = color10; break;
                case 11: selectedColor = color11; break;
                case 12: selectedColor = color12; break;
                case 13: selectedColor = color13; break;
                case 14: selectedColor = color14; break;
                case 15: selectedColor = color15; break;
                case 16: selectedColor = color16; break;
            }
            
            System.out.println("I was thinking of " + selectedColor + ".");
            
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }
        }
        
        System.out.println("Game Over\n");
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
        
        // Get user info and display it
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Describe yourself: ");
        String description = input.nextLine();
        System.out.print("Due Date: ");
        String dueDate = input.nextLine();
        
        System.out.println("User Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);
        
        input.close();
    }
}
