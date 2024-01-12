package week04.p02_encapsulation;

/*
 * Coupling is one the OOP terminologies:
 * The dependency of one class/object on the other class/object
 * So coupling refer to the connection that two classes have with each other
 * which means any simple change we add to the "User class"
 * This topic has more details if we talk about types of coupling:
 * - Loose Coupling: When two classes, modules, or components have low dependencies on each other, 
 * it is called loose coupling in Java
 * - Tight Coupling: When two classes are highly dependent on each other, it is called tight coupling
 * 
 * In Java environment, the less dependency we have between two classes is better for maintain, 
 * updating and debugging, so "loose coupling" which is "GOOD" is better than "tight coupling" which is "BAD".
 */
public class Main {
    public static void main(String[] args) {
        User user2 = new User("Martin", 5);
        user2.greetAll();
        // now we are targeting/accessing the other class "User" fields directly:
        // public fields!
        user2.name = "Sam";
        user2.subNum = 7;
        user2.greetAll();

        // now we CANNOT target/access the other class "Members" fields directly:
        // private fields
        Member member1 = new Member("Sam Simpson", "Golden Membership");

        // Our first member is week04.P02_encapsulation.Member@36baf30c !!!!
        System.out.println("Our first member is " + member1);

        Member member2 = new Member("Sally Solfege", "Bronze Membership");

        Member member3 = new Member("Alex Chow", "Silver Membership");

        Member member4 = new Member("Martin Smith", "Golden Membership");

        Member member5 = new Member("Kate Wilson", "Silver Membership");

        // Let's practice the class "Account":
        // ***********************************
        Account account1 = new Account();
        account1.setBalance(100);
        account1.deposit(300);
        // again
        account1.deposit(400);

        System.out.println("Main.main(): Your current Balance: " + account1.getBalance());
        account1.withdraw(-5);

        account1.withdraw(1000);

        account1.withdraw(699);

    } // end main()
}
