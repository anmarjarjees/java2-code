package abstraction;

/* 
 * The keyword "abstract" in Java:
 * Abstract "Classes" (Also used with class Properties, and Methods)
 * An abstract class is a class that is declared "abstract":
 * > Abstract classes cannot be instantiated
 * > may or may not include abstract methods
 * > they can ONLY be subclassed (inherited/extended). 
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 */
public abstract class Shape {
    /*
     * so any "abstract" class can have 0 or x numbers of abstract methods:
     */

    /*
     * abstract method(s) has/have no body ( no { and } )
     * but it has to be implemented by the subclasses
     * 
     * In other words, the body of this method that has the entire code,
     * will be written in the subclass(es)
     * 
     * We CANNOT create an abstract method inside a norma class!
     * 
     * ERROR:
     * The abstract method calcOdometer in type Vehicle
     * can only be defined by an abstract class
     */

    public abstract double calcArea();

    public abstract double calcPerimeter();

    public void viewShapeInfo() {
        System.out.println("Shape!");
    }
}
