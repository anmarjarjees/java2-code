package bank_accounts;

public class Main {
    public static void main(String[] args) {
        // Let's practice the class "Account":
        // ***********************************
        /*
         * Remember that our custom class "Account"
         * doesn't have any constructor method,
         * Java will use the default constructor (with no parameter)
         */
        Account account1 = new Account();

        // account1.balance = 100; // Error => "balance" is a private field
        account1.setBalance(100);

        // deposit:
        account1.deposit(300);

        // deposit again:
        account1.deposit(400);

        System.out.println("Main.main(): Your current Balance: " + account1.getBalance());

        // the current balance: 800
        // for testing, run again the setBalance
        account1.setBalance(300);

        // deposit invalid negative value
        account1.withdraw(-5); // invalid input

        account1.withdraw(1000);

        account1.withdraw(650);

        // To recap:
        // print the object "account1" of type "Account"
        // Remember that "Account" class inside "bank_accounts":
        System.out.println("account1: " + account1);
        // account1: bank_accounts.Account@4c873330

        Account account2 = new Account();
        System.out.println("account2: " + account2);
        // account2: bank_accounts.Account@776ec8df

        /*
         * The two output of the object values above (before overriding):
         * - bank_accounts.Account@4c873330
         * - bank_accounts.Account@776ec8df
         * 
         * are coming from the method in the (parent) class "Object"
         * this method is named toString()
         * 
         * so printing any object => call this method
         */

        Account account3 = new Account();
        // testing ".toString()"
        // notice that we don't need to attach this method "toString()"
        // it will be invoked by java when when we are tempted to print an object:
        System.out.println("account3: " + account3.toString());
    } // main()
} // class
