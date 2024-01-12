package week12.p08_abstraction;

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

    public double calcPerimeter() {
        return 2 * (value1 + value2);
    }

    @Override
    double calcArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcArea'");
    }
}
