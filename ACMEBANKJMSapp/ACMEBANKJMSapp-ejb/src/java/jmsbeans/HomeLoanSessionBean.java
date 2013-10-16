/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmsbeans;

import entity.HomeLoan;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class HomeLoanSessionBean implements HomeLoanSessionBeanRemote {

    //Injecting Persistence Unit
    @PersistenceContext(unitName = "ACMEBANKJMSapp-ejbPU")
    private EntityManager em;

    //Accessing Entity Manager
    protected EntityManager getEm() {
        return em;
    }

    //Adding HomeLoan Account
    @Override
    public void addHomeLoan(String c_ID, int c_AccNumber, int c_AmtRepay) {
        try {
            HomeLoan home = new HomeLoan(c_ID,c_AccNumber, c_AmtRepay);
            em.persist(home);
        } catch (IllegalArgumentException e) {
            System.out.println("CANNOT ADD HOMELOAN ACCOUNT");
            e.printStackTrace();
        }
        
    }

}
