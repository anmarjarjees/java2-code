package inheritance_demo2;

public class Main {
    public static void main(String[] args) {
        /*
         * Constructing 3 objects (instances) and passing initial values to each one:
         * - myCar => "Toyota", 2014, false, 2021, "Petrol", 4, "SUV", "AWD"
         * - myMotorcycle => "Harley-Davidson", 2021, false, 2022, "Petrol", false
         * We must have these constructors available
         * - myTruck => do it :-)
         */

        // Creating an instance of Car:
        Car myCar = new Car("Toyota", 2014, true, 2018, "Petrol", 4, "SUV", "AWD");

        // Creating an instance of Truck:
        // Task: Complete the code in "Truck" class to activate the code line below:
        /*
         * Truck myTruck = new Truck("Ford", 2018, true, 2019, "Diesel", 2000,
         * "Pickup","RWD");
         */

        // Creating an instance of Motorcycle
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2021, false, 2022, "Petrol", false);

        // Error:
        // Truck myTruck = new Truck(); // calling the default constructor!
        /*
         * When we run our application:
         * Error Message about this statement:Truck myTruck = new Truck();
         * Implicit super constructor Vehicle() is undefined for default constructor.
         * Must define an explicit constructor
         */

        myCar.startDriving(); // Inherited method from the class "Vehicle"
        myCar.turn("left"); // Inherited method from the class "Vehicle"
        myCar.printVehicleInfo(); // Inherited method from the class "Vehicle"
        myCar.printCarSpecs(); // Specific/Unique of the class "Car"
        myCar.printRecord("break", 860); // Specific/Unique method of the class "Car"

        myMotorcycle.startEngine(); // Inherited method from Vehicle
        myMotorcycle.startDriving(); // Inherited method from Vehicle
        myMotorcycle.turn("right"); // Inherited method from Vehicle
        myMotorcycle.stopDriving(); // Inherited method from Vehicle

        /*
         * NOTE:
         * We do have access to all the protected fields!
         * because we are inside the same package (folder)
         */
        myCar.brand = "Nissan";
        myCar.purchasedYear = 2014;
        myCar.isPreowned = false;

        if (myCar.isPreowned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

        myCar.printRecord("Tires", 250.89);
    } // main()
} // class file
