/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Accountant;
import Business.Employee.DataAnalyst;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Accountant accountant;
    private DataAnalyst dataanalyst;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount( String username, String password, Employee employee, Role role, Accountant accountant,DataAnalyst dataanalyst ) {

        this.username = username;
        this.password = password;
        this.employee = employee;
        this.role = role;
        this.accountant=accountant;
        this.dataanalyst=dataanalyst;
        
    }

    public DataAnalyst getDataanalyst() {
        return dataanalyst;
    }

    public void setDataanalyst(DataAnalyst dataanalyst) {
        this.dataanalyst = dataanalyst;
    }

  
    
    public UserAccount() {
        workQueue = new WorkQueue();
        
        
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    @Override
    public String toString() {
        return username;
    }
    
    
    
}