package com.example.animals;

public class Dolphin extends Animal implements Swim { 

    String color; // Dolphin's color
    int swimmingSpeed; // Dolphin's swimming speed

    public Dolphin() {
        super("Dolphin"); // Initialize the Dolphin with the name "Dolphin"
    }

    // Getters and setters for the color and swimming speed
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Override the eatingFood method for Dolphin's specific behavior
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    // Indicate that Dolphin has finished eating
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    // Implement swimming behavior for Dolphin
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }

    // Override toString method to return a customized string for the Dolphin object
    @Override
    public String toString() {
        return "Dolphin{" +
                "color='" + color + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
}
