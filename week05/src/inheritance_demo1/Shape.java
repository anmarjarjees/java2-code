package inheritance_demo1;

/*
 * OOP => A PIE
 * Create a superclass named "Shape"
 * then make other subclass that extend the class "Shape":
 * "Shape" class is the main "Superclass" for the other "Subclasses":
* - Square
* - Triangle
* - Rectangle
We can say:
 * - "Square" is a Shape
 * - "Triangle" is a Shape
 * - "Rectangle" is a Shape
 * - "Airplane" is a Shape (Bad => Doesn't make sense)
 * - 'is a' OR 'is a type of'
 * 
 * so we can have Square, Circle, Triangle as sub-classes
 */

/* 
* Java Definitions: 
* A class that is derived from another class is called a "subclass" 
* (also a derived class, extended class, or child class). 
* 
* The class from which the subclass is derived is called a "superclass" 
* (also a base class or a parent class). 

* In Java:
* - Shape => Superclass
* - Square => subclass
* 
- Java: Superclass and Subclass 
- PHP: Parent class and Child Class
- C#: Base Class and Derived Class

in C++, class can inherit from multiple classes
In Java, C# => only one

* Different kinds of objects often have a certain amount in common with each other.
* link: https://www.w3schools.com/java/java_inheritance.asp
*/
public class Shape {
    // using the default constructor (has no parameters)

    /*
     * The "perimeter" of a shape:
     * a closed path that encompasses, surrounds, or outlines
     * either a two dimensional shape or a one-dimensional length.
     * 
     * The perimeter of a circle or an ellipse is called its circumference
     * 
     * Link: https://en.wikipedia.org/wiki/Perimeter
     */

    // public normal method "calcPerimeter":
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }

    // We can another public method for the area of any shape
    // Task: Practice it by yourselves after the lecture ?
    public double calcArea() {
        return 0;
    }
}