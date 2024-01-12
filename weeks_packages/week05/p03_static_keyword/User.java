package week05.p03_static_keyword;

public class User {
    // Fields (attributes):
    // variables inside a class:
    private String name; // null by default
    private int age; // 0 by default
    // Practicing the keyword "static"
    // this will make appName belongs to the "User" class itself
    // and also make userId belongs to the "User" class itself
    private static String appName; // application name
    private static int userId; // User ID
    private static int totalUsers; // Total number of users

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor:
    // has two parameters => String name, int age
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        // A counter to count the number users:
        totalUsers++;
    }

    // Methods: are just functions inside a class:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I'm " + age + " years old");
    }

    // Access Modifier - "static" - Return Data Type - Method Name
    // "static" - Access Modifier - Return Data Type - Method Name
    public static void hiAll() {
        System.out.println("Hello every one! Do you like Java?");
        /*
         * This method "hiAll()" is a static method
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

    public int test() {
        return 2 * 2; // like in PHP => return a value and terminate the method:
        // Error: Unreachable code
        // System.out.println("Hello every one!");
    }

    public static int getUserTotal() {
        return totalUsers;
    }

}
