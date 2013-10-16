/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class RDBCustomerDAO implements CustomerDAO {
    
    private Connection dbConnection = null;
    
    public RDBCustomerDAO(Connection connection){
        this.dbConnection = connection;
    }

    @Override
    public void createCustomer(Customer customer) {
        try{
            PreparedStatement sqlStatement = dbConnection.prepareStatement(
                   "INSERT INTO ACMEDB.CUSTOMER(C_ID,C_FIRST_NAME,C_LAST_NAME,C_ADDRESS,C_PASSWORD)"
                    + "VALUES(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            
            sqlStatement.setString(1,customer.getC_ID());
            sqlStatement.setString(2,customer.getC_FirstName());
            sqlStatement.setString(3,customer.getC_LastName());
            sqlStatement.setString(4,customer.getC_Address());
            sqlStatement.setString(5,customer.getC_Password());
            
            sqlStatement.executeUpdate();
            
            ResultSet result = sqlStatement.getGeneratedKeys();
            result.next();
            customer.setID(result.getInt(1)); 
        }catch (SQLException c){
            System.out.println("CANNOT ADD NEW CUSTOMER");
            c.printStackTrace();
        }
    }

    @Override
    public void selectCustomer(String c_ID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
