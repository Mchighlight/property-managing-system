/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;
import Business.property.Lease;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Leasing {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    private String SSN ;
    private ArrayList<Lease> leaseDirectory ;

    public ArrayList<Lease> getLeaseDirectory() {
        return leaseDirectory;
    }

    public void setLeaseDirectory(ArrayList<Lease> leaseDirectory) {
        this.leaseDirectory = leaseDirectory;
    }
    
     public void addLease(Lease ls) {
        this.leaseDirectory.add(ls) ;
    }
     
    public void removeLease(Lease ls) {
        this.leaseDirectory.remove(ls) ;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    

    public Leasing() {
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
