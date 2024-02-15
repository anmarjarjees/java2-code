package inheritance_part2;

public class Main {
    public static void main(String[] args) {
        /*
         * Constructing two objects (instances) and passing initial values to each one:
         * - myCar => "Toyota", "Sedan", "2 wheels drive", 2010
         * - myFriendCar => "Toyota", "Sedan", "2 wheels drive", 2010, "Gas", 2014
         * We must have these constructors available
         */
        Car myCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010);

        Car myFriendCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010, "Gas", 2014);

        // Error:
        // Truck myTruck = new Truck(); // calling the default constructor!
        /*
         * When we run our application:
         * Error Message about this statement:Truck myTruck = new Truck();
         * Implicit super constructor Vehicle() is undefined for default constructor.
         * Must define an explicit constructor
         */

        myCar.StartDriving(); // from the class "Vehicle"
        myCar.turn("left"); // from the class "Vehicle"
        myCar.printVehicleInfo(); // from the class "Vehicle"
        myCar.printCarSpecs(); // from the class "Car"
        myCar.printRecord("break", 860); // from the class "Car"

        myFriendCar.StartDriving();

        Car myCar3 = new Car("Nissan", "Sedan", "2 wheels drive", 2008, "Gas", 2012);

        myCar3.isPreOwned = false;

        if (myCar3.isPreOwned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

        myCar.printRecord("Tires", 250.89);
    } // main()
} // class file
