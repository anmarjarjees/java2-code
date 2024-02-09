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
         * so any field/method we need to use inside it has to be static also
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
        // System.out.println("Hello every one! My name again is " + name + " and I'm "
        // + age + " years old");
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
