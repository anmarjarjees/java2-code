package inheritance_demo1;
/*
 * Two keywords:
 * - extends => with inheritance OOP concept
 * - implements => to implement interfaces for later :-)
 * 
 * Hint:
 * Use the keyword "is a" for inheritance relationship
 * inheritance => "is a" relationship 
 * 
 * Review the code examples below:
 * 
 * public class Square extends Car (Doesn't make sense!)
 * Can we say "Square" is a "Car"?
 * No => No Inheritance Relationship
 * 
 * public class Square extends Shape (Makes sense)
 * Can we say "Square" is a "Shape" ?
 * Yes => Can have an Inheritance Relationship :-) 
 * so "Square" is a "Shape"
 * 
 * Also minor should inherit from the major:
 * public class Animal extends Cat (Doesn't make sense!)
 * Can we say "Animal" is a "Cat"? Cat is an animal
 * No => No Inheritance Relationship
 * 
 * public class Cat extends Animal (Makes sense)
 * Can we say "Cat" is a "Animal"? 
 * Yes => Can have an Inheritance Relationship :-)
 * 
 * To recap:
 * *********
 * Inheritance allows a class to inherit the members (properties & methods)
 * of another class. 
 */

/**
 * Square is a Shape? Yes
 */
public class Square extends Shape {
    // one value for any side (no difference)
    private double length;

    // adding a custom constructor (with parameters):
    public Square(double length) {
        this.length = length;
    }

    /*
     * polymorphism Example => method overriding
     */
    /*
     * To review:
     * Override the toString() method from the mother object/class "Object"
     * 
     * Remember that every class we create in Java,
     * will implicitly extend the main Java class "Object"
     * the "Object" class has a method named "toString()"
     */
    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public double calcPerimeter() {
        return this.length * 4;
    }
}