package polymorphism_review;

/* 
 * polymorphism => method overriding 
 */
public class Square extends Shape {
    // one value for any side (no difference)
    private double length;

    // adding a custom constructor:
    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calcPerimeter() {
        return this.length * 4;
    }

    // Override the toString() method from the mother object/class "Object"
    @Override
    public String toString() {
        return "Square";
    }
}
