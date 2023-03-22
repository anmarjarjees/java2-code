package week11.p07_polymorphism;

/*
 * Shape is the main superclass for the other subclasses:
 * - Square
 * - Triangle 
 * - Rectangle
 */
public class Shape {

    // public method
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }
}