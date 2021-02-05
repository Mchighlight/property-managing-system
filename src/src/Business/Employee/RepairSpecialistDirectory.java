/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.RepairSpecialist;
import java.util.ArrayList;

/**
 *
 * @author hung-chih huang
 */
public class RepairSpecialistDirectory {
    
    private ArrayList<RepairSpecialist> repairSpecialist;

    public RepairSpecialistDirectory() {
        repairSpecialist = new ArrayList();
    }

    public ArrayList<RepairSpecialist> getRepairSpecialist() {
        return repairSpecialist;
    }
    
    public RepairSpecialist createRepairSpecialist(String name, String email){
        RepairSpecialist rs = new RepairSpecialist();
        rs.setName(name);
        rs.setEmail(email);
        repairSpecialist.add(rs);
        return rs;
    }
    
        public RepairSpecialist findRepairSpecialist(String name) {

        for (RepairSpecialist rs :repairSpecialist) {
            if (rs.getName().equals(name)) {
                return rs;
            }
        }
        return null;
    }
}