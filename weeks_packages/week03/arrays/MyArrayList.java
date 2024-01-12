package week03.arrays;

/* 
 * Importing a class named "ArrayList"
 * from a package "java.util"
 */
import java.util.ArrayList;

/* 
 * Collections in JAVA
 */
public class MyArrayList {
    // psvm
    public static void main(String[] args) {
        System.out.print("test");
        String course = "Java";

        // Simple Array:
        String[] mySubjects = new String[4];

        mySubjects[0] = "HTML";
        mySubjects[1] = "CSS";
        mySubjects[2] = "JS";
        mySubjects[3] = "PHP";

        System.out.print("\nOur first course " + mySubjects[0]);

        // ArrayList:
        ArrayList<String> myLanguages = new ArrayList<>();
        myLanguages.add("HTML"); // index 0
        myLanguages.add("CSS"); // index 1
        myLanguages.add("JS");
        myLanguages.add("PHP");
        myLanguages.add("Python");

        System.out.print("\nOur first course " + myLanguages.get(0));

        // Create ArrayList object "cars" of "String" data type
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Dodge");
        cars.add("Ford");
        cars.add("Mazda");

        // testing:
        System.out.println(cars); // [Toyota, Nissan, Dodge, Ford, Mazda]

        String car1 = cars.get(0); // access the first element
        String car2 = cars.get(1); // access the second element

        System.out.println("\n We have " + myLanguages.size() + " languages to learn!");

        for (int i = 0; i < myLanguages.size(); i++) {
            // Yes, using .get(i) method instead of [i]
            System.out.println(myLanguages.get(i));
        } // end for

        // replace PHP with Java:
        myLanguages.set(3, "Java");
        for (int i = 0; i < myLanguages.size(); i++) {
            // Yes, using .get(i) method instead of [i]
            System.out.println(myLanguages.get(i));
        } // end for

        // .remove() method to remove an item from the array list:
        // remove the last item:
        cars.remove(cars.size() - 1);

    } // main()

} // class file
