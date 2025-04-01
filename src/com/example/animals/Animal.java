package com.example.animals; // Package declaration for organizing related classes.

import java.io.Serializable; // Importing Serializable interface to allow the object to be saved and restored.

abstract public class Animal implements Eat, Serializable { 
    private static final long serialVersionUID = 1L; // Ensures compatibility when serializing/deserializing.

    // Instance variables representing animal properties.
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    // Default constructor that sets default values for the animal.
    public Animal() {
        nameOfAnimal = "Unknown Animal";
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    // Constructor to set a custom name for the animal while keeping default values for other attributes.
    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    // Getter and setter methods for accessing and modifying animal properties.
    public String getNameOfAnimal() { return nameOfAnimal; }
    public void setNameOfAnimal(String nameOfAnimal) { this.nameOfAnimal = nameOfAnimal; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Method to simulate the animal eating, as per the 'Eat' interface.
    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }
}
