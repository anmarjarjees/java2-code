package week04.p01_classes;

/* 
 * camelCase 
 * PascalCase
 * snake_case
 * 
 */
public class Person {
    // State of an object => in OOP are called fields which are just variable
    // declared within the class:
    int age;
    String name;

    // behaviour of an object => in OOP are called methods which are just functions
    // declared within the class:
    /*
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
