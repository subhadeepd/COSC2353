/*
 * Data Transfer Object_ Customer Class
 * Subhadeep Dasgupta
 */
package data_access;

/**
 * @author s3353762@student.rmit.edu.au
 */
public class Customer {

    //Instance Variables for this class
    private String c_ID;
    private String c_FirstName;
    private String c_LastName;
    private String c_Address;
    private String c_Password;

    //Accessors for this class
    public String getC_ID() {
        return c_ID;
    }

    public String getC_FirstName() {
        return c_FirstName;
    }

    public String getC_LastName() {
        return c_LastName;
    }

    public String getC_Address() {
        return c_Address;
    }

    public String getC_Password() {
        return c_Password;
    }

    //Mutator for this class
    public void setC_ID(String c_ID) {
        this.c_ID = c_ID;
    }

    public void setC_FirstName(String c_FirstName) {
        this.c_FirstName = c_FirstName;
    }

    public void setC_LastName(String c_LastName) {
        this.c_LastName = c_LastName;
    }

    public void setC_Address(String c_Address) {
        this.c_Address = c_Address;
    }

    public void setC_Password(String c_Password) {
        this.c_Password = c_Password;
    }

    //Constructor for this class
    public Customer(String c_ID, String c_FirstName, String c_LastName, String c_Address, String c_Password) {
        this.c_ID = c_ID;
        this.c_FirstName = c_FirstName;
        this.c_LastName = c_LastName;
        this.c_Address = c_Address;
        this.c_Password = c_Password;
    }

    public Customer(String c_ID, String c_Password) {
        this.c_ID = c_ID;
        this.c_Password = c_Password;
    }

    public void setID(int aInt) {
        System.out.println("CUSTOMER ID: " + getC_ID() + " HAS BEEN ADDED");
    }
}
