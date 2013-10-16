/*
 * Data Transfer Object_ Employee Class
 * Subhadeep Dasgupta
 */
package data_access;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
public class Employee {

    //Instance Variables of this class
    private String e_ID;
    private String e_FirstName;
    private String e_LastName;
    private String e_Address;

    // Accessors for this class
    public String getE_ID() {
        return e_ID;
    }

    public String getE_FirstName() {
        return e_FirstName;
    }

    public String getE_LastName() {
        return e_LastName;
    }

    public String getE_Address() {
        return e_Address;
    }

    // Mutators for this class
    public void setE_ID(String e_ID) {
        this.e_ID = e_ID;
    }

    public void setE_FirstName(String e_FirstName) {
        this.e_FirstName = e_FirstName;
    }

    public void setE_LastName(String e_LastName) {
        this.e_LastName = e_LastName;
    }

    public void setE_Address(String e_Address) {
        this.e_Address = e_Address;
    }

    // Constructor for this class
    public Employee(String e_ID, String e_FirstName, String e_LastName, String e_Address) {
        this.e_ID = e_ID;
        this.e_FirstName = e_FirstName;
        this.e_LastName = e_LastName;
        this.e_Address = e_Address;
    }

    // Second Constructor for this class
    public Employee(String e_ID) {
        this.e_ID = e_ID;
    }

    public void setID(int aInt) {
        System.out.println("EMPLOYEE ID: " + getE_ID() + " HAS BEEN ADDED");
    }
}
