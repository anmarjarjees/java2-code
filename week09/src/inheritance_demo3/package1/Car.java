package inheritance_demo3.package1;

/* 
 * Car extends "Vehicle" within the same package
 */
public class Car extends Vehicle {

    public void showName() {
        System.out.println(this.owner);
    }
}
