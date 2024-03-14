package about_abstraction;

public class LoginService {

    public void logInUser() {
        enterCredentials();
        connectToDatabase();
        if (isValidUser()) {
            loadUserData();
        } else {
            // throw an error
        }
    }

    private void enterCredentials() {
        System.out.println("Entering Username and password");
    }

    private void connectToDatabase() {
        System.out.println("Connecting to the database");
    }

    private boolean isValidUser() {
        System.out.println("Validating User input by reading the data from the database table(s)");
        return true; // true if valid user or false if invalid
    }

    private void loadUserData() {
        System.out.println("Loading all the home page of the user");
    }
} // end LoginService
