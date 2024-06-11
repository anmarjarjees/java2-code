package protected_demo;

import inheritance_part1.Vehicle;

/* 
 * Link: https://docs.oracle.com/javase%2Ftutorial%2F/java/javaOO/accesscontrol.html
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Just simple quick object with default values from VS Code:
        Vehicle vehicle1 = new Vehicle(null, 0, false, 0, null);

        /*
         * "printVehicleInfo()"" method is defined as "public"
         */
        vehicle1.printVehicleInfo();
        /*
         * "printStatus()" method is defined as "protected"
         * Error: The method printStatus() from the type Vehicle is not visible
         * Reason: Because it's protected
         */
        // vehicle1.printStatus();
    }
}
