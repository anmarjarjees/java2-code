package week11.p07_polymorphism;

/* 
 * OOP => Polymorphism:
 * - Overriding
 * - Overloading 
 */
public class Rectangle extends Shape {
    // two values for length and height
    // value1 and value2 interchangeably (no difference)
    private double value1;
    private double value2;
    // Perimeter = 2 × (a + b)

    public Rectangle(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
        // In PHP: $this->value2 = $value2;
        // In Py: self.value2 = value2;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    // Overriding => override the method calcPerimeter()
    public double calcPerimeter() {
        return 2 * (this.value1 + this.value2);
    }

    // Override the toString() method:
    public String toString() {
        return "Rectangle";
    }

}
