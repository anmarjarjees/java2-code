package week12.p09_interface;

public class Main {
    public static void main(String[] args) {
        JuniorLevel emp1 = new JuniorLevel();
        SeniorLevel emp2 = new SeniorLevel();

        System.out.println("Employee1 Gross Pay: " + emp1.calculateGross(22));
        System.out.println("Employee2 Gross Pay: " + emp2.calculateGross(31));
    }
}

/*
 * In our main application,
 * instead of working with classes,
 * we can work with the interface
 */
// https://docs.oracle.com/javase/tutorial/java/IandI/interfaceAsType.html