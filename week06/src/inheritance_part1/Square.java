package inheritance_part1;
/*
 * Two keywords:
 * - extends => with inheritance OOP concept
 * - implements => to implement interfaces for later :-)
 * 
 * Hint:
 * Use the keyword "is a" for inheritance relationship
 * inheritance => "is a" relationship 
 * 
 * Review the code examples below:
 * 
 * public class Square extends Car (Doesn't make sense!)
 * Can we say "Square" is a "Car"?
 * No => No Inheritance Relationship
 * 
 * public class Square extends Shape (Makes sense)
 * Can we say "Square" is a "Shape" ?
 * Yes => Can have an Inheritance Relationship :-) 
 * so "Square" is a "Shape"
 * 
 * Also minor should inherit from the major:
 * public class Animal extends Cat (Doesn't make sense!)
 * Can we say "Animal" is a "Cat"? Cat is an animal
 * No => No Inheritance Relationship
 * 
 * public class Cat extends Animal (Makes sense)
 * Can we say "Cat" is a "Animal"? 
 * Yes => Can have an Inheritance Relationship :-)
 * 
 * To recap:
 * *********
 * Inheritance allows a class to inherit the members (properties & methods)
 * of another class. 
 */

/**
 * Square is a Shape
 */
public class Square extends Shape {

}