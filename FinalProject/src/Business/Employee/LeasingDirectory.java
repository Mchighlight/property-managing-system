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
public class LeasingDirectory {
    
    private ArrayList<Leasing> leasingList;

    public LeasingDirectory() {
        leasingList = new ArrayList();
    }

    public ArrayList<Leasing> getLeasingList() {
        return leasingList;
    }

    public Leasing createLeasing(String name, String email, String ssn) {
        Leasing leasing = new Leasing();
        leasing.setName(name);
        leasing.setEmail(email);
        leasing.setSSN(ssn);
        leasingList.add(leasing);
        return leasing;
    }

    public Leasing findLeasing(String name) {

        for (Leasing ls : leasingList) {
            if (ls.getName().equals(name)) {
                return ls;
            }
        }
        return null;
    }
}