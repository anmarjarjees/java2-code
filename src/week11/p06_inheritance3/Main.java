package week11.p06_inheritance3;

public class Main {
    public static void main(String[] args) {
        Truck myTruck = new Truck("Jumbo", "XL3", "3 wheels drive", 2012, "Snow");

        myTruck.province = "BC";

        /*
         * if (myTruck.isPreOwned) {
         * System.out.println("It's a used car");
         * } else {
         * System.out.println("It's a new car");
         * }
         */
    }
}
