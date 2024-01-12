package week04.p01_classes;

public class Main {
    public static void main(String[] args) {

        // Object, instance
        User user1 = new User();
        user1.name = "Alex Chow";

        User user2 = new User();
        user2.name = "Sam Simpson";

        User user3 = new User("Martin Smith");

        System.out.println(user3.name);

        user1.greetAll();
        user2.greetAll();

        // working with "Car" class
        // Arguments
        Car myCar = new Car("Dodge", 2010, "SUV", "CXT");
        Car johnCar = new Car("Nissan", 2012, "Sedan", "Vista");

        System.out.println(myCar); // week04.p01_classes.Car@36baf30c
        System.out.println(johnCar); // week04.p01_classes.Car@7a81197d

        // before
        // week04.p01_classes.Car@36baf30c
        // week04.p01_classes.Car@7a81197d
    }
}
