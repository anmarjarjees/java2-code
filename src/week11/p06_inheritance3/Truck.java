package week11.p06_inheritance3;

import week10.p06_inheritance2.Vehicle;

public class Truck extends Vehicle {
    private String using;

    public Truck(String brand, String type, String wheels, int year, String using) {
        super(brand, type, wheels, year);
        this.using = using;
    }
}
