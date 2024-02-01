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
     * User.hiAll()
     */
    // Fields (attributes):
    // variables inside a class:
    // Yes, not good idea to identify class fields to be public!
    // It should be private following the encapsulation concept
    public String name; // null by default
    public int age; // 0 by default

    // Practicing the keyword "static"
    // this will make appName belongs to the "User" class itself
    // and also make userId belongs to the "User" class itself
    private static String appName; // application name
    private static int userId; // User ID

    /*
     * It's a private field => we cannot use User.totalUser to access it outside?
     * it has the keyword "static"!!!
     * 
     * Usually we use "public" with any class member,
     * so we can access this class member publicly
     * by using ClassName.property or ClassName.method()
     * 
     * In such case, we have to add the keyword "static"
     * because we are calling this class field "variable"
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

    // Access Modifier - "static" - Return Data Type - Method Name
    // "static" - Access Modifier - Return Data Type - Method Name
    public static void hiAll() {
        System.out.println("Hello every one! Do you like Java?");
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

} // class
