package static_keyword;

public class Client {
    // class fields should be private to enforce the idea of encapsulation:
    private String clientName;
    private String accountType;

    // The Client constructor:
    public Client(String name, String type) {
        this.clientName = name;
        this.accountType = type;
    }

    /*
     * Getters => get the value of a class field
     * Setters => set (assign) a value to a class field
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // @Override
    // public String toString() {
    // return clientName + " - " + accountType;
    // }

}
