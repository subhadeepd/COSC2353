/*
 * Employee Data Access Implementation Class
 */
package data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author s3353762@student.rmit.edu.au
 */
public class RDBEmployeeDAO implements EmployeeDAO {

    //Constructor for this class using Database Connection as a parameter
    private Connection dbConnection = null;

    public RDBEmployeeDAO(Connection connection) {
        this.dbConnection = connection;
    }

    //Method to create Customers
    @Override
    public void createEmployee(Employee emp) {
        try {
            PreparedStatement sqlStatement = dbConnection.prepareStatement("INSERT INTO ACME.EMPLOYEE(E_ID,E_FIRST_NAME,E_LAST_NAME,E_ADDRESS)"
                    + "VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            sqlStatement.setString(1, emp.getE_ID());
            sqlStatement.setString(2, emp.getE_FirstName());
            sqlStatement.setString(3, emp.getE_LastName());
            sqlStatement.setString(4, emp.getE_Address());
            
            sqlStatement.executeUpdate();
            ResultSet result = sqlStatement.getGeneratedKeys();
            result.next();
            emp.setID(result.getInt(1));
            
        } catch (SQLException e) {
            System.out.println("NEW EMPLOYEE WAS NOT ADDED");
            e.printStackTrace();
        }
    }

    @Override
    public void selectEmployee(String e_ID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteEmployee(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
