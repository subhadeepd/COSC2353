/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.sql.DataSource;

/**
 *
 * @author Administrator
 */
@Remote
public interface CustomerSessionBeanRemote {

    //Method to add Customers
    public void addCustomer(String c_ID, String c_FirstName,
            String c_LastName, String c_Address, String c_Password);

    public void initialize();

    @javax.annotation.PreDestroy
    public void close();
}
