package week11.p07_polymorphism;

public class Square extends Shape {
    // two values for length and height (no difference)
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double calcPerimeter() {
        return this.length * 4;
    }

    // Override the toString() method from the mother object/class "Object"
    public String toString() {
        return "Square";
    }
}
