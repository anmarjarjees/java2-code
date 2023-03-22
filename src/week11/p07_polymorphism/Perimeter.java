package week11.p07_polymorphism;

public class Perimeter {

    // Polymorphism: Overloading

    // for the square shapes:
    public double getPerimeter(double value) {
        return value * 4;
    }

    // for the rectangle shapes:
    public double getPerimeter(double value1, double value2) {
        return 2 * (value1 + value2);
    }

    // for the triangle shapes:
    public double getPerimeter(double value1, double value2, double value3) {
        return value1 + value2 + value3;
    }
}