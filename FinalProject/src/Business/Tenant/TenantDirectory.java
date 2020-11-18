/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tenant;

import Business.Employee.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TenantDirectory {
    
    private ArrayList<Employee> employeeList;

    public TenantDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}