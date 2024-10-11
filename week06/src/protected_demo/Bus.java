package protected_demo;

import inheritance_demo2.Vehicle;

/*
 * The "Bus" class extends the "Vehicle" class.
 * This means that Bus inherits all the properties and methods from Vehicle.
 * This class demonstrates "valid" access to "protected" members directly within the subclass.
 */
public class Bus extends Vehicle {

    // Constructor to initialize the Bus with its properties
    public Bus(String brand, int year, int purchasedYear, String fuelType, boolean isPreowned) {
        /*
         * Calling the constructor of the superclass (Vehicle)
         * to initialize inherited fields.
         */
        super(brand, year, purchasedYear, fuelType, isPreowned);
    }

    // Method to display details of the Bus
    public void displayBusInfo() {
        // Valid access: we can access protected members directly within the subclass.
        // Accessing the protected member 'brand' from Vehicle:
        System.out.println("Bus Brand: " + brand); // Accessing protected member 'brand'

        // Accessing protected member 'year'
        System.out.println("Year of Manufacture: " + year);

        // Accessing protected member 'purchasedYear'
        System.out.println("Purchased Year: " + purchasedYear);

        // Accessing protected member 'fuelType'
        System.out.println("Fuel Type: " + fuelType);

        // Accessing the protected boolean member 'isPreowned'
        // Valid access with conditional output using "Ternary Operator":
        System.out.println("Is Preowned: " + (isPreowned ? "Yes" : "No"));
    }
} // class file
