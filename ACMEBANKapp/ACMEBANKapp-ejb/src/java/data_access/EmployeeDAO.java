/*
 * Employee Interface for Data Access Object
 */
package data_access;

/**
 * @author s3353762@student.rmit.edu.au
 */
public interface EmployeeDAO {
    
    //Methods to create, delete, select and update Employees
    public void createEmployee(Employee emp);

    public void selectEmployee(String e_ID);

    public void updateEmployee(Employee emp);

    public void deleteEmployee(Employee emp);
}
