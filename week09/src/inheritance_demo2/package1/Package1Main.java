package inheritance_demo2.package1;

public class Package1Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        /*
         * printInfo() => protected
         * 
         * NO error => access this method within the same package
         */
        myCar.printInfo();
    }
}
