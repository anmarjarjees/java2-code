package exceptions_part3;

import java.util.Scanner;

public class C1TryResourcesBasic {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            int age = input.nextInt();
            System.out.println("Your age is " + age);
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

    }
}
