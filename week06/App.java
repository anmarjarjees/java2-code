package protected_demo;

import inheritance_demo1.Car;
import inheritance_demo1.Vehicle;

/* 
 * Link: https://docs.oracle.com/javase%2Ftutorial%2F/java/javaOO/accesscontrol.html
 */
public class App {
    public static void main(String[] args) throws Exception {

        Car myFriendCar = new Car("Nissan", 2020, true, 2021, "Petrol", 4, "SUV", "AWD");
        /*
         * IMPORTANT NOTE:
         * ***************
         * Even though Car extends Vehicle, and brand is a protected field,
         * you cannot access brand directly using an object reference (myCar.brand)
         * from outside the Car class if you're not in the same package as the
         * superclass (Vehicle)
         * 
         * So the "protected" modifier only allows access through "inheritance"
         * You can access the protected property "brand" within the Car class itself,
         * but not from outside the class via an object reference in the protected_demo
         * package.
         */

        // Error: The field Vehicle.brand is not visible
        // myFriendCar.brand = "Dodge";

        // Error: any cannot be resolved or is not a field
        // myFriendCar.any = "nothing";

        // Just simple quick object with default values from VS Code:
        Vehicle vehicle1 = new Vehicle(null, 0, 0, null, false);

        /*
         * "printVehicleInfo()" method is defined as "public"
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
