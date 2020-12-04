/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;

/**
 *
 * @author raunak
 */
public class Landlord {

    private int id;
    private static int count = 1;
    private String firstname;
    private String lastname;
    private String SSN;
    private String email;
    private ProporityCatalog proporityCatalog;
   

    public Landlord() {
        id = count;
        count++;

        proporityCatalog = new ProporityCatalog();

    }

  
    

    public ProporityCatalog getProporityCatalog() {
        return proporityCatalog;
    }

    public void setProporityCatalog(ProporityCatalog proporityCatalog) {
        this.proporityCatalog = proporityCatalog;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
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

    @Override
    public String toString() {
        return lastname;
    }

}
