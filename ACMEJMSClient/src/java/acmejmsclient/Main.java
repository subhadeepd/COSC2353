/*
 * Client for ACMEJMSapp Application
 */
package acmejmsclient;

import java.sql.Date;
import javax.ejb.EJB;
import jmsbeans.HomeLoanSessionBeanRemote;

/**
 * @author s3353762@student.rmit.edu.au
 */
public class Main {
    
    @EJB
    private static HomeLoanSessionBeanRemote homeLoanSession;

    public static void main(String[] args) {
        
        //Add HomeLoan Account
        homeLoanSession.addHomeLoan("C001",1001,0);
    }
}
