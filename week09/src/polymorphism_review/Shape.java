package polymorphism_review;

/*
 * "Shape" class is the main "Superclass" for the other "Subclasses":
 * - Square
 * - Triangle 
 * - Rectangle
 */
public class Shape {
    // using the default constructor (has no parameters)

    // public method "calcPerimeter"
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }
}
