package arrays_review;

/* 
 * Collections in JAVA: ArrayList
 * Importing a class named "ArrayList"
 * from a package "java.util"
 */
import java.util.ArrayList;

public class MyArrayList {
    // psvm
    public static void main(String[] args) {
        /*
         * ArrayList:
         * - is a part of the Java Collections Framework
         * - is a resizable array implementation of the List interface
         * 
         * ArrayList can grow or shrink as you add or remove elements
         *
         */
        ArrayList<String> myLanguages = new ArrayList<>();
        /*
         * ArrayList<String>
         * <String> => This is a type parameter
         * new ArrayList<>() => for instantiating a new ArrayList object
         * <> is known as the diamond operator
         * 
         * NOTE:
         * ArrayList<String> is an example of Java generics.
         * Generics allow us to define classes, interfaces, and methods with a
         * placeholder for types,
         * which provides type safety and eliminates the need for casting.
         * 
         * Generic Class: ArrayList is a generic class.
         * When we specify <String>, we're creating an instance of ArrayList
         * that can only hold String objects.
         * 
         * Generics help us catch errors at compile time rather than at runtime,
         * making your code safer and cleaner.
         */
        myLanguages.add("HTML"); // index 0
        myLanguages.add("CSS"); // index 1
        myLanguages.add("JS"); // index 2
        myLanguages.add("PHP");
        myLanguages.add("Python");

        // get(int index) : String
        System.out.print("\nOur first course " + myLanguages.get(0));

        // size() => Returns the number of elements in this list.
        System.out.println("\n We have " + myLanguages.size() + " languages to learn!");

        // replace PHP with Java:
        myLanguages.set(3, "Java");

        for (int i = 0; i < myLanguages.size(); i++) {
            // Yes, using .get(i) method instead of [i]
            System.out.println(myLanguages.get(i));
        } // end for

        // .remove() method to remove an item from the array list:
        // remove the last item:
        myLanguages.remove(myLanguages.size() - 1);

        // You can add more examples :-)
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
    } // main()
} // class file
