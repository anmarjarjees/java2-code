package bank_accounts;

/*
 * OOP: A PIE
 * 
 * NOTE:
 * In Java, we have the main (parent) class called "Object"
 * "Object" is the mother class in Java :-)
 * Any class we create will be a child of the mother class "Object"
 * 
 * Which means:
 * Every custom class we create will "inherit" properties/methods 
 * from this main Java class "Object"
 * 
 * In other words,
 * All classes in Java implicitly "extend" the main/parent class "Object"
 * 
 * Link: https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
 * 
 * Inheritance: will be covered in details
 */

/*
* Creating a class for a bank account to learn more about Encapsulation:
* The bank account is very popular example in the net 
* 
*/

/*
 * NOTE TO REVIEW:
 * class must always be "public"
 * Error Message:
 * Illegal modifier for the class Member;
 * only public, abstract & final are permitted
 * 
 * private class Account {
 * 
 * }
 */
public class Account {
    // Yes, not good idea to identify class fields to be "public"!
    // It should be "private" following the rules of "Encapsulation"
    public String clientName;

    // The class fields should be private:
    // public double balance;
    private double balance; // by default value: 0.0

    // adding getter and setter:
    public double getBalance() {
        return balance;
    }

    // setBalance() => for deposit money to the account:
    public void setBalance(double balance) {
        /*
         * we can make our program more robust by validating the user input!
         * Add validation#1:
         * if the balance <=0 then output an error message
         * else then we add the new value to the current balance
         */
        if (balance <= 0) {
            System.err.println("Invalid amount!");
        } else {
            /*
             * Add validation#2: Double check
             * if the current balance > 0 then ignore the operation with a message
             * Else then do the assignment
             */
            if (this.balance > 0) {
                System.out.println("Transaction was canceled, you already have a balance");
            } else {
                // assign the "balance" method parameter to the "balance" class field
                this.balance = balance;
            }
        }
    } // setBalance

    // Make it more advanced by adding deposit/withdraw methods:
    // Setting a value using the setter is definitely not a good practice!
    public void deposit(double amount) {
        if (amount < 0) {
            System.err.println("Invalid deposit amount!");
        } else {
            System.out.println("Previous Balance: " + this.balance);
            // Using the long formula:
            // this.balance = this.balance + amount;
            // Or using the shorthand => +=
            // Notice that you could omit the use of "this" keyword
            this.balance += amount;
            // for testing, we can output this message:
            System.out.println("The new balance after adding $" + amount + " is: " + this.balance);
        }
    } // deposit()

    public void withdraw(double amount) {
        /*
         * Two conditions for withdrawing:
         * 1. the amount to withdraw should be more than 0
         * 2. has enough balance
         */
        if (amount <= 0) {
            System.err.println("Invalid amount!");
        } else {
            // 1. check if the balance is 0 [no balance at all :-(]:
            if (this.balance == 0) {
                System.err.println("Sorry your account balance is 0!");
            } else {
                // 2. check if the balance is less than the wanted amount:
                if (balance < amount) {
                    double shortage = amount - balance;
                    System.err.println(
                            "Sorry you don't have enough balance to withdraw $" + amount + ". Your current balance is $"
                                    + balance + ". You are short with $" + shortage
                                    + ". Transaction Failed");
                } else {
                    balance -= amount;
                    System.err.println("Your current balance after withdrawing $" + amount + " is " + balance);
                }
            }
        } // end main if/else
    } // end withdraw()

    /*
     * The main/parent class in Java is "Object":
     * > has a public method => "toString()"
     * > this method is used to print any object of any class. => class "Account"
     * > we can modify/change the behaviour of "toString()" method: "Override"
     * "override" => when we modify a method from the "super" (main/parent) class
     * 
     * The class "Object":
     * Link: https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
     * 
     * Using @override Annotation:
     * Annotations: a form of metadata, provide data about a program that is not
     * part of the program itself
     * Annotations: have no direct effect on the operation of the code they annotate
     * 
     * NOTE:
     * When overriding a method, we might want to use the @Override annotation
     * to instruct the compiler that we intend to override a method in the
     * superclass.
     * 
     * If, for some reason, the compiler detects that the method
     * does not exist in one of the superclasses, then it will generate an error.
     * Link: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
     * 
     * Polymorphism (To be discussed on details with Inheritance):
     * - Overloading: (not in this example)
     * - Overriding: in the example below "toString()"
     */
    @Override
    public String toString() {
        /*
         * Override a method => change it's action/code inside the body
         * we can modify it by returning any funny thing :-(
         */
        // return "Da da!";

        /*
         * Or we can modify it by return a useful thing:
         * return the current balance
         * 
         * Notice that below, we can omit the user of "this" keyword
         */
        return "Current Balance: " + this.balance; // no need for "this" (optional)
    } // toString()
} // class file