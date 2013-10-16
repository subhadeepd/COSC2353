/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import data_access.Customer;
import data_access.CustomerDAO;
import data_access.RDBCustomerDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author Administrator
 */
@Stateless
public class CustomerSessionBean implements CustomerSessionBeanRemote {

    @Resource(lookup = "jdbc/acmeDBDatasource")
    private DataSource datasource;
    
    private Connection connection;
    
    @PostConstruct
    @Override
    public void initialize(){
        try{
            connection = datasource.getConnection();
        }catch(SQLException c){
            c.printStackTrace();
        }
    }

    @Override
    public void addCustomer(String c_ID, String c_FirstName, String c_LastName,
            String c_Address, String c_Password) {
        try{
            CustomerDAO cDAO = new RDBCustomerDAO(connection);
            Customer customer = new Customer(c_ID, c_FirstName,c_LastName, c_Address, c_Password);
            cDAO.createCustomer(customer);
        }catch(Exception e){
            System.out.println("CANNOT CREATE A CUSTOMER");
            e.printStackTrace();
        }
    }

    @PreDestroy
    @Override
    public void close(){
        try{
            connection.close();
        }catch(SQLException sq){
            sq.printStackTrace();
        }
    }
}
