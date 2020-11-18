/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CleaningStaffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CleaningOrganization extends Organization{

    public CleaningOrganization() {
        super(Organization.Type.Cleaning.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CleaningStaffRole());
        return roles;
    }
     
   
    
    
}
