/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TenantRole;
import Business.Role.CustomerSupportRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CustomerSupportOrganization extends Organization{

    public CustomerSupportOrganization() {
        super(Organization.Type.CustomerSupport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TenantRole());
        roles.add(new CustomerSupportRole());
        return roles;
    }
     
   
    
    
}
