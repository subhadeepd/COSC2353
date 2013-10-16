/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
@Entity
@Table(name = "ACMEJMS.HOMELOAN")
public class HomeLoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "C_ID")
    private String c_ID;
    @Column(name = "C_FULL_NAME")
    private String c_FullName;
    @Column(name = "C_FULL_ADDRESS")
    private String c_FullAddress;
    @Column(name = "C_ACCOUNT_NUMBER")
    private int c_AccNumber;
    @Column(name = "C_AMOUNT_BORROWED")
    private int c_AmtBorrow;
    @Column(name = "C_AMOUNT_REPAYED")
    private int c_AmtRepay;
    @Column(name = "C_DOB")
    @Temporal(TemporalType.DATE)
    private Date c_Dob;
    @Column(name = "C_JOB")
    private String c_Job;
    @Column(name = "C_SALARY")
    private int c_Salary;
    @Column(name = "C_CONTACT_METHOD")
    private String c_Contact;

    //Accessors for this class
    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getC_ID() {
        return c_ID;
    }

    public String getC_FullName() {
        return c_FullName;
    }

    public String getC_FullAddress() {
        return c_FullAddress;
    }

    public int getC_AccNumber() {
        return c_AccNumber;
    }

    public int getC_AmtBorrow() {
        return c_AmtBorrow;
    }

    public int getC_AmtRepay() {
        return c_AmtRepay;
    }

    public Date getC_Dob() {
        return c_Dob;
    }

    public String getC_Job() {
        return c_Job;
    }

    public int getC_Salary() {
        return c_Salary;
    }

    public String getC_Contact() {
        return c_Contact;
    }

    //Mutators for this class
    public void setId(Long id) {
        this.id = id;
    }

    public void setC_ID(String c_ID) {
        this.c_ID = c_ID;
    }

    public void setC_FullName(String c_FullName) {
        this.c_FullName = c_FullName;
    }

    public void setC_FullAddress(String c_FullAddress) {
        this.c_FullAddress = c_FullAddress;
    }

    public void setC_AccNumber(int c_AccNumber) {
        this.c_AccNumber = c_AccNumber;
    }

    public void setC_AmtDebit(int c_AmtDebit) {
        this.c_AmtBorrow = c_AmtDebit;
    }

    public void setC_AmtCredit(int c_AmtCredit) {
        this.c_AmtRepay = c_AmtCredit;
    }

    public void setC_Dob(Date c_Dob) {
        this.c_Dob = c_Dob;
    }

    public void setC_Job(String c_Job) {
        this.c_Job = c_Job;
    }

    public void setC_Salary(int c_Salary) {
        this.c_Salary = c_Salary;
    }

    public void setC_Contact(String c_Contact) {
        this.c_Contact = c_Contact;
    }

    //Default Constructor for this class
    public HomeLoan() {
    }

    //Constructor for this Class
    public HomeLoan(String c_ID, String c_FullName, String c_FullAddress, int c_AccNumber,
            int c_AmtBorrow, int c_AmtRepay, Date c_Dob, String c_Job, int c_Salary, String c_Contact) {
        this.c_ID = c_ID;
        this.c_FullName = c_FullName;
        this.c_FullAddress = c_FullAddress;
        this.c_AccNumber = c_AccNumber;
        this.c_AmtBorrow = c_AmtBorrow;
        this.c_AmtRepay = c_AmtRepay;
        this.c_Dob = c_Dob;
        this.c_Job = c_Job;
        this.c_Salary = c_Salary;
        this.c_Contact = c_Contact;
    }

    //Constructor for repay Method
    public HomeLoan(String c_ID, int c_AccNumber, int c_AmtRepay) {
        this.c_AccNumber = c_AccNumber;
        this.c_ID = c_ID;
        this.c_AmtRepay = c_AmtRepay;
    }

    @Override
    public String toString() {
        return "HOME LOAN " + c_AccNumber + " EXISTS IN THE SYSTEM";
    }
}
