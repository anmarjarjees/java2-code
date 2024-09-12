package basic_intro;
/*
Oracle Documents:
A class may be declared with the modifier public, in which case that class is visible to all classes everywhere.
If a class has no modifier (the default, also known as package-private), it is visible only within its own package

Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

Java Modifiers:
Link: https://www.w3schools.com/java/java_modifiers.asp
*/

/*
 * Working with a class named "Car"
 * An "object" is any "entity" that has:
 * - state 
 * - behavior
 * 
 * Example:
 * Car is an object. It has
 * States: sedan, 4-weal, white, etc...
 * Behaviors: driving, braking, turn left, turn right, ... 
 */
public class Person {
    // State of an object => in OOP are called fields which are just variable
    // declared within the class:
    /*
     * To recap:
     * Primitive" Data Types => start with small letter
     * "Reference" Data Types => start with Capital letter
     */
    int age; // Primitive Data Type
    Integer birthYear; // Reference Data Type

    double salary; // Primitive Data Type
    Double totalIncome; // Reference Data Type

    boolean isSingle; // Primitive Data Type
    Boolean isMarried; // Reference Data Type

    String name; // Reference Data Type (ONLY)

    // behaviour of an object => in OOP are called methods which are just functions
    // declared within the class:
    /*
     * Constructors: will be Discusses and explained in details
     * --------------------------------------------------------
     * Constructor Method:
     * - is used to create instances of the class
     * - The constructor is named after the class
     * - If no constructor is defined, a default empty constructor is used
     * - A class can contain multiple constructors as long as they have different
     * parameter values
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    /*
     * NOTE:
     * We can add the main() method which is the entry point to run our application
     * within the class "Person" and it's ok for learning and demonstration
     * but with large application,
     * we should separate the classes from the main method
     * easier for debugging, to enforce the idea of encapsulation (later..)
     * and we can reuse the class with other application if we want
     */

    // Adding the main method:
    public static void main(String[] args) {
        // creates a new Person object
        Person person1 = new Person("Martin", 47);
        person1.getInfo();
    }
}
