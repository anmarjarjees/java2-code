package week10.p06_inheritance2;

/* 
Important Note to review again:
------------------------------
when you first make the Truck extends Vehicle,
Java compiler will show this complex error message:
"Implicit super constructor Vehicle() is undefined for default constructor. Must define an explicit constructor"

Solutions:
* 1. The subclass must implement the same custom constructor from the super (parent) class,
    OR:
* 2. you can redefine a default constructor (that has no parameters) explicitly in the superclass
 */
public class Truck extends Vehicle {
    // we used solution#1:
    public Truck(String brand, String type, String wheels, int year) {
        super(brand, type, wheels, year);
    }

    // the rest of your code...
}
