package inheritance_demo1;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar; // Indicates if the motorcycle has a sidecar
    /*
     * Link: https://en.wikipedia.org/wiki/Sidecar
     */

    // Constructor to initialize brand, year, isPreowned status, purchasedYear,
    // fuelType, and hasSidecar
    public Motorcycle(String brand, int year, boolean isPreowned, int purchasedYear, String fuelType,
            boolean hasSidecar) {
        // Call to the superclass (Vehicle) constructor
        super(brand, year, isPreowned, purchasedYear, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Use your imagination to add method(s) specific to Motorcycle :-)
}
