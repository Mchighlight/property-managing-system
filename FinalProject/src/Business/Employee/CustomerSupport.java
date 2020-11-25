/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.CustomerSupport;

/**
 *
 * @author hung-chih huang
 */
public class CustomerSupport {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;

    public CustomerSupport() {
        id = count;
        count++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
