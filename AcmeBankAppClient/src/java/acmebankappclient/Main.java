/*
 * Driver Class for this Application
 */
package acmebankappclient;

import beans.CustomerSessionBeanRemote;
import beans.EmployeeSessionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
public class Main {

    @EJB
    private static EmployeeSessionBeanRemote employeeBean;
    @EJB
    private static CustomerSessionBeanRemote customerBean;

    public static void main(String[] args) {

        //Add Employees
        employeeBean.addEmployee("E001", "SUBHADEEP", "DASGUPTA", "HAWTHORN");
        employeeBean.addEmployee("E002", "HARTLEY", "OLLEY", "MELBOURNE");
        employeeBean.addEmployee("E003", "CARSON", "BOYD", "MELBOURNE");

        //Add Customers
        customerBean.addCustomer("C001", "JOHN", "DOE", "MELBOURNE", "pass");
        customerBean.addCustomer("C002", "LANCE", "FRANKLIN", "HAWTHORN", "pass");
        customerBean.addCustomer("C003", "ISSAC", "SMITH", "HAWTHORN", "pass");
    }
}
