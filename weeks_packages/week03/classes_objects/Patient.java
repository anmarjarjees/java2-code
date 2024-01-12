package week03.classes_objects;

public class Patient {
    // 1. Class Properties/Attributes/fields:
    private String firstName; // "" by default => empty string
    private String lastName; // "" by default

    // Encapsulation
    private double weight; // 0.0 by default
    private double height; // 0.0 by default
    // private int age; // no need for this variable

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // another constructor
    public Patient(String firstName, String lastName, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // define the default constructor explicitly:
    public Patient() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
