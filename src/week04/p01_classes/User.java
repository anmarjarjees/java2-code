/* 
 * In Windows/MAC
 * 
 * Java-Lectures\src\week04\p01_classes
 * Java-Lectures => the main project folder * 
 * src => the source code folder for our .java classes/files 
 * 
 * The full folder path
 * src => week04 => p01_classes
 * 
 * OOP: A PIE
 * 
 * Polymorphism:
 * - Overloading (Compile Time)=> inside one class 
 * - Overriding (Run Time)=> with inheritance  
 */
package week04.p01_classes;

public class User {
    // Fields (attributes):
    // variables inside a class:
    public String name;

    /*
     * OOP:
     * A default constructor that has no parameters
     */
    public User() {

    }

    /*
     * Constructor:
     * A special method that are being called and triggered automatically when
     * creating a new instance of a class
     * no return type
     */

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {

    }

    public User(int age) {

    }

    /*
     * public User(String address) {
     * 
     * }
     */

    // methods:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I will work with you on Java!");
    }

    public void greetAll(String text) {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I will work with you on Java!");
    }
} // end class file

/*
 * Illegal modifier for the class Member;
 * only public, abstract & final are permitted
 */
/*
 * private class Member {
 * 
 * }
 */
