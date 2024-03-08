package polymorphism_review;

/*
 * "Shape" class is the main superclass for the other subclasses:
 * - Square
 * - Triangle 
 * - Rectangle
 */
public class Shape {
    // stick with the default constructor (has no parameters)

    // public method
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }
}
