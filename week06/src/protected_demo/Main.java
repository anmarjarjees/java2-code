package protected_demo;

// import inheritance_demo2.Vehicle;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of Bus
        Bus bus = new Bus("Mercedes", 2020, 2021, "Diesel", false);
        bus.displayBusInfo(); // Valid: Displaying bus info

        // Creating an instance of Van
        Van van = new Van("Ford", 2019, 2020, "Petrol", true);
        van.displayVanInfo(); // Valid: Displaying van info

        // Examples of invalid access to "protected" members:
        // The line below will trigger a compile-time error:
        /*
         * Problem:
         * The following line attempts to access the protected member 'brand'
         * using the "bus" instance.
         * 
         * Reason:
         * Because 'brand' is a protected member of the "Vehicle" class.
         * We are trying to access it from the "Main" class, which is not a
         * subclass of "Vehicle" and is not in the same package.
         */
        // System.out.println("Brand: " + bus.brand); // Invalid access

        /*
         * Another Example:
         * Attempting to access the protected property 'year' directly:
         * The line below will also cause a compile-time error.
         */
        // System.out.println("Year of Manufacture: " + van.year); // Invalid access

        // To access protected members, we must use methods defined in the subclass.
        System.out.println("Accessing protected members via methods:");
        bus.displayBusInfo(); // Valid access through method in Bus
        van.displayVanInfo(); // Valid access through method in Van
    }
} // end class