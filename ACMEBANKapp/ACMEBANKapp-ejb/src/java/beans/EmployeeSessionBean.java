/*
 * Employee Session Bean
 */
package beans;

import data_access.Employee;
import data_access.EmployeeDAO;
import data_access.RDBEmployeeDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
@Stateless
public class EmployeeSessionBean implements EmployeeSessionBeanRemote {

    //Injecting Datasource Resource
    @Resource(lookup = "jdbc/acmeDatasource")
    private DataSource dataSource;
    //Creating Instance Variable to maintain database Connection
    private Connection connection;

    //Method to access database Connection on the last phase of Construction
    @PostConstruct
    @Override
    public void initialize() {
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Method to close database connection before session bean is destroyed
    @PreDestroy
    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Method to add Employees
    @Override
    public void addEmployee(String e_ID, String e_FirstName, String e_LastName, String e_Address) {
        try{
            EmployeeDAO eDAO = new RDBEmployeeDAO(connection);
            Employee employee = new Employee(e_ID, e_FirstName, e_LastName,e_Address);
            eDAO.createEmployee(employee);
        }catch(Exception e){
            System.out.println("COULD NOT CREATE EMPLOYEE");
            e.printStackTrace();
        }
        
    }
}
