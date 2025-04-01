package com.example.animals;

// The Penguin class extends Animal and implements Walk and Swim interfaces
public class Penguin extends Animal implements Walk, Swim {

    // Instance variables
    boolean isSwimming;  // To track if the penguin is swimming
    int walkSpeed;       // Walking speed of the penguin
    int swimSpeed;       // Swimming speed of the penguin

    // Getter for isSwimming
    public boolean isSwimming() {
        return isSwimming;
    }

    // Setter for isSwimming
    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    // Getter for walkSpeed
    public int getWalkSpeed() {
        return walkSpeed;
    }

    // Setter for walkSpeed
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    // Getter for swimSpeed
    public int getSwimSpeed() {
        return swimSpeed;
    }

    // Setter for swimSpeed
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    // Constructor for Penguin, calls the constructor of Animal with "Penguin" as the name
    public Penguin() {
        super("Penguin");
    }

    // Method for eating food, implementation of the abstract method from Animal class
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    // Method for completing eating, implementation of the abstract method from Animal class
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    // Method for swimming, implementation of Swim interface
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    // Method for walking, implementation of Walk interface
    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    // Overriding toString method to print the Penguin's details
    @Override
    public String toString() {
        return "Penguin{" +
                "isSwimming=" + isSwimming +
                ", walkSpeed=" + walkSpeed +
                ", swimSpeed=" + swimSpeed +
                '}';
    }
}
