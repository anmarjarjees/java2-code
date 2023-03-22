package week04.p02_encapsulation;

public class Member {
    // class fields should be private to enforce the idea of encapsulation:
    private String memberName;
    private String membershipType;

    // The Member constructor:
    public Member(String name, String type) {
        this.memberName = name;
        this.membershipType = type;
    }

    /*
     * Getters => get the value of a class field
     * Setters => set (assign) a value to a class field
     */
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return memberName + " - " + membershipType;
    }

}
