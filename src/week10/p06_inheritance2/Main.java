package week10.p06_inheritance2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010, "Gas", 2014);

        System.out.println(myCar.getClass()); // class week10.p06_inheritance2.Car

        myCar.getCarSpecs();

        // The field Vehicle.isPreOwned is not visible:
        Vehicle myCar2 = new Vehicle("Toyota", "Sedan", "2 wheels drive", 2014);

        myCar2.isPreOwned = true;

        Car myCar3 = new Car("Nissan", "Sedan", "2 wheels drive", 2008, "Gas", 2012);

        myCar3.isPreOwned = false;

        if (myCar3.isPreOwned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

    }

}
