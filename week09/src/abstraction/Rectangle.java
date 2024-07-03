package abstraction;

/*
Rectangle is a shape => inheritance

Two Important Points:
- The subclass must implement all the abstract methods form the superclass
- abstract methods can ONLY be declared inside "abstract" classes
Error: 
The type Rectangle must implement the inherited abstract method Shape.calcArea()
 */
public class Rectangle extends Shape {

    private double value1;
    private double value2;
    // Perimeter = 2 × (a + b)

    public Rectangle(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
        // In PHP: $this->value2 = $value2;
        // In Py: self.value2 = value2;
    }

    // 2 public methods:
    @Override
    double calcArea() {
        return value1 * value2;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (value1 + value2);

    }

}
