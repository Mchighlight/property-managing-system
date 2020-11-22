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
public class CleaningStaffDirectory {

    private ArrayList<CleaningStaff> cleaningStaffList;

    public CleaningStaffDirectory() {
        cleaningStaffList = new ArrayList();
    }

    public ArrayList<  CleaningStaff> getCleaningStaffList() {
        return cleaningStaffList;
    }

    public CleaningStaff createCleaningStaff(String name, String email) {
        CleaningStaff cleaningStaff = new CleaningStaff();
        cleaningStaff.setName(name);
        cleaningStaff.setEmail(email);
        cleaningStaffList.add(cleaningStaff);
        return cleaningStaff;
    }
}
