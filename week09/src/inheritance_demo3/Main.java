package inheritance_demo3;
// First Way:

import inheritance_demo3.package1.*;
import inheritance_demo3.package2.Truck;

public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck();
        truck1.province = "BC";
        truck1.checkNewOld();

        // Error: The field Vehicle.isPreowned is not visible
        // truck1.isPreowned = true;

        Animal animal = new Animal();
        Person person = new Person();
        Vehicle vehicle = new Vehicle();
    }
}
