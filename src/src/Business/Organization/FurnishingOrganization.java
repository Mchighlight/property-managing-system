/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DecoratorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FurnishingOrganization extends Organization{

    public FurnishingOrganization() {
        super(Organization.Type.Furnishing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DecoratorRole());
        return roles;
    }
     
   
    
    
}
