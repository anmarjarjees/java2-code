package inheritance_demo2;
// First Way:

// we can import all the classes one by one:
/*
import inheritance_part3.package1.Animal;
import inheritance_part3.package1.Person;
import inheritance_part3.package1.Vehicle;
*/

// Second Way:
// we can use the wildcard * to import all the classes:
import inheritance_demo2.package1.*;
import inheritance_demo2.package2.Truck;

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
