/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
public interface CustomerDAO {
    
    //Methods to create, delete, select and update Customers
    
    public void createCustomer(Customer customer);
    
    public void selectCustomer(String c_ID);
    
    public void updateCustomer(Customer customer);
    
    public void deleteCustomer(Customer customer);
    
}
