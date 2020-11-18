/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RepairSpecialistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class RepairOrganization extends Organization{

    public RepairOrganization() {
        super(Organization.Type.Repair.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RepairSpecialistRole());
        return roles;
    }
     
   
    
    
}
