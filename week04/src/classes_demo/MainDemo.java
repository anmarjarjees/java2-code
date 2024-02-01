package classes_demo;

/*
 * We need to import them to be used
 */
import bank_accounts.Account;

/* 
 * Importing all the class files 
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
         * there is no import so we have to specify
         */
        week04.p01_classes.Car myCar = new week04.p01_classes.Car("Dodge", 2010, "SUV", "CXT");
    }
}
