package polymorphism_review;
/* 
 * Polymorphism:
 * - Overloading (semester#1)
 * - Overriding (semester#2 => Inheritance)
 */

// Polymorphism: Overloading

public class Perimeter {

    // for the square shapes:
    public double getPerimeter(double value) {
        return value * 4;
    }

    public double getPerimeter(int value) {
        return value * 4;
    }

    // for any rectangle:
    public double getPerimeter(double value1, double value2) {
        return 2 * (value1 + value2);
    }

    // for any triangle:
    public double getPerimeter(double value1, double value2, double value3) {
        return value1 + value2 + value3;
    }

    // for any Quadrilateral:
    public double getPerimeter() {

    }
}
