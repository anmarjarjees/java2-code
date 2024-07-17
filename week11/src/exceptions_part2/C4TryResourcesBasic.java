package exceptions_part2;

import java.util.Scanner;

public class C4TryResourcesBasic {
    public static void main(String[] args) {
        // try with resources using very simple example :-)
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            int age = input.nextInt();
            System.out.println("Your age is " + age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // or adding our custom message:
            System.out.println("Invalid Input!");
        }

    }
}
