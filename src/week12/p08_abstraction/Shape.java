package week12.p08_abstraction;

/* 
 * Java: 
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 * 
 */
public abstract class Shape {
    // public method
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }

    /*
     * abstract method(s) has/have no body
     * but it has to be implemented by the subclasses
     */
    abstract double calcArea();
}
