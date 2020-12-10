/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;
import java.util.ArrayList;

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
    private ArrayList<Propority> ProporityCatalog;
    private boolean isAssignagent = false;
    private String agent;

    public Landlord() {
        id = count;
        count++;
        ProporityCatalog = new ArrayList<>();

    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
    

    public boolean isIsAssignagent() {
        return isAssignagent;
    }

    public void setIsAssignagent(boolean isAssignagent) {
        this.isAssignagent = isAssignagent;
    }

    public ArrayList<Propority> getProporityCatalog() {
        return ProporityCatalog;
    }

    public void setProporityCatalog(ArrayList<Propority> ProporityCatalog) {
        this.ProporityCatalog = ProporityCatalog;
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
