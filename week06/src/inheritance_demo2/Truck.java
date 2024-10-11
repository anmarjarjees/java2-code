package inheritance_demo2;

/*
 * Important Note to review again:
 * *********************************
 * 
 * When you first make the class "Truck" extend "Vehicle",
 * the Java compiler will show this complex error message:
 * "Implicit super constructor Vehicle() 
 * is undefined for default constructor. 
 * Must define an explicit constructor"
 */

/* 
 * Solution:
 * *********
 * To fix this error, we can use either of these two solutions:
 * 1. The subclass must implement the same custom constructor from the super (parent) class, 
 * so we can implement the custom constructor as we did with class "Car"
 * 
 * 2. You can redefine a default constructor (that has no parameters) explicitly in the superclass, 
 * so we can explicitly declare a default constructor (no parameter) in the parent class 
 */

// Task: it's up to you which solution you will choose :-)
// Task: Fix the code below as we did with class Car or just by adding a default constructor in the superclass
public class Truck extends Vehicle {
    private int loadCapacity; // Load capacity in kilograms
    private String truckType; // Type of truck: Pickup, Lorry

    // We don't have to call the constructor from the superclass with super
    // because the superclass has the implementation of the default constructor

    // Method specific to Truck to load cargo
    public void loadCargo() {
        System.out.println("Loading cargo");
    }
} // class file
