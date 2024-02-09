package inheritance_part2;
/*
 * Important Note to review again:
 * *********************************
 * 
 * When you first make the "Truck" extends "Vehicle",
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
// Task: Fix the code below as we did with class Car
public class Truck extends Vehicle {

    // we can use solution#1 by creating a custom constructor of "Truck":

    // the rest of your code...

}
