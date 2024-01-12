package week04.p03_demo;

import week04.p01_classes.User;

/* 
 * Importing all the class files inside the package "week04.p01_classes"
 */
import week04.p01_classes.*;

public class MainDemo {
    public static void main(String[] args) {
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
