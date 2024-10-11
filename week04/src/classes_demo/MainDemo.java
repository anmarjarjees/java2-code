package classes_demo;

/*
 * We need to import them to be used
 */
import bank_accounts.Account;

// Ignore the "Total" import statement:
// import overload_review.Total;
/* 
 * Importing all the class files using *
 * inside the package "static_keyword"
 */
import static_keyword.*;

public class MainDemo {
    public static void main(String[] args) {
        /*
         * Create an object from a class named "Account"
         */
        Account account1 = new Account();

        /*
         * Create an object from a class named "User"
         */
        User user1 = new User();

        /*
         * There is no import statement for class "Total"
         * so we have to specify the full path: overload_review.Total
         */
        System.out.println(overload_review.Total.add(20, 30));
    }
}
