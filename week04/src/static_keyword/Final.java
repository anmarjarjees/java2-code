package static_keyword;

/*
 * "Coupling" is one the OOP terminologies:
 * The dependency of one class/object on the other class/object
 * 
 * So coupling refer to the connection that two classes have with each other
 *  
 * This topic has more details if we talk about types of coupling:
 * - Loose Coupling: 
 * When two classes, modules, or components have low dependencies on each other, 
 * it is called loose coupling in Java
 * - Tight Coupling: 
 * When two classes are highly dependent on each other, it is called tight coupling
 * 
 * In Java environment, the less dependency we have between two classes is better for maintain, 
 * updating and debugging, so "loose coupling" which is "GOOD" is better than "tight coupling" which is "BAD".
 */
public class Final {
    public static void main(String[] args) {

        /*
         * we can directly call/access the "static" method "hiAll()"
         * through the class name "User" without creating an object
         */
        User.hiAll();

        /*
         * We instantiating 3 instances (objects)
         * using an empty constructor
         */
        User user1 = new User("Martin", 5);
        User user2 = new User();
        User user3 = new User();

        // now we are targeting/accessing the other class "User" fields directly:
        // public fields!
        user1.name = "Sam";
        user1.age = 27;

        user1.greetAll();
        user2.greetAll();
        user3.greetAll();

        /*
         * The static method hiAll() from the type User should be accessed in a static
         * way
         */
        // user1.hiAll();

        System.out.println(User.getUserTotal());

        // The field User.totalUsers is not visible [private]
        // System.out.println(User.totalUsers);

        // Practice the class "Client" (self-study) :-)
        // ********************************************
        // now we CANNOT target/access the other class "Client" fields directly:
        // private fields
        Client client1 = new Client("Sam Simpson", "Golden Account Type");

        System.out.println("Our first client is " + client1);
        // The output before overriding the .toString() method:
        // Our first client is static_keyword.Client@87aac27

        Client client2 = new Client("Sally Solfege", "Bronze Account Type");

        Client client3 = new Client("Alex Chow", "Silver Account Type");

        Client client4 = new Client("Martin Smith", "Golden Account Type");

        Client client5 = new Client("Kate Wilson", "Silver Account Type");

    } // main()
} // class
