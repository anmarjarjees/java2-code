package protected_demo;

import inheritance_demo2.Vehicle;

/*
 * The Van class extends the Vehicle class.
 * This means that Van is a type of Vehicle and inherits its properties and methods.
 * In this class, we will demonstrate how to access "protected" members of the "Vehicle" class.
 */
public class Van extends Vehicle {

    // Constructor to initialize the Van with its properties
    public Van(String brand, int year, int purchasedYear, String fuelType, boolean isPreowned) {
        /*
         * Calling the constructor of the superclass (Vehicle)
         * to initialize inherited fields. This ensures that all
         * relevant properties of the Vehicle class are properly set
         * when creating an instance of Van.
         */
        super(brand, year, purchasedYear, fuelType, isPreowned);
    }

    // Method to display information about the Van
    public void displayVanInfo() {
        // Valid access: we can access protected members directly within the subclass
        // Accessing the protected member 'brand' from Vehicle:
        System.out.println("Van Brand: " + brand); // Accessing protected member 'brand'

        // This line demonstrates valid access to the protected member 'year'.
        // Since Van is a subclass of Vehicle, we can directly access 'year' here.
        System.out.println("Year of Manufacture: " + this.year); // Valid access

        /*
         * Note:
         * While we can access protected members like 'brand' and 'year' directly here,
         * attempting to access these members from an instance of Van in another class
         * outside the package would result in a compile-time error, as those members
         * are
         * protected.
         */
    }
} // class file
