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

    public CleaningStaff createCleaningStaff(String name, String email, int charge) {
        CleaningStaff cleaningStaff = new CleaningStaff();
        cleaningStaff.setName(name);
        cleaningStaff.setEmail(email);
        cleaningStaff.setChargepresquarefee(charge);

        cleaningStaffList.add(cleaningStaff);
        return cleaningStaff;
    }

    public CleaningStaff findCleaningstaff(String username) {

        for (CleaningStaff cleaningStaff : cleaningStaffList) {
            if (cleaningStaff.getName().equals(username)) {
                return cleaningStaff;
            }
        }
        return null;
    }
}
