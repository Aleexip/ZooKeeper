package com.example.app;

import com.example.animals.Penguin;
import com.example.animals.Tiger;
import com.example.animals.Dolphin;
import com.example.animals.Animal;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Scanner for getting user input
        Scanner keyboard = new Scanner(System.in);
        
        // Loop control flags for the main menu and animal-specific menu
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // Menu choice variable
        int menuChoice = 1;
        
        // Creating animal objects
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // Animal choice menu loop
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1: // Tiger
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1: // Set tiger properties
                                System.out.println("Enter the number of Stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter decibel of roar:");
                                tigerObject.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2: // Display tiger properties
                                System.out.println("The characteristics of the " + tigerObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Number of stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound level of roar: " + tigerObject.getSoundLevel());
                                break;
                            case 3: // Tiger movement
                                tigerObject.walking();
                                break;
                            case 4: // Tiger eating
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2: // Dolphin
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1: // Set dolphin properties
                                keyboard.nextLine(); // Clear the buffer to fix issues after reading integers
                                System.out.println("Enter the color of the dolphin:");
                                dolphinObject.setColor(keyboard.nextLine());
                                System.out.println("Enter the speed of the dolphin:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2: // Display dolphin properties
                                System.out.println("The characteristics of the " + dolphinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Color:" + dolphinObject.getColor());
                                System.out.println("Speed:" + dolphinObject.getSwimmingSpeed());
                                break;

                            case 3: // Dolphin movement
                                dolphinObject.swimming();
                                break;
                            case 4: // Dolphin eating
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3: // Penguin
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1: // Set penguin properties
                                System.out.println("Is the dolphin swimming (true/false):");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter the walk speed of the penguin:");
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter the swim speed of the penguin:");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2: // Display penguin properties
                                System.out.println("The characteristics of the " + penguinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Walking Speed:" + penguinObject.getWalkSpeed());
                                System.out.println("Swimming Speed:" + penguinObject.getSwimSpeed());
                                break;

                            case 3: // Penguin movement
                                if (penguinObject.isSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;

                            case 4: // Penguin eating
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 4: // Write animal objects to file
                    System.out.println("Write the objects to file");
                    writeObjectsToFile(tigerObject, penguinObject, dolphinObject);
                    break;

                case 5: // Read animal objects from file
                    System.out.println("File read successfully");
                    readObjectsFromFile();
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            // Ask if user wants to continue with the main menu
            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    // Animal choice menu for the user
    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Save animals to file");
        System.out.println("5. Display saved animals from file");
        System.out.println("Enter choice of animal (1-5):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    // Menu for manipulating animal details
    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    // Save animals' state to files
    private static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        try (ObjectOutputStream oosTiger = new ObjectOutputStream(new FileOutputStream("tiger.txt"));
             ObjectOutputStream oosPenguin = new ObjectOutputStream(new FileOutputStream("penguin.txt"));
             ObjectOutputStream oosDolphin = new ObjectOutputStream(new FileOutputStream("dolphin.txt"))) {
            
            oosTiger.writeObject(tiger);
            oosPenguin.writeObject(penguin);
            oosDolphin.writeObject(dolphin);
            System.out.println("Animal state saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving animal states: " + e.getMessage());
        }
    }
    
    // Read animal states from files
    private static void readObjectsFromFile() {
        try {
            // Check if files exist first
            File tigerFile = new File("tiger.txt");
            File penguinFile = new File("penguin.txt");
            File dolphinFile = new File("dolphin.txt");
    
            if (!tigerFile.exists() || !penguinFile.exists() || !dolphinFile.exists()) {
                System.out.println("No saved animal data found. Please save data first.");
                return;
            }
    
            try (ObjectInputStream oisTiger = new ObjectInputStream(new FileInputStream(tigerFile));
                 ObjectInputStream oisPenguin = new ObjectInputStream(new FileInputStream(penguinFile));
                 ObjectInputStream oisDolphin = new ObjectInputStream(new FileInputStream(dolphinFile))) {
                
                Tiger tiger = (Tiger) oisTiger.readObject();
                Penguin penguin = (Penguin) oisPenguin.readObject();
                Dolphin dolphin = (Dolphin) oisDolphin.readObject();
                
                System.out.println("Tiger data retrieved from file: " + tiger);
                System.out.println("Penguin data retrieved from file: " + penguin);
                System.out.println("Dolphin data retrieved from file: " + dolphin);
            }
        } catch (IOException e) {
            System.err.println("Error reading animal states: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found while reading animal states: " + e.getMessage());
        }
    }
}
