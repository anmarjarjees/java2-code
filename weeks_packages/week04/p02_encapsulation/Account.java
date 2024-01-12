package week04.p02_encapsulation;

/*
* Creating a class for a bank account to learn about Encapsulation:
* The bank account is very popular example in the net 
*/
public class Account {
    // The class fields should be private:
    // public double balance;
    private double balance; // by default 0.0

    // adding getter and setter:
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // we can make our program more robust by validating the user input
        // add validation:
        // if the balance <=0 output error message:
        // else set the new value
        if (balance <= 0) {
            System.err.println("Invalid amount!");
        } else {
            this.balance = balance;
        }
    }

    // Make it more advanced by adding deposit/withdraw methods:
    // Setting a value using the setter is definitely not a good practice!
    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid deposit amount!");
        } else {
            // this.balance = this.balance + amount;
            // Or:
            // Notice that you could omit the use of "this" keyword
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        /*
         * Two conditions for withdrawing:
         * 1. the amount to withdraw should be more than 0
         * 2. has enough balance
         */
        if (amount <= 0) {
            System.err.println(amount + ". Invalid withdraw amount!");
        } else {
            // 1. check if the balance is 0 (no balance at all):
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
}
