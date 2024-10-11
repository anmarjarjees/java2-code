package inheritance_demo2;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar; // Indicates if the motorcycle has a sidecar
    /*
     * Link: https://en.wikipedia.org/wiki/Sidecar
     */

    /*
     * Constructor for Motorcycle
     * Initializes fields from the superclass and the specific field of this class:
     * - brand
     * - year
     * - purchasedYear
     * - fuelType
     * - isPreowned
     * - hasSidecar
     */
    public Motorcycle(String brand, int year, int purchasedYear, String fuelType, boolean isPreowned,
            boolean hasSidecar) {
        // Call to the superclass (Vehicle) constructor
        super(brand, year, purchasedYear, fuelType, isPreowned);
        this.hasSidecar = hasSidecar;
    }

    // Additional methods specific to Motorcycle can be added here
    // For example, a method to display sidecar information
    public void displaySidecarInfo() {
        if (hasSidecar) {
            System.out.println("This motorcycle has a sidecar.");
        } else {
            System.out.println("This motorcycle does not have a sidecar.");
        }
    }
} // class file
