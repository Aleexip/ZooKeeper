package com.example.animals;

// The Tiger class extends Animal and implements Walk interface
public class Tiger extends Animal implements Walk {

    // Property for stripes on tiger
    int numberOfStripes;

    // Property for speed of tiger during walking or running
    int speed;

    // Property for sound level when tiger roars
    int soundLevel;

    // Constructor for Tiger, calls the constructor of Animal with "Tiger" as the name
    public Tiger() {
        super("Tiger");
    }

    // Getter for the number of stripes
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    // Setter for the number of stripes
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for sound level
    public int getSoundLevel() {
        return soundLevel;
    }

    // Setter for sound level
    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    // Method for when the tiger has finished eating
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    // Method for walking, implementation of the Walk interface
    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + speed);
    }

    // Overriding toString method to print the Tiger's details
    @Override
    public String toString() {
        return "Tiger{" +
                "numberOfStripes=" + numberOfStripes +
                ", speed=" + speed +
                ", soundLevel=" + soundLevel +
                '}';
    }
}
