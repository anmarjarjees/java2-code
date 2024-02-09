package inheritance_part2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010);

        Car myFriendCar = new Car("Toyota", "Sedan", "2 wheels drive", 2010, "Gas", 2014);

        myCar.StartDriving();
        myCar.turn("left");
        myCar.getCarSpecs();

        myFriendCar.StartDriving();

        Car myCar3 = new Car("Nissan", "Sedan", "2 wheels drive", 2008, "Gas", 2012);

        myCar3.isPreOwned = false;

        if (myCar3.isPreOwned) {
            System.out.println("It's a used car");
        } else {
            System.out.println("It's a new car");
        }

        myCar.printRecord("Tires", 250.89);
    }
}
