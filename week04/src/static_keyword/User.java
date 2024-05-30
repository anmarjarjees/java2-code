package static_keyword;

/*
 * Using this class as blueprint for other objects
 * or as a utility class
 * 
 * we don't want to add the main() method
 */
public class User {
    /*
     * NOTE:
     * Attaching the keyword "static" to any class member (property/method)
     * makes this member belongs to the class not to the object:
     * we can access this static member using the class name (not the object):
     * Template => ClassName.StaticFiled or ClassName.StaticMethod()
     * 
     * Example:
     * User.hiAll()
     */
    // Fields (attributes):
    // variables inside a class:
    // Yes, not good idea to identify class fields to be public!
    // It should be private following the encapsulation concept
    public String name; // null by default
    public int age; // 0 by default

    // Practicing the keyword "static"
    // this will make "appName" belongs to the "User" class itself
    // and also make "userId" belongs to the "User" class itself
    public static String appName; // application name
    public static int userId; // User ID

    /*
     * Although this field "totalUsers" is declared as "static"
     * but we cannot use User.totalUser to access it outside the class
     * Because it's a private field
     * 
     * Usually we use "public" with any "static" class member,
     * so we can access this class member publicly
     * by using ClassName.property or ClassName.method()
     * 
     * But in this class, we had to add the keyword "static"
     * because we are calling this class field/variable "totalUsers"
     * inside a static method "getUserTotal()"
     */
    private static int totalUsers; // Total number of users

    // Constructor: Adding our custom constructor
    // has two parameters => String name, int age
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        // A counter to count the number users:
        totalUsers++;
        // test:
        System.out.println("total: " + totalUsers);
    } // Constructor

    /*
     * Since we added our custom constructor with parameters
     * we need to "explicitly" (by ourselves as programmers)
     * create this constructor (without parameters)
     */
    public User() {
        totalUsers++;
    }

    // Methods: are just "functions" inside a class:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I'm " + age + " years old");
    }

    // Method Syntax => Access Modifier - "static" - Return Data Type - Method Name
    // Or: =>"static" - Access Modifier - Return Data Type - Method Name
    public static void hiAll() {
        System.out.println("Hello every one! Do you like Java?");
        /*
         * IMPORTANT NOTES:
         * ----------------
         * This method "hiAll()" is a "static" method
         * so any field/method we need to use/invoke inside it has to be "static" also
         * 
         * When accessing these class fields: name and age here,
         * we will see the following errors because neither one of them is static!
         * 
         * Errors:
         * - Cannot make a static reference to the non-static field name
         * - Cannot make a static reference to the non-static field age
         * 
         * Finally, we CANNOT use the keyword "this" inside a static method
         */
        // System.out.println("Hello! My name is " + name + ". I'm " + age + " years
        // old");
    }

    /*
     * logically belong to all objects:
     */
    public static int getUserTotal() {
        /*
         * Cannot make a static reference to the non-static field totalUsers
         * 
         * totalUsers has also to be "static"
         */
        return totalUsers;
    }

    /*
     * Consider the example below as short and quick hint for your first task:
     */

    // create any simple "static" method:
    /*
     * Notice that inside the body of this static method,
     * we are calling/invoking 2 other static methods
     * according to the user's choice
     */
    public static double doCalculation(double anyNumber, int choice) {
        if (choice == 1) {
            // call our method squareNumber: example => 5 * 5
            /*
             * Cannot make a "static reference"
             * to the "non-static method" squareNumber(double)
             * from the type User
             */
            return squareNumber(anyNumber);
        } else {
            // call our method divideNumber: example => 5 /2
            return divideNumberBy2(anyNumber);
        }
    }

    /*
     * For a quick demo,
     * creating two simple static methods.
     * Both are private => it can only be used within this class body:
     * - squareNumber()
     * - divideNumberBy2()
     */
    private static double squareNumber(double number) {
        return (number * number);
    }

    private static double divideNumberBy2(double number) {
        return (number / 2);
    }

    /*
     * // Error: Type mismatch: cannot convert from double to int
     * 
     * private int getResult() {
     * return 0.0;
     * }
     */

    /*
     * Final Example:
     * Creating another "static" method for printing
     * > userID of the user
     * > application name that the user is using
     */
    public static void printUserInfo() {
        System.out.println("User ID: " + userId + "Application Name: " + appName);
    }

} // class
