/*
 * Remote Interface for Employee Session Bean
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author s3353762@student.rmit.edu.au
 */
@Remote
public interface EmployeeSessionBeanRemote {
    
    //Method to add Employees
    public void addEmployee(String e_ID, String e_FirstName, String e_LastName, String e_Address);

    @javax.annotation.PostConstruct
    public void initialize();

    @javax.annotation.PreDestroy
    public void close();
}
