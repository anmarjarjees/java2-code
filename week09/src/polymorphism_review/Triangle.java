package polymorphism_review;

/* 
 * polymorphism => method overriding 
 */
public class Triangle {
    // three values for side1, side2, and base (no difference)
    private double value1;
    private double value2;
    private double value3;

    public Triangle(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public double calcPerimeter() {
        return this.value1 + this.value2 + this.value3;
    }

}
