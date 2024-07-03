package inheritance_demo1;
/*
 * Important Note to review again:
 * *********************************
 * 
 * When you first make the class "Truck" extends "Vehicle",
 * Java compiler will show this complex error message:
 * "Implicit super constructor Vehicle() 
 * is undefined for default constructor. 
 * Must define an explicit constructor"
 */

/* 
 * Solution:
 * *********
 * To Fix this error, we can use any of these two solutions:
 * 1. The subclass must implement the same custom constructor from the super (parent) class, 
 * so we can implement the custom class as we did with class "Car"
 * 
 * 2. You can redefine a default constructor (that has no parameters) explicitly in the superclass, 
 * we we can explicitly declare a default constructor (no parameter) in the parent class 
 */

// Task: it's up to you which solution you will choose :-)
// Task: Fix the code below as we did with class Car or just by adding a default constructor in super class
public class Truck extends Vehicle {
    private int loadCapacity; // Load capacity in kilograms
    private String truckType; // Type of truck: Pickup, Lorry

    // we don't have to call the constructor from the superclass with super
    // because the superclass has the implementation of the default constructor

    // Method specific to Truck to load cargo
    public void loadCargo() {
        System.out.println("Loading cargo");
    }

}
