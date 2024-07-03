package abstraction;

/* 
 * Java:
 * Abstract Methods and Classes
 * An abstract class is a class that is declared "abstract":
 * > Abstract classes cannot be instantiated
 * > may or may not include abstract methods. 
 * > they can ONLY be subclassed (inherited/extended). 
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 */
public abstract class Shape {

    // can have normal method(s):
    public double calcPerimeter() {
        // lets just return 0 for the main one,
        // and it will be changed later by derived (sub) classes
        return 0;
    }

    /*
     * any "abstract" class can have 0 or x numbers of abstract methods:
     */

    /*
     * abstract method(s) has/have no body ( no { and } )
     * but it has to be implemented by the subclasses
     * 
     * In other words, the body of this method that has the entire code,
     * will be written in the subclass(es)
     */

    abstract double calcArea();
}
