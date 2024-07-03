package inheritance_demo2.package2;

import inheritance_demo2.package1.Car;

public class Package2Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        /*
         * printInfo() => protected
         * 
         * Error Message:
         * The method printInfo() from the type Vehicle is not visible
         */
        // myCar.printInfo();

        // province => public
        System.out.println(myCar.province);

    }
}
