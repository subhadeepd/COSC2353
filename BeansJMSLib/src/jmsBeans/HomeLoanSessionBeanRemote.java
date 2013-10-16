/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmsbeans;

import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface HomeLoanSessionBeanRemote {

    //Method to Add Home Loan Account
    public void addHomeLoan(String c_ID, int c_AccNumber, int c_AmtRepay);
}
