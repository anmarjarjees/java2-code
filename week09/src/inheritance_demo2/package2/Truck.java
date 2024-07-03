package inheritance_demo2.package2;

import inheritance_demo2.package1.Vehicle;

/*
Truck extends "Vehicle" from different package,
that's why we had to import it as we did above
*/
public class Truck extends Vehicle {
    // We can add a custom constructor if needed

    // for testing the protected class field:
    public void checkNewOld() {
        // Accessing the protected property "isPreowned"
        if (this.isPreowned) {
            System.out.println("It's a used case");
        } else {
            System.out.println("New Car!");
        }
    }

    public void showName() {
        // The field Vehicle.owner is not visible
        // System.out.println(this.owner);
    }
}
