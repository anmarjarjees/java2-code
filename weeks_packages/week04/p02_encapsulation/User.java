package week04.p02_encapsulation;

public class User {
    // Yes, not good idea to identify class fields to be public!
    // It should be private following the encapsulation concept
    public String name;
    public int subNum;

    public User(String name, int subNum) {
        this.name = name;
        this.subNum = subNum;
    }

    // Methods:
    public void greetAll() {
        System.out.println("Hello every one! My name is " + this.name + " and I will work with you on Java!");
        // or without .this works also:
        System.out.println("Hello every one! My name again is " + name + " and I will work with you on Java!");
        System.out.println("I have " + subNum + " subject(s) to work on");
    }

}
